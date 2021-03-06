package gui;

import com.sun.rowset.JdbcRowSetImpl;
import java.awt.Image;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class LoginFrame extends javax.swing.JFrame {

    String userName= "";
    char[] password= null;
    int count;
    JdbcRowSetImpl loginRowSet = new JdbcRowSetImpl();
    ImageIcon icon = new ImageIcon("src/images/icon.png");
    Image symbol = icon.getImage();

    /** Creates new form LoginFrame */
    public LoginFrame() throws ClassNotFoundException, SQLException {
        initComponents();
        this.setIconImage(symbol);
        
        //college 
        //loginRowSet.setUrl("jdbc:mysql://itshares.student.litdom.lit.ie:3306/litrealtyrobertm");
        //loginRowSet.setUsername("isd3user");
        //loginRowSet.setPassword("pass");

        
        //home
        loginRowSet.setUrl("jdbc:mysql://localhost/cp");
        
        loginRowSet.setUsername("root");
        loginRowSet.setPassword("");

        //reseting login variables
        userName = "";
        password = null;
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        usernameTF.requestFocus(true);
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
        nameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        usernameTF = new javax.swing.JTextField();
        quitButton = new javax.swing.JButton();
        logonButton = new javax.swing.JButton();
        passwordTf = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LIT Realty - Login");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        imageLabel.setFont(new java.awt.Font("Tahoma", 0, 24));
        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LIT_Logo.jpg"))); // NOI18N
        imageLabel.setText("   Lit Realty - System Logon ");

        nameLabel.setFont(new java.awt.Font("Tahoma", 0, 14));
        nameLabel.setText("Enter User Name:");

        passwordLabel.setFont(new java.awt.Font("Tahoma", 0, 14));
        passwordLabel.setText("Enter Password:");

        usernameTF.setText("Sue.Roberts");

        quitButton.setText("Quit");
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });

        logonButton.setText("Logon");
        logonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logonButtonActionPerformed(evt);
            }
        });

        passwordTf.setText("suepass");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel)
                    .addComponent(passwordLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                    .addComponent(passwordTf, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(logonButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quitButton)
                        .addGap(33, 33, 33)))
                .addGap(262, 262, 262))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logonButton)
                    .addComponent(quitButton))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
        // this button will exit the logon frame
        System.exit(0);
    }//GEN-LAST:event_quitButtonActionPerformed

    private void logonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logonButtonActionPerformed
        userName = "";
        password = null;    
        // getting data from textfield and password field and storing in variable
        userName = usernameTF.getText();
        password = passwordTf.getPassword();
        String pass = generatePass(password);
        
        //storing username and password to use later
        //Login l = new Login();
        //l.setUsername(userName);
        
        //used to store values retrieved from the database
        String user1 =null;
        String pass1 =null;
        
        //getting password
        try {
            loginRowSet.setCommand("SELECT * FROM agents WHERE username = ? AND password = ?");
            loginRowSet.setString(1, userName);
            loginRowSet.setString(2, pass);
            loginRowSet.execute();

            if (loginRowSet.first()) {
                user1 = loginRowSet.getString("username");
                pass1 = loginRowSet.getString("password");
                
                
                
            }
            if(user1 != null && pass1 != null){
            if (userName.equals(user1) && pass.equals(pass1)){
                    
                //get time stamp
                String date = getDate();
                
                
                JOptionPane.showMessageDialog(this, "Welcome " + user1 + ", You have successfully Login");
                mainMenuFrame next = new mainMenuFrame(user1, date);
                next.setVisible(true);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "Incorrect username and pasword combination, Please try again", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            }
            else{
                JOptionPane.showMessageDialog(this, "Incorrect username and pasword combination, Please try again", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
         catch (SQLException ex) {
            Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    




    }//GEN-LAST:event_logonButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    new LoginFrame().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imageLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logonButton;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordTf;
    private javax.swing.JButton quitButton;
    private javax.swing.JTextField usernameTF;
    // End of variables declaration//GEN-END:variables

    private String generatePass(char[] password) {
        String pass="";
        for(int i = 0; i<password.length;i++){
           pass+=password[i]; 
        }
        return pass;
    }

    public String getDate() {
        DateFormat dateFormat = new SimpleDateFormat("MMMM dd, yyyy HH:mm");
        Date date = new Date();
        String timestamp = dateFormat.format(date);
        return timestamp;
    }
    
    
}
