package Algoritmos.Teste;

import Algoritmos.EstruturaDeDados.Vetor;

public class Vetor1Teste {
    public static void main(String[] args)  {
        Vetor vetor =  new Vetor(5);
        try {
            vetor.adiciona("B");
            vetor.adiciona("G");
            vetor.adiciona("C");
            vetor.adiciona("E");
            vetor.adiciona("F");

            vetor.removeElemento(1);
            System.out.println(vetor);

            System.out.println("Remover o elemento E");

            int posicao = vetor.busca("E");
            if (posicao >= -0){
                vetor.removeElemento(posicao);
            }

            System.out.println(vetor);

          /*  vetor.adiciona(0, "A");

            System.out.println(vetor);

            vetor.adiciona(3, "D");

            System.out.println(vetor);*/
        }
        catch (Exception e){
            System.out.println(e);
        }

     /*   try{
            Vetor vetor =  new Vetor(10);
            vetor.adiciona("elemento 1");
            vetor.adiciona("elemento 2");
            vetor.adiciona("elemento 3");
            System.out.println(vetor.busca("elemento 3"));

        } catch (Exception e){
            System.out.println(e);
        }*/
    }
}
