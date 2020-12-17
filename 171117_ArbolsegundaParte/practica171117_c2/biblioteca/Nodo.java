public class Nodo{

    Alumno alum;
    Nodo der;
    Nodo izq;

    Nodo(Alumno alum){
        this.alum = alum;
        this.der = null;
        this.izq = null;
    }

    public Alumno getValor(){
        return alum;
    }
    public void setValor(Alumno valor){
        this.alum = valor;
    }
    public Nodo getIzq(){
        return izq;
    }
    public void setIzq(Nodo izq){
        this.izq = izq;
    }
    public Nodo getDer(){
        return der;
    }
    public void setDer(Nodo der){
        this.der = der;
    }

}