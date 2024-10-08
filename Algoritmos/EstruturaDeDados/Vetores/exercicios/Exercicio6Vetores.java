package Algoritmos.EstruturaDeDados.Vetores.exercicios;

import Algoritmos.EstruturaDeDados.Vetores.Contato;
import Algoritmos.EstruturaDeDados.Vetores.Lista;

import java.util.Scanner;

public class Exercicio6Vetores {
    public static void main(String[] args) throws Exception {

        Lista<Contato> contatoList = new Lista<>(20);
        Scanner scanner = new Scanner(System.in);

        criarContatosDinamicamente(5, contatoList);


        int opcao = 1;

        while (opcao != 0){
            switch (opcao){
                case 1:
                    adicionarContatoFinal(scanner, contatoList);
                    break;
                case 2:
                    adicionarContatoPosicao(scanner, contatoList);
                    break;
                case 3:
                    obtemContatoPosicao(scanner, contatoList);
                    break;
                case 4:
                    obtemContato(scanner, contatoList);
                    break;
                case 5:
                    pesquisarUltimoContato(scanner, contatoList);
                    break;
                default:
                    System.out.println("Usuario digitou 0. Programa terminado");
            }
            opcao = obterOpcaoMenu(scanner);
        }
    }

    static int obterOpcaoMenu(Scanner scan) {
        boolean entradaValida = false;

        int opcao = 0;

        String entrada;

        while (!entradaValida) {
            System.out.println("[1] Adicionar contato ");
            System.out.println("[2] Adiciona contato no final do vetor");
            System.out.println("[3] Adiciona contato em uma posição expecifica");
            System.out.println("[4] Obtém contato de uma posição expecífica");
            System.out.println("[5] Consulta contato");
            System.out.println("[6] Consulta ultimo índice do contato");
            System.out.println("[7] Verifica se o contato existe");
            System.out.println("[8] Exclui por posição ");
            System.out.println("[9] Listar todos os contatos");
            System.out.println("[10] Exclui todos os contatos");
            System.out.println("[11] imprime vetor");
            System.out.println("[0] sair");

            try {
                entrada = scan.nextLine();
                opcao = Integer.parseInt(entrada);

                if (opcao >= 0 && opcao <= 11) {
                    entradaValida = true;
                }
                else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida, digite novamente: ");
            }
        }

        return opcao;
    }

    static void pesquisarUltimoContato(Scanner scan, Lista<Contato> lista){
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {
            Contato contato = lista.busca(pos);

            System.out.println("contato existe, seguem dados: ");
            System.out.println(contato);

            System.out.println("fazendo pesquisa do ultimo contato: ");
            pos = lista.ultimoIndice(contato);

            System.out.println("contato encontrado na posição: " + pos);

        }catch (Exception e){
            System.out.println("posição inválida");
        }
    }


    static void adicionarContatoFinal(Scanner scan, Lista<Contato> lista) throws Exception {
        System.out.println("Criando um contato com as informações");

        String nome = lerInformacao("entre com o nome", scan);
        String email = lerInformacao("entre com o email", scan);
        String telefone = lerInformacao("entre com o telefone", scan);

        Contato contato = new Contato(nome, telefone, email);

        lista.adiciona(contato);

        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato);

    }
    static void obtemContato(Scanner scan, Lista<Contato> lista){
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {
            Contato contato = lista.busca(pos);
            System.out.println(contato);

        }catch (Exception e){
            System.out.println("posição inválida");

        }
    }

    static void obtemContatoPosicao(Scanner scan, Lista<Contato> lista){
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {
             Contato contato = lista.busca(pos);
            System.out.println(contato);

        }catch (Exception e){
            System.out.println("posição inválida");

        }
    }

    static void adicionarContatoPosicao(Scanner scan, Lista<Contato> lista) throws Exception {
        System.out.println("Criando um contato com as informações");

        String nome = lerInformacao("entre com o nome", scan);
        String email = lerInformacao("entre com o email", scan);
        String telefone = lerInformacao("entre com o telefone", scan);

        Contato contato = new Contato(nome, telefone, email);

        int pos = lerInformacaoInt("Entre com a posição para adicionar o contato", scan);

        try {
            lista.adiciona(pos, contato);
            System.out.println("Contato adicionado com sucesso");
            System.out.println(contato);
        }catch (Exception e){
            System.out.println("Não adicionado");

        }

        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato);

    }

    static String lerInformacao(String menssagem, Scanner scan){
        System.out.println(menssagem);
        String entrada = scan.nextLine();

        return entrada;
    }

    static int lerInformacaoInt(String menssagem, Scanner scan){
        boolean entradaValida = false;

        int num = 0;

        while (!entradaValida){
            try{
                System.out.println(menssagem);
                String entrada = scan.nextLine();

                num = Integer.parseInt(entrada);

                entradaValida = true;

            } catch (Exception e) {
                System.out.println("Entrada inválida. Digite novamente");
            }
        }
        return num;
    }




    static void criarContatosDinamicamente(int quantitade, Lista<Contato> contatoList) throws Exception {
        Contato contato;
        for (int i = 1; i <= quantitade; i++) {
            contato = new Contato();

            contato.setNome("Contato " + i);
            contato.setEmail("contato" + i + "@gmail.com");
            contato.setTelefone("(11) 555-5555");

            contatoList.adiciona(contato);
        }
    }
}
