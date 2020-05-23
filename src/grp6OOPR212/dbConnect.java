/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grp6OOPR212;
//imports are always located between package and public class definition
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class dbConnect {
    public static void main(String[] args) {
        
        try{
           //method definition is always in main class
           String host="jdbc:derby://localhost:1527/dbSEE";
           String uName = "group6";
           String uPass = "oopr212123";
           //get host from Services>Server>Properties>Database URL
           Connection con = DriverManager.getConnection(host, uName, uPass) ;
           //Connection con = DriverManager.getConnection(host, uName, uPass );
        }
        catch(SQLException err){
            System.out.println(err.getMessage());
        }
    }
    
}
