import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ELVINA
 */
public class koneksi {
    public void getKoneksi(){
        try {
            String host = "jdbc:mysql://localhost/login",
                    Nama = "root",
                    Password = "root";
            Connection con =(Connection) DriverManager.getConnection(host, Nama, Password);
            System.out.println("Koneksi Berhasil");
        }catch(SQLException ex){
            System.err.println("Koneksi gagal");
        }
        }
    public static void main(String[] args) {
        
    }
    }



