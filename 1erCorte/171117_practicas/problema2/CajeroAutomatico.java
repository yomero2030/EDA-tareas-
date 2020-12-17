
public class CajeroAutomatico  implements  Comparable<CajeroAutomatico>{
    private  int visitaCajeroAuto;
    private int numeroCUentaTarjetaAutomatico;


    CajeroAutomatico(int visitas, int cuenta){
        visitaCajeroAuto= visitas;
        numeroCUentaTarjetaAutomatico= cuenta;
    }

    public void setVisitasCajeroA(int visitaCajeroAuto){
        this.visitaCajeroAuto= visitaCajeroAuto;
    }

    public void setNumeroCuentaTarjataAutomatico(int numeroCUentaTarjetaAutomatico){
        this.numeroCUentaTarjetaAutomatico= numeroCUentaTarjetaAutomatico;
    }

    public int getNumeroCUentaTarjetaAutomatico(){
        return numeroCUentaTarjetaAutomatico;
    }


    public int getVisitaCajeroAuto(){
        return visitaCajeroAuto;
    }

    @Override
    public int compareTo(CajeroAutomatico cA) {
        // TODO Auto-generated method stub
        return this.numeroCUentaTarjetaAutomatico-cA.numeroCUentaTarjetaAutomatico;
    }

}

