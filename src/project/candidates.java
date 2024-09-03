/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.sql.DriverManager;
import java.sql.SQLException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author Sanjay
 */
public class candidates extends javax.swing.JFrame {
    /**
     * Creates new form candidates
     */
    public candidates() {
        initComponents();
        Getcandidates();
        DisplayCandidate();
        GetPost();
        GetPostID();
    }

    @SuppressWarnings("unchecked")
      

Connection Con = null;
PreparedStatement pst = null;
ResultSet Rs = null;
Statement St = null;

private void Getcandidates()
{
  try  {
         Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/candidates","root","");
         St = Con.createStatement ();
         String Query = "select * from candidateTbl";
         Rs = St.executeQuery(Query) ;
         while (Rs.next())
         {
          String cid = Rs.getString("cid");
         //candidatetable.addInt(cid);
           }
  } catch (SQLException e) {
}
}

private void GetPost()
{
  try  {
         Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/candidates","root","");
         St = Con.createStatement ();
         String Query = "select * from posttbl";
         Rs = St.executeQuery(Query) ;
         while (Rs.next())
         {
          String Post = Rs.getString("Postname");
         CpostCb.addItem(Post);
           }
  } catch (SQLException e) {
}
}

private void GetPostID()
{
  try  {
         Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/candidates","root","");
         St = Con.createStatement ();
         String Query = "select * from posttbl";
         Rs = St.executeQuery(Query) ;
         while (Rs.next())
         {
          String Postid = Rs.getString("Pid");
         Cpostid.addItem(Postid);
           }
  } catch (SQLException e) {
}
}

 

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CnameTb = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        candidatetable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CageTb = new javax.swing.JTextField();
        CgenCb = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        CpostCb = new javax.swing.JComboBox<>();
        Browsebutton = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        CyearCb = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        CbranchCb = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CandidatePictureLbl = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        add = new javax.swing.JButton();
        Cpostid = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(368, 368, 368))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel2.setText("MAnage candiDATES");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Full Name");

        CnameTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CnameTbActionPerformed(evt);
            }
        });

        candidatetable.setBackground(new java.awt.Color(204, 255, 255));
        candidatetable.setForeground(new java.awt.Color(0, 51, 153));
        candidatetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Age", "Gender", "Branch", "Year", "Post"
            }
        ));
        candidatetable.setGridColor(new java.awt.Color(204, 255, 255));
        candidatetable.setRowHeight(25);
        candidatetable.setSelectionBackground(new java.awt.Color(0, 0, 204));
        candidatetable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                candidatetableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(candidatetable);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Age");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("Gender");

        CageTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CageTbActionPerformed(evt);
            }
        });

        CgenCb.setFont(new java.awt.Font("Javanese Text", 3, 18)); // NOI18N
        CgenCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Transgender " }));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setText("Post");

        CpostCb.setFont(new java.awt.Font("Javanese Text", 3, 18)); // NOI18N
        CpostCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CpostCbActionPerformed(evt);
            }
        });

        Browsebutton.setFont(new java.awt.Font("Javanese Text", 3, 18)); // NOI18N
        Browsebutton.setText("Browse");
        Browsebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BrowsebuttonMouseClicked(evt);
            }
        });

        edit.setFont(new java.awt.Font("Javanese Text", 3, 18)); // NOI18N
        edit.setText("Edit");
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
        });

        delete.setFont(new java.awt.Font("Javanese Text", 3, 18)); // NOI18N
        delete.setText("Delete");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });

        CyearCb.setFont(new java.awt.Font("Javanese Text", 3, 18)); // NOI18N
        CyearCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FE", "SE", "TE", "BE" }));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Year");

        CbranchCb.setFont(new java.awt.Font("Javanese Text", 3, 18)); // NOI18N
        CbranchCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IT", "COMPS", "DS", "AI ML", "MECH", "CIVIL" }));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setText("Branch");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setText("Photo");

        CandidatePictureLbl.setBackground(new java.awt.Color(255, 255, 255));
        CandidatePictureLbl.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        CandidatePictureLbl.setText("Photo");

        back.setFont(new java.awt.Font("Javanese Text", 3, 18)); // NOI18N
        back.setText("Back");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        add.setFont(new java.awt.Font("Javanese Text", 3, 18)); // NOI18N
        add.setText("Add");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });

        Cpostid.setFont(new java.awt.Font("Javanese Text", 3, 18)); // NOI18N
        Cpostid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CpostidActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setText("PostID");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(388, 388, 388))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CnameTb)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CageTb, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(CpostCb, 0, 229, Short.MAX_VALUE)
                                        .addComponent(Cpostid, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(40, 40, 40))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(52, 52, 52)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(CyearCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(32, 32, 32)
                                    .addComponent(CbranchCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(Browsebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CandidatePictureLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CgenCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CnameTb)
                    .addComponent(CageTb, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CgenCb, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CpostCb, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cpostid, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CyearCb, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CbranchCb, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addComponent(jLabel9)
                        .addGap(12, 12, 12)
                        .addComponent(CandidatePictureLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Browsebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addGap(27, 27, 27)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(265, 265, 265))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 787, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CageTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CageTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CageTbActionPerformed

    private void CnameTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CnameTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CnameTbActionPerformed
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
    private void BrowsebuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BrowsebuttonMouseClicked
          
          JFileChooser chooser = new JFileChooser();
          chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
          FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images","jpg","gif","png");
          chooser.addChoosableFileFilter(filter);
          int result = chooser.showSaveDialog(null);
          if(result == JFileChooser.APPROVE_OPTION)
          {
              File selectedFile = chooser.getSelectedFile();
              String path = selectedFile.getAbsolutePath();
              CandidatePictureLbl.setIcon(ResizePhoto(path,null));
              imgpath = path;
          }


    }//GEN-LAST:event_BrowsebuttonMouseClicked
    private void DisplayCandidate()
    {
      
        try{
             Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/candidates","root","");
             St = Con.createStatement();
             Rs = St.executeQuery("Select * from candidate");
             candidatetable.setModel(DbUtils.resultSetToTableModel(Rs));
        }catch (SQLException e){
    }
    }
   int cid ;
   Statement St1 = null;
   ResultSet Rs1 = null;
  private void candcount()
  {
   try{
        St1 = Con.createStatement();
        Rs1 = St1.executeQuery("select max(cid) from candidate");
        Rs1.next ();
        cid = Rs1.getInt(1)+1;
}catch (SQLException Ex){
    }
  }
    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        // TODO add your handling code here:
       if(CageTb.getText().isEmpty() || CnameTb.getText().isEmpty() || CgenCb.getSelectedIndex()==-1 || CyearCb.getSelectedIndex()==-1 || CbranchCb.getSelectedIndex()== -1 || CpostCb.getSelectedIndex()== -1 || Cpostid.getSelectedIndex()== -1)
        {
            JOptionPane.showMessageDialog(this,"Missing Information");
    }//GEN-LAST:event_addMouseClicked
       else{
           try{
             candcount();
            Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/candidates","root","");
            PreparedStatement Add = Con.prepareStatement("Insert into candidate values(?,?,?,?,?,?,?,?,?)");       
            InputStream img = new FileInputStream(imgpath);
            Add.setInt (1, cid);
            Add.setString(2, CnameTb.getText ());
           Add.setInt(3,Integer.parseInt(CageTb.getText()));
            Add.setString(4, CgenCb.getSelectedItem().toString());
           Add.setString(5, CyearCb.getSelectedItem().toString());
           Add.setString(6, CbranchCb.getSelectedItem() .toString());
           Add.setString(7, CpostCb.getSelectedItem() .toString()); 
           Add.setBlob(8, img);
           Add.setString(9,Cpostid.getSelectedItem().toString());
           int row = Add.executeUpdate();
           JOptionPane.showMessageDialog(this, "Candidate Registered");
           Con.close();
           DisplayCandidate();
           }catch (HeadlessException | FileNotFoundException | NumberFormatException | SQLException ex){
               JOptionPane.showMessageDialog(this, ex);
           }
       }
    }
    
        private void FetchPhoto()
        {
            String Query = "select cphoto from candidate where cid="+Key;
            Statement St;
            ResultSet Rs;
            try{
                Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/candidates","root","");
                St = Con.createStatement();
                Rs = St.executeQuery(Query);
                if(Rs.next())
                {
                    CandidatePictureLbl.setIcon(ResizePhoto(null,Rs.getBytes("cphoto")));
            } 
            }
            catch (Exception e){
        }
        }
    int Key = -1;
    private void candidatetableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_candidatetableMouseClicked
       DefaultTableModel model = (DefaultTableModel)candidatetable.getModel();
       int MyIndex = candidatetable.getSelectedRow();
       Key = Integer.parseInt(model.getValueAt(MyIndex, 0).toString());
       CnameTb.setText(model.getValueAt(MyIndex , 1).toString());
       CageTb.setText(model.getValueAt(MyIndex, 3).toString());
       CgenCb.setSelectedItem(model.getValueAt(MyIndex, 3).toString());
       CyearCb.setSelectedItem(model.getValueAt(MyIndex, 4).toString());
       CbranchCb.setSelectedItem(model.getValueAt(MyIndex, 5).toString());
       CyearCb.setSelectedItem(model.getValueAt(MyIndex, 6).toString());
       CpostCb.setSelectedItem(model.getValueAt(MyIndex, 7).toString());
       Cpostid.setSelectedItem(model.getValueAt(MyIndex, 8).toString());
       FetchPhoto();
    }//GEN-LAST:event_candidatetableMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        if(Key == -1)
        {
           JOptionPane.showMessageDialog(this, "Select the candidate to be deleted"); 
        }else{
            try{
        Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/candidates","root","");
        String Query = "Delete from candidate where cid="+Key;
        Statement Del = Con.createStatement();
        Del.executeUpdate(Query);
        JOptionPane.showMessageDialog(this, "candidate deleted succesfully");
        DisplayCandidate();
    }catch (HeadlessException | SQLException e){
             JOptionPane.showMessageDialog(this, e);
            }
    }//GEN-LAST:event_deleteMouseClicked
    }
    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
      // if(Key == -1 ||CageTb.getText().isEmpty() || CnameTb.getText().isEmpty() || CgenCb.getSelectedIndex()==-1 || CyearCb.getSelectedIndex()==-1 || CbranchCb.getSelectedIndex()== -1 || CpostCb.getSelectedIndex()== -1){
           //JOptionPane.showMessageDialog(this, "Missing Information");
       if(imgpath != null){
           try{ 
           InputStream img =new FileInputStream(imgpath);
           Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/candidates","root","");
           String Query = "Update candidate set cname=?,cage=?,cgen=?,cbranch=?,cbranch=?,cpost=?,cphoto=? where cid=?";
           PreparedStatement UpdateQuery = Con.prepareStatement(Query);
           UpdateQuery.setString(1,CnameTb.getText());
           UpdateQuery.setInt(2,Integer.valueOf(CageTb.getText().toString()));
           UpdateQuery.setString(3, CgenCb.getSelectedItem().toString());
           UpdateQuery.setString(4, CyearCb.getSelectedItem().toString());
           UpdateQuery.setString(5, CbranchCb.getSelectedItem() .toString());
           UpdateQuery.setString(6, CpostCb.getSelectedItem() .toString()); 
           UpdateQuery.setBlob(7, img);
           UpdateQuery.setInt(8,Key);
         //  UpdateQuery.setString(9, Cpostid.getSelectedItem().toString());
          if( UpdateQuery.executeUpdate() ==1){
           JOptionPane.showMessageDialog(this, "Candidate Updated Succesfully");
           DisplayCandidate();
          }
            else{
           JOptionPane.showMessageDialog(this,"Missing Information");
          }
           }catch(Exception Ex){
               JOptionPane.showMessageDialog(this, Ex);
           }
       }
       else{
         JOptionPane.showMessageDialog(this, "Select Photo");
         CandidatePictureLbl.setIcon(null);
         CandidatePictureLbl.setText(""); 
               }
       imgpath = null;
    }//GEN-LAST:event_editMouseClicked

    private void CpostCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CpostCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CpostCbActionPerformed

    private void CpostidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CpostidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CpostidActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
         new Mainmenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked
    

    //}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
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
            java.util.logging.Logger.getLogger(candidates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(candidates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(candidates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(candidates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new candidates().setVisible(true);
        });
    }
 
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Browsebutton;
    private javax.swing.JTextField CageTb;
    private javax.swing.JLabel CandidatePictureLbl;
    private javax.swing.JComboBox<String> CbranchCb;
    private javax.swing.JComboBox<String> CgenCb;
    private javax.swing.JTextField CnameTb;
    private javax.swing.JComboBox<String> CpostCb;
    private javax.swing.JComboBox<String> Cpostid;
    private javax.swing.JComboBox<String> CyearCb;
    private javax.swing.JButton add;
    private javax.swing.JButton back;
    private javax.swing.JTable candidatetable;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
