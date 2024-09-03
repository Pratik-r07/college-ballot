/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Sanjay
 */
public class Result extends javax.swing.JFrame {
    public Result() {
        initComponents();
        DisplayPost();
        winLbl.setVisible(false);
    }
   Connection Con = null;
PreparedStatement pst = null;
ResultSet Rs = null;
Statement St = null;

    @SuppressWarnings("unchecked")
    int WinnerID,Votes,Percentage;
    private void GetWinner()
{
     try{
             Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/candidates","root","");
             St = Con.createStatement();
             String Query = "select PostID, Count(PostId) from votes where PostId="+Key+" Group BY CandidateId ORDER BY CandidateId DESC LIMIT 1 ";
             Rs = St.executeQuery(Query);
            while (Rs.next()){
                //JOptionPane.showMessageDialog(this,""+Rs.getInt(1));
            WinnerID = Rs.getInt(1);
            }
        }catch (SQLException e){
    JOptionPane.showMessageDialog(this,e);
        }
}
   private ImageIcon ResizePhoto(String ImagePath, byte[] pic)
{
ImageIcon MyImage = null;
if(ImagePath != null)
{
    MyImage = new ImageIcon(ImagePath);
}else{
    MyImage = new ImageIcon(pic);
}
Image img = MyImage.getImage();
Image newImg = img.getScaledInstance(CandidatePictureLbl.getWidth(), CandidatePictureLbl.getHeight (), Image.SCALE_SMOOTH);
ImageIcon image = new ImageIcon(newImg);
return image;
}
    String imgpath = null;

    private void GetWinnerData(){
        String Query = "select cphoto,cname from candidate where cid="+WinnerID;
            Statement St;
            ResultSet Rs;
            try{
                Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/candidates","root","");
                St = Con.createStatement();
                Rs = St.executeQuery(Query);
                if(Rs.next())
                {
                    CandidatePictureLbl.setIcon(ResizePhoto(null,Rs.getBytes("cphoto")));
                    WinnerLbl.setText(Rs.getString("cname"));
                } 
            }
            catch (Exception e){
        }

    }
     private void GetVotes()
{
     try{
             Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/candidates","root","");
             St = Con.createStatement();
             String Query = "select Count(CandidateId) from votes where CandidateId="+WinnerID;
             Rs = St.executeQuery(Query);
            while (Rs.next()){
            Votes = Rs.getInt(1);
         //JOptionPane.showMessageDialog(this,""+Votes);
         VotesLbl.setText(Votes+" Votes");
            }
        }catch (SQLException e){
    JOptionPane.showMessageDialog(this,e);
        }
}
     int TotalVotes;
     double WinPercentage;
    private void GetPercentage()
{
     try{
             Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/candidates","root","");
             St = Con.createStatement();
             String Query = "select Count(*) from votes where PostId="+Key;
             Rs = St.executeQuery(Query);
            while (Rs.next()){
            TotalVotes = Rs.getInt(1);
         JOptionPane.showMessageDialog(this,TotalVotes);
         //VotesLbl.setText(Votes+" Votes");
           WinPercentage = (Votes*100)/TotalVotes;
           PercentageLbl.setText(new DecimalFormat("##.##").format(WinPercentage)+"%");
            }
        }catch (SQLException e){
    JOptionPane.showMessageDialog(this,e);
       
        }
}
 
    private void DisplayPost()
 {
      
        try{
             Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/candidates","root","");
             St = Con.createStatement();
             Rs = St.executeQuery("Select * from posttbl");
             PostTable.setModel(DbUtils.resultSetToTableModel(Rs));
        }catch (SQLException e){
    }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        VotesLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PostTable = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        winLbl = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CandidatePictureLbl = new javax.swing.JLabel();
        WinnerLbl = new javax.swing.JLabel();
        CountedLbl = new javax.swing.JLabel();
        PercentageLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Algerian", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("College Ballot");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );

        VotesLbl.setBackground(new java.awt.Color(255, 255, 255));
        VotesLbl.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        VotesLbl.setText("Votes");

        PostTable.setBackground(new java.awt.Color(204, 255, 255));
        PostTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        PostTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PostTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(PostTable);

        jButton3.setFont(new java.awt.Font("Javanese Text", 3, 18)); // NOI18N
        jButton3.setText("Back");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        winLbl.setBackground(new java.awt.Color(255, 255, 255));
        winLbl.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        winLbl.setForeground(new java.awt.Color(0, 255, 204));
        winLbl.setText("Winnner");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Election List");

        CandidatePictureLbl.setBackground(new java.awt.Color(255, 255, 255));
        CandidatePictureLbl.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        CandidatePictureLbl.setText("photo");

        WinnerLbl.setBackground(new java.awt.Color(255, 255, 255));
        WinnerLbl.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        WinnerLbl.setText("Name");

        CountedLbl.setBackground(new java.awt.Color(255, 255, 255));
        CountedLbl.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N

        PercentageLbl.setBackground(new java.awt.Color(255, 255, 255));
        PercentageLbl.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        PercentageLbl.setText("Percentage");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(CountedLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(WinnerLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CandidatePictureLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(winLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(VotesLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PercentageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 110, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(CountedLbl))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(winLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CandidatePictureLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(VotesLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PercentageLbl)))
                        .addGap(18, 18, 18)
                        .addComponent(WinnerLbl)))
                .addGap(17, 17, 17)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int Key = -1;
    private void PostTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PostTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)PostTable.getModel();
        int MyIndex = PostTable.getSelectedRow();
        Key = Integer.parseInt(model.getValueAt(MyIndex, 0).toString());
        GetWinner();
        GetWinnerData();
        GetVotes();
        GetPercentage();
        winLbl.setVisible(true);
    }//GEN-LAST:event_PostTableMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        new Mainmenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Result().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CandidatePictureLbl;
    private javax.swing.JLabel CountedLbl;
    private javax.swing.JLabel PercentageLbl;
    private javax.swing.JTable PostTable;
    private javax.swing.JLabel VotesLbl;
    private javax.swing.JLabel WinnerLbl;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel winLbl;
    // End of variables declaration//GEN-END:variables
}
