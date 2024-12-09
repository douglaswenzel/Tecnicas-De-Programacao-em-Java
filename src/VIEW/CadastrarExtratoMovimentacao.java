/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import DAO.ConnectDao; 
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import DAO.ExtratoMovimentacao;

/**
 *
 * @author Douglas Wenzel
 */
public class CadastrarExtratoMovimentacao extends javax.swing.JFrame {

    public CadastrarExtratoMovimentacao() {
        initComponents();
    }
    
    ExtratoMovimentacao extratoMovimentacaoTela = new ExtratoMovimentacao();


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        ID_HIS = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        NUM_AGE = new javax.swing.JTextField();
        NUM_CC = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        DATA_MOV = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        NUM_DOCTO = new javax.swing.JTextField();
        valor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        saldo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        COMPL_HIS = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        DEBITO_CREDITO = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        label1 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("ID Histórico:");

        jLabel2.setText("Agência:");

        NUM_AGE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUM_AGEActionPerformed(evt);
            }
        });

        jLabel1.setText("Conta:");

        jLabel4.setText("Data Movimento:");

        jLabel8.setText("Documento:");

        valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorActionPerformed(evt);
            }
        });

        jLabel9.setText("Valor:");

        jLabel6.setText("Meio transação:");

        jLabel5.setText("Saldo:");

        jLabel7.setText("Histórico Completo:");

        COMPL_HIS.setColumns(20);
        COMPL_HIS.setRows(5);
        jScrollPane1.setViewportView(COMPL_HIS);

        jButton2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jButton2.setText("Cadastrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2cadastrarActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jButton1.setText("Limpar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1limparActionPerformed(evt);
            }
        });

        DEBITO_CREDITO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Débito", "Crédito" }));

        jButton3.setText("← Voltar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3voltarTelaMenu(evt);
            }
        });

        label1.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        label1.setText("Cadastrar extrato de movimentação");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addGap(79, 79, 79)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ID_HIS)
                                    .addComponent(NUM_AGE, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NUM_DOCTO, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(DATA_MOV)
                                    .addComponent(NUM_CC, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DEBITO_CREDITO, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NUM_AGE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(NUM_CC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ID_HIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DATA_MOV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(NUM_DOCTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(DEBITO_CREDITO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(saldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NUM_AGEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NUM_AGEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NUM_AGEActionPerformed

    private void valorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorActionPerformed

    private void jButton2cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2cadastrarActionPerformed
        try {
        // Cria uma instância do SimpleDateFormat para formatar a data
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date dataMov = formatter.parse(this.DATA_MOV.getText()); // Campo para DATA_MOV
        String numCc = this.NUM_CC.getText(); // Campo para NUM_CC
        String numAge = this.NUM_AGE.getText(); // Campo para NUM_AGE
        String numDocto = this.NUM_DOCTO.getText(); // Campo para NUM_DOCTO
        String debitoCredito = this.DEBITO_CREDITO.getSelectedItem().toString().substring(0, 1); // Campo para DEBITO_CREDITO
        int idHis = Integer.parseInt(this.ID_HIS.getText()); // Campo para ID_HIS
        String complHis = this.COMPL_HIS.getText(); // Campo para COMPL_HIS
        double valor = Double.parseDouble(this.valor.getText()); // Campo para VALOR
        double saldo = Double.parseDouble(this.saldo.getText()); // Campo para SALDO

        // Valida os campos obrigatórios
        if (numCc.isEmpty() || numAge.isEmpty() || numDocto.isEmpty() || dataMov == null || debitoCredito.isEmpty() || complHis.isEmpty() || valor <= 0 || saldo < 0) {
            JOptionPane.showMessageDialog(this, "Todos os campos são obrigatórios e valores válidos devem ser preenchidos!");
            return;
        }

        // Cria uma instância do ConnectDao
        ConnectDao connDAO = new ConnectDao();

        // Chama o método cadastrarMovimentacao
        connDAO.cadastrarMovimentacao("MOVIMENTACAO", numCc, numAge, numDocto, dataMov, debitoCredito, idHis, complHis, valor, saldo);

        // Exibe mensagem de sucesso após a inserção
        JOptionPane.showMessageDialog(this, "Movimentação cadastrada com sucesso!");

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Erro: O ID_HIS deve ser numérico.");
    } catch (ParseException e) {
        JOptionPane.showMessageDialog(this, "Erro na formatação da data: " + e.getMessage());
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao cadastrar movimentação: " + e.getMessage());
    }
    }//GEN-LAST:event_jButton2cadastrarActionPerformed

    private void jButton1limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1limparActionPerformed
        this.ID_HIS.setText("");
        this.NUM_AGE.setText("");
        this.NUM_CC.setText("");
        this.DATA_MOV.setText("");
        this.NUM_DOCTO.setText("");
        this.DEBITO_CREDITO.setSelectedIndex(0); 
        this.valor.setText("");
        this.saldo.setText("");
        this.COMPL_HIS.setText("");
    }//GEN-LAST:event_jButton1limparActionPerformed

    private void jButton3voltarTelaMenu(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3voltarTelaMenu
        Menu telaMenu = new Menu();
        telaMenu.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButton3voltarTelaMenu


    public static void main(String args[]) {


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarExtratoMovimentacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea COMPL_HIS;
    private javax.swing.JTextField DATA_MOV;
    private javax.swing.JComboBox<String> DEBITO_CREDITO;
    private javax.swing.JTextField ID_HIS;
    private javax.swing.JTextField NUM_AGE;
    private javax.swing.JTextField NUM_CC;
    private javax.swing.JTextField NUM_DOCTO;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private javax.swing.JTextField saldo;
    private javax.swing.JTextField valor;
    // End of variables declaration//GEN-END:variables
}
