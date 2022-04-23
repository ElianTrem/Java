package Prototipo;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class conexionBD {

    public Connection conn;
    public Statement stm;

    public conexionBD() {
        connect();
    }

    public void connect() {
        String database_connection_string = "jdbc:postgresql://localhost:5432/Dentista";
        String database_user_name = "postgres";
        String database_user_password = "TP20007";
        try {
            conn = DriverManager.getConnection(database_connection_string, database_user_name, database_user_password);
            System.out.println("Conexion en la base de datos *Exito*.");
        } catch (SQLException e) {
            Logger.getLogger(conexionBD.class.getName()).log(Level.SEVERE, null, e);
            System.out.println(e.getMessage());
        }
    }

    public ResultSet consultar(String sql) {
        ResultSet resultado = null;
        try {
            stm = conn.createStatement();
            resultado = stm.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(conexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public int accionesEdit(String sql) {
        int res = 0;
        try {
            stm = conn.createStatement();
            res = stm.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(conexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }

    public static void main(String[] args) {
        conexionBD conn = new conexionBD();
        conn.connect();
    }
}
