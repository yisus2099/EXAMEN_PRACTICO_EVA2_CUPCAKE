
package programa_1_arbol_binario;

/**
 *
 * @author CUPCAKE
 */
public class PROGRAMA_1_ARBOL_BINARIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArbolBinario arbolBinario = new ArbolBinario();
        
        arbolBinario.Agregar("a");
        arbolBinario.Agregar("b");
         arbolBinario.Agregar("d");
        arbolBinario.Agregar("g");
        arbolBinario.Agregar("e");
        arbolBinario.Agregar("h");
        arbolBinario.Agregar("i");
        arbolBinario.Agregar("c");
        arbolBinario.Agregar("f");
        arbolBinario.Agregar("j");
        arbolBinario.Agregar("k");



        System.out.println("Pre order");
        arbolBinario.preOrder();
                System.out.println("In order: ");
        arbolBinario.inOrder();
        System.out.println("Pos order");
        arbolBinario.postOrder();
        
        
        
    }
    
}
