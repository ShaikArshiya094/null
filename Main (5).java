import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class SEdit extends javax.swing.JFrame {

     Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    PreparedStatement st = null;
    private String path;
    private String s;
    
    public SEdit() {
       super("Edit Criminal info");
        conn = dbaseConnx.openConnection();
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
  
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        file = new javax.swing.JLabel();
        imageLabel = new javax.swing.JLabel();
        fileNumba = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        fullnames = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        Register2 = new javax.swing.JButton();
        select = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        offenze = new javax.swing.JTextField();
        baiil = new javax.swing.JTextField();
        jaiil = new javax.swing.JTextField();
        gender = new javax.swing.JTextField();
        Nation = new javax.swing.JTextField();
        delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(0, 51, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Edit Criminal  Record Page", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 3, 24))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EDIT CRIMINAL RECORD");

        file.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        file.setText("Case/ File Number");

        fileNumba.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        fileNumba.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fileNumba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileNumbaActionPerformed(evt);
            }
        });

        age.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        age.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        fullnames.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        fullnames.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel21.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel21.setText("Type of Offense");

        jLabel22.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel22.setText("Gender");

        jLabel23.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel23.setText("Age");

        jLabel24.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel24.setText("Nationality");

        jLabel25.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel25.setText("Fullnames");

        jLabel26.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel26.setText("Bail Status");

        jLabel27.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel27.setText("Jail Term");

        Register2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        Register2.setText("Exit");
        Register2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Register2ActionPerformed(evt);
            }
        });

        select.setText("SEARCH RECORD");
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });

        Update.setBackground(new java.awt.Color(0, 102, 204));
        Update.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        offenze.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        offenze.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        baiil.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        baiil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jaiil.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jaiil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        gender.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        gender.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Nation.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Nation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        delete.setBackground(new java.awt.Color(255, 51, 0));
        delete.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(file, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fullnames, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(baiil, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jaiil, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fileNumba, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Nation, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(delete, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(offenze, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Register2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(select, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(428, 428, 428))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Register2, Update, delete});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(select, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(file, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fileNumba, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nation, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(offenze, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fullnames, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(baiil, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jaiil, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(279, 279, 279)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Register2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Update)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Register2, Update});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }

    private void fileNumbaActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void Register2ActionPerformed(java.awt.event.ActionEvent evt) {
       
        System.exit(0);
    }

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {
 
       try {
            stmt = conn.createStatement();
            int Id = Integer.parseInt(fileNumba.getText());
            String Fullnames = fullnames.getText();
            String Age = age.getText();
            String Gender = gender.getText();
            String Bail = baiil.getText();
            String Jail = jaiil.getText();
            String Nationality = Nation.getText();
            String Offense = offenze.getText();

            if("".equals(Fullnames)){
                JOptionPane.showMessageDialog(null, "The fullnames field is required");
            }else if("".equals(Age)){
                JOptionPane.showMessageDialog(null, "The age field is required");
            }else if("".equals(Gender)){
                JOptionPane.showMessageDialog(null, "The gender field is required");
            }else if("".equals(Bail)){
                JOptionPane.showMessageDialog(null, "The bail field is required");
            }else if("".equals(Jail)){
                JOptionPane.showMessageDialog(null, "The jail field is required");
            }else if("".equals(Nationality)){
                JOptionPane.showMessageDialog(null, "The nationality field is required");
            }else if("".equals(Offense)){
                JOptionPane.showMessageDialog(null, "The offense field is required");
            }else{
                String sql = "UPDATE register SET  fullnames = '"+Fullnames+"', age = '"+ Age+"',  "
                        + "gender = '"+ Gender +"', bail = '"+ Bail +"', jail = '"+ Jail +"', nationality = '"+ Nationality +"', offense = '"+ Offense+"' WHERE fileNumber = '"+Id+"'";
                stmt.executeUpdate(sql);
                
                JOptionPane.showMessageDialog(null, "Criminal Record Successfully Updated");
                
                setVisible(false);
               ShowRecords object = new ShowRecords();
                object.setVisible(true);
            }
        }catch (SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {
        
        try{
            stmt = conn.createStatement();
            int Id = Integer.parseInt(fileNumba.getText());
            
            String sql = "SELECT * FROM register WHERE fileNumber ='"+Id+"'";
            rs = stmt.executeQuery(sql);
            
            byte[] imgData = null;
            if(rs.next()){
                gender.setText(rs.getString("gender"));
                age.setText(rs.getString("age"));
                offenze.setText(rs.getString("offense"));
                fullnames.setText(rs.getString("fullnames"));
                baiil.setText(rs.getString("bail"));
                jaiil.setText(rs.getString("jail"));
                Blob img = rs.getBlob("image");
                imgData = img.getBytes(1, (int)img.length());
                BufferedImage imag = ImageIO.read(new ByteArrayInputStream(imgData));
                ImageIcon jk1 = new ImageIcon(imag);
                imageLabel.setIcon(RImage(jk1));
            }else{
                JOptionPane.showMessageDialog(null, "Record Not Found");
            }
        }
        catch (SQLException | NumberFormatException e){
            JOptionPane.showMessageDialog(null, e);
        } catch (IOException ex) {
            Logger.getLogger(SEdit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            stmt = conn.createStatement();
            int Id = Integer.parseInt(fileNumba.getText());
            String sql = "DELETE FROM register WHERE fileNumber ='"+Id+"'";
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Criminal Record cleared");
            setVisible(false);
            ShowRecords object = new ShowRecords();
            object.setVisible(true);
            
        }catch (SQLException | NumberFormatException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SEdit().setVisible(true);
            }
        });
    }
    private javax.swing.JTextField Nation;
    private javax.swing.JButton Register;
    private javax.swing.JButton Register1;
    private javax.swing.JButton Register2;
    private javax.swing.JButton Update;
    private javax.swing.JButton Upload;
    private javax.swing.JButton Upload1;
    private javax.swing.JTextField age;
    private javax.swing.JTextField age1;
    private javax.swing.JTextField age2;
    private javax.swing.JTextField baiil;
    private javax.swing.JComboBox bail;
    private javax.swing.JComboBox bail1;
    private javax.swing.JButton delete;
    private javax.swing.JLabel file;
    private javax.swing.JTextField fileNumba;
    private javax.swing.JTextField fileNumber;
    private javax.swing.JTextField fileNumber1;
    private javax.swing.JTextField fullnames;
    private javax.swing.JTextField fullnames1;
    private javax.swing.JTextField fullnames2;
    private javax.swing.JTextField gender;
    private javax.swing.JComboBox gender1;
    private javax.swing.JComboBox gender2;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img2;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jaiil;
    private javax.swing.JComboBox jail;
    private javax.swing.JComboBox jail1;
    private javax.swing.JComboBox nationality;
    private javax.swing.JComboBox nationality1;
    private javax.swing.JComboBox offense;
    private javax.swing.JComboBox offense1;
    private javax.swing.JTextField offenze;
    private javax.swing.JButton select;

     private ImageIcon RImage(ImageIcon Imagepath) {
        Image img = Imagepath.getImage();
        Image newimg = img.getScaledInstance(imageLabel.getWidth(),imageLabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newimg);
       return image;
    }
    
}