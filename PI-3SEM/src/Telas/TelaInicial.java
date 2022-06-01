package Telas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author ruy_s
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
        initComponents();
        if (TelaLogin.acesso == 1) {
            lblUsuario.setText("Loja");
        } else {
            lblUsuario.setText("Cliente");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRelatorio = new javax.swing.JButton();
        btnProduto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnVenda = new javax.swing.JButton();
        lblSair = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblPed1 = new javax.swing.JLabel();
        lblPed2 = new javax.swing.JLabel();
        lblPed3 = new javax.swing.JLabel();
        lblPed4 = new javax.swing.JLabel();
        lblPed5 = new javax.swing.JLabel();
        btnPronto1 = new javax.swing.JButton();
        btnPronto2 = new javax.swing.JButton();
        btnPronto3 = new javax.swing.JButton();
        btnPronto4 = new javax.swing.JButton();
        btnPronto5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 51));

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));

        btnRelatorio.setBackground(new java.awt.Color(0, 0, 0));
        btnRelatorio.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        btnRelatorio.setForeground(new java.awt.Color(255, 255, 0));
        btnRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/RelatorioTamanhoCerto.png"))); // NOI18N
        btnRelatorio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRelatorio.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnRelatorio.setVerifyInputWhenFocusTarget(false);
        btnRelatorio.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnRelatorio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioActionPerformed(evt);
            }
        });

        btnProduto.setBackground(new java.awt.Color(0, 0, 0));
        btnProduto.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        btnProduto.setForeground(new java.awt.Color(255, 255, 0));
        btnProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Estoque02TamanhoCerto.png"))); // NOI18N
        btnProduto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnProduto.setBorderPainted(false);
        btnProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProduto.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 48)); // NOI18N
        jLabel1.setText("Restauceronte");

        btnVenda.setBackground(new java.awt.Color(0, 0, 0));
        btnVenda.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        btnVenda.setForeground(new java.awt.Color(255, 255, 0));
        btnVenda.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnVenda.setBorderPainted(false);
        btnVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVenda.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendaActionPerformed(evt);
            }
        });

        lblSair.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblSair.setForeground(new java.awt.Color(51, 51, 255));
        lblSair.setText("Sair");
        lblSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSairMouseClicked(evt);
            }
        });

        lblUsuario.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblUsuario.setText("Usuario");

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        lblPed1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPed1.setForeground(new java.awt.Color(255, 255, 255));
        lblPed1.setText("Pedido 1");

        lblPed2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPed2.setForeground(new java.awt.Color(255, 255, 255));
        lblPed2.setText("Pedido 1");

        lblPed3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPed3.setForeground(new java.awt.Color(255, 255, 255));
        lblPed3.setText("Pedido 1");

        lblPed4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPed4.setForeground(new java.awt.Color(255, 255, 255));
        lblPed4.setText("Pedido 1");

        lblPed5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPed5.setForeground(new java.awt.Color(255, 255, 255));
        lblPed5.setText("Pedido 1");

        btnPronto1.setBackground(new java.awt.Color(0, 204, 0));
        btnPronto1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPronto1.setText("Pronto");

        btnPronto2.setBackground(new java.awt.Color(0, 204, 0));
        btnPronto2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPronto2.setText("Pronto");

        btnPronto3.setBackground(new java.awt.Color(0, 204, 0));
        btnPronto3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPronto3.setText("Pronto");

        btnPronto4.setBackground(new java.awt.Color(0, 204, 0));
        btnPronto4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPronto4.setText("Pronto");

        btnPronto5.setBackground(new java.awt.Color(0, 204, 0));
        btnPronto5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPronto5.setText("Pronto");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPed2, javax.swing.GroupLayout.PREFERRED_SIZE, 1036, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPed3, javax.swing.GroupLayout.PREFERRED_SIZE, 1036, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPed1, javax.swing.GroupLayout.PREFERRED_SIZE, 1036, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPed5, javax.swing.GroupLayout.PREFERRED_SIZE, 1036, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPed4, javax.swing.GroupLayout.PREFERRED_SIZE, 1036, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPronto3)
                    .addComponent(btnPronto5)
                    .addComponent(btnPronto2)
                    .addComponent(btnPronto1)
                    .addComponent(btnPronto4))
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPronto1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPed1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnPronto2)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblPed2)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPed4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPronto3)
                            .addComponent(lblPed3))
                        .addGap(18, 18, 18)
                        .addComponent(btnPronto4)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPed5)
                    .addComponent(btnPronto5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(283, 283, 283)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addGap(19, 19, 19)
                .addComponent(btnRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(292, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSair)
                .addGap(37, 37, 37))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSair)
                    .addComponent(lblUsuario))
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutoActionPerformed
        // TODO add your handling code here:
        FrmProdCat x = new FrmProdCat();
        x.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnProdutoActionPerformed

    private void btnVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendaActionPerformed
        // TODO add your handling code here:
        frmPedido x = new frmPedido();
        x.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVendaActionPerformed

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
        TelaRelatorio tela = new TelaRelatorio();
        tela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRelatorioActionPerformed

    private void lblSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseClicked
        // TODO add your handling code here:
        if (TelaLogin.acesso == 1) {
            TelaLogin x = new TelaLogin();
            x.setVisible(true);
            this.setVisible(false);
        } else {
            String t = JOptionPane.showInputDialog("Insira a senha");
            if (t.equals("123loja")) {
                TelaLogin x = new TelaLogin();
                x.setVisible(true);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Senha incorreta");
            }
        }
    }//GEN-LAST:event_lblSairMouseClicked

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProduto;
    private javax.swing.JButton btnPronto1;
    private javax.swing.JButton btnPronto2;
    private javax.swing.JButton btnPronto3;
    private javax.swing.JButton btnPronto4;
    private javax.swing.JButton btnPronto5;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JButton btnVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblPed1;
    private javax.swing.JLabel lblPed2;
    private javax.swing.JLabel lblPed3;
    private javax.swing.JLabel lblPed4;
    private javax.swing.JLabel lblPed5;
    private javax.swing.JLabel lblSair;
    private javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables
}
