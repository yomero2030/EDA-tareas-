import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arbol x = new arbol();

        int z; 
        String e;

        System.out.print("\nIngrese el numero de datos a capturar: ");
        z = sc.nextInt();

        for(int i = 1; i <=z ; i++){
            sc.nextLine();  
            System.out.print("Ingresa el nombre " + i + ": ");
            e = sc.nextLine();
            x.alta(e);  
               
        }

        System.out.println("\n Datos en preorden:");
        x.imprimirPreorden();
        System.out.println("\n Datos en Indorden \n");
        x.imI();

        sc.close();
    }
}
