package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Mendeskripsikan variabel serta menampilkannya dalam bentuk operasi logika di layar.
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        
        System.out.println("a && b = " + (a && b)); //AND
        System.out.println("a || b = " + (a || b)); //OR
        System.out.println("!a = " + !a); //NOT
        System.out.println("!(a && b) = " + !(a && b));
    }
    
}
