/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trail1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static sun.security.jgss.GSSUtil.login;

/**
 *
 * @author USER
 */
public class Trail1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
              
        try {
            if( 1 > 0){
             Class.forName("com.mysql.jdbc.Driver");
  
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_databse","root","avani@123");
             
             System.out.print("hua na");
             
             new login().setVisible(true);
            }
            else{
                 System.out.println("nai bhai tujhse na hoga");
            }
            
            // TODO code application logic here
        } catch (SQLException ex) {
            Logger.getLogger(Trail1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Trail1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
