package com.dpcompany.tradutor.view;

import com.dpcompany.tradutor.controller.ControllerTradutor;
import com.jtattoo.plaf.acryl.AcrylLookAndFeel;
import javax.swing.JTextField;

/**
 * @author Dumildes Paulo
 */
@SuppressWarnings("serial")
public class TradutorView extends javax.swing.JFrame {

    private final ControllerTradutor controllerTradutor;

    public TradutorView() {
        controllerTradutor = new ControllerTradutor();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        split = new javax.swing.JSplitPane(javax.swing.JSplitPane.VERTICAL_SPLIT, textFrom, textTo);
        jScrollPane1 = new javax.swing.JScrollPane();
        textTo = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        textFrom = new javax.swing.JTextArea();
        botaoT = new javax.swing.JButton();
        labelFrom = new javax.swing.JLabel();
        comboFrom = new javax.swing.JComboBox<>();
        controllerTradutor.Idioma(comboFrom);
        labelTo = new javax.swing.JLabel();
        comboTo = new javax.swing.JComboBox<>();
        controllerTradutor.Idioma(comboTo);
        comboTo.removeItemAt(comboFrom.getSelectedIndex());
        jMenuBar1 = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        importMenu = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        addMenu = new javax.swing.JMenu();
        addIdioma = new javax.swing.JMenuItem();
        addPalavra = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        help = new javax.swing.JMenu();
        pro = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DP Tradutor");
        setName("janela"); // NOI18N
        setResizable(false);

        split.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        split.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        split.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        split.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        textTo.setEditable(false);
        textTo.setBackground(new java.awt.Color(18, 28, 51));
        textTo.setColumns(20);
        textTo.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        textTo.setForeground(new java.awt.Color(255, 255, 255));
        textTo.setLineWrap(true);
        textTo.setRows(5);
        textTo.setWrapStyleWord(true);
        textTo.setMargin(new java.awt.Insets(0, 0, 0, 4));
        jScrollPane1.setViewportView(textTo);

        split.setBottomComponent(jScrollPane1);

        textFrom.setBackground(new java.awt.Color(18, 28, 51));
        textFrom.setColumns(20);
        textFrom.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        textFrom.setForeground(new java.awt.Color(255, 255, 255));
        textFrom.setLineWrap(true);
        textFrom.setRows(5);
        textFrom.setWrapStyleWord(true);
        textFrom.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        textFrom.setMargin(new java.awt.Insets(0, 0, 0, 4));
        textFrom.setName(""); // NOI18N
        jScrollPane2.setViewportView(textFrom);

        split.setLeftComponent(jScrollPane2);

        botaoT.setBackground(new java.awt.Color(102, 102, 102));
        botaoT.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        botaoT.setForeground(new java.awt.Color(51, 51, 51));
        botaoT.setText("Traduzir");
        botaoT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoTActionPerformed(evt);
            }
        });

        labelFrom.setText("De");

        comboFrom.setBackground(new java.awt.Color(58, 51, 128));
        comboFrom.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        comboFrom.setForeground(new java.awt.Color(255, 255, 255));
        comboFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFromActionPerformed(evt);
            }
        });

        labelTo.setText("Para");

        comboTo.setBackground(new java.awt.Color(58, 51, 128));
        comboTo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        comboTo.setForeground(new java.awt.Color(255, 255, 255));
        comboTo.setPreferredSize(new java.awt.Dimension(169, 26));

        file.setText("Ficheiro");

        importMenu.setText("Importar pacote de idioma");
        importMenu.setEnabled(false);
        file.add(importMenu);

        jMenuItem2.setText("Exportar pacote de idioma");
        jMenuItem2.setEnabled(false);
        file.add(jMenuItem2);

        addMenu.setText("Adicionar...");

        addIdioma.setText("idioma");
        addIdioma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addIdiomaMousePressed(evt);
            }
        });
        addMenu.add(addIdioma);

        addPalavra.setText("palavra");
        addPalavra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addPalavraMousePressed(evt);
            }
        });
        addMenu.add(addPalavra);

        file.add(addMenu);

        exit.setText("Sair");
        file.add(exit);

        jMenuBar1.add(file);

        help.setText("Ajuda");
        help.setEnabled(false);
        jMenuBar1.add(help);

        pro.setText("Versão Pro");
        jMenuBar1.add(pro);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(split, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
            .addComponent(botaoT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelFrom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelTo)
                .addGap(18, 18, 18)
                .addComponent(comboTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelFrom))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboTo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(split, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoT, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        split.getAccessibleContext().setAccessibleName("");
        split.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoTActionPerformed
        controllerTradutor.traduz((String) comboFrom.getSelectedItem(), (String) comboTo.getSelectedItem(), textFrom, textTo
        );
    }//GEN-LAST:event_botaoTActionPerformed

    private void comboFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFromActionPerformed
        comboTo.removeAllItems();
        controllerTradutor.Idioma(comboTo
        );
        comboTo.removeItemAt(comboFrom.getSelectedIndex());
    }//GEN-LAST:event_comboFromActionPerformed

    private void addPalavraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPalavraMousePressed
        javax.swing.JDialog dialog = new javax.swing.JDialog();
        javax.swing.JPanel panel = new javax.swing.JPanel(new java.awt.GridLayout(2, 2, 3, 3));
        javax.swing.JTextField tab1 = new javax.swing.JTextField((String) comboFrom.getSelectedItem());
        javax.swing.JTextField tab2 = new javax.swing.JTextField((String) comboTo.getSelectedItem());
        javax.swing.JButton addId = new javax.swing.JButton("Add");
        javax.swing.JButton cancelId = new javax.swing.JButton("Cancelar");

        tab1.setBackground(new java.awt.Color(18, 28, 51));
        tab2.setBackground(new java.awt.Color(18, 28, 51));
        tab1.setForeground(new java.awt.Color(255, 255, 255));
        tab2.setForeground(new java.awt.Color(255, 255, 255));
        tab1.setFont(new java.awt.Font("Times New Romam", java.awt.Font.PLAIN, 14));
        tab2.setFont(new java.awt.Font("Times New Romam", java.awt.Font.PLAIN, 14));
        tab1.setHorizontalAlignment(JTextField.CENTER);
        tab2.setHorizontalAlignment(JTextField.CENTER);
        addId.setBackground(new java.awt.Color(51, 51, 51));
        cancelId.setBackground(new java.awt.Color(51, 51, 51));
        addId.setForeground(new java.awt.Color(255, 255, 255));
        cancelId.setForeground(new java.awt.Color(255, 255, 255));

        panel.add(tab1);
        panel.add(tab2);
        panel.add(addId);
        panel.add(cancelId);

        panel.setBorder(new javax.swing.border.TitledBorder("Adicionar Idioma"));

        dialog.add(panel);
        dialog.setVisible(true);
        dialog.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        dialog.setSize(350, 150);
        dialog.setTitle("Adicionar palavra");
        dialog.setResizable(false);

        addId.addActionListener((java.awt.event.ActionEvent arg0) -> {
            if (tab1.getText().equals("") && tab2.getText().equals("")) {
                javax.swing.JOptionPane.showMessageDialog(null, "Um ou mais campos vazio(s)", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
            } else {
                controllerTradutor.inserir((String) comboFrom.getSelectedItem(), (String) comboTo.getSelectedItem(), tab1.getText(), tab2.getText()
                );
                javax.swing.JOptionPane.showMessageDialog(null, "Adicionado com sucesso!", "Palavra adicionada", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
            tab1.setText("");
            tab2.setText("");
        });

        cancelId.addActionListener((java.awt.event.ActionEvent arg0) -> {
            tab1.setText("");
            tab2.setText("");
            dialog.dispose();
        });
    }//GEN-LAST:event_addPalavraMousePressed

    private void addIdiomaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addIdiomaMousePressed
        javax.swing.JDialog dialog = new javax.swing.JDialog();
        javax.swing.JPanel panel = new javax.swing.JPanel(new java.awt.GridLayout(1, 1));
        javax.swing.JTextField tab1 = new javax.swing.JTextField();
        javax.swing.JButton addId = new javax.swing.JButton("Add");

        tab1.setBackground(new java.awt.Color(18, 28, 51));
        tab1.setForeground(new java.awt.Color(255, 255, 255));
        tab1.setFont(new java.awt.Font("Times New Romam", java.awt.Font.PLAIN, 14));
        tab1.setHorizontalAlignment(JTextField.CENTER);
        addId.setBackground(new java.awt.Color(51, 51, 51));
        addId.setForeground(new java.awt.Color(255, 255, 255));

        panel.add(tab1);
        panel.add(addId);

        panel.setBorder(new javax.swing.border.TitledBorder("Adicionar Idioma"));

        dialog.add(panel);
        dialog.setVisible(true);
        dialog.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        dialog.setSize(350, 150);
        dialog.setTitle("Adicionar Idioma");
        dialog.setResizable(false);

        addId.addActionListener((java.awt.event.ActionEvent arg0) -> {
            if (tab1.getText().equals("")) {
                javax.swing.JOptionPane.showMessageDialog(null, "campo vazio", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
            } else {
                controllerTradutor.inserirIdioma(tab1.getText());
                javax.swing.JOptionPane.showMessageDialog(null, "Adicionado com sucesso!", "Idioma adicionado", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
            tab1.setText("");
        });

    }//GEN-LAST:event_addIdiomaMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {

            javax.swing.UIManager.setLookAndFeel(new AcrylLookAndFeel());
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TradutorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TradutorView().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JMenuItem addIdioma;
    javax.swing.JMenu addMenu;
    javax.swing.JMenuItem addPalavra;
    javax.swing.JButton botaoT;
    javax.swing.JComboBox<String> comboFrom;
    javax.swing.JComboBox<String> comboTo;
    javax.swing.JMenuItem exit;
    javax.swing.JMenu file;
    javax.swing.JMenu help;
    javax.swing.JMenuItem importMenu;
    javax.swing.JMenuBar jMenuBar1;
    javax.swing.JMenuItem jMenuItem2;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JScrollPane jScrollPane2;
    javax.swing.JLabel labelFrom;
    javax.swing.JLabel labelTo;
    javax.swing.JMenu pro;
    javax.swing.JSplitPane split;
    javax.swing.JTextArea textFrom;
    javax.swing.JTextArea textTo;
    // End of variables declaration//GEN-END:variables
}
