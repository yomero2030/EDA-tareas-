import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hashtable<String, Cancion>  cancionero = new Hashtable<String, Cancion>();
        Enumeration<String> enumeration = cancionero.keys();
        int opcion = 0;
        String Keys;
        int keyAleatorio = 0;
        do{ 
            opcion =0;
            System.out.println("******Menu **********");
            System.out.println("1) Agregar nuevo Canciones");
            System.out.println("2) Listar numero de Canciones");
            System.out.println("3) Actuallizar nombre Cancion ");
            System.out.println("4) Salir");
            System.out.println("Elija una opcion");

            opcion = sc.nextInt();
                switch(opcion){

                    case 1 :
                            keyAleatorio = keyAleatorio +1;
                            Keys  = String.valueOf(keyAleatorio);
                            sc.nextLine();
                            System.out.println("Ingrese la cancion");
                                String nombre = sc.nextLine();
                            System.out.println("Ingrese el autor");
                                String autor = sc.nextLine();
                            
                            cancionero.put(Keys, new Cancion(nombre,autor));
                    
                            System.out.println("clave: "+Keys+" "+ cancionero.get(Keys).toString() ); 
                            enumeration = cancionero.keys();
                            System.out.println("se ha registrado de manera Corecta ");
                            System.out.println("---------------------------------------------- ");
                
                            break;
                    case 2 :     sc.nextLine();
                                System.out.println("*********Lista de Canciones *********");
                                while(enumeration.hasMoreElements()){
                                    Keys = (String) enumeration.nextElement();
                                    System.out.println("clave: "+Keys+" "+ cancionero.get(Keys).toString() ); 
                                
                                }
                                enumeration = cancionero.keys();

                            break;
                    case 3 : 
                                                            
                                ///ACTUALIZAR DATO NOMBRE ESPESIFICO
                                sc.nextLine();
                                String kee, date;
                                System.out.println("************** Actualizar los datos************");
                                    System.out.println("Ingrese Su  numero de cancion");
                                        kee = sc.nextLine();
                                    System.out.println("Ingrese la nueva cancion");
                                        date = sc.nextLine();
                                    cancionero.get(kee).setNombre(date);

                                    System.out.println("Lista Actualizada");
                                while(enumeration.hasMoreElements()){
                                    Keys = (String) enumeration.nextElement();
                                    System.out.println("clave: "+Keys+" "+ cancionero.get(Keys).toString() ); 
                                
                                }
                                enumeration = cancionero.keys();
            
                            break;
                    case 4 : System.out.println(0);
                            break;
                  default : System.out.println("ingrese una opcion valida");
                            break;
                        
                }



        }while(true);
        

    }
}