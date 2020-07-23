/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author boot9
 */
public class OracleDatabaseConnection {
    
    private static Connection con;
    public static Connection establishedConnection(){
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:Banking/hello@127.0.0.1:1521:XE");
            System.out.println("Connection Establised successfully");
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
        return con;
    }
    
}
