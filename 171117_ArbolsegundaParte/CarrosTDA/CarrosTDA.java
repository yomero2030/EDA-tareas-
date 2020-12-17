import java.util.Scanner;

public class CarrosTDA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Arbol arbols = new Arbol();
        
        String nombre;
        float peso;

        System.out.print("\nIngrese el numero de datos a capturar: ");
        int z = sc.nextInt();

        for(int i = 1; i <=z ; i++){
            sc.nextLine();
            System.out.print("Ingresa el nombre: ");
            nombre = sc.nextLine();
            System.out.print("Ingresa el peso: ");
            peso = sc.nextFloat();
            arbols.alta(new Carro(nombre, peso));        
            //sc.nextLine(); 
        }

        System.out.println("\nDatos en preorden:");
        arbols.imprimirpreorden();

        System.out.println("\n \n Datos en Indorden");
        arbols.imI();
        sc.close();
    }
}
