package Algoritmos.EstruturaDeDados.Vetores.exercicios;

import Algoritmos.EstruturaDeDados.Vetores.Lista;

public class Exercicio4Vetores {
    public static void main(String[] args) {
        Lista<String> vetor = new Lista<>(5);
        try {
            vetor.adiciona("a");
            vetor.adiciona("b");
            vetor.adiciona("c");
            vetor.adiciona("d");

            var pega = vetor.pegar("b");
            System.out.println(pega);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
