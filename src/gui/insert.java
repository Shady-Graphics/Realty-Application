package gui;

import com.sun.rowset.JdbcRowSetImpl;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class insert extends javax.swing.JFrame {

    JdbcRowSetImpl insertRowSet = new JdbcRowSetImpl();
    String street = "";
    String city = "";
    String listingNumber = "";
    int styleID;
    int typeID;
    String bedrooms = "";
    String bathrooms = "";
    String squareFeet = "";
    String lotSize = "";
    String description = "";
    String strGarageSize = "";
    int gargageID;
    //int agentID;
    String photo = "";
    String price = "";
    ImageIcon icon = new ImageIcon("src/images/icon.png");
    Image symbol = icon.getImage();
    String user;
    String date;
    String map;
    
    //file chooser
     String filename = File.separator + "";

    /** Creates new form insert */
    public insert(String user, String date) throws SQLException {
        initComponents();
        this.user = user;
        this.date = date;
        this.setIconImage(symbol);
        //insertRowSet.setUrl("jdbc:mysql://itshares.student.litdom.lit.ie:3306/litrealtyrobertm");
        //insertRowSet.setUsername("isd3user");
        //insertRowSet.setPassword("pass");
        
        insertRowSet.setUrl("jdbc:mysql://localhost/cp");

        //rowSet.setUsername("isd3user");
        insertRowSet.setUsername("root");
        insertRowSet.setPassword("");
        streetTF.requestFocus(true);
        
       
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        imageLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        streetLbl = new javax.swing.JLabel();
        cityLbl = new javax.swing.JLabel();
        listingNoLabel = new javax.swing.JLabel();
        styleIdLbl = new javax.swing.JLabel();
        typeLbl = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        streetTF = new javax.swing.JTextField();
        cityTF = new javax.swing.JTextField();
        listingNoTF = new javax.swing.JTextField();
        lotsizeTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionTF = new javax.swing.JTextArea();
        priceTF = new javax.swing.JTextField();
        photoTF = new javax.swing.JTextField();
        propertyStyle = new javax.swing.JComboBox();
        propertyType = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        mapTF = new javax.swing.JTextField();
        browse1 = new javax.swing.JButton();
        browse2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        submitButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bedlbl = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bedroomsSpinner = new javax.swing.JSpinner();
        squarefeetTF = new javax.swing.JTextField();
        garageSize = new javax.swing.JTextField();
        garageType = new javax.swing.JComboBox();
        bathroomNoTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        imageLabel.setFont(new java.awt.Font("Tahoma", 0, 24));
        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LIT_Logo.jpg"))); // NOI18N
        imageLabel.setText("   Lit Realty - System Logon ");

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        streetLbl.setText("Street");

        cityLbl.setText("city");

        listingNoLabel.setText("listing number");

        styleIdLbl.setText("style");

        typeLbl.setText("type");

        jLabel9.setText("description");

        jLabel10.setText("lot size");

        jLabel14.setText("photo");

        jLabel15.setText("price");

        cityTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityTFActionPerformed(evt);
            }
        });

        descriptionTF.setColumns(20);
        descriptionTF.setRows(5);
        jScrollPane1.setViewportView(descriptionTF);

        propertyStyle.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Colonial", "Tudor", "Ranch", "Victorian", "Modern", "Traditional", "Condo", "Apartment", "Other" }));
        propertyStyle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                propertyStyleActionPerformed(evt);
            }
        });

        propertyType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Residential-single", "Residential-multi", "Commercial" }));

        jLabel1.setText("map");

        browse1.setText("browse");
        browse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browse1ActionPerformed(evt);
            }
        });

        browse2.setText("browse");
        browse2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browse2ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(listingNoLabel)
                    .add(cityLbl)
                    .add(styleIdLbl)
                    .add(typeLbl)
                    .add(jLabel10)
                    .add(jLabel14)
                    .add(jLabel9)
                    .add(streetLbl)
                    .add(jLabel1)
                    .add(jLabel15))
                .add(41, 41, 41)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(priceTF, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                    .add(streetTF, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 134, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 363, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(photoTF, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 134, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(browse2))
                    .add(lotsizeTF, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 134, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(cityTF, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 134, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, propertyType, 0, 0, Short.MAX_VALUE)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, propertyStyle, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, listingNoTF, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(mapTF, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 137, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(browse1)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(streetLbl)
                    .add(streetTF, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cityTF, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(cityLbl))
                .add(8, 8, 8)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(listingNoTF, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(listingNoLabel))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(styleIdLbl)
                        .add(18, 18, 18)
                        .add(typeLbl))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(propertyStyle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(propertyType, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(11, 11, 11)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lotsizeTF, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel10))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel14)
                    .add(photoTF, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(browse2))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 162, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED))
                    .add(jLabel9))
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel1)
                    .add(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(mapTF, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(browse1))))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(priceTF, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel15))
                .add(59, 59, 59))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.GridLayout());

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        jPanel3.add(submitButton);

        jButton1.setText("Reset Form");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel3.add(backButton);

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));

        jLabel12.setText("garage");

        jLabel11.setText("garage size");

        jLabel8.setText("square feet");

        bedlbl.setText("bedrooms");

        jLabel7.setText("bathrooms");

        garageType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Attached", "Detached", "Carport" }));

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(bedlbl)
                            .add(jLabel7))
                        .add(33, 33, 33)
                        .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(bathroomNoTF)
                            .add(bedroomsSpinner, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel11)
                            .add(jLabel12)
                            .add(jLabel8))
                        .add(30, 30, 30)
                        .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(garageType, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(squarefeetTF, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .add(garageSize))))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(bedroomsSpinner, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(bedlbl))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(bathroomNoTF, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel7))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(squarefeetTF, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel8))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel11)
                    .add(garageSize, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel12)
                    .add(garageType, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(4, 4, 4)
                        .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(32, 32, 32)
                        .add(jPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(imageLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 509, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(296, 296, 296)
                        .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(20, 20, 20)
                .add(imageLabel)
                .add(26, 26, 26)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 517, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        mainMenuFrame back = new mainMenuFrame(user, date);
        back.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed

        int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to enter a new record", "Insertion", JOptionPane.YES_NO_CANCEL_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            try {
                getData();
                //getting agent id
                insertRowSet.setCommand("SELECT agentId FROM agents WHERE username=?");
                insertRowSet.setString(1, user);
                insertRowSet.execute();
                insertRowSet.next();
                int agentId = insertRowSet.getInt("agentId");

                //select the table to insert into
                insertRowSet.setCommand("SELECT * FROM properties");
                insertRowSet.execute();
                insertRowSet.last();

                //get last id, add one to get next insert id
                int nextInsertId = insertRowSet.getInt("id") + 1;

                //inserting new record
                insertRowSet.moveToInsertRow();
                insertRowSet.updateInt("id", nextInsertId);
                //System.out.println("" + nextInsertId);
                insertRowSet.updateString("street", street);
                insertRowSet.updateString("city", city);
                insertRowSet.updateInt("listingNum", Integer.parseInt(listingNumber));
                insertRowSet.updateInt("styleId", styleID);
                insertRowSet.updateInt("typeId", typeID);
                insertRowSet.updateInt("bedrooms", Integer.parseInt(bedrooms));
                insertRowSet.updateFloat("bathrooms", Float.parseFloat(bathrooms));
                //System.out.println(Float.parseFloat(bathrooms) + "");
                insertRowSet.updateInt("squarefeet", Integer.parseInt(squareFeet));
                insertRowSet.updateString("description", description);
                insertRowSet.updateString("lotsize", lotSize);
                insertRowSet.updateInt("garagesize", Integer.parseInt(strGarageSize));
                insertRowSet.updateInt("garageId", gargageID);
                insertRowSet.updateInt("agentId", agentId);
                //System.out.println("" + agentId);
                insertRowSet.updateString("photo", photo);
                insertRowSet.updateDouble("price", Double.parseDouble(price));
                insertRowSet.updateString("map", map);
                insertRowSet.insertRow();

                JOptionPane.showMessageDialog(this, "Property Successfully Entered.", "Insertion Complete", JOptionPane.INFORMATION_MESSAGE);
                //clearing the form
                resetForm();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "There was a problem inserting this record \nPlease try again.", "ERROR", JOptionPane.WARNING_MESSAGE);
                JOptionPane.showMessageDialog(this, ex, "ERROR", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Record has not being added");
        }



    }//GEN-LAST:event_submitButtonActionPerformed

    private void cityTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityTFActionPerformed

    private void propertyStyleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_propertyStyleActionPerformed
        // TODO add your handling code here:}//GEN-LAST:event_propertyStyleActionPerformed
    }

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            //RESET form
            resetForm();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void browse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browse1ActionPerformed
        JFileChooser fc = new JFileChooser(new File(filename));
        // Show open dialog; this method does not return until the dialog is closed
        fc.showOpenDialog(this);
        File selectedPicture = fc.getSelectedFile();
 
        mapTF.setText((selectedPicture.getName()));
    }//GEN-LAST:event_browse1ActionPerformed

    private void browse2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browse2ActionPerformed
        JFileChooser fc = new JFileChooser(new File(filename));
        // Show open dialog; this method does not return until the dialog is closed
        fc.showOpenDialog(this);
        File selectedPicture = fc.getSelectedFile();
        
        photoTF.setText((selectedPicture.getName()));
    }//GEN-LAST:event_browse2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTextField bathroomNoTF;
    private javax.swing.JLabel bedlbl;
    private javax.swing.JSpinner bedroomsSpinner;
    private javax.swing.JButton browse1;
    private javax.swing.JButton browse2;
    private javax.swing.JLabel cityLbl;
    private javax.swing.JTextField cityTF;
    private javax.swing.JTextArea descriptionTF;
    private javax.swing.JTextField garageSize;
    private javax.swing.JComboBox garageType;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel listingNoLabel;
    private javax.swing.JTextField listingNoTF;
    private javax.swing.JTextField lotsizeTF;
    private javax.swing.JTextField mapTF;
    private javax.swing.JTextField photoTF;
    private javax.swing.JTextField priceTF;
    private javax.swing.JComboBox propertyStyle;
    private javax.swing.JComboBox propertyType;
    private javax.swing.JTextField squarefeetTF;
    private javax.swing.JLabel streetLbl;
    private javax.swing.JTextField streetTF;
    private javax.swing.JLabel styleIdLbl;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel typeLbl;
    // End of variables declaration//GEN-END:variables

    private void getData() {
        street = streetTF.getText();
        city = cityTF.getText();
        listingNumber = listingNoTF.getText();
        styleID = propertyStyle.getSelectedIndex() + 1;
        typeID = propertyType.getSelectedIndex() + 1;
        bedrooms = bedroomsSpinner.getValue().toString();
        bathrooms = bathroomNoTF.getText();
        squareFeet = squarefeetTF.getText();
        lotSize = lotsizeTF.getText();
        description = descriptionTF.getText();
        strGarageSize = garageSize.getText();
        gargageID = garageType.getSelectedIndex() + 1;
        //agentID = agentIDspinner.getValue().toString();
        photo = photoTF.getText();
        price = priceTF.getText();
        map = mapTF.getText();
    }

    private void resetForm() {
        streetTF.setText("");
        cityTF.setText("");
        listingNoTF.setText("");
        propertyStyle.setSelectedIndex(0);
        propertyType.setSelectedIndex(0);
        bedroomsSpinner.getModel().setValue(0);
        bathroomNoTF.setText("");
        squarefeetTF.setText("");
        lotsizeTF.setText("");
        descriptionTF.setText("");
        garageType.setSelectedIndex(0);
        garageSize.setText("");
        photoTF.setText("");
        priceTF.setText("");
    }
    public static void copyFile(File sourceFile, File destFile) throws IOException {
    if(!destFile.exists()) {
        destFile.createNewFile();
    }

    FileChannel source = null;
    FileChannel destination = null;
    try {
        source = new FileInputStream(sourceFile).getChannel();
        destination = new FileOutputStream(destFile).getChannel();

        // previous code: destination.transferFrom(source, 0, source.size());
        // to avoid infinite loops, should be:
        long count = 0;
        long size = source.size();              
        while((count += destination.transferFrom(source, 0, size-count))<size);
    }
    finally {
        if(source != null) {
            source.close();
        }
        if(destination != null) {
            destination.close();
        }
    }
}
}
