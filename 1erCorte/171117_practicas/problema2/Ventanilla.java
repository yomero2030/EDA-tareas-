
public class Ventanilla implements Comparable<Ventanilla> { 
    private int tarjetaVentanilla;
    private int numeroVisitanteVentanilla;


    Ventanilla(int numero, int tarjeta){
            numeroVisitanteVentanilla= numero;
            tarjetaVentanilla = tarjeta;
    }

    public void setTarjetaVentanilla( int tarjetaVentanilla) {

        this.tarjetaVentanilla = tarjetaVentanilla;
    }

    public int getTarjetaVentanilla() {
        return tarjetaVentanilla;
    }

    public void setNumeroVisitanteVentanilla(int numeroVisitanteVentanilla) {
        this.numeroVisitanteVentanilla = numeroVisitanteVentanilla;
    }

    public int getNumeroVisitanteVentanilla(){
        return numeroVisitanteVentanilla;
    }

   
    @Override
    public int compareTo(Ventanilla ven) {
        // TODO Auto-generated method stub
        return this.tarjetaVentanilla-ven.tarjetaVentanilla;
    }


    
}
