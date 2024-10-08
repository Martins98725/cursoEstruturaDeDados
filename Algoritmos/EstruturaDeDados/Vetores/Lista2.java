package Algoritmos.EstruturaDeDados.Vetores;

import Algoritmos.EstruturaDeDados.EstruturaEstatica;

public class Lista2<T> extends EstruturaEstatica<T> {

    public Lista2(int capacidade) {
        super(capacidade);
    }

    public Lista2() {
        super();
    }
    public boolean adiciona(T elemento) throws Exception {
         return super.adiciona(elemento);
    }
    public boolean adiciona(int posicao, T elemento) {
        return super.adiciona(posicao, elemento);
    }
}
