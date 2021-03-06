package gui;

import com.sun.rowset.JdbcRowSetImpl;
import java.awt.Image;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author robertmcnamara
 */
public class search extends javax.swing.JFrame {
    String location;
    double minPrice = 0.00;
    double maxPrice = 1000000.00;
    ImageIcon icon = new ImageIcon("src/images/icon.png");
    Image symbol = icon.getImage();
    
    String user;
    String date;
    
    JdbcRowSetImpl search = new JdbcRowSetImpl();

    /** Creates new form search */
    public search() throws SQLException {
        initComponents();
        this.setIconImage(symbol);
        search.setUrl("jdbc:mysql://localhost/cp");
        search.setUsername("root");
        search.setPassword("");
        
    }

    public search(String user, String date) throws SQLException {
        initComponents();
        this.user = user;
        this.date = date;
        locationTf.requestFocus(true);
        
        //search.setUrl("jdbc:mysql://itshares.student.litdom.lit.ie:3306/litrealtyrobertm");
        //search.setUsername("isd3user");
        //search.setPassword("pass");
        
        search.setUrl("jdbc:mysql://localhost/cp");
        search.setUsername("root");
        search.setPassword("");
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        locationTf = new javax.swing.JTextField();
        goBut = new javax.swing.JButton();
        backBut = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        imageLabel.setFont(new java.awt.Font("Tahoma", 0, 24));
        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LIT_Logo.jpg"))); // NOI18N
        imageLabel.setText("   Lit Realty  ");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 14));
        jLabel1.setText("Please enter your search criteria ");

        jLabel2.setText("Enter Location:");

        jLabel3.setText("Enter price range:");

        goBut.setText("go");
        goBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButActionPerformed(evt);
            }
        });

        backBut.setText("exit");
        backBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Any", "€100 000 - €150 000", "€150 000 - €200 000", "€200 000 - €250 000", "€250 000 - €350 000", "€350 000 - €500 000", "Over €500 000" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(46, 46, 46)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jLabel2)
                            .add(goBut)
                            .add(jLabel3))
                        .add(18, 18, 18)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(backBut)
                            .add(locationTf, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .add(jComboBox1, 0, 0, Short.MAX_VALUE)))
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 298, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(10, 10, 10)
                        .add(imageLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 374, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(10, 10, 10)
                .add(imageLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jLabel1)
                .add(30, 30, 30)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(locationTf, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel2))
                .add(9, 9, 9)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel3))
                .add(26, 26, 26)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(goBut)
                    .add(backBut))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 398, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButActionPerformed
        mainMenuFrame back = new mainMenuFrame(user, date);
        back.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButActionPerformed

    private void goButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButActionPerformed
        try {
            location = locationTf.getText();
            try {
                search.setCommand("SELECT * FROM properties WHERE city = ?");
                search.setString(1, location);
                search.execute();
            } catch (SQLException ex) {
                Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(search.next()){
            if(location == null || "".equals(location)){
                    JOptionPane.showMessageDialog(this, "Error; please enter a location");
                    locationTf.setText("");
                    locationTf.requestFocus(true);
            }
            else
                {
                try {
                    retrieveUpdateDelete next = new retrieveUpdateDelete(location, minPrice, maxPrice, user, date);
                    
                    this.setVisible(false);
                    next.setVisible(true);
                    //this.setVisible(false);
                } catch (SQLException ex) {
                   JOptionPane.showMessageDialog(this, "error with search \nPlease try again.", "ERROR", JOptionPane.WARNING_MESSAGE);
                    JOptionPane.showMessageDialog(this, ex, "ERROR", JOptionPane.WARNING_MESSAGE);
                }
                }
            }
            else{
                    JOptionPane.showMessageDialog(this, "No Properties match the criteria");
                    locationTf.setText("");
                    locationTf.requestFocus(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    }//GEN-LAST:event_goButActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        //getting values from jCombo box
        //if the value dosn't change use the default values from the global variables
        int selection = jComboBox1.getSelectedIndex();
        
         switch (selection){
            case 0:  minPrice = 0; maxPrice = 1000000; break;
            case 1:  minPrice = 100000; maxPrice = 150000; break;
            case 2:  minPrice = 150000; maxPrice = 200000; break;
            case 3:  minPrice = 200000; maxPrice = 250000; break;
            case 4:  minPrice = 250000; maxPrice = 350000; break;  
            case 5:  minPrice = 350000; maxPrice = 500000; break;
            case 6:  minPrice = 500000; maxPrice = 1000000; break;
         }
        
    }//GEN-LAST:event_jComboBox1ItemStateChanged

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
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    new search().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBut;
    private javax.swing.JButton goBut;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField locationTf;
    // End of variables declaration//GEN-END:variables

    
}
