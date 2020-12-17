

public class arbol {
    nodo raiz = null;
    public boolean tieneraiz(){
        if(raiz == null)
            return false;
        else 
             return true;
    }

    public arbol alta(String ed){
        if(!tieneraiz()){
            nodo nuevo = new nodo(ed);
            raiz = nuevo;
        }
         else{
            boolean izquierdo;
            nodo actual = raiz;
            while (true){
                if(actual.nombre.compareTo(ed) <=0)
                izquierdo = false;
                else
                    izquierdo = true;
                if(! izquierdo){
                    if (actual.derecho == null){
                        nodo nuevo = new nodo(ed);
                        actual.derecho = nuevo;
                        break;
                    }
                    else
                        actual = actual.derecho;
                } else{
                    if (actual.izquierdo == null) {
                        nodo nuevo = new nodo(ed);
                        actual.izquierdo = nuevo;
                        break;
                    } else
                        actual = actual.izquierdo;

                }
            }    
         }
         return this;
    }

        public boolean baja(String dat) {
            nodo actual = raiz, anterior = raiz, temp;
            while (true) {
                if (actual == null) {
                    System.out.println("1 actual= null:" + actual);
                    break;
                }
                if (actual.nombre == dat) {
                    System.out.println("borrando: " + dat);
                    actual.nombre = "0";
                    System.out.println("borrando dato en arbol: " + actual.nombre);
                    imIB();
                    break;
                }

                anterior = actual;
                if (actual.nombre.compareTo(dat) <=0) {
                    System.out.println("Derecha1: " + dat + "valor en nodo del recorrido es: " + actual.nombre);
                    actual = actual.derecho;
                    System.out.println("Derecha1: " + dat + "valor en nodo del recorrido es: " + actual.nombre);
                } else {
                    System.out.println("En el esle: " + dat + "valor en el nodo en el recorrido es:" + actual.nombre);
                    actual = actual.izquierdo;
                    System.out.println("En el else: " + dat + "valor en el nodo en el recorrido es:" + actual.nombre);
                }
            }

            if (actual == null)
                return false;
            else {
                if (actual == raiz) {
                    temp = actual.izquierdo;
                    raiz = raiz.derecho;
                    anterior = raiz;
                } else if (anterior.derecho == actual) {
                    temp = actual.izquierdo;
                    anterior = actual.derecho;
                } else {
                    temp = actual.izquierdo;
                    anterior.derecho = actual.izquierdo;
                }
                // actual=new nodo();
                while (actual.izquierdo != null)
                    actual = actual.izquierdo;
                actual.izquierdo = temp;
                return true;
            }
        }


    public void imprimirPreorden(){
        ayudantePreorden(raiz);
    }
    public void ayudantePreorden(nodo dat){
        if( dat == null)
            return;
            System.out.printf("%s ", dat.nombre);
            ayudantePreorden(dat.derecho);
            ayudantePreorden(dat.izquierdo);
        
    }

    public void imI(){
        imprimirInorden(raiz);
    }

    public void imprimirInorden(nodo dat){
        if( dat != null ){
            imprimirInorden(dat.izquierdo);
            System.out.printf("%s ", dat.nombre);
            imprimirInorden(dat.derecho);
        }
    }
    public void imIB() {
        imprimir_baja(raiz);
    }

    public void imprimir_baja(nodo dat) {
        if (dat != null) {
            imprimir_baja(dat.izquierdo);
            System.out.println(" " + dat.nombre);
            imprimir_baja(dat.derecho);
        }
    }

}
