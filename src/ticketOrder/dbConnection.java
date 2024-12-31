/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ticketOrder;

// mengimpor kelas dari paket java.sql
import java.sql.*;

/**
 *
 * @author Lenovo
 */

// mengatur koneksi ke MySQL
public class dbConnection {
    // Informasi yg diperlukan utk menghubungkan ke db
    private static final String URL="jdbc:mysql://localhost:3306/db_orderticket";
    private static final String USER="root";
    private static final String PASSWORD="";
    
    // membuka koneksi ke db dgn DriverManager
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
