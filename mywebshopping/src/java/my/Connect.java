/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my;
import java.sql.*;

/**
 *
 * @author Prabhat
 */
public class Connect {
    public static Connection con=null;
    
    public static Connection getconnection()
    {
        try
        {
           Class.forName("com.mysql.jdbc.Driver");
           con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mywebshopping","root","root");
          
        }
        catch(Exception pp)
        {
            System.out.println(pp.getMessage());
        }
        return  con;
    }
    
}
