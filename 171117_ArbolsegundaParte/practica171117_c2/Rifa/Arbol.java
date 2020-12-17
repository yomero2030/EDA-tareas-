import javax.swing.text.StyledEditorKit.BoldAction;

public class Arbol {
    Nodo raiz = null;
   
    public boolean tieneraiz() {
        if (raiz == null)
            return false;
        else
            return true;
    }
    public Arbol alta(Persona Persona) {
        if (!tieneraiz()) {
            Nodo nuevo = new Nodo(Persona );
            raiz = nuevo;
        } else {
            boolean izquierdo;
            Nodo actual = raiz;
            while (true) {
                if (actual.personitas.getNumeroTApa().compareTo(Persona.getNumeroTApa())<= 0)
                    izquierdo = false;
                else
                    izquierdo = true;
                if (!izquierdo) {
                    if (actual.derecho == null) {
                        Nodo nuevo = new Nodo(Persona);
                        actual.derecho = nuevo;
                        break;
                    }

                    else
                        actual = actual.derecho;
                } else {
                    if (actual.izquierdo == null) {
                        Nodo nuevo = new Nodo(Persona);
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
        System.out.printf("%s ", dat.personitas);
        ayudantePreorden(dat.derecho);
        ayudantePreorden(dat.izquierdo);
    }


//Eliminar
public boolean eliminar(String d) {

    Nodo auxiliar = raiz;
    Nodo padre = raiz;
    boolean hijoIzquizquierdo = true;

    while (auxiliar.personitas.getNumeroTApa().compareTo(d) != 0) {
        padre = auxiliar;

        if (d.compareTo(auxiliar.personitas.getNumeroTApa()) < 0 ) {
            hijoIzquizquierdo = true;
            auxiliar = auxiliar.izquierdo;
        } else {
            hijoIzquizquierdo = false;
            auxiliar = auxiliar.derecho;
        }
        if (auxiliar == null) {
            return false;
        }
    } // fin del while

    if (auxiliar.izquierdo == null && auxiliar.derecho == null) {
        if (auxiliar == raiz) {
            raiz = null;
        } else if (hijoIzquizquierdo) {
            padre.izquierdo = null;
        } else {
            padre.derecho = null;
        }
    } else if (auxiliar.derecho == null) {
        if (auxiliar == raiz) {
            raiz = auxiliar.izquierdo;
        } else if (hijoIzquizquierdo) {
            padre.izquierdo = auxiliar.izquierdo;
        } else {
            padre.derecho = auxiliar.izquierdo;
        }
    } else if (auxiliar.izquierdo == null) {
        if (auxiliar == raiz) {
            raiz = auxiliar.derecho;
        } else if (hijoIzquizquierdo) {
            padre.izquierdo = auxiliar.derecho;
        } else {
            padre.derecho = auxiliar.izquierdo;
        }
    } else {
        Nodo reemplazo = obtenerReemplazo(auxiliar);
        if (auxiliar == raiz) {
            raiz = reemplazo;
        } else if (hijoIzquizquierdo) {
            padre.izquierdo = reemplazo;
        } else {
            padre.derecho = reemplazo;
        }
        reemplazo.izquierdo = auxiliar.izquierdo;
    }
    return true;
}

public Nodo obtenerReemplazo(Nodo nodoReemp){
    
    Nodo reemplazo = nodoReemp;
    Nodo reemplazoPadre = nodoReemp;
    Nodo auxiliar = nodoReemp.derecho;

    while(auxiliar != null){
        reemplazoPadre = reemplazo;
        reemplazo = auxiliar;
        auxiliar = auxiliar.izquierdo;
    }

    if(reemplazo != nodoReemp.derecho){
        reemplazoPadre.izquierdo = reemplazo.derecho;
        reemplazo.derecho = nodoReemp.derecho;
    }

    return reemplazo;

}


}
