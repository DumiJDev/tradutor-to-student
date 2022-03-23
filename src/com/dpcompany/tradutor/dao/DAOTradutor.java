package com.dpcompany.tradutor;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 * @author Dumildes Paulo
 */
public abstract class DAOTradutor {

    private static Connection con = null;
    private static PreparedStatement stm = null;
    private static ResultSet rs = null;
    private static String url = "jdbc:sqlite:LTDP.db";
    private static Integer I;

    private static boolean abrirBanco(String url) {
        try {
            con = DriverManager.getConnection(url);
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getClass().getName() + ": " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    private static boolean fecharBanco() {
        try {
            con.close();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getClass().getName() + ": " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    private static boolean criarTabela(String table) {
        if (abrirBanco(url))
			try {
            String sql = "create table " + table + "(id integer primary key not null, palavra text not null);";
            stm = con.prepareStatement(sql);
            stm.execute();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não é possível inserir contacto!\nContacte: DP Company", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    public static String traduzDAO(String from, String to, String str) {
        String found = null;
        int i = 0, foun;
        String sql = "select palavra from " + to + " where id = ("
                + "select id from " + from + " where palavra like '" + str + "');";

        if (abrirBanco(url))
            try {

            stm = con.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()) {
                found = rs.getString("palavra");
                i++;
            }
            I = i;
            stm.close();
            rs.close();

        } catch (SQLException t) {
            try {

                if (criarTabela(from) && criarTabela(to)) {
                    stm = con.prepareStatement(sql);
                    rs = stm.executeQuery();
                    while (rs.next()) {
                        found = rs.getString("palavra");
                        i++;
                    }
                    I = i;
                    stm.close();
                    rs.close();
                }
            } catch (SQLException ex) {
            }
        }
        fecharBanco();

        if (i == 0) {
            return str;
        }

        return found;
    }

    public static boolean insereDAO(String tab1, String str1) {
        if (abrirBanco(url))
            try {
            String sql = "insert into " + tab1 + "(palavra) values(?);";
            stm = con.prepareStatement(sql);
            stm.setString(1, str1);
            stm.execute();
            if (fecharBanco()) {
                return true;
            }
        } catch (SQLException ex) {
        }
        fecharBanco();
        return false;
    }

    public static Integer getI() {
        return I;
    }

    public static String[] idioma() {
        String[] lingua = new String[20];
        int i = 0;
        if (abrirBanco(url))
            try {
            stm = con.prepareStatement("select nome from idioma order by nome;");
            rs = stm.executeQuery();
            while (rs.next()) {
                lingua[i] = rs.getString("nome");
                i++;
            }
            stm.close();
            rs.close();

        } catch (SQLException e) {
        }
        fecharBanco();
        return lingua;
    }

}
