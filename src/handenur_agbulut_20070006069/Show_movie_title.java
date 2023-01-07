package handenur_agbulut_20070006069;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Handenur
 */
public class Show_movie_title extends javax.swing.JFrame {

    /**
     * Creates new form Show_movie_id_title
     */
    public Show_movie_title() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        enter = new javax.swing.JButton();
        go = new javax.swing.JButton();
        TextField = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Movie Title:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Show Movie title page");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 330, 50));

        enter.setText("Enter");
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });
        getContentPane().add(enter, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 150, 50));

        go.setText("Go to home page");
        go.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goActionPerformed(evt);
            }
        });
        getContentPane().add(go, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 210, 60));
        getContentPane().add(TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 270, 50));

        back.setText("Back to Page");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 210, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed
        String str = TextField.getText();
        if(str.equals("Captain Marvel"))
        {
            JOptionPane.showMessageDialog(this, "id number: 1 " ,"Info message",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(str.equals("Aladdin"))
        {
            JOptionPane.showMessageDialog(this, "id number: 2 " ,"Info message",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(str.equals("Batman"))
        {
            JOptionPane.showMessageDialog(this, "id number: 3 " ,"Info message",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(str.equals("La La Land"))
        {
            JOptionPane.showMessageDialog(this, "id number: 4 " ,"Info message",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(str.equals("The Conservation Game"))
        {
            JOptionPane.showMessageDialog(this, "id number: 5 " ,"Info message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Please, try again!" ,"Info message",JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_enterActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Show_movies_star show = new Show_movies_star();
        show.setVisible(true);
        this.setVisible(false); 
    }//GEN-LAST:event_backActionPerformed

    private void goActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goActionPerformed
        Login_Page login = new Login_Page();
        login.setVisible(true);
        this.setVisible(false); 
    }//GEN-LAST:event_goActionPerformed

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
            java.util.logging.Logger.getLogger(Show_movie_title.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Show_movie_title.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Show_movie_title.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Show_movie_title.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Show_movie_title().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextField;
    private javax.swing.JButton back;
    private javax.swing.JButton enter;
    private javax.swing.JButton go;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}