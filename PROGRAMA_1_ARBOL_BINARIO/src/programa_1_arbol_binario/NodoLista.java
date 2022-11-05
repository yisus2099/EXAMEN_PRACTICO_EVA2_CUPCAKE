
package programa_1_arbol_binario;

/**
 *s
 * @author Jesús Alejandro Torres Ramírez
 */
public class NodoLista {
    private String valor;
    private NodoLista siguiente;
    
  
    public NodoLista() {
        this.siguiente = null;
    }

    public NodoLista(String valor) {
        this.valor = valor;
        this.siguiente = null;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public NodoLista getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLista siguiente) {
        this.siguiente = siguiente;
    }
}
