package Exercicios;

public class Main {

    public static void main(String[] args){
        exerc1(args);
    }

    public static void exerc1(String[] args){
        Estoque estoque = new Estoque();

        double[][] estoqueTotal = estoque.somarMatrizes(estoque.A, estoque.B);
        double[][] estoqueDisponivel = estoque.multiplicarMatriz(0.9, estoqueTotal);

        Estoque.printMatrizes("Soma das matrizes\n", estoqueTotal);
        Estoque.printMatrizes("Multiplicação por escalar\n", estoqueDisponivel);
    }
}
