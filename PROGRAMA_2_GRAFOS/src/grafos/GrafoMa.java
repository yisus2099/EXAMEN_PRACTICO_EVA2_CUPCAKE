package grafos;

public class GrafoMa {

    private final int VerticeMax;
    private int numVertice;
    private boolean dirigido;
    private boolean[][] matrizAdy;

    public GrafoMa(int VerticeMax, int numVertice, boolean dirigido, boolean[][] matrizAdy) {
        this.VerticeMax = VerticeMax;
        numVertice = 0;
        this.dirigido = dirigido;
        this.matrizAdy = new boolean[VerticeMax][VerticeMax];
    }

    GrafoMa(int Max, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getVerticeMax() {
        return VerticeMax;
    }

    public int getNumVertice() {
        return numVertice;
    }

    public boolean getDirigido() {
        return dirigido;
    }

    public void insertarVertice() {
        if (VerticeMax == numVertice) {
            System.out.println("Se supera el numero de nodos");
        } else {
            for (int i = 0; i < numVertice; i++) {
                matrizAdy[i][numVertice] = false;
            }
            numVertice++;
        }

    }

    public void insertarAr(int a, int b) {
        if ((a < numVertice) && (a >= 0) && (b < numVertice) && (b >= 0)) {
            matrizAdy[a][b] = true;
            if (!dirigido) {
                matrizAdy[a][b] = true;
            }
        } else {
            System.out.println("Los vertices no se encuentran");
        }
    }

    public void EliminarAr(int a, int b) {
        if ((a < numVertice) && (a >= 0) && (b < numVertice) && (b >= 0)) {
            matrizAdy[a][b] = false;
            if (!dirigido) {
                matrizAdy[a][b] = false;
            }
        } else {
            System.out.println("Los vertices no se encuentran");
        }
    }

    public boolean ExisteAr(int a, int b) {
        if ((a < numVertice) && (a >= 0) && (b < numVertice) && (b >= 0)) {
            return matrizAdy[a][b];
        } else {
            return false;
        }

    }

    public int grado(int a) {
        int resultado = 0;
        if ((a < numVertice) && (a >= 0)) {
            for (int i = 0; i < numVertice; i++) {
                if (matrizAdy[i][a]) {
                    resultado++;

                }
            }
        }
        return resultado;

    }

    public int incidencia(int a) {
        int resultado = 0;
        if ((a < numVertice) && (a >= 0)) {
            if (!dirigido) {
                resultado = columna(a);

            } else {
                resultado = columna(a) + fila(a);

            }
        }
        return resultado;
    }

    public int tamano(int a) {
        int resultado = 0;
        for (int i = 0; i < numVertice; i++) {
            for (int j = 0; j < numVertice; j++) {
                if (matrizAdy[i][j]) {
                    if (dirigido || i >= j) {
                        resultado++;
                    }
                }
            }
        }
        return resultado;

    }

    public void mostrar() {
        System.out.println("Esta matriz tiene " + numVertice + "Vertices");
        if (dirigido) {
            System.out.println("Si es dirigido");

        } else {
            System.out.println("No es dirigido");
        }
        for (int i = 0; i < numVertice; i++) {
            for (int j = 0; j < numVertice; j++) {
                if (matrizAdy[i][j]) {
                    System.out.println("i");
                } else {
                    System.out.println("0");
                }
            }
            System.out.println();
        }
    }

    private int columna(int a) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private int fila(int a) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
