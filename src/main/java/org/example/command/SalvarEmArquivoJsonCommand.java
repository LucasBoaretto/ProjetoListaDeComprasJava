package org.example.command;

import org.example.model.ListaDeCompras;

public class SalvarEmArquivoJsonCommand implements Command{
    private ListaDeCompras model;

    public SalvarEmArquivoJsonCommand(ListaDeCompras model){
        this.model = model;
    }

    @Override
    public void executar() {
        model.salvarEmArquivoJson("listaDeCompras.json");
    }
}
