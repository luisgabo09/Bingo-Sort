package interfaz;
import modelo.BingoSort;
 
/**
 *  
 * @author acer
 */
public class Interfaz {
    
    /**
     * @param args the command line arguments
     */   
    public static void main(String[] args) {
        // TODO code application logic here        
        Comparable[] a = {4, 2, 4, 1, 2, 4, 3};

        System.out.println("Arreglo sin BingoSort: " + BingoSort.show(a));

        BingoSort.sort(a);

        System.out.println("Arreglo con BingoSort: " + BingoSort.show(a));
        System.out.println("Se ordeno correctamente? " + BingoSort.isSorted(a));
    }
}

