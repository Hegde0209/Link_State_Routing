
import com.sun.glass.events.KeyEvent;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.time.Clock.system;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class link extends javax.swing.JFrame {
    
    /**
     * Creates new form link
     */
    public link() {
        initComponents();
        
    }
    
  

	// Finding next node to reach fr

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        user = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MAIN MENU");
        setBackground(new java.awt.Color(51, 51, 255));
        setPreferredSize(new java.awt.Dimension(500, 421));

        user.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userKeyPressed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 204));
        jButton1.setText("Execute");
        jButton1.setPreferredSize(new java.awt.Dimension(103, 25));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Link State Routing Simulator ");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("(1) Input Network Topology File ");

        jLabel3.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 0));
        jLabel3.setText("(2) Build a Connection Table ");

        jLabel4.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 51));
        jLabel4.setText("(3) Shortest Path to Destination Router");

        jLabel5.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("(4) Exit");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/footer.png"))); // NOI18N
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(98, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //String choice = user.getText();
        if(user.getText().equals("")){
            System.out.println("Blank");
        }
        int x=0;
        try {
            x= Integer.parseInt(user.getText());
            if (!(x>0 && x<=4))
            {
                JOptionPane.showMessageDialog(this, "Please Select the Correct Option and Execute","WRONG CHOICE", JOptionPane.OK_CANCEL_OPTION);
                user.setText("");
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(this, "Invalid Input","WRONG CHOICE", JOptionPane.OK_CANCEL_OPTION);
            user.setText("");
        }
        
       
        switch(x){
            
            case 1: Fram3 page=new Fram3(); 
                    page.setVisible(true);
                    this.setVisible(false); 
                    break;
                
            case 2: if (Fram3.nMat == 0) 
                    {
					
                        JOptionPane.showMessageDialog(this, "Invalid input : Network topology file should be given before Connection Table","ERROR", JOptionPane.ERROR_MESSAGE);
			user.setText("");
                        break;

				}
            else{
                    Form4 page1=new Form4(); 
                    page1.setVisible(true);
                    this.setVisible(false); 
            }
                    break;
                
                
            case 3: if (Fram3.nSrc == 0)
            {
                 JOptionPane.showMessageDialog(this, "Invalid input : Source router number should be given before Destination router ","ERROR", JOptionPane.ERROR_MESSAGE);
		 user.setText("");			
                 break;
            }
            else
            {
                
                    Form5 page2=new Form5(); 
                    page2.setVisible(true);
                    this.setVisible(false); 
            }
                    break;
                
            case 4: JOptionPane.showMessageDialog(this, "Good Bye!","EXIT CS 542 PROJECT", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                          
        }
        

 
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void userKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            if(user.getText().equals("")){
                System.out.println("Blank");
        }
            int x=0;
            try {
            x= Integer.parseInt(user.getText());
            if (!(x>0 && x<=4))
            {
                JOptionPane.showMessageDialog(this, "Please Select the Correct Option and Execute","WRONG CHOICE", JOptionPane.OK_CANCEL_OPTION);
                user.setText("");
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(this, "Invalid Input","WRONG CHOICE", JOptionPane.OK_CANCEL_OPTION);
            user.setText("");
        }

        switch(x){
            
            case 1: Fram3 page=new Fram3(); 
                    page.setVisible(true);
                    this.setVisible(false); 
                    break;
                
            case 2: if (Fram3.nMat == 0) 
                    {
					
                        JOptionPane.showMessageDialog(this, "Invalid input : Network topology file should be given before Connection Table","ERROR", JOptionPane.ERROR_MESSAGE);
			user.setText("");		
                        break;

				}
            else{
                    Form4 page1=new Form4(); 
                    page1.setVisible(true);
                    this.setVisible(false); 
            }
                    break;
                
                
            case 3: if (Fram3.nSrc == 0)
            {
                 JOptionPane.showMessageDialog(this, "Invalid input : Source router number should be given before Destination router ","ERROR", JOptionPane.ERROR_MESSAGE);
                 user.setText("");
                 break;
            }
            else
            {
                
                    Form5 page2=new Form5(); 
                    page2.setVisible(true);
                    this.setVisible(false); 
            }
                    break;
                
            case 4: JOptionPane.showMessageDialog(this, "Good Bye!","EXIT CS 542 PROJECT", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                 
            }
        }
         
    }//GEN-LAST:event_userKeyPressed

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
            java.util.logging.Logger.getLogger(link.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(link.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(link.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(link.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Start().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
