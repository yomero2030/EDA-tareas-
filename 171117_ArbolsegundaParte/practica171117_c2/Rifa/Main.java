import java.util.Scanner;
import java.util.TreeSet;
public class Main{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        boolean y = true;
        Arbol arboleda = new Arbol();
        String cod[] = new String[0];

        do {
            System.out.println("\n\nSORTEO!.");
            System.out.println("1. Registrar Participantes.");
            System.out.println("2. Sortear.");
            System.out.println("3. Lista de Participantes.");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");

            switch (sc.nextInt()) {
                case 1:
                    cod = registro(arboleda, cod);
                    break;
                case 2:
                    sortear(arboleda, cod);
                    break;
                case 3:
                    imprimirRelacion(arboleda);
                    break;
                case 4:
                    y = false;
                    break;
                default:
                    System.out.println("Opción no disponible.");
                    break;
            }
        } while (y);
        System.out.println("Hasta el proarboledaimo sorteo.");
    }

    public static String[] registro(Arbol arboleda, String[] cod) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        String tapa;
        String fecha;
        String apellidos;
    
        System.out.print("\tIngresa el numero de participantes: ");
        int tam = sc.nextInt();
        cod = new String[tam];

        System.out.println("\t--------------------------");
        sc.nextLine();
        for (int i = 0; i < tam; i++) {
            System.out.print("\tIngresa el dia : ");
            fecha = sc.nextLine();
            if(fecha.equals("29 noviembre")){
                System.out.println("\tFalló. Fecha limite de registro.");
                i--;
            }else{
                System.out.print("\tIngresa el nombre participante " + (i + 1) + " : ");
                nombre = sc.nextLine();
                System.out.print("\tIngrese los apellidos : ");
                apellidos = sc.nextLine();
                System.out.print("\tIngresa la codigo de la tapa: ");
                tapa = sc.nextLine();
                System.out.println("\t--------------------------");
                arboleda.alta(new Persona(nombre, apellidos, tapa,fecha ));
                cod[i] = tapa;
            }
            sc.nextLine();
        }
        return cod;
    }


    public static void sortear(Arbol arboleda, String[] cod) {
        
        int tamInicial = cod.length;
        System.out.println("\t Realizando Sorteo! Suerte");
        for (int i = 0; i < 3; i++) {
            int numero = (int) (Math.random() * tamInicial + 1);
            if (i == 2) {
                if (cod[numero - 1] == "0") {
                    i--;
                } else {
                    System.out.println("\tNumero ganador: " + cod[numero - 1]);
                }
            } else {
                String eliminar = cod[numero - 1];
                System.out.println("\tEliminado de la tombola: " + eliminar);
                arboleda.eliminar(eliminar);
                cod[numero - 1] = "0";
            }
        }
    }


    public static void imprimirRelacion(Arbol arboleda) {
        // System.out.println("\nDatos en preorden:");
        // arboleda.imprimirpreorden();
        System.out.println("\nDatos en Indorden");
        arboleda.imprimirpreorden();

    }
}