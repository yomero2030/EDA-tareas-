import java.util.Scanner;
import java.util.TreeSet;

public class Main{ 

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        TreeSet<Ventanilla> venta = new TreeSet<Ventanilla>();
        TreeSet<Ejecutivo> ejecutivos = new TreeSet<Ejecutivo>();
        TreeSet<CajeroEmpresarial> cajeroEmpresarials = new TreeSet<CajeroEmpresarial>();
        TreeSet<CajeroAutomatico> cajeroAutomaticos = new TreeSet<CajeroAutomatico>();
        int opcion =0 ;
        int visitaseje = 0;
        int aprovacion = 0;
        int countMenores =0 ;
        int vent =0;
        
        while(opcion <=4 ){
            
            opcion =0;
            System.out.println("******Menu  Cajas Seguridad **********");
            System.out.println("1) Retiros, depositos, canje de cheques transacciones mayores a 5000.00");
            System.out.println("2) Retiros, depositos y tramites menores de  3000.00 ");
            System.out.println("3) Ejecutivos ");
            System.out.println("4) Cajero Empresarial ");
            System.out.println("5) Salir");
            System.out.println("Elija una opcion");

            opcion = sc.nextInt();

            switch(opcion){
                 case 1:    //sc.nextInt();
                            System.out.println("******Ventailla***");
                            int  numeroCuenVEn = 0;
                            vent = vent + 1;
                            System.out.println("Ingrese tu Trajeta");
                                numeroCuenVEn = sc.nextInt();
                            venta.add(new Ventanilla(vent, numeroCuenVEn));
                            System.out.println("Su tuno es el: "+"V"+ vent);
                    break;
                 case 2 : 
                                        //Movimiento menores.
                            System.out.println("Depositos y Retiros Menores de 3000");
                            int depositos  = 0; 
                            countMenores=  countMenores+1;
                            System.out.println("Ingrese tu Trajeta");
                            depositos= sc.nextInt();
                            cajeroAutomaticos.add(new CajeroAutomatico(countMenores, depositos));
                            System.out.println("su turno es : "+"A"+countMenores);
                    break;
                 case 3 : 
                            System.out.println("Aprovaciones");
                            int cuentanmber =0;
                                aprovacion= aprovacion+1;
                                System.out.println("Ingrese tu Trajeta");
                                cuentanmber = sc.nextInt();
                                ejecutivos.add(new Ejecutivo(aprovacion,cuentanmber));
                                System.out.println("Su tuno es el: "+"E"+ aprovacion);
                    
                    break;
                 case 4 : 
                                        // Empresarial
                                        sc.nextInt();
                            System.out.println("Empresarial");
                            int numeroEje = 0; 
                                visitaseje= visitaseje+1;
                            System.out.println("Ingrese tu Trajeta");
                            numeroEje = sc.nextInt();
                            cajeroEmpresarials.add(new CajeroEmpresarial(visitaseje,numeroEje));
                            System.out.println("su turno es:"+"Em"+visitaseje);
                    break;
                 case 5 : 
                 System.out.println(0);
                 break;
                     default : System.out.println("ingrese una opcion valida");
                 break;


            }

        };
        
        System.out.println("Lista Asistencia de Ventanilla");
        for(Ventanilla vents: venta){
            System.out.println(vents.getTarjetaVentanilla()+" "+vents.getNumeroVisitanteVentanilla());
        }
        System.out.println("Lista Asistencia de Cajero Automatico");
        for(CajeroAutomatico caj1 : cajeroAutomaticos){
            System.out.println(caj1.getNumeroCUentaTarjetaAutomatico()+" "+caj1.getVisitaCajeroAuto());
        }
        System.out.println("Lista Asistencia de Empresarial");
        for(CajeroEmpresarial empr : cajeroEmpresarials){
            System.out.println(empr.getNumeroEmpresarial()+ " "+ empr.getCajero());
        }
        System.out.println("Lista Asistencia de Ejecutivos");
        for(Ejecutivo ejem : ejecutivos){
            System.out.println(ejem.getTarjetaEjecutivo()+" "+ ejem.getEjecutivo());
        }

    }
}
