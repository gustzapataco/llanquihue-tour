package ui;

import data.GestorDatos;
import model.TourTuristico;
/**
 * Actividad Semana 4.
 * Entrada del programa
 */
public class Main {
    
    public static void main(String[] args){
        System.out.println("=== Sistema Llanquihue iniciado ===");
    
        GestorDatos gestor = new GestorDatos();
        
        gestor.cargarDatos();
        
        // muestra cantidad de tours registrados
        System.out.println(
                "\nCantidad de tours registrados: "
                + gestor.getTours().size());
        
        //muestra todos los tours cargados en archivo txt
        System.out.println("\nLISTA DE TOURS: ");
        for (TourTuristico tour : gestor.getTours()) {
            System.out.println(tour);
        }
        
        // filtra tours con precio superior a $15.000
        System.out.println("\nTOURS MAYORES A CLP $15000: ");
        
        for (TourTuristico tour : gestor.getTours()) {
            if (tour.getPrecio() > 15000) {
                System.out.println(tour);
            }
        }
                     
    }    
    
}
