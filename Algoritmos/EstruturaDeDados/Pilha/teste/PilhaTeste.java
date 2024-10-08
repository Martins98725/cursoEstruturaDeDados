package Algoritmos.EstruturaDeDados.Pilha.teste;

import Algoritmos.EstruturaDeDados.Pilha.Pilha;

public class PilhaTeste {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        for (int i = 1; i <= 10; i++){
            try {
                pilha.empilha(i);
            }catch (Exception e){
                System.out.println("Deu erro");
            }

        }

        System.out.println(pilha);
        System.out.println(pilha.tamanho());
    }
}
