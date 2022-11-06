package programa_1_arbol_binario;

/**
 *
 * @author CUPCAKE
 */
public class ArbolBinario {

    private Nodo root;
    private int nodos;

    public ArbolBinario() {
        this.root = null;
    }

    public void Agregar(String valor) {
        if (root == null) {
            root = new Nodo(valor);
        } else {
            AgregarRecur(valor, root);
        }
    }

    public void AgregarRecur(String valor, Nodo nodoActual) {
        Nodo nuevo = new Nodo(valor);
        if (valor.compareTo(nodoActual.getValor()) > 0) {
            if (nodoActual.getDerecho() == null) {
                nodoActual.setDerecho(nuevo);
            } else {
                AgregarRecur(valor, nodoActual.getDerecho());
            }
        } else if (valor.compareTo(nodoActual.getValor()) < 0) {
            if (nodoActual.getIzquierdo() == null) {
                nodoActual.setIzquierdo(nuevo);
            } else {
                AgregarRecur(valor, nodoActual.getIzquierdo());
            }
        } else {
            System.out.println("NOMBRE REPETIDO");
        }
    }

    public void inOrder() {
        inOrderRecu(root);
        System.out.println("");
    }

    private void inOrderRecu(Nodo nodo) {
        if (nodo != null) {
            int i=0;
            inOrderRecu(nodo.getIzquierdo());
           System.out.print("[" + nodo.getValor() + "] ");
            inOrderRecu(nodo.getDerecho());
        }
    }
    
    public void preOrder() {
        preOrderRecu(root);
        System.out.println("");
    }

    private void preOrderRecu(Nodo nodo) {
        if (nodo != null) {
            System.out.print("[" + nodo.getValor() + "] ");
            preOrderRecu(nodo.getIzquierdo());
            preOrderRecu(nodo.getDerecho());
        }
    }

    public void postOrder() {
        postOrderRecu(root);
        System.out.println("");
    }

    private void postOrderRecu(Nodo nodo) {
        if (nodo != null) {
            postOrderRecu(nodo.getIzquierdo());
            postOrderRecu(nodo.getDerecho());
            System.out.print("[" + nodo.getValor() + "] ");
        }
    }
    
    public int numeroNodos(){
        nodos =0;
        numeroNodosRecu(root);
        return nodos;
    }
    
    private void  numeroNodosRecu(Nodo recorrido) {
        if (recorrido != null) {
            nodos ++;
            numeroNodosRecu(recorrido.getIzquierdo());
            numeroNodosRecu(recorrido.getDerecho());
        }
    }
    
    //Método para guar en lista InOrder
     public void arbolAListaInOrder(Lista lista){
       arbolAListaInOrderRecu(root, lista);
   }
     
    private void arbolAListaInOrderRecu (Nodo nodo, Lista lista) {
        if (nodo != null) {
            arbolAListaInOrderRecu(nodo.getIzquierdo(), lista);
           lista.agregar(nodo.getValor());
          arbolAListaInOrderRecu(nodo.getDerecho(), lista);
        }
    }

}
