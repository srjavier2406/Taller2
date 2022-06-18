//Celeste Soto Valdebenito
//Solange Soto Broock
//Alex Sanchez Carrillo
//Brian Sobarzo Benavente
//Javier Torres Rios
package vista;
import conexion.Conector;
/**
 *
 * @author celes
 */
public class pruebaCon {
    public static void main(String[] args){
    Conector con = new Conector();
    if (con.iniciarConexion()!=null){
        System.out.println("CONECTADO");
    } else {
        System.out.println("ERROR");
    }
    
    }
}
