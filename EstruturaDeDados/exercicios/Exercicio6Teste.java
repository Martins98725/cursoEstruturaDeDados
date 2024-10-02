package Algoritmos.EstruturaDeDados.exercicios;

import Algoritmos.EstruturaDeDados.Contato;
import Algoritmos.EstruturaDeDados.Lista;

import java.util.Scanner;

public class Exercicio6Teste {
    public static void main(String[] args)  {

        Lista<Contato> contatoList = new Lista<>(20);
        Scanner scanner = new Scanner(System.in);

        boolean rodando = true;

        while (rodando) {
            System.out.println("[1] Adicionar contato ");
            System.out.println("[2] Mostrar contato expecifico");
            System.out.println("[3] Remover contato");
            System.out.println("[4] Listar todos os contatos");
            System.out.println("[5] Sair");
            System.out.println("Escolha uma opção para proseguir");
            String opcao = scanner.nextLine();

            Contato contato = new Contato();
            switch (opcao){
                case "1":
                    try{
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
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }

                case "2":
                    System.out.println("informe o indice que quer buscar o contato");
                    int indice = scanner.nextInt();
                    var busca = contatoList.busca(indice);
                    System.out.println(busca);
                    break;
                default:
                    System.out.println("bye");
            }
        }

    }
}
