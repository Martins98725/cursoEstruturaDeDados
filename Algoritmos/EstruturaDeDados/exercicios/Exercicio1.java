package Algoritmos.EstruturaDeDados.exercicios;

import Algoritmos.EstruturaDeDados.Lista;

public class Exercicio1 {
    public static void main(String[] args) {
        // exercicio para adicionar em metodo de conter na classe Lista
        Lista<String> vetor = new Lista<>(5);
        try {
            vetor.adiciona("a");
            vetor.adiciona("b");
            vetor.adiciona("c");
            vetor.adiciona("d");

            var existe = vetor.contem("e");
            System.out.println(existe);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
