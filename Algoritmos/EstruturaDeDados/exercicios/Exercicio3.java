package Algoritmos.EstruturaDeDados.exercicios;

import Algoritmos.EstruturaDeDados.Lista;

public class Exercicio3 {
    public static void main(String[] args) {
        //exercicio para criar um metodo semelhante ao remove do arraylist
        Lista<String> vetor = new Lista<>(5);
        try {
            vetor.adiciona("a");
            vetor.adiciona("b");
            vetor.adiciona("c");
            vetor.adiciona("d");

            vetor.removeElemento("d");
            System.out.println(vetor);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
