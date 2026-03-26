package org.example.controller;

import org.example.model.ListaDeCompras;
import org.example.model.Produto;
import org.example.view.ListaDeComprasView;

public class ListaDeComprasController {
    private ListaDeCompras model;
    private ListaDeComprasView view;

    public ListaDeComprasController(ListaDeCompras model, ListaDeComprasView view){
        this.model = model;
        this.view = view;
    }

    public void iniciar(){
        int opcao;
        do {
            view.exibirMenu();
            opcao = view.lerOpcao();
            processarOpcao(opcao);
        } while (opcao != 0);
    }

    private void processarOpcao(int opcao) {
        switch (opcao){
            case 1:
                adicionarProduto();
                break;
            case 2:
                removerProduto();
                break;
            case 3:
                exibirLista();
                break;
            case 4:
                salvarEmArqTexto();
                break;
            case 5:
                carregarDeArqTexto();
                break;
            case 6:
                salvarEmArquivoBinario();
                break;
            case 7:
                carregarDeArquivoBinario();
            case 0:
                view.exibirMensagem("Saíndo...");
                break;
            default:
                view.exibirMensagem("Opção inválida!");
                break;
        }
    }

    private void carregarDeArquivoBinario() {
        model.carregarDeArquivoBinario("listaDeCompras.bin");
    }

    private void salvarEmArquivoBinario() {
        model.salvarEmArquivoBinario("listaDeCompras.bin");
    }

    private void carregarDeArqTexto() {
        model.carregarDeArquivoTexto("listaDeCompras.txt");
    }

    private void salvarEmArqTexto() {
        model.salvarEmArquivoTexto("listaDeCompras.txt");
    }

    private void exibirLista() {
        view.exibirMensagem(model.toString());
    }

    private void removerProduto() {
        String nome = view.lerNomeProduto();

        model.removrProduto(nome);
    }

    private void adicionarProduto() {
        String nome = view.lerNomeProduto();
        int quantidade = view.lerQuantidade();
        double preco = view.lerPreco();

        model.adicionarProduto(new Produto(nome, quantidade, preco));
    }
}
