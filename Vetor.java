package Algoritmos.EstruturaDeDados;

public class Vetor {
    //String
    private Object[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }

    public void adiciona(Object elemento) throws Exception {
        this.aumnetaCapacidade();
        if (tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("Vetor cheio não é possivel adicionar novos elementos");
        }
    }

    //overloadin do metodo
    public boolean adiciona(int posicao, Object elemento) {
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
            Object[] elementosNovos = new Object[this.elementos.length * 2];
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

    public int busca(Object elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
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

    /*public void adiciona(String elemento){
        //intera sobre a  lista para verificar se tem elementos nulos
        for(int i =0; i < this.elementos.length; i++){
            //verifica se a posição do vetor está nula, se estiver, adiciona o nosso elemento
            if(this.elementos[i] == null){
                this.elementos[i] = elemento;
                break;
            }
        }
        //this.elementos[this.elementos.length - 1]  =  elemento;
    }*/
}
