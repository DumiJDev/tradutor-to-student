package com.dpcompany.tradutor.controller;

import com.dpcompany.tradutor.dao.DAOTradutor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author Dumildes Paulo
 */
public class ControllerTradutor {

    private final DAOTradutor daoTradutor;

    public ControllerTradutor() {
        daoTradutor = new DAOTradutor();
    }

    public void traduz(String from, String to, javax.swing.JTextArea textFrom, javax.swing.JTextArea textTo) {
        List<String> text;
        String out = textFrom.getText();

        text = Arrays.asList(textFrom.getText().replaceAll(",", ";")
                .replaceAll("\\?", ";").replaceAll("[ \t\f\r\n\b]", ";")
                .replaceAll("\\!", ";").replaceAll("\\<", ";").replaceAll("\\>", ";")
                .replaceAll("\\|", ";").replaceAll("\"", ";").replaceAll("\\.", ";")
                .replaceAll("\\*", ";").replaceAll("-", ";").replaceAll("'", ";")
                .replaceAll("\\^", ";").replaceAll("\\+", ";").replaceAll("º", ";")
                .replaceAll("´", ";").replaceAll("~", ";").replaceAll("\\\\", ";")
                .replaceAll("«", ";").replaceAll("»", ";").replaceAll("_", ";")
                .replaceAll("\\:", ";").replaceAll("`", ";").replaceAll("ª", ";")
                .replaceAll("%", ";").replaceAll("#", ";").replaceAll("&", ";")
                .replaceAll("\\(", ";").replaceAll("\\)", ";").replaceAll("=", ";")
                .replaceAll("\\/", ";").replaceAll("\\$", ";").replaceAll("[0-9]", ";")
                .replaceAll(";{1,}", ";").split(";"));

        for (String word : text) {

            daoTradutor.setFrom(from);
            daoTradutor.setTo(to);
            out = out.replaceAll((word != null ? word : ""),
                    (daoTradutor.traduz(word) != null
                    ? daoTradutor.traduz(word) : ""));
        }
        textTo.setText(out);

    }

    public void inserir(String tab1, String tab2, String str1, String str2) {
        daoTradutor.insereDAO(tab1, str1);
        daoTradutor.insereDAO(tab2, str2);
    }

    public void Idioma(JComboBox<String> box) {
        String[] v;

        v = daoTradutor.idioma();

        System.out.println(Arrays.toString(v));
        box.setModel(new DefaultComboBoxModel<>(v));
    }

    public void inserirIdioma(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
