import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Hashtable<String, Persona> cajasSeguridad = new Hashtable<String, Persona>();
        Enumeration<String> enumeration = cajasSeguridad.keys();
        int opcion = 0;
        String Keys;
        int keyAleatorio = 0;
        do{ 
            opcion =0;
            System.out.println("******Menu  Cajas Seguridad **********");
            System.out.println("1) Agregar nuevo Cliente");
            System.out.println("2) Listar numero de Cajas");
            System.out.println("3) Actuallizar nombre Cliente ");
            System.out.println("4) Salir");
            System.out.println("Elija una opcion");

            opcion = sc.nextInt();
                switch(opcion){

                    case 1 :
                            keyAleatorio = keyAleatorio +1;
                            Keys  = String.valueOf(keyAleatorio);
                            sc.nextLine();
                            System.out.println("Ingrese el Nombre");
                                String letras = sc.nextLine();
                            System.out.println("Ingrese la Curp");
                                String curps = sc.nextLine();
                            
                            cajasSeguridad.put(Keys, new Persona(letras,curps));
                    
                            System.out.println("clave: "+Keys+" "+"Nombre : "+ cajasSeguridad.get(Keys).getName()+ " Curp: " +cajasSeguridad.get(Keys).getCurp() ); 
                            enumeration = cajasSeguridad.keys();
                            System.out.println("se ha registrado de manera Corecta ");
                            System.out.println("---------------------------------------------- ");
                
                            break;
                    case 2 :     sc.nextLine();
                                System.out.println("*********Lista de Relacion de cajas Asignadas a Clientes*********");
                                while(enumeration.hasMoreElements()){
                                    Keys = (String) enumeration.nextElement();
                                    System.out.println("clave: "+Keys+" "+"Nombre : "+ cajasSeguridad.get(Keys).getName()+ "  Curp: " +cajasSeguridad.get(Keys).getCurp() ); 
                                
                                }
                                enumeration = cajasSeguridad.keys();

                            break;
                    case 3 : 
                                                            
                                ///ACTUALIZAR DATO NOMBRE ESPESIFICO
                                sc.nextLine();
                                String kee, date;
                                System.out.println("************** Actualizar los datos************");
                                    System.out.println("Ingrese Su  numero de CAJA");
                                        kee = sc.nextLine();
                                    System.out.println("Ingrese el nombre Nuevo");
                                        date = sc.nextLine();
                                    cajasSeguridad.get(kee).setName(date);

                                    System.out.println("Lista Actualizada");
                                while(enumeration.hasMoreElements()){
                                    Keys = (String) enumeration.nextElement();
                                    System.out.println("clave: "+Keys+" "+"Nombre : "+ cajasSeguridad.get(Keys).getName()+ "  Curp: " +cajasSeguridad.get(Keys).getCurp() ); 
                                
                                }
                                enumeration = cajasSeguridad.keys();
            
                            break;
                    case 4 : System.out.println(0);
                            break;
                  default : System.out.println("ingrese una opcion valida");
                            break;
                        
                }



        }while(true);

    }
}
