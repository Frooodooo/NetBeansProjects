/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day10;

import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author Frooodooo
 */
public class Day10 {

    private static Connection connection;

    private static void connectDB(String username, String password) {
        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mydb?zeroDateTimeBehavior=convertToNull",
                    username,
                    password);
        } catch (SQLException ex1) {
            System.out.print(ex1.toString());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       connectDB("root", "jageks12"); 
       Scanner input = new Scanner(System.in);
        System.out.println("Izvelies darbibu");
        System.out.println("0 Partraukt darbibu");
        System.out.println("1 apskatit darbinieku");
        System.out.println("2 pievienot darbinieku");
       while(true)
       {
       String darbiba = input.next();
       switch(darbiba)
       {
       case"0":
           return;
                   case "1":
                       printEmployee();
                       break;
                       case"2":
                           insertEmployee();
                           break;
       }
       }
    }
    private static void insertEmployee()
    {
     try {
            Scanner ievade = new Scanner(System.in);
           
            int id = ievade.nextInt();
            System.out.print("emp_name = ");
           String name = ievade.nextLine();
            System.out.print("hire_date = ");
            String hirre_date = ievade.nextLine();
            System.out.print("emp_id = ");
           int salary = ievade.nextInt();
            Statement stmt = connection.createStatement();
            
           stmt.executeUpdate(String.format("INSERT INTO employees (emp_id, emp_name, hirre_date, salary)" + "VALUES (%s, %s, %s, %s)", id, name, hirre_date, salary));
            
           
            
            
            

        } catch (Exception ext) {
            System.out.print(ext.toString());
        }
        
        
    }
    
    private static void printEmployee()
    {
   
        try {

            Statement stmt = connection.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT  e.emp_id, e.emp_name, e.dep_id, d.dep_name, d.dep_location, e.hirre_date, e.salary FROM employees e, department d WHERE e.dep_id = d.dep_id");
             
            
            while (rs.next()) {
                String depname = rs.getString("d.dep_name");
                int x = rs.getInt("dep_id");
                String s = rs.getString("dep_name");
                String k = rs.getString("dep_location");
                int empid = rs.getInt("emp_id");
                String empname = rs.getString("emp_name");
                Date hireDate = rs.getDate("hirre_date");
                float salary = rs.getFloat("salary");
                System.out.println("dep_id = " + x + " " + "dep_name = " + s + " " + "dep_location = " + k);
                System.out.println("emp_id = " + empid + " " + "emp_name = " + empname + " " + "hirre_date = " + hireDate + " "  + "salary = " + salary);
                System.out.println("dep_name = " + depname);
            }
            

        } catch (Exception ext) {
            System.out.print(ext.toString());
        }
    }

}
