/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package handenur_agbulut_20070006069;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Handenur
 */



public class CreatMovie extends javax.swing.JFrame {
    
    public CreatMovie() {
        
        
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

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        year = new javax.swing.JTextField();
        Enter = new javax.swing.JButton();
        length = new javax.swing.JTextField();
        movietitle = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        genre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Title1 = new javax.swing.JLabel();
        studioName = new javax.swing.JTextField();
        showmovielist = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        AvgRating = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create Movie Page");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 440, 100));

        Title.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Title.setText("Title:");
        getContentPane().add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 117, 42));
        getContentPane().add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 217, 45));

        Enter.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        Enter.setText("ENTER");
        Enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterActionPerformed(evt);
            }
        });
        getContentPane().add(Enter, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 160, 60));
        getContentPane().add(length, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 217, 45));
        getContentPane().add(movietitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 217, 45));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Year:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 117, 42));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Length:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 117, 42));
        getContentPane().add(genre, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 217, 45));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Genre:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 70, 42));

        Title1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        Title1.setForeground(new java.awt.Color(255, 255, 255));
        Title1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Title1.setText("Studio Name:");
        getContentPane().add(Title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 150, 42));
        getContentPane().add(studioName, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 217, 45));

        showmovielist.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        showmovielist.setForeground(new java.awt.Color(102, 255, 0));
        showmovielist.setText("Show Movie List");
        showmovielist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showmovielistActionPerformed(evt);
            }
        });
        getContentPane().add(showmovielist, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 520, 330, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Avg Rating:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 120, -1));
        getContentPane().add(AvgRating, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 220, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterActionPerformed
           //movieid kendi kendine artsın
           //okuma ekle
           String title = movietitle.getText();
           String year1 = year.getText();
           String length1 = length.getText();
           String genre1= genre.getText();
           String StudioName = studioName.getText();
           String rating = AvgRating.getText();
           
           File f = new File("src//Movie.txt");
        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter(f,true));
            Movies m = new Movies();
            writer.append(m.getId()+" "+title + " "+ year1 + " " + length1 + " " + genre1 + " " + StudioName + " " + rating + "\n");
            writer.close();
            JOptionPane.showMessageDialog(null, "Success");
            
            setVisible(false);
            new CreatMovie().setVisible(true);
      
            
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex) {
            Logger.getLogger(CreatMovie.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(f))); 
            String s = reader.readLine();
            
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex) {
            
        }
    }//GEN-LAST:event_EnterActionPerformed

    private void showmovielistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showmovielistActionPerformed
        MoviesList movie = new MoviesList();
        movie.setVisible(true); 
        this.setVisible(false); 
        MoviesList.getMovieList();   
    }//GEN-LAST:event_showmovielistActionPerformed
        
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
            java.util.logging.Logger.getLogger(CreatMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreatMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreatMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreatMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreatMovie().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AvgRating;
    private javax.swing.JButton Enter;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Title1;
    private javax.swing.JTextField genre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField length;
    private javax.swing.JTextField movietitle;
    private javax.swing.JButton showmovielist;
    private javax.swing.JTextField studioName;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}
