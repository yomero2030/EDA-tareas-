public class Nodo {
     Carro cars;
     Nodo derecho;
     Nodo izquierdo;
     Nodo (Carro cars){
         this.cars =  cars;
         this.derecho = null;
         this.izquierdo = null;
     }
}
