package com.dpcompany.tradutor;

import java.util.Arrays;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author Dumildes Paulo
 */
public abstract class ControllerTradutor {

    public static void traduz(String from, String to, javax.swing.JTextArea textFrom, javax.swing.JTextArea textTo) {
        String[] text = new String[100];
        String out = textFrom.getText();

        text = textFrom.getText().replaceAll(",", ";")
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
                .replaceAll(";{1,}", ";").split(";");

        String aux;

        for (int k = 0; k < text.length - 1; k++) {
            if (text[k].equals("") || text[k] == null) {
                if (!text[k + 1].equals("") || text[k + 1] != null) {
                    aux = text[k];
                    text[k] = text[k + 1];
                    text[k + 1] = aux;
                }
            }
        }

        for (int i = 0; i < text.length; i++) {
            out = out.replaceAll((text[i] != null ? text[i] : ""),
                    (DAOTradutor.traduzDAO(from, to, text[i]) != null
                    ? DAOTradutor.traduzDAO(from, to, text[i]) : ""));
        }
        textTo.setText(out);

    }

    public static void inserir(String tab1, String tab2, String str1, String str2) {
        DAOTradutor.insereDAO(tab1, str1);
        DAOTradutor.insereDAO(tab2, str2);
    }

    public static void Idioma(JComboBox<String> box) {
        String[] v;
        int i = 0;
        for (String string : DAOTradutor.idioma()) {
            if (string != null) {
                i++;
            }
        }

        v = new String[i];
        i = 0;

        for (String string : DAOTradutor.idioma()) {
            if (string != null) {
                v[i] = string;
                i++;
            }
        }

        System.out.println(Arrays.toString(v));
        box.setModel(new DefaultComboBoxModel<>(v));
    }
}
