package org.example.controller;

import org.example.command.*;
import org.example.model.ListaDeCompras;
import org.example.model.Produto;
import org.example.view.ListaDeComprasView;

import java.util.HashMap;
import java.util.Map;

public class ListaDeComprasController {
    private ListaDeCompras model;
    private ListaDeComprasView view;
    private Map<Integer, Command> comandos = new HashMap<>();

    public ListaDeComprasController(ListaDeCompras model, ListaDeComprasView view){
        this.model = model;
        this.view = view;
        registrarComandos();
    }

    private void registrarComandos(){
        comandos.put(1, new AdicionarProdutoCommand(model, view));
        comandos.put(2, new RemoverProdutoCommand(model, view));
        comandos.put(3, new ExibirListaCommand(model, view));
        comandos.put(4, new CarregarDeArqTextoCommand(model));
        comandos.put(5, new SalvarEmArqTextoCommand(model));
        comandos.put(6, new CarregarDeArqBinarioCommand(model));
        comandos.put(7, new SalvarEmArquivoBinarioCommand(model));
        comandos.put(8, new CarregarDeArquivoJsonCommand(model));
        comandos.put(9, new SalvarEmArquivoJsonCommand(model));
        comandos.put(10, new FiltrarPorQuantidadeMinimaCommand(model, view));
        comandos.put(11, new CalcularValorTotalCommand(model));
        comandos.put(12, new ImprimirListaCommand(model));
    }

    public void iniciar(){
        int opcao;
        do {
            view.exibirMenu();
            opcao = view.lerOpcao();
            if(opcao != 0){
                processarOpcao(opcao);
            }
            processarOpcao(opcao);
        } while (opcao != 0);
        view.exibirMensagem("Saíndo...");
    }

    private void processarOpcao(int opcao) {
        Command command = comandos.get(opcao);
        if(command != null){
            command.executar();
        } else {
            view.exibirMensagem("Opção inválida");
        }
    }
}
