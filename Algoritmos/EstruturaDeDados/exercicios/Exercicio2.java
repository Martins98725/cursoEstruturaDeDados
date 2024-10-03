package Algoritmos.EstruturaDeDados.exercicios;

import Algoritmos.EstruturaDeDados.Lista;

public class Exercicio2 {
    public static void main(String[] args) {
        //exercicio para criar um metodo semelhante ao lastIndexOf do arraylist
        Lista<String> vetor = new Lista<>(5);
        try {
            vetor.adiciona("a");
            vetor.adiciona("b");
            vetor.adiciona("c");
            vetor.adiciona("d");

            System.out.println(vetor.ultimoIndice("e"));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}