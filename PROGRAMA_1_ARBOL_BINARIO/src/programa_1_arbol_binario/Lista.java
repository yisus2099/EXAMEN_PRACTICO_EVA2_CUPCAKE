
package programa_1_arbol_binario;

/**
 *
 * @author CUPCAKE
 */
public class Lista {

    private NodoLista inicio;
    private NodoLista fin;
    private int cont;
   

     public Lista() {
        this.inicio = null;//No hay nodos en la lista
        this.fin = null;
        this.cont = 0;//No hay nodos en la lista
    }

//Lista esta vacía
    public boolean listaVacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void imprimir() {
        if (listaVacia()) {
            System.out.print("Lista vacía ");
        } else {
            NodoLista temp = inicio;
            //Mover temp hasta que llegue al nodo final
            while (temp != null) { 
                System.out.print( "[" + temp.getValor() + "] ");
                temp = temp.getSiguiente();  
            }
        }
        System.out.println("");
    }

    //Método para agregar nodos
    public void agregar(String valor) {
        NodoLista newNodo = new NodoLista(valor);
cont++;
        if (inicio == null) {//No hay nodos en la lista
            inicio = newNodo;
            fin = newNodo;
        } else {
            fin.setSiguiente(newNodo);
            fin = newNodo;
        }
        
    }

public int tamaLista(){
    return cont;
}

//Insertar en posisiciones no validads
    public void InsertarEn(String valor, int pos) throws Exception {
        int cantNodos = tamaLista();

        if (pos < 0)// posiciones negativas
        {
            throw new Exception("No puede insertarse un nodo en una posicion negativa");
        } else if (pos >= cantNodos)//posiciones mayores a la cantidad  de elementos
        {
            throw new Exception(pos + " No es una possicion valida en la lista");
        } else {
            NodoLista nuevoNodo = new NodoLista(valor);
            if (pos == 0) {//insertar al inicio de la lista
                nuevoNodo.setSiguiente(inicio);
                inicio = nuevoNodo;
            } else {// insertar un nodo en una posicion
                NodoLista temp = inicio;
                int cont = 0;
                while (cont < (pos - 1)) {

                    temp = temp.getSiguiente();
                    cont++;

                }
                // y ahora??
                nuevoNodo.setSiguiente(temp.getSiguiente());
                temp.setSiguiente(nuevoNodo);

            }
            this.cont++;
        }
    }

    //Metodo para limpiar toda la lista
    public void Limpiar() {
        inicio = null;
        fin = null;
        cont = 0;
    }

    //Eliminar segun la posicion en la lista
    public void BorrarEn(int pos) throws Exception {
        int cantNodos = tamaLista();
        if (pos < 0)// posiciones negativas
        {
            throw new Exception("No se pueden eliminar nodos de porsiciones negativas");
        } else if (pos >= cantNodos)//posiciones mayores a la cantidad  de elementos
        {
            throw new Exception("Esa posicion no es válida en la lista");
        } else {

            if (cantNodos == 1) {
                Limpiar();
            } else {
                //Borrar el primer nodi
                //borrar nodo intermedio
                //borrar el ultimo nodo
                if (pos == 0) {
                    inicio = inicio.getSiguiente();
                } else {
                    NodoLista temp = inicio;
                    int cont = 0;
                    while (cont < (pos - 1)) {
                        temp = temp.getSiguiente();
                        cont++;
                    }
                    NodoLista objSig = temp.getSiguiente();
                    temp.setSiguiente(objSig.getSiguiente());
                    if (pos == (cantNodos - 1)) {
                        fin = temp;
                    }
                }
                this.cont--;
            }
        }
    }

    public String getValueAt(int pos) throws Exception {

        int cantNodos = tamaLista();
        String Valor;
        if (pos < 0)// posiciones negativas
        {
            throw new Exception("No puede insertarse un nodo en una posicion negativa");
        } else if (pos >= cantNodos)//posiciones mayores a la cantidad  de elementos
        {
            throw new Exception(pos + " no es una possicion valida en la lista");
        } else {
            NodoLista temp = inicio;
            int cont = 0;
            while (cont < (pos)) {
                temp = temp.getSiguiente();
                cont++;

            }
            Valor = temp.getValor();

        }
        return Valor;
    }
   
}
