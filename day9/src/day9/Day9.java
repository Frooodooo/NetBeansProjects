/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day9;

import java.sql.*;

/**
 *
 * @author Frooodooo
 */
public class Day9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
    connectToAndQueryDatabase("root", "jageks12");
    
    }

   static public void connectToAndQueryDatabase(String username, String password) {
try{
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/mydb?zeroDateTimeBehavior=convertToNull",
                username,
                password);
        
        Statement stmt = con.createStatement();
        
        stmt.executeUpdate("INSERT INTO students (uzvards) VALUES ()")
        
        ResultSet rs = stmt.executeQuery("SELECT * FROM students");
        
        while (rs.next()) {
            int x = rs.getInt("id");
            String s = rs.getString("name");
            String k = rs.getString("uzvards");
           System.out.print(x + s + k);
            
           
        }
         
}catch(Exception ext)
{
 System.out.print(ext.toString());
}
    }
}
