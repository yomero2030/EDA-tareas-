import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        Scanner rc =  new Scanner(System.in);
        String clave;
        int opcion;
        Hashtable<String, String> conjunto = new Hashtable<String, String>();
        Enumeration<String> enumeration = conjunto.keys();
        do{
            System.out.println("******Menu Hashtable**********");
            System.out.println("1) ingresar datos");
            System.out.println("2) eliminar datos");
            System.out.println("3) Actuallizar");
            System.out.println("4) Salir");
            System.out.println("Elija una opcion");

            opcion = rc.nextInt();
        
            switch(opcion){

                case 1 : 

                            conjunto.put("171", "adrian");
                            conjunto.put("172", "penal");
                            conjunto.put("173", "codigo");
                            conjunto.put("174", "tester1");
                            conjunto.put("175", "tester2");
        
                            while(enumeration.hasMoreElements()){
                                clave = (String) enumeration.nextElement();
                                  System.out.println("clave: "+clave+" "+"& DAto : "+ conjunto.get(clave)); 
                              
                            }
                            enumeration = conjunto.keys();
                
                    break;

                case 2 : 

                            System.out.println("*************Eliminar****************");
                            String matricula; 
                            while(enumeration.hasMoreElements()){
                                clave = (String) enumeration.nextElement();
                                System.out.println("clave: "+clave+" "+"& DAto : "+ conjunto.get(clave)); 
                             }
                                enumeration = conjunto.keys();

                                  rc.nextLine();               
                                System.out.println("Ingrese la matricula a eliminar ");
                                matricula = rc.nextLine();
                                conjunto.remove(matricula);
                                while(enumeration.hasMoreElements()){
                                    clave = (String) enumeration.nextElement();
                                    System.out.println("clave: "+clave+" "+"& DAto : "+ conjunto.get(clave)); 
                                
                                }
                                enumeration = conjunto.keys();

                    break;
                
                case 3 : 
                        ///Modificar
                                String matri, date;
                                System.out.println("--------Reemplazar Nombre----------------");
                                while(enumeration.hasMoreElements()){
                                    clave = (String) enumeration.nextElement();
                                    System.out.println("clave: "+clave+" "+"& DAto : "+ conjunto.get(clave)); 
                                
                                }
                                enumeration = conjunto.keys();
                                    rc.nextLine();
                                System.out.println("Ingrese la matricula:  ");
                                matri = rc.nextLine();
                                System.out.println("Ingrese el Nombre ;");
                                date = rc.nextLine();
                                conjunto.replace(matri,date);
                                while(enumeration.hasMoreElements()){
                                    clave = (String) enumeration.nextElement();
                                    System.out.println("clave: "+clave+" "+"& DAto : "+ conjunto.get(clave)); 
                                
                                }
                                enumeration = conjunto.keys();
                        

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
