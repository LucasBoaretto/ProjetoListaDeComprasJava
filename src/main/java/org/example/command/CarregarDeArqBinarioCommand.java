package org.example.command;

import org.example.model.ListaDeCompras;

public class CarregarDeArqBinarioCommand implements Command{
    private ListaDeCompras model;

    public CarregarDeArqBinarioCommand(ListaDeCompras model){
        this.model = model;
    }

    @Override
    public void executar() {
        model.carregarDeArquivoBinario("listaDeCompras.bin");
    }
}
