


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hillaryomondi
 */
public class DataBase {
    public static void main(String args[]){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/102261","root","");
            System.out.println("Connection Established...");
            
            Statement st=conn.createStatement();
            String query1="INSERT INTO LOGIN VALUES('hillary','pass')";
            st.executeUpdate(query1);
            System.out.println("Query 1 success");
            String query2="SELECT * FROM LOGIN";
            ResultSet rs=st.executeQuery(query2);
            while(rs.next())
            {
                String name=rs.getString("username");
                String pass=rs.getString("password");
                
                System.out.print("Name: "+name+" password: "+pass);
            }
            System.out.println("Results obtained");
            
        }catch(Exception e){
            System.out.println("Error");
        }
    }
    
    
}
