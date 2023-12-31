
import java.awt.CardLayout;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Ananta
 */
public class FormPilihGambarBtnFullScreen extends javax.swing.JFrame {

    /**
     * Creates new form FormPilihGambarBtn
     */
    public FormPilihGambarBtnFullScreen() {
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

        pBtn = new javax.swing.JPanel();
        btnLucario = new javax.swing.JButton();
        btnBlaziken = new javax.swing.JButton();
        btnZoroark = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnGmbr = new javax.swing.JButton();
        btnGmbrComboBox = new javax.swing.JButton();
        pImg = new javax.swing.JPanel();
        lblLucario = new javax.swing.JLabel();
        lblBlaziken = new javax.swing.JLabel();
        lblZoroark = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pBtn.setBackground(new java.awt.Color(51, 51, 255));
        pBtn.setForeground(new java.awt.Color(102, 102, 255));
        pBtn.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 50));

        btnLucario.setText("Lucario");
        btnLucario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLucarioActionPerformed(evt);
            }
        });
        pBtn.add(btnLucario);

        btnBlaziken.setText("Blaziken");
        btnBlaziken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBlazikenActionPerformed(evt);
            }
        });
        pBtn.add(btnBlaziken);

        btnZoroark.setText("Zoroark");
        btnZoroark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZoroarkActionPerformed(evt);
            }
        });
        pBtn.add(btnZoroark);

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        pBtn.add(btnExit);

        btnGmbr.setText("Form Button");
        btnGmbr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGmbrActionPerformed(evt);
            }
        });
        pBtn.add(btnGmbr);

        btnGmbrComboBox.setText("Form Combo Box");
        btnGmbrComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGmbrComboBoxActionPerformed(evt);
            }
        });
        pBtn.add(btnGmbrComboBox);

        getContentPane().add(pBtn, java.awt.BorderLayout.PAGE_START);

        pImg.setLayout(new java.awt.CardLayout());

        lblLucario.setBackground(new java.awt.Color(255, 255, 255));
        lblLucario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLucario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/layout/lucario.png"))); // NOI18N
        lblLucario.setAlignmentY(0.0F);
        pImg.add(lblLucario, "0");

        lblBlaziken.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBlaziken.setIcon(new javax.swing.ImageIcon(getClass().getResource("/layout/blaziken.png"))); // NOI18N
        pImg.add(lblBlaziken, "1");

        lblZoroark.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblZoroark.setIcon(new javax.swing.ImageIcon(getClass().getResource("/layout/zoroark.png"))); // NOI18N
        pImg.add(lblZoroark, "2");

        getContentPane().add(pImg, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLucarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLucarioActionPerformed
        CardLayout c1 = (CardLayout)(pImg.getLayout());
        c1.show(pImg, "0");
    }//GEN-LAST:event_btnLucarioActionPerformed

    private void btnBlazikenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBlazikenActionPerformed
       CardLayout c1 = (CardLayout)(pImg.getLayout());
        c1.show(pImg, "1");
    }//GEN-LAST:event_btnBlazikenActionPerformed

    private void btnZoroarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZoroarkActionPerformed
        CardLayout c1 = (CardLayout)(pImg.getLayout());
        c1.show(pImg, "2");
    }//GEN-LAST:event_btnZoroarkActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnGmbrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGmbrActionPerformed
        new FormPilihGambarBtn().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGmbrActionPerformed

    private void btnGmbrComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGmbrComboBoxActionPerformed
        new FormTampilGambarComboBox().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGmbrComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(FormPilihGambarBtn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPilihGambarBtn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPilihGambarBtn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPilihGambarBtn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormPilihGambarBtn fullFrame = new FormPilihGambarBtn();
                
                GraphicsDevice device =
                        GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
                device.setFullScreenWindow(fullFrame);
                
                fullFrame.setVisible(true);
                       
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBlaziken;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGmbr;
    private javax.swing.JButton btnGmbrComboBox;
    private javax.swing.JButton btnLucario;
    private javax.swing.JButton btnZoroark;
    private javax.swing.JLabel lblBlaziken;
    private javax.swing.JLabel lblLucario;
    private javax.swing.JLabel lblZoroark;
    private javax.swing.JPanel pBtn;
    private javax.swing.JPanel pImg;
    // End of variables declaration//GEN-END:variables
}
