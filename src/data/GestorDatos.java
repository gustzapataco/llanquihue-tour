package data;

//clases de lectura
import java.util.ArrayList;
import model.TourTuristico;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;

/**
 * Gestiona la lectura de datos desde archivo de texto
 * y almacena los tours en una colleccion ArrayList.
 * @author gzapa
 */
public class GestorDatos {
    private ArrayList<TourTuristico> tours;
    
//constructor
    public GestorDatos() {
        tours = new ArrayList<>();
    }
    
//getter del ArrayList
    public ArrayList<TourTuristico> getTours() {
        return tours;
    }
    /**
     * Lee el archivo tours.txt,
     * crea objetos TourTuristico y los almacena
     * en una coleccion ArrayList.
     */
    public void cargarDatos(){
        try {
            File archivo = new File("resources/tours.txt");
            /** corrigiendo error, verificar donde se encuentra txt 
            System.out.println("Existe archivo: "
                    + archivo.exists());
            System.out.println("Ruta: "
                    + archivo.getAbsolutePath());
            */
            // abrir archivo de txt
            BufferedReader lector =
                    new BufferedReader(
                    new FileReader("resources/tours.txt"));
            String linea;
            // leer cada linea del archivo
            while ((linea = lector.readLine()) != null) {
                // separa datos utilizando ";"
                String[] datos = linea.split(";");
                // convierte el precio desde String a double
                double precio = Double.parseDouble(datos[2]);
                //creando el objeto
                TourTuristico tour =
                        new TourTuristico(
                                datos[0],
                                datos[1],
                                precio);
                // agrega el objeto a la coleecion 
                tours.add(tour);
            }
            
            lector.close();                
            
        } catch (IOException e) {
            
            System.out.println("Error al leer archivo");
            e.printStackTrace();            
        }
    }
}
