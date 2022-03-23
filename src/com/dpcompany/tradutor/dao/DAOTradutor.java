package com.dpcompany.tradutor.dao;

import java.io.StreamCorruptedException;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 * @author Dumildes Paulo
 */
public class DAOTradutor {

    private Connection con = null;
    private PreparedStatement stm = null;
    private ResultSet rs = null;
    private final String URL;
    private Integer I;

    private String from, to;

    public DAOTradutor() {
        URL = "jdbc:sqlite:LTDP.db";
        from = "pt";
        to = "en";
    }

    private boolean abrirBanco(String URL) {
        try {
            con = DriverManager.getConnection(URL);
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getClass().getName() + ": " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    private boolean fecharBanco() {
        try {
            con.close();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getClass().getName() + ": " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    private boolean criarTabela(String table) {
        if (abrirBanco(URL)) {
            try {
                String sql = String.format("create table %s(id integer primary key not null, palavra text not null);", table);
                stm = con.prepareStatement(sql);
                stm.execute();
                con.commit();
                return true;
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Não é possível inserir contacto!" +
                        "\nContacte: DP Company", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        return false;
    }

    public String traduz(String str) {
        String found = null;
        int i = 0;
        String sql = String.format("select palavra from %s where id = (select id from %s where palavra like ?);", to, from);

        if (abrirBanco(URL)) {
            try {
                stm = con.prepareStatement(sql);
                stm.setString(1, str);
                rs = stm.executeQuery();
                while (rs.next()) {
                    found = rs.getString("palavra");
                    i++;
                }
                I = i;
                con.commit();
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
        }
        fecharBanco();

        if (i == 0) {
            return str;
        }

        return found;
    }

    public boolean insereDAO(String tab1, String str1) {
        if (abrirBanco(URL)) {
            try {
                String sql = String.format("insert into %s(palavra) values(?);", tab1);
                stm = con.prepareStatement(sql);
                stm.setString(1, str1);
                stm.execute();
                con.commit();
                if (fecharBanco()) {
                    return true;
                }
            } catch (SQLException ignored) {
            } finally {
                fecharBanco();
            }
        }

        return false;
    }

    public Integer getI() {
        return I;
    }

    public String[] idioma() {
        String[] lingua = new String[30];
        int i = 0;
        if (abrirBanco(URL)) {
            try {
                stm = con.prepareStatement("select nome from idioma order by nome;");
                rs = stm.executeQuery();
                while (rs.next()) {
                    lingua[i] = rs.getString("nome");
                    i++;
                }
                con.commit();
                stm.close();
                rs.close();

            } catch (SQLException e) {
            } finally {
                fecharBanco();
            }
        }

        if (i < 1) {
            lingua[0] = "";
        }

        return lingua;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

}
