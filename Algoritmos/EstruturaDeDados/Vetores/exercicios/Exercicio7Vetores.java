package Algoritmos.EstruturaDeDados.Vetores.exercicios;

import Algoritmos.EstruturaDeDados.Vetores.Contato;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio7Vetores extends Exercicio6Vetores {
    public static void main(String[] args) throws Exception {

        ArrayList<Contato> contatoList = new ArrayList<>(20);
        Scanner scanner = new Scanner(System.in);


        int opcao = 1;

        while (opcao != 0) {
            opcao = obterOpcaoMenu(scanner);
            switch (opcao) {
                case 1:
                    //criarContatosDinamicamente(5, contatoList);
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
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida, digite novamente: ");
            }
        }

        return opcao;
    }

    static void pesquisarUltimoContato(Scanner scan, ArrayList<Contato> lista) {
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {
            Contato contato = lista.get(pos);

            System.out.println("contato existe, seguem dados: ");
            System.out.println(contato);

            System.out.println("fazendo pesquisa do ultimo contato: ");
            pos = lista.lastIndexOf(contato);

            System.out.println("contato encontrado na posição: " + pos);

        } catch (Exception e) {
            System.out.println("posição inválida");
        }
    }


    static void adicionarContatoFinal(Scanner scan, ArrayList<Contato> lista) throws Exception {
        System.out.println("Criando um contato com as informações");

        String nome = lerInformacao("entre com o nome", scan);
        String email = lerInformacao("entre com o email", scan);
        String telefone = lerInformacao("entre com o telefone", scan);

        Contato contato = new Contato(nome, telefone, email);

        lista.add(contato);

        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato);

    }

    static void obtemContato(Scanner scan, ArrayList<Contato> lista) {
        System.out.println();

        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {
            Contato contato = lista.get(pos);
            System.out.println(contato);

        } catch (Exception e) {
            System.out.println("posição inválida");

        }
    }

    static void obtemContatoPosicao(Scanner scan, ArrayList<Contato> lista) {
        obtemContato(scan, lista);
    }

    static void adicionarContatoPosicao(Scanner scan, ArrayList<Contato> lista) {
        System.out.println("Criando um contato com as informações");

        String nome = lerInformacao("entre com o nome", scan);
        String email = lerInformacao("entre com o email", scan);
        String telefone = lerInformacao("entre com o telefone", scan);

        Contato contato = new Contato(nome, telefone, email);

        int pos = lerInformacaoInt("Entre com a posição para adicionar o contato", scan);

        try {
            lista.add(pos, contato);
            System.out.println("Contato adicionado com sucesso");
            System.out.println(contato);
        } catch (Exception e) {
            System.out.println("Não adicionado");

        }

        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato);

    }

    static String lerInformacao(String menssagem, Scanner scan) {
        System.out.println(menssagem);
        String entrada = scan.nextLine();

        return entrada;
    }

    static int lerInformacaoInt(String menssagem, Scanner scan) {
        boolean entradaValida = false;

        int num = 0;

        while (!entradaValida) {
            try {
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

    static void listarTodosOsContatos(ArrayList<Contato> lista) {
        Contato contato;
        for (int i = 0; i <= lista.size(); i++) {
            contato = new Contato();

            contato.setNome("Contato " + i + " com o nome: " + contato.getNome());
            contato.setEmail("contato" + i + contato.getEmail() + "@gmail.com");
            contato.setTelefone(contato.getTelefone());
        }
    }


    static void criarContatosDinamicamente(int quantidade, ArrayList<Contato> contatoList) throws Exception {
        listarTodosOsContatos(contatoList);
        Contato contato;
        for (int i = 1; i <= quantidade; i++) {
            contato = new Contato();

            contato.setNome("Contato " + i + " com o nome: ");
            contato.setEmail("contato" + i + "@gmail.com");
            contato.setTelefone("(11) 555-5555");

            contatoList.add(contato);
        }
    }
}
