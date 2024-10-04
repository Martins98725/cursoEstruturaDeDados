package Algoritmos.EstruturaDeDados.exercicios;

import Algoritmos.EstruturaDeDados.Contato;
import Algoritmos.EstruturaDeDados.Lista;

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
                    break;
                default:
            }
            opcao = obterOpcaoMenu(scanner);
        }

        System.out.println("Usuario digitou 0. Programa terminado");

        /*boolean rodando = true;

        while (rodando) {
            System.out.println("[1] Adicionar contato ");
            System.out.println("[2] Mostrar contato expecifico");
            System.out.println("[3] Remover contato");
            System.out.println("[4] Listar todos os contatos");
            System.out.println("[5] Sair");
            System.out.println("Escolha uma opção para proseguir");
            String opcao = scanner.nextLine();

            Contato contato = new Contato();
            switch (opcao) {
                case "1":
                    try {
                        System.out.println("nome para contato");
                        String nome = scanner.nextLine();
                        contato.setNome(nome);
                        System.out.println("email para contato");
                        String email = scanner.nextLine();
                        contato.setEmail(email);
                        System.out.println("telefone para contato");
                        String telefone = scanner.nextLine();
                        contato.setTelefone(telefone);
                        contatoList.adiciona(contato);

                        break;
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                case "2":
                    System.out.println("informe o indice que quer buscar o contato");
                    int indice = scanner.nextInt();
                    var busca = contatoList.busca(indice);
                    System.out.println(busca);
                    break;
                case "3":

                    break;
                default:
                    System.out.println("bye");
            }
        }*/

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

    static String lerInformacao(String menssagem, Scanner scan){
        System.out.println(menssagem);
        String entrada = scan.nextLine();

        return entrada;
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
