/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import negocio.Cliente;
import persistencia.ClienteControle;

/**
 *
 * @author tais
 */
public class TelaConsultaCliente extends javax.swing.JFrame {

    /**
     * Creates new form TelaConsultaCliente
     */
    
    private TelaCadastroCliente telaCadastroCLiente;
    
    public TelaConsultaCliente() {
        initComponents();
    }
    
    public TelaConsultaCliente(TelaCadastroCliente telaCadastroCliente){
        this.telaCadastroCLiente = telaCadastroCliente;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nomeClienteConsulta = new javax.swing.JTextField();
        btnConsultaCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableModelConsultaCLi = new javax.swing.JTable();
        btnVoltarTelaCadastroCliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                fecharJanela(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Bitstream Vera Sans", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Digite o nome do cliente:");

        nomeClienteConsulta.setBackground(new java.awt.Color(204, 204, 204));
        nomeClienteConsulta.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 14)); // NOI18N
        nomeClienteConsulta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        nomeClienteConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeClienteConsultaActionPerformed(evt);
            }
        });

        btnConsultaCliente.setBackground(new java.awt.Color(0, 0, 0));
        btnConsultaCliente.setFont(new java.awt.Font("Bitstream Vera Sans", 1, 14)); // NOI18N
        btnConsultaCliente.setForeground(new java.awt.Color(204, 204, 204));
        btnConsultaCliente.setText("Pesquisar");
        btnConsultaCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btnConsultaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarCliente(evt);
            }
        });

        tableModelConsultaCLi.setForeground(new java.awt.Color(0, 0, 0));
        tableModelConsultaCLi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "CPF", "E-mail"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableModelConsultaCLi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableModelConsultaCLiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableModelConsultaCLi);

        btnVoltarTelaCadastroCliente.setBackground(new java.awt.Color(0, 0, 0));
        btnVoltarTelaCadastroCliente.setFont(new java.awt.Font("Bitstream Vera Sans", 1, 14)); // NOI18N
        btnVoltarTelaCadastroCliente.setForeground(new java.awt.Color(204, 204, 204));
        btnVoltarTelaCadastroCliente.setText("Voltar");
        btnVoltarTelaCadastroCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btnVoltarTelaCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarTelaCadastroClienteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bitstream Vera Sans", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Consulta de Clientes");

        jLabel3.setFont(new java.awt.Font("Bitstream Vera Sans", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("**Clique duas vezes sobre o registro para editar.");

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setIcon(new javax.swing.ImageIcon("/home/tais/Imagens/lupa_1.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(btnConsultaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnVoltarTelaCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(nomeClienteConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(29, 29, 29)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(47, 47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomeClienteConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnConsultaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(btnVoltarTelaCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nomeClienteConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeClienteConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeClienteConsultaActionPerformed

    private void consultarCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarCliente
        String nome = nomeClienteConsulta.getText();
        DefaultTableModel tableModel = (DefaultTableModel) tableModelConsultaCLi.getModel();
        tableModel.setRowCount(0);
        ClienteControle clienteControle = new ClienteControle();
        
        try{
            ArrayList<Cliente> clientes = clienteControle.listarClientes(nome);
            clientes.forEach((Cliente cliente) -> {
                tableModel.addRow(new Object[] 
                            {cliente.getCodCliente(),
                             cliente.getNome(),
                             cliente.getCpf(),
                             cliente.getEmail()});
                 });
                tableModelConsultaCLi.setModel(tableModel);
        } catch (Exception ex) {
            Logger.getLogger(TelaConsultaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_consultarCliente

    private void fecharJanela(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_fecharJanela
        this.dispose();
        this.telaCadastroCLiente.setVisible(true);
    }//GEN-LAST:event_fecharJanela

    private void tableModelConsultaCLiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableModelConsultaCLiMouseClicked
        if(evt.getClickCount() == 2){
            Integer codCliente = (Integer) tableModelConsultaCLi.getModel().getValueAt(tableModelConsultaCLi.getSelectedRow(), 0);
            String nome = (String) tableModelConsultaCLi.getModel().getValueAt(tableModelConsultaCLi.getSelectedRow(), 1);
            String cpf = (String) tableModelConsultaCLi.getModel().getValueAt(tableModelConsultaCLi.getSelectedRow(), 2);
            String email = (String) tableModelConsultaCLi.getModel().getValueAt(tableModelConsultaCLi.getSelectedRow(), 3);
        
            this.telaCadastroCLiente.buscarCliente(codCliente, nome, cpf, email);
            this.telaCadastroCLiente.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_tableModelConsultaCLiMouseClicked

    private void btnVoltarTelaCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarTelaCadastroClienteActionPerformed
        TelaCadastroCliente tc = new TelaCadastroCliente();
        this.setVisible(false);
        tc.setVisible(true);
    }//GEN-LAST:event_btnVoltarTelaCadastroClienteActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsultaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultaCliente;
    private javax.swing.JButton btnVoltarTelaCadastroCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomeClienteConsulta;
    private javax.swing.JTable tableModelConsultaCLi;
    // End of variables declaration//GEN-END:variables
}
