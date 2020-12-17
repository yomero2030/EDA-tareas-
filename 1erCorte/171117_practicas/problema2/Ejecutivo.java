
public class Ejecutivo implements Comparable<Ejecutivo> {
    private int ejecutivo;
    private int tarjetaEjecutivo;
    Ejecutivo(int ejecutivo, int tarjetaEjecutivo){
        this.tarjetaEjecutivo= tarjetaEjecutivo;
        this.ejecutivo= ejecutivo;
    }
    public void setEjecutivo(int ejecutivo){
        this.ejecutivo = ejecutivo;
    }

    public void setTarjetaEjecutivo(int tarjetaEjecutivo){
        this.tarjetaEjecutivo = tarjetaEjecutivo;
    }

    public int getEjecutivo(){
        return ejecutivo;
    }

    public int getTarjetaEjecutivo(){
        return tarjetaEjecutivo;
    }

    @Override
    public int compareTo(Ejecutivo eje) {
        // TODO Auto-generated method stub
        return this.tarjetaEjecutivo-eje.tarjetaEjecutivo;
    }

    
}
