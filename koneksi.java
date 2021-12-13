/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ade herawan
 */
public class koneksi {
    private static Connection conn;
    public static Connection configDB()throws SQLException{
        try {
            String url = "jdbc:mysql://localhost/showroom";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            conn = DriverManager.getConnection(url, user, pass);
        
        }catch (Exception e){
            System.err.println("koneksi gagal !!"+e.getMessage());
        }
        return conn;
    
    }
    
}
