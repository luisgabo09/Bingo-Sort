package modelo;
import java.util.Arrays;

/**
 * 
 * @author acer
 */
public class BingoSort {
 
    public static void sort(Comparable[] a) {
        int n = a.length;
        int inicio = 0;   
 
        while (inicio < n) {
            Comparable bingo = a[inicio];
            for (int i = inicio + 1; i < n; i++)
                if (less(a[i], bingo)) bingo = a[i];
 
            for (int i = inicio; i < n; i++) {
                if (a[i].compareTo(bingo) == 0) {
                    exch(a, i, inicio);
                    inicio++;
                }
            }
        }
    }
 
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }
 
    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
 
    public static String show(Comparable[] a) {
        return Arrays.toString(a);
    }
 
    public static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++)
            if (less(a[i], a[i - 1])) return false;
        return true;
    }
} 