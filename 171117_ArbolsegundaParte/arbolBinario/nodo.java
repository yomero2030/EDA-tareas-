public class nodo{
    String nombre;
    nodo derecho;
    nodo izquierdo;

    nodo(String nombre){
        this.nombre= nombre;
        this.derecho= null;
        this.izquierdo= null;
    }
}