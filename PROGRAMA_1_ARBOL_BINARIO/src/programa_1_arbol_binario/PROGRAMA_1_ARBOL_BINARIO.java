package programa_1_arbol_binario;

import java.util.Scanner;

/**
 *
 * @author CUPCAKE
 */
public class PROGRAMA_1_ARBOL_BINARIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int num = 0;
        String datos;
        ArbolBinario arbolBinario = new ArbolBinario();
        Lista lista = new Lista();

        System.out.println("Bienvenido, ¿Cuantas palabras quieres introducir?");
        num = input.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print("Ingresa palabra: ");
            datos = input.next();
            arbolBinario.Agregar(datos);
        }

        System.out.println("Pre order");
        arbolBinario.preOrder();
        System.out.println("In order: ");
        arbolBinario.inOrder();
        System.out.println("Pos order");
        arbolBinario.postOrder();
        System.out.println("");

        System.out.println("Lista guardada en In order: ");
        arbolBinario.arbolAListaInOrder(lista);
        lista.imprimir();

    }
}
