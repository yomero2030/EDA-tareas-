public class Arbol {
    Nodo raiz = null;

    public boolean tieneraiz() {
        if (raiz == null)
            return false;
        else
            return true;
    }

    public Arbol alta(Alumno Alumno) {
        if (!tieneraiz()) {
            Nodo nuevo = new Nodo(Alumno);
            raiz = nuevo;
        } else {
            boolean izq;
            Nodo actual = raiz;
            while (true) {
                if (actual.alum.getmatricula().compareTo(Alumno.getmatricula()) <= 0)
                    izq = false;
                else
                    izq = true;
                if (!izq) {
                    if (actual.der == null) {
                        Nodo nuevo = new Nodo(Alumno);
                        actual.der = nuevo;
                        break;
                    }

                    else
                        actual = actual.der;
                } else {
                    if (actual.izq == null) {
                        Nodo nuevo = new Nodo(Alumno);
                        actual.izq = nuevo;
                        break;
                    } else
                        actual = actual.izq;
                }
            }
        }
        return this;
    }


    public boolean eliminar(String matricula , String libro) {

        Nodo auxiliar = raiz;
        Nodo padre = raiz;
        boolean hijoIzq = true;

        while (auxiliar.alum.getmatricula().compareTo(matricula) != 0) {
            padre = auxiliar;

            if (libro.compareTo(auxiliar.alum.getLibro()) < 0 ) {
                hijoIzq = true;
                auxiliar = auxiliar.izq;
            } else {
                hijoIzq = false;
                auxiliar = auxiliar.der;
            }
            if (auxiliar == null) {
                return false;
            }
        } // fin del while

        if (auxiliar.izq == null && auxiliar.der == null) {
            if (auxiliar == raiz) {
                raiz = null;
            } else if (hijoIzq) {
                padre.izq = null;
            } else {
                padre.der = null;
            }
        } else if (auxiliar.der == null) {
            if (auxiliar == raiz) {
                raiz = auxiliar.izq;
            } else if (hijoIzq) {
                padre.izq = auxiliar.izq;
            } else {
                padre.der = auxiliar.izq;
            }
        } else if (auxiliar.izq == null) {
            if (auxiliar == raiz) {
                raiz = auxiliar.der;
            } else if (hijoIzq) {
                padre.izq = auxiliar.der;
            } else {
                padre.der = auxiliar.izq;
            }
        } else {
            Nodo reemplazo = obtenerReemplazo(auxiliar);
            if (auxiliar == raiz) {
                raiz = reemplazo;
            } else if (hijoIzq) {
                padre.izq = reemplazo;
            } else {
                padre.der = reemplazo;
            }
            reemplazo.izq = auxiliar.izq;
        }
        return true;
    }

    public Nodo obtenerReemplazo(Nodo nodoReemp){
        
        Nodo reemplazo = nodoReemp;
        Nodo reemplazoPadre = nodoReemp;
        Nodo auxiliar = nodoReemp.der;

        while(auxiliar != null){
            reemplazoPadre = reemplazo;
            reemplazo = auxiliar;
            auxiliar = auxiliar.izq;
        }

        if(reemplazo != nodoReemp.der){
            reemplazoPadre.izq = reemplazo.der;
            reemplazo.der = nodoReemp.der;
        }

        //System.out.println("El Nodo reemplazo es: " + reemplazo);
        return reemplazo;

    }



    public void imprimirpreorden() {
        ayudantePreorden(raiz);
    }

    public void ayudantePreorden(Nodo dat) {
        if (dat == null)
            return;
        System.out.printf("%s ", dat.alum.toString());
        ayudantePreorden(dat.der);
        ayudantePreorden(dat.izq);
    }

    public void imI() {
        imprimir_inorden(raiz);
    }

    public void imprimir_inorden(Nodo dat) {
        if (dat != null) {
            imprimir_inorden(dat.izq);
            System.out.print(" " + dat.alum.toString());
            imprimir_inorden(dat.der);
        }
    }

    public void imIB() {
        imprimir_baja(raiz);
    }

    public void imprimir_baja(Nodo dat) {
        if (dat != null) {
            imprimir_baja(dat.izq);
            System.out.print(" " + dat.alum.toString());
            imprimir_baja(dat.der);
        }
    }
}
