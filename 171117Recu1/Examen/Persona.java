import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.TreeSet;

public class Persona {

    String nombre , apellido, pais, pasaporte, mensaje, año, digito,tar;
    Scanner sc = new Scanner(System.in);

    //C O N S T R U C T O R
    public Persona() {}

    // M E T H O D S
    public void buscarPasaporte(Hashtable<String, String> pasaporte, TreeSet<String> past) {
        Enumeration pastport;
        String clave;
        // Buscar el pasaporte
        if (pasaporte.isEmpty()) { // valida si el hash tiene datos.
            System.out.println("\t- - - No se encontraron pasaportes en nuestros registros. Por favor registre el pasaporte. - - - -");
            //registroT(pasaporte, past);
        } else {                                                                                                                   //Si el hashtable tiene datos
            System.out.println("\n\t A continuación ingresa el pasaporte para verificar si existe.");
            System.out.print("\tPasaporte: ");
            this.pasaporte = sc.nextLine();
            System.out.println("\t- - - Buscando el pasaporte en nuestros registros - - -");
            System.out.println("\t- - - Espere por favor. - - -");
            pastport = pasaporte.keys();                                                                                            //Recupera todas las llaves, claves, keys dentro del hashtable
            while (pastport.hasMoreElements()) {                                                                                    //Itera los elementos del hashtable
                clave = (String) pastport.nextElement();
                if (clave.equals(this.pasaporte)) {                                                                                 //Compara si el elemento del iterador es igual al que se busca
                    System.out.println("\t\t - - - - El pasaporte fue encontrado con los siguientes datos - - - -");
                    System.out.println("\t\tPasaporte: " + clave);
                    System.out.println("\t\tMensaje: " + pasaporte.get(clave));
                } else {
                    System.out.println("\t\t - - - - El pasaporte no fue encontrado. Por favor registre el pasaporte. - - - -");
                    //registroT(pasaporte, past);                                         
                    break;
                }
            }
        }
    }// class

    //Registrar nuevos pasaportes.
    public void registroT(Hashtable<String, String> pasa, TreeSet<String> past) {

        System.out.print("\t\t Nombre: ");
        this.nombre = sc.nextLine();
        System.out.print("\t\t Apellido: ");
        this.apellido = sc.nextLine();
        System.out.print("\t\t Pais (MEXICO , EUA , FRANCIA): ");                                //L50-59 Registro de datos del usuario
        this.pais = sc.nextLine();
        System.out.print("\t\t Año de expedición: ");
        this.año = sc.nextLine();
        System.out.print("\t\t Digitos(4): ");
        this.digito = sc.nextLine();
        System.out.println("ingrese su sexo M = mujer || H= Hombre");
        this.tar= sc.nextLine();
        System.out.print("\t\t Mensaje: ");
        this.mensaje = sc.nextLine();

        this.pasaporte = this.pais.substring(0, 3) + this.año + this.digito;          // contatena: pais + año de expedicion + digitos random
        System.out.println("\n\t\t Pasaporte: " + this.pasaporte);
        pasa.put(this.pasaporte, this.mensaje);                                                         // se agrega al hashtable
        past.add(this.apellido + " " + this.nombre + " " + this.pais + " " + this.pasaporte+ this.tar);           // se agrega a el treeset
        System.out.print("\t\t - - - - El pasaporte fue registrado Exitosamente - - - - \n");

    }


    //Imprimir por orden de apellido.
    public void printByLastName(TreeSet<String> past) {
        System.out.println("\t\t- - - - - - - - - - - -");
        for (String tar : past) {
            System.out.println("\t\t" + tar);
        }
        System.out.println("\t\t- - - - - - - - - - - -");
    }


    //Imprimir por nación.
    public void printByNatio(TreeSet<String> past, TreeSet<String> pM, TreeSet<String> pA, TreeSet<String> pP) {
        nation(past, pM, pA, pP);

        System.out.println("\n\t\t- - E U A - - - - -  - -");
        for (String tar : pA) {
            System.out.println("\t\t" + tar);
        }
        System.out.println("\t\t- - - - - - - - - - - - -");
        System.out.println("\n\t\t- - M E X I C O - - - - ");
        for (String tar : pM) {
            System.out.println("\t\t" + tar);
        }
        System.out.println("\t\t- - - - - - - - - - - -");
        System.out.println("\n\t\t- - F R A N C I A - - -");
        for (String tar : pP) {
            System.out.println("\t\t" + tar);
        }
        System.out.println("\t\t- - - - - - - - - - - -");

    }


    //Valida de que nación es, y lo agrega al treeset correspondiente.
    public void nation(TreeSet<String> past, TreeSet<String> pM, TreeSet<String> pA, TreeSet<String> pP) {
        for (String tar : past) {
            if (tar.contains("MEXICO") || tar.contains("Mexico")) {                                     //Compara si el iterador, es igual a la cadena String "MEXICO" o "Mexico"
                pM.add(tar);                                                                            //Treeset de Mexico
            } else if (tar.contains("EUA") || tar.contains("Eua")) {                          
                pA.add(tar);                                                                            //Treeset de Alemania
            } else if (tar.contains("FRANCIA") || tar.contains("Francia")) {
                pP.add(tar);                                                                            //Treeset de Portugal
            }
        }
    }


    public void Listapasaron(TreeSet<String> past, TreeSet<String> LH, TreeSet<String> LM ){
        for(String Sexualidad : past){
            if(Sexualidad.contains("M") || Sexualidad.contains("m") ){
                LM.add(Sexualidad);
            }else if (Sexualidad.contains("H") || Sexualidad.contains("h")  ){
                LH.add(Sexualidad);
            }
        }

    }

    public void imprimirLPasaron(TreeSet<String> past, TreeSet<String> LM, TreeSet<String> LH ){
        Listapasaron(past, LH, LM);
        System.out.println("\n\t\t- - Mujeres - - - - -  - -");
        for (String tar : LM) {
            System.out.println("\t\t" + tar);
        }

        System.out.println("\n\t\t- - Hombres - - - - -  - -");
        for (String tar : LH) {
            System.out.println("\t\t" + tar);
        }
    
    }

}