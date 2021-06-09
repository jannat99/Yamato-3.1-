
package yamato;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class dealer_yamato extends javax.swing.JFrame {

    Connection con;
    PreparedStatement insert; 
    public dealer_yamato() {
        initComponents();
         try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try {
                con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=B;selectMethod=cursor", "sa", "123456");
            } catch (SQLException ex) {
                Logger.getLogger(dealer_yamato.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(dealer_yamato.class.getName()).log(Level.SEVERE, null, ex);
        }
        update();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DEALER = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        DEALER_SALARY = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(10, 10, 800, 40);

        jButton1.setBackground(new java.awt.Color(102, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SEARCH DEALER ID");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(820, 10, 180, 40);

        jButton2.setBackground(new java.awt.Color(102, 51, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("REFRESH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(1020, 0, 230, 103);

        jButton3.setBackground(new java.awt.Color(102, 51, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("BIKE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(1020, 103, 230, 103);

        jButton4.setBackground(new java.awt.Color(102, 51, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("PARTS");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(1020, 206, 230, 103);

        jButton5.setBackground(new java.awt.Color(102, 51, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("CUSTOMER");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(1020, 309, 230, 103);

        jButton6.setBackground(new java.awt.Color(102, 51, 0));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("CALCULATION");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(1020, 412, 230, 104);

        jButton7.setBackground(new java.awt.Color(102, 51, 0));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("LOG OUT");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(1020, 516, 230, 104);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("DEALER SALARY INFORMATION :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 60, 280, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel3.setText("Dealer Salary Id :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 120, 150, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel4.setText("Dealer Id :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 150, 90, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel5.setText("Dealer Deals :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 190, 120, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel6.setText("Dealer Salary :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 230, 124, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel7.setText("Dealer Bonus :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 270, 125, 30);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(170, 110, 170, 30);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(170, 150, 170, 30);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4);
        jTextField4.setBounds(170, 190, 170, 30);
        jPanel1.add(jTextField5);
        jTextField5.setBounds(170, 230, 170, 30);

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField6);
        jTextField6.setBounds(170, 270, 170, 30);

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField7);
        jTextField7.setBounds(170, 310, 170, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Table Name : DEALER");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(550, 70, 240, 30);

        DEALER.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dealer_Id", "Dealer_Name", "Dealer_Age", "Dealer_Address", "Dealer_Contact"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(DEALER);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(350, 110, 660, 230);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Table Name : DEALER_SALARY");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(360, 390, 320, 40);

        DEALER_SALARY.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dealer_Salary_Id", "Dealer_Id", "Dealer_Deals", "Dealer_Salary", "Dealer_Bonus", "Dealer_Total_Salary"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(DEALER_SALARY);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(30, 440, 970, 170);

        jButton8.setBackground(new java.awt.Color(102, 0, 0));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("INSERT");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(30, 360, 90, 40);

        jButton9.setBackground(new java.awt.Color(102, 0, 0));
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("DELETE");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);
        jButton9.setBounds(140, 360, 90, 40);

        jButton10.setBackground(new java.awt.Color(102, 0, 0));
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("UPDATE");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);
        jButton10.setBounds(250, 360, 100, 40);

        jButton11.setBackground(new java.awt.Color(102, 0, 0));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Dealer Total Salary:");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11);
        jButton11.setBounds(7, 310, 160, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yamato/dealer.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1020, 620);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1251, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void update(){
        
        int x,y;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=B;selectMethod=cursor", "sa", "123456");
            PreparedStatement insert1;
            PreparedStatement insert2;
            insert1 = con.prepareStatement("select * from DEALER");
            insert2 = con.prepareStatement("select * from DEALER_SALARY");
            
            ResultSet rs1 = insert1.executeQuery();
            ResultSet rs2 = insert2.executeQuery();
            ResultSetMetaData rss1 = rs1.getMetaData();
            ResultSetMetaData rss2 = rs2.getMetaData();
            x=rss1.getColumnCount();
            y=rss2.getColumnCount();
            
            DefaultTableModel df1 = (DefaultTableModel)DEALER.getModel();
            df1.setRowCount(0);
            DefaultTableModel df2 = (DefaultTableModel)DEALER_SALARY.getModel();
            df2.setRowCount(0);
            
            while(rs1.next()){
                Vector v2 = new Vector();
                
                for(int a=1; a<=x; a++){
                    v2.add(rs1.getString("Dealer_Id"));
                    v2.add(rs1.getString("Dealer_Name"));
                    v2.add(rs1.getString("Dealer_Age"));
                    v2.add(rs1.getString("Dealer_Address"));
                    v2.add(rs1.getString("Dealer_Contact"));
                }
                df1.addRow(v2);
            } 
             while(rs2.next()){
                Vector v2 = new Vector();
                
                for(int a=1; a<=y; a++){
                    v2.add(rs2.getString("Dealer_Salary_Id"));
                    v2.add(rs2.getString("Dealer_Id"));
                    v2.add(rs2.getString("Dealer_Deals"));
                    v2.add(rs2.getString("Dealer_Salary"));
                    v2.add(rs2.getString("Dealer_Bonus"));
                    v2.add(rs2.getString("Dealer_Total_Salary"));
                }
                df2.addRow(v2);
            } 
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(dealer_yamato.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         new dealer_yamato().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         new bike_yamato().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         new parts_yamato().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         new customer_yamato().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         new Calculation().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         new login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            //get data
            String sql = "Insert into DEALER_SALARY Values(?,?,?,?,?,?)";
            String Dealer_Salary_Id = jTextField2.getText();
            String Dealer_Id=jTextField3.getText();;
            String Dealer_Deals=jTextField4.getText();
            String Dealer_Salary=jTextField5.getText();
            String Dealer_Bonus=jTextField6.getText();
            String Dealer_Total_Salary=jTextField7.getText();
            
            //set data
            insert = con.prepareStatement(sql);
            insert.setString(1, Dealer_Salary_Id);
            insert.setString(2, Dealer_Id);
            insert.setString(3, Dealer_Deals);
            insert.setString(4, Dealer_Salary);
            insert.setString(5, Dealer_Bonus);
            insert.setString(6, Dealer_Total_Salary);
            
            int i= insert.executeUpdate();
            if(i==1){
                System.out.println("Data added");
            }
        } catch (SQLException ex) {
            Logger.getLogger(dealer_yamato.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                insert.close();
            } catch (SQLException ex) {  
            }
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        try {  
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
        con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=B;selectMethod=cursor", "sa", "123456");
        Statement statement = con.createStatement();  
        statement.executeUpdate("DELETE FROM DEALER_SALARY WHERE Dealer_Salary_Id=" + jTextField2.getText() + "");  
        statement.close();  
        con.close();  
    }   catch (SQLException | ClassNotFoundException e) {  
        JOptionPane.showMessageDialog(null, e);  
    }  
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
         try {  
          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=B;selectMethod=cursor", "sa", "123456");  
            Statement stmt = con.createStatement();  
            stmt.execute("UPDATE DEALER_SALARY SET Dealer_Id='" + jTextField3.getText() + "',  Dealer_Deals" + jTextField4.getText() + " WHERE Dealer_Salary_Id=" + jTextField2.getText() + "");  
        
            stmt.close();  
            con.close();  
       
    } catch (SQLException | ClassNotFoundException se) {  
        JOptionPane.showMessageDialog(null, se);  
    }  
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
             String sql="SELECT * from DEALER_SALARY WHERE Dealer_Id=?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1,jTextField1.getText());
            ResultSet rs=pst.executeQuery();
            if(rs.next())
            {
                String setid=rs.getString("Dealer_Salary_Id");
                jTextField2.setText(setid);
                String seti=rs.getString("Dealer_Id");
                jTextField3.setText(seti);
                String setname=rs.getString("Dealer_Deals");
                jTextField4.setText(setname);
                 String setBikeName=rs.getString("Dealer_Salary");
                jTextField5.setText(setBikeName);
                String setPartsQuantity=rs.getString("Dealer_Bonus");
                jTextField6.setText(setPartsQuantity);
                 String setPartsPrice=rs.getString("Dealer_Total_Salary");
                jTextField7.setText(setPartsPrice);    
            }
            else
            {
                 JOptionPane.showMessageDialog(null,"Invalid Dealer Id");
                 jTextField2.setText("");
                 jTextField3.setText("");
                 jTextField4.setText("");
                 jTextField5.setText("");
                 jTextField6.setText("");
                 jTextField7.setText("");
            }
        } catch (SQLException ex) {
            Logger.getLogger(dealer_yamato.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        int num1, num2, ans;
        num1=Integer.parseInt(jTextField5.getText());
        num2=Integer.parseInt(jTextField6.getText());
        ans=(num1 + num2);
        jTextField7.setText(Integer.toString(ans));
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        int num;
        num=Integer.parseInt(jTextField4.getText());
        if(num>5)
        {
            jTextField6.setText(Integer.toString(2000));
        }else{
            jTextField6.setText(Integer.toString(0));
        }
    }//GEN-LAST:event_jTextField6ActionPerformed

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
            java.util.logging.Logger.getLogger(dealer_yamato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dealer_yamato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dealer_yamato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dealer_yamato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dealer_yamato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DEALER;
    private javax.swing.JTable DEALER_SALARY;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
