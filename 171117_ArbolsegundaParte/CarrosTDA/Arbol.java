public class Arbol {
    Nodo raiz = null;

    public boolean tieneraiz() {
        if (raiz == null)
            return false;
        else
            return true;
    }

    public Arbol alta(Carro carro) {
        if (!tieneraiz()) {
            Nodo nuevo = new Nodo(carro);
            raiz = nuevo;
        } else {
            boolean izquierdo;
            Nodo actual = raiz;
            while (true) {
                if (actual.cars.getNombre().compareTo(carro.getNombre())<=0)
                    izquierdo = false;
                else
                    izquierdo = true;
                if (!izquierdo) {
                    if (actual.derecho == null) {
                        Nodo nuevo = new Nodo(carro);
                        actual.derecho = nuevo;
                        break;
                    }

                    else
                        actual = actual.derecho;
                } else {
                    if (actual.izquierdo == null) {
                        Nodo nuevo = new Nodo(carro);
                        actual.izquierdo = nuevo;
                        break;
                    } else
                        actual = actual.izquierdo;
                }
            }
        }
        return this;
    }

    public void imprimirpreorden() {
        ayudantePreorden(raiz);
    }

    public void ayudantePreorden(Nodo dat) {
        if (dat == null)
            return;
        System.out.printf("%s ", dat.cars.toString());
        ayudantePreorden(dat.derecho);
        ayudantePreorden(dat.izquierdo);
    }

    public void imI() {
        imprimir_inorden(raiz);
    }

    public void imprimir_inorden(Nodo dat) {
        if (dat != null) {
            imprimir_inorden(dat.izquierdo);
            System.out.print(" " + dat.cars.toString());
            imprimir_inorden(dat.derecho);
        }
    }

    public void imIB() {
        imprimir_baja(raiz);
    }

    public void imprimir_baja(Nodo dat) {
        if (dat != null) {
            imprimir_baja(dat.izquierdo);
            System.out.print(" " + dat.cars.toString());
            imprimir_baja(dat.derecho);
        }
    }
}
