public class Nodo {
    Persona personitas;

    Nodo derecho;
    Nodo izquierdo;

    Nodo( Persona  personitas){
        this.personitas= personitas;
        this.derecho = null;
        this.izquierdo = null;
    }
}
