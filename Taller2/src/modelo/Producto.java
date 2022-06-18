//Celeste Soto Valdebenito
//Solange Soto Broock
//Alex Sanchez Carrillo
//Brian Sobarzo Benavente
//Javier Torres Rios
package modelo;

/**
 *
 * @author celes
 */
public class Producto {
    private String Nombre;
    private int Codigo;
    private int Precio;
    private String Descripcion;

    public Producto() {
    }

    public Producto(String Nombre, int Codigo, int Precio, String Descripcion) {
        this.Nombre = Nombre;
        this.Codigo = Codigo;
        this.Precio = Precio;
        this.Descripcion = Descripcion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    @Override
    public String toString() {
       String txt = "Nombre: " + this.getNombre()
                + " - Codigo: " + this.getCodigo()
                + " - Precio: " + this.getPrecio()
                + "Descripcioo" + this.getDescripcion();
        return txt; 
    }
    
    
    
}
