
import java.util.Hashtable;
import java.util.Scanner;
import java.util.TreeSet;

public class Principal {

    public static void main(String[] args){
 
        Scanner sc = new Scanner(System.in);
        Persona per = new Persona();
        Hashtable<String, String> pasaportes  = new Hashtable<String, String>();
        TreeSet<String> pasaportesRegistrados = new TreeSet<String>();
        TreeSet<String> pM = new TreeSet<String>();
        TreeSet<String> pA = new TreeSet<String>();
        TreeSet<String> pP = new TreeSet<String>();
        TreeSet<String> LH = new TreeSet<String>();
        TreeSet<String> LM = new TreeSet< String>();
        int x = 0;

        do{
            System.out.println("\nBienvenido a la Aduana.\nSeleccione una opción: ");
            System.out.println("1. Registrar nuevo pasaporte.");
            System.out.println("2. Buscar Pasaporte");
            System.out.println("3. Ver lista de Pasaportes. (Apellido)");
            System.out.println("4. Ver lista de Pasaportes. (País).");
            System.out.println("5. Ver por Sexualidad");
            System.out.println("6 Salir");
            System.out.print("Opción: ");
            switch(sc.nextInt()){
                case 1:
                    per.registroT(pasaportes, pasaportesRegistrados);
                break;
                case 2:
                    per.buscarPasaporte(pasaportes, pasaportesRegistrados);
                break;
                case 3: 
                    per.printByLastName(pasaportesRegistrados);
                break;
                case 4:
                    per.printByNatio(pasaportesRegistrados, pM, pA, pP);
                break;
                case 5:
                    per.imprimirLPasaron(pasaportesRegistrados, LM, LH);
                    break;
                case 6:
                    System.out.println("Gracias.");
                    x = 1;


                break;
            } //switch
        }while( x != 1);
        sc.close();
    }

}