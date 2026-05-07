package org.example.command;

import org.example.model.ListaDeCompras;

public class SalvarEmArquivoBinarioCommand implements Command{
    private ListaDeCompras model;

    public SalvarEmArquivoBinarioCommand(ListaDeCompras model){
        this.model = model;
    }

    @Override
    public void executar() {
        model.salvarEmArquivoBinario("listaDeCompras.bin");
    }
}
