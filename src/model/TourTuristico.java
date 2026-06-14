package model;
/**
 * Representa un tour turistico ofrecido por la agencia Llanquihue Tour.
 * Almacena informacion relacionada con el nombre del tour, comuna de realizacion  y precio.
 * @author gzapa
 */
// atributos
public class TourTuristico {
    private String nombre;
    private String comuna;
    private double precio;

    /**
     * Constructor que inicializa un tour.
     * Datos principales:
     * @param nombre Nombre del tour.
     * @param comuna Comuna donde se realiza el tour.
     * @param precio Precio del tour.
     */
    public TourTuristico(String nombre, String comuna, double precio) {
        this.nombre = nombre;
        this.comuna = comuna;
        this.precio = precio;
    }
    
    /**
     * Obtiene el nombre del tour.
     * @return Nombre del tour.
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Se establece que el valor no sea nulo ni vacio.
     * @param nombre Establece Nombre del tour.
     */
    public void setNombre(String nombre) {
        if(nombre != null && !nombre.isEmpty())
            this.nombre = nombre;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if(precio > 0)
            this.precio = precio;
    }
    /**
     * Retorna una representacion legible.
     * @return Informacion del tour.
     */
    @Override
    public String toString() {
        return "\nTour: " + nombre + 
               "\nComuna: " + comuna +
               "\nPrecio CLP: $" + precio;
    }
    
    
}
