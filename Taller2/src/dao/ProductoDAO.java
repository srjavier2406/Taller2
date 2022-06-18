//Celeste Soto Valdebenito
//Solange Soto Broock
//Alex Sanchez Carrillo
//Brian Sobarzo Benavente
//Javier Torres Rios
package dao;
import conexion.Conector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.Producto;

/**
 *
 * @author celes
 */
public class ProductoDAO {
  private static Connection con = null;
    private Statement statement = null;
    private ResultSet resultSet = null;
    public ProductoDAO(){}
  
  

   public boolean insertarDatos(String Nombre, String Codigo, int Precio, String Descripcion) {
        boolean resp = false;
        
   try {
            con = Conector.iniciarConexion(); //inicio la conexion con la BD
            statement = con.createStatement(); //Abro la query
            String sql = "INSERT INTO producto "
                    + " VALUES ('" + Nombre + "', '" + Codigo
                    + "', " + Precio +", '" + Descripcion + "')"; //Escribo la consulta en lenguaje SQL
            statement.executeUpdate(sql); //Ejecutando la query
            resp = true; //entrego el valor verdadero cuando se ejecuta correctamente
            statement.close(); //cierro la conexion
        } catch (SQLException e) {
            System.out.println("Error SQL"); //en caso de error de la query
        }
        return resp; //entrego true o false dependiendo del resultado
    }
    public boolean eliminarDatos(String valor) {
        boolean resp = false;
        try {
            con = Conector.iniciarConexion();
            statement = con.createStatement();
            String sql = "DELETE FROM producto WHERE codigo='" + valor + "'"; //Query para elminar
            statement.executeUpdate(sql);
            resp = true;
            statement.close();
        } catch (SQLException e) {
            System.out.println("Error SQL");
        }
        return resp;
    }
    
    public boolean actualizarDatos(String codigo, String nombre,int precio, String descripcion, String codigoActual) {
        boolean resp = false;
        try {
            con = Conector.iniciarConexion();
            statement = con.createStatement();
            String sql = "UPDATE producto "
                    + " SET codigo = '" + codigo + "', nombre = '" + nombre + "', precio='" + precio + "', descripcion = '" + descripcion 
                    + "' WHERE codigo='" + codigoActual + "'";
            statement.executeUpdate(sql);
            resp = true;
            statement.close();
        } catch (SQLException e) {
            System.out.println("Error SQL");
        }
        return resp;
    }
    public boolean eliminarTodo() {
      boolean resp = false;
        try {
            con = Conector.iniciarConexion();
            statement = con.createStatement();
            String sql = "DELETE from producto"; //Query para elminar
            statement.executeUpdate(sql);
            resp = true;
            statement.close();
        } catch (SQLException e) {
           System.out.println("Error SQL");
        }
        return resp;
    }
}
