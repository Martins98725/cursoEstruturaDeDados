package Algoritmos.EstruturaDeDados;

import java.lang.reflect.Array;

public class Lista<T> {
    //String
    private T[] elementos;
    private int tamanho;

    public Lista(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public Lista(int capacidade, Class<T> tipoClasse) {
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
        this.tamanho = 0;

    }

    public void adiciona(T elemento) throws Exception {
        this.aumnetaCapacidade();
        if (tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("Vetor cheio não é possivel adicionar novos elementos");
        }
    }

    //overloadin do metodo
    //metodo para adicionar um elemento numa posição expecifica
    public boolean adiciona(int posicao, T elemento) {
        this.validaPosicao(posicao);

        this.aumnetaCapacidade();
        // vai interar o vetor de trás pra frente ou seja vai mover todos os elementos
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;

        this.tamanho++;

        return true;
    }

    private void aumnetaCapacidade() {
        if (this.tamanho == elementos.length) {
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            System.arraycopy(this.elementos, 0, elementosNovos, 0, this.elementos.length);
            /*for(int  i = 0; i < this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }*/
            this.elementos = elementosNovos;
        }
    }

    public void removeElemento(int posicao) {
        this.validaPosicao(posicao);

        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        this.tamanho--;
    }

    public Object validaPosicao(int posicao) {
        if (!(posicao >= 0 && posicao <= tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return elementos[posicao];
    }

    public int tamanho() {
        return this.tamanho;
    }

    public Object busca(int posicao) {
        if (!(posicao >= 0 && posicao <= this.tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao];
    }

    public int busca(T elemento) {
        //percorre a lista até o ultimo elemento
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public T pegar(T elemento){
        if (contem(elemento)){
            busca(elemento);
        }
        return elemento;
    }

    public boolean contem(T elemento) {
        return busca(elemento) >= 0;
    }

    public int ultimoIndice(T elemento) {

        //percorre o array de elementos de trás para frente e busca a última ocorrência de um elemento específico.
        for (int i = this.tamanho - 1; i >= 0; i--) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public void removeElemento(T elemento) {
        int pos = this.busca(elemento);
        if (pos > -1) {
            this.removeElemento(pos);
        }
    }

    public void limparElementos(){

       /* //cria um novo array de Object com o mesmo tamanho que o array atual this.elementos. O length retorna o número de elementos no array existente.
        //opção 1
        this.elementos = (T[])new Object[this.elementos.length];

        //opção 2
        //fica a cargo do coletor de lixo do java
        this.tamanho = 0;*/

        //opção 3
        this.tamanho = 0;
        for (int i = 0; i < this.tamanho; i++){
            this.elementos[i] = null;
        }
        this.tamanho = 0;

    }


    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(",");
        }
        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }
        s.append("]");

        return s.toString();
    }
}