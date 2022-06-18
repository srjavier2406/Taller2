package DAO;

import conexion.Conector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import vista.VistaLogin;

/**
 *
 * @author BlasCR
 */
public class usuarioDAO {
    
    
    static Connection con = null;
    private Statement statement = null;
    private ResultSet resultSet = null;
    public static String sql;

    public usuarioDAO() {
        if (con == null) {
            con = (Connection) Conector.iniciarConexion();
        }
    }
    
    //Insertar datos en la tabla
    public boolean insertar(String usuario, String pass){
        boolean respuesta = false;
        try{
            statement = con.createStatement();
            String sql = "INSERT INTO  trabajador " + 
                                 " VALUES (null, '" + usuario + "', '" + pass + "')";
            statement.executeUpdate(sql);
            respuesta = true;
        } catch (SQLException ex) {
            Logger.getLogger(usuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }
    
        
    
    
}


