import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean y = true;

        Arbol x = new Arbol();
        TreeSet<String> listaSolicitud = new TreeSet<String>();

        do {
            System.out.println("\n\nLibrería Universitaria.");
            System.out.println("1. Prestamo de libros.");
            System.out.println("2. Devolver libro prestado.");
            System.out.println("3. Lista de libros solicitados.");
            System.out.println("4. Lista de libros entregados.");
            System.out.println("5. Salir");
            System.out.print("Opcion: ");

            switch (sc.nextInt()) {
                case 1:
                    prestamo(x);
                    break;
                case 2:
                    eliminar(x, listaSolicitud);
                    break;
                case 3:
                    imprimirRelacion(x);
                    break;
                case 4:
                    imprimirLista(listaSolicitud);
                    break;
                case 5:
                    y = false;
                    break;
                default:
                    System.out.println("Opción no disponible.");
                    break;
            }
        } while (y);
        sc.close();
    }

    public static void prestamo(Arbol x) {
        Scanner sc = new Scanner(System.in);
        int cont = 1;
        String nombre;
        String matricula;
        boolean y = true;

        System.out.print("\tIngresa la matricula del alumno: ");
        matricula = sc.nextLine();
        while (y) {
            System.out.print("\tIngresa el nombre del libro: ");
            nombre = sc.nextLine();
            x.alta(new Alumno(matricula, nombre));
            System.out.print("\tDesea solicitar otro libro? 1. Si | 2. No gracias \n\tOpcion: ");
            if (sc.nextInt() == 1) {
                if (cont == 3) {
                    System.out.println("\tSolo se puede solicitar 3 libros por alumnos");
                    y = false;
                }
                sc.nextLine();
                cont++;
            } else {
                y = false;
            }
        }
    }

    public static void eliminar(Arbol x, TreeSet<String> lista) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\tIngresa tu matricula: ");
        String mat = sc.nextLine();
        System.out.print("\tIngresa el libro: ");
        String lib = sc.nextLine();
        if (x.eliminar(mat , lib) == false) {
            System.out.println("\tMatricula no encontrado");
        } else {
            System.out.println("\tLibro entregado");
            String dato = "\tMatricula: " + mat + " Libro: " + lib;
            lista.add(dato);
        }
    }

    public static void imprimirRelacion(Arbol x) {
        // System.out.println("\nDatos en preorden:");
        // x.imprimirpreorden();
        System.out.println("\n\tSolicitudes: ");
        x.imI();
    }

    public static void imprimirLista(TreeSet<String> lista) {
        Iterator<String> i = lista.iterator();
        System.out.println();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
