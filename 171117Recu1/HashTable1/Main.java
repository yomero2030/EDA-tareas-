import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hashtable<String,Paciente> hospital = new Hashtable<String, Paciente>();
        Enumeration<String> enumeration= hospital.keys();
        int opcion = 0;
        String Keys;
        int keyAleatorio = 0;
        do{ 
          opcion =0;
          System.out.println("******Menu  Cajas Seguridad **********");
          System.out.println("1) Agregar nuevo Paciente");
          System.out.println("2) Listar numero de pacientes");
          System.out.println("3) Eliminar ");
          System.out.println("4) Salir");
          System.out.println("Elija una opcion");
          opcion = sc.nextInt();
              switch(opcion){

                  case 1 :sc.nextLine();
                          System.out.println("Ingrese el Nombre");
                              String nombre = sc.nextLine();
                          System.out.println("Ingrese el Apellido");
                              String apellidos = sc.nextLine();
                          System.out.println("Ingrese la Curp");
                              String curp = sc.nextLine();
                              Keys  = curp+nombre;
                          
                          hospital.put(Keys, new Paciente(nombre, apellidos, curp));
                  
                          System.out.println("clave: "+Keys+" "+ hospital.get(Keys).toString() ); 
                          enumeration = hospital.keys();
                          System.out.println("se ha registrado de manera Corecta ");
                          System.out.println("---------------------------------------------- ");
                          sc.nextLine();
                          break;
                  case 2 :     
                              System.out.println("*********Lista de Relacion Paciente *********");
                              while(enumeration.hasMoreElements()){
                                  Keys = (String) enumeration.nextElement();
                                  System.out.println("clave: "+Keys+" "+ hospital.get(Keys).toString() ); 
                              
                              }
                              enumeration = hospital.keys();

                          break;
                  case 3 : 
                                                          
                             
                              sc.nextLine();
                              String kee;
                              System.out.println("************** Eliminar************");
                                  System.out.println("Ingrese Su expediente");
                                      kee = sc.nextLine();
                                  hospital.remove(kee);

                                  System.out.println("Lista Actualizada");
                              while(enumeration.hasMoreElements()){
                                  Keys = (String) enumeration.nextElement();
                                  System.out.println("clave: "+Keys+" "+ hospital.get(Keys).toString()); 
                              
                              }
                              enumeration = hospital.keys();
          
                          break;
                  case 4 : System.out.println(0);
                          break;
                default : System.out.println("ingrese una opcion valida");
                          break;
                      
              }





    }while(true);
  
  }

}
