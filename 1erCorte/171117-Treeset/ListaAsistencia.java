import java.util.Iterator;
import java.util.TreeSet;

public class ListaAsistencia{
        Matematicas matematicas = new Matematicas();
        TreeSet<String>  mate  =new TreeSet<String>();

        Algoritmo algoritmo = new Algoritmo();
        TreeSet<String> algo = new TreeSet<String>();

        ProgramacionVS programacionVS = new ProgramacionVS();
        TreeSet<String> pVisual = new TreeSet<String>();

    public void asistenConferencia(TreeSet<String> conf){
        conf.add("Alexis");
        conf.add("Ana");
        conf.add("Sandra");
        conf.add("Maria");
        conf.add("David");
        conf.add("Ramirez");
        conf.add("Pedro");
        conf.add("Fabian");

        System.out.println("Comparando las listas de asistencia...");

    }


    public void CompararListaA(TreeSet<String> mate, TreeSet<String> algo,
                                TreeSet<String> pv,TreeSet<String> confM,TreeSet<String> confA,
                                TreeSet<String> confPV,TreeSet<String> confe){

    //Lista de Matematicas con referencia a la conferencia.
    for(String value: confe){
        for (String m : mate){
            if(value.equals(m)){
                confM.add(m);
            }
        }
    }
    //Lista de Algoritmos con referencia a la conferencia.
    for(String value: confe){    
        for (String a : algo){   
            if(value.equals(a)){
                confA.add(a);
            }
        }
    }
    //Lista de Programación visual con referencia a la conferencia.
    for(String value3: confe){
        for (String p : pv){
            if(value3.equals(p)){
                confPV.add(p);
            }
        }
    }

                                }
    
    public  void imprimirListas(TreeSet<String> confM, TreeSet<String> confA, TreeSet<String> confPV){
        
        System.out.println("\n----- Lista de Asistencia por materias. ------");
        System.out.println("---- Matematicas -----");
        Iterator<String> i = confM.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
       
        System.out.println("----------------------");
        System.out.println("---- Algoritmos -----");
        Iterator<String> x = confA.iterator();
        while (x.hasNext()) {
            System.out.println(x.next());
        }
        System.out.println("----------------------");

        System.out.println("---- Programacion Visual -----");
        Iterator<String> y = confPV.iterator();
        while (y.hasNext()) {
            System.out.println(y.next());
        }
        System.out.println("----------------------");
    }
}