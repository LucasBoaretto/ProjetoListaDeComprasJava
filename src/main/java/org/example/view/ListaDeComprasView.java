package org.example.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ListaDeComprasView {
    private Scanner scanner;

    public ListaDeComprasView(){
        scanner = new Scanner(System.in);
    }

    public void exibirMenu(){
        System.out.println("\n--- Gerenciador de Lista de Compras---");
        System.out.println("1.Adicionar Produto");
        System.out.println("2.Remover Produto");
        System.out.println("3.Exibir a Lista de Compras");
        System.out.println("4.Salvar lista em Arquivo Texto");
        System.out.println("5.Carregar lista do Arquivo Texto");
        System.out.println("6.Salvar lista em Arquivo Binario");
        System.out.println("7.Carregar lista do Arquivo Binario");
        System.out.println("0.Sair");
        System.out.println("Escolha uma opção: ");
    }

    public int lerOpcao(){
        int opcao = scanner.nextInt();
        scanner.nextLine();
        return opcao;
    }

    public String lerNomeProduto(){
        String nome = "";
        boolean nomeValido = false;
        while(!nomeValido){
            System.out.println("Nome do Produto: ");
            nome = scanner.nextLine().trim();

            if(nome.isEmpty()){
                System.out.println("Erro: informe o nome do produto");
            } else {
                nomeValido = true;
            }
        }
        return nome;
    }

    public int lerQuantidade(){
        int quantidade = 0;
        boolean quantidadeValida = false;
        while(!quantidadeValida){
            try {
                System.out.print("Quantidade: ");
                quantidade = scanner.nextInt();
                scanner.nextLine();
                quantidadeValida = true;
            } catch (InputMismatchException e){
                System.out.println("Erro: Quantidade deve ser um número inteiro. Tente novamente.");
                scanner.nextLine();
            }
        }
        return quantidade;
    }

    public double lerPreco(){
        System.out.println("Preço: ");
        return scanner.nextDouble();
    }

    public void exibirMensagem(String mensagem){
        System.out.print(mensagem);
    }
}
