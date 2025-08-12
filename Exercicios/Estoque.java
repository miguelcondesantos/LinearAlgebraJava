package Exercicios;

public class Estoque {

    public double[][] A = {
            { 10, 20 },
            { 30, 40 }
    };

    public double[][] B = {
            { 5, 15 },
            { 25, 35 }
    };

    public double[][] somarMatrizes(double[][] m1, double[][] m2) {

        int linhas = m1.length;
        int colunas = m1[0].length;

        double[][] resultado = new double[linhas][colunas];

        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                resultado[l][c] = m1[l][c] + m2[l][c];
            }
        }

        return resultado;
    }

    public double[][] multiplicarMatriz(double n, double[][] m) {
        int linhas = m.length;
        int colunas = m[0].length;

        double[][] resultado = new double[linhas][colunas];

        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                resultado[l][c] = n * m[l][c];
            }
        }

        return resultado;
    }

    public static void printMatrizes(String texto, double[][] matriz) {
        System.out.println(texto);

        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.printf( matriz[l][c] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

}
