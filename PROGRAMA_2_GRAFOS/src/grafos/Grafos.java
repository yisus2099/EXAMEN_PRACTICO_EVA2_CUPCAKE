package grafos;

/**
 *
 * @author CUPCAKE
 */
public class Grafos {

    public static void main(String[] args) {
        int Max = 12;
        GrafoMa grafo = new GrafoMa(Max, false);
        for (int i = 0; i < Max; i++) {
            grafo.insertarVertice();
        }
        grafo.insertarAr(Max, Max);
        grafo.insertarAr(0, 10);
        grafo.insertarAr(0, 7);
        grafo.insertarAr(4, 12);
        grafo.insertarAr(0, 5);
        grafo.insertarAr(1, 7);
        grafo.insertarAr(9, 4);
        grafo.insertarAr(3, 8);
        grafo.insertarAr(2, 11);
        grafo.insertarAr(1, 2);
        grafo.insertarAr(5, 1);
        grafo.insertarAr(6, 3);

        grafo.mostrar();
        System.out.println("Tamano:" + grafo.tamano(Max));
        System.out.println("");
    }

}
