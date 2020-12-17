import java.util.TreeSet;

public class Main{ 
    public static void main(String[] args) {

        ListaAsistencia listasAsistencia =  new ListaAsistencia();
         Matematicas matematicas = new Matematicas();
         TreeSet<String>  mate  =new TreeSet<String>();

         Algoritmo algoritmo = new Algoritmo();
         TreeSet<String> algo = new TreeSet<String>();

        ProgramacionVS programacionVS = new ProgramacionVS();
        TreeSet<String> pVisual = new TreeSet<String>();
        
        TreeSet<String> ConferenciaM = new TreeSet<String>();
        TreeSet<String> ConferenciaA  = new TreeSet<String>();
        TreeSet<String> COnferenciaPV = new TreeSet<String>();
        TreeSet<String> conf =  new TreeSet<String>();
        listasAsistencia.asistenConferencia(conf);

         matematicas.ConferenciaMatematicas(mate);
         algoritmo.conferenciaAlgoritmo(algo);
         programacionVS.conferenciaProgramacion(pVisual);

         listasAsistencia.CompararListaA(mate, algo, pVisual, ConferenciaM, ConferenciaA, COnferenciaPV, conf);

         listasAsistencia.imprimirListas(ConferenciaM, ConferenciaA, COnferenciaPV);

    }
}