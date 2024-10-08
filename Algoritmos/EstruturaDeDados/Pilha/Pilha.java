package Algoritmos.EstruturaDeDados.Pilha;

import Algoritmos.EstruturaDeDados.EstruturaEstatica;

import java.util.Stack;

public class Pilha<T> extends EstruturaEstatica<T> {
    public Pilha() {
    }

    public Pilha(int capacidade) {
        super(capacidade);
    }

    public void empilha(T elemento) throws Exception {
        super.adiciona(elemento);
    }

}
