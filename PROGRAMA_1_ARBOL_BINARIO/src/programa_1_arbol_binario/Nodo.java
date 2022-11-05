
package programa_1_arbol_binario;

/**
 *
 * @author CUPCAKE
 */
public class Nodo {
    private Nodo izquierdo;
    private Nodo derecho;
    private String valor;

     
public Nodo(String valor) {
        this.valor = valor;
        this.izquierdo = null;
        this.derecho = null;
       
    }

    public Nodo getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(Nodo izquierda) {
        this.izquierdo = izquierda;
    }

    public Nodo getDerecho() {
        return derecho;
    }

    public void setDerecho(Nodo derecha) {
        this.derecho = derecha;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return  valor;
    }
    
    
    
}
