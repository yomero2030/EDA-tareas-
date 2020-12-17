import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        String mens;
        String clave;
        Persona compararApellido = new Persona();
        TreeSet<Persona> personatre = new TreeSet<Persona>();
        TreeSet<Persona> ordenamiento2 = new TreeSet<Persona>(compararApellido);
        TreeSet<Persona> pME = new TreeSet<Persona>();
        TreeSet<Persona> pEU = new TreeSet<Persona>();
        TreeSet<Persona> pFRA = new TreeSet<Persona>();
        Hashtable<String,String> cargandoPassport = new Hashtable<String, String>();
        Enumeration<String> enumeration = cargandoPassport.keys();
        Scanner sc = new Scanner(System.in);
        
        do{
            String name;
            String apellido;
            String pais;
            String keysnew;
            int opcion;
            System.out.println("******Menu Hashtable**********");
            System.out.println("1) REGISTRO");
            System.out.println("2) ORDENAMIENTO APELLIDO");
            System.out.println("3) ORDENAMIENTO PAIS");
            System.out.println("4) BUSQUEDA PASAPORTE");
            System.out.println("Elija una opcion");

            opcion = sc.nextInt();
        
            switch(opcion){

                case 1 : 

                                        
                        System.out.println("ingrese nombre");
                        name = sc.nextLine();
                    System.out.println("apellidos");
                        apellido = sc.nextLine();
                        System.out.print("ingrese el estado del pasport: ");
                            mens= sc.nextLine();
                    System.out.println("pasaport");
                        keysnew = sc.nextLine();
                        pais = keysnew.substring(0,3);
                    System.out.println(pais);
                    personatre.add(new Persona(name,keysnew,apellido, pais));
                    System.out.print("\t\t - - - - El pasaporte fue registrado Exitosamente - - - - \n");
                    cargandoPassport.put(keysnew, mens);
                    System.out.println("Cargando ......");
                    ordenamiento2.add(new Persona(name, keysnew, apellido, pais));
                    if(pais == "MEX"){
                        pME.add(new Persona(pais,name,apellido,keysnew));
                    }
                                
                    break;

                case 2 : 
                        for(Persona per : ordenamiento2){
                        System.out.println(per.getLastName()+" "+ per.getPassport()+" "+per.getPais());
                        }
                    break;
                    
                
                case 3 : 
                        
                            
                System.out.println("pais");
                for(Persona per2 : pME){
                System.out.println(per2.getPais()+ " "+per2.getPassport());
                }

                    break;
                case 4 : System.out.println(0);
                    break;
                default : System.out.println("ingrese una opcion valida");
                    break;
            }
        }
        while( true);



    }
    

}
