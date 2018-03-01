/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotels;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Nyagritin
 */
public class Connector {
    public static void main(String args []){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/102320_oop1","root","Amigo4517");
            Statement st=conn.createStatement();
            System.out.println("Connection Established...");
            /*ResultSet rs=st.executeQuery(select * from Inventory);*/
            
            
            
            
        }catch(Exception e){
            System.out.println("Error");
        }
    }
    
}
