package org.example.command;

import org.example.model.ListaDeCompras;

public class CarregarDeArquivoJsonCommand implements Command{
    private ListaDeCompras model;

    public CarregarDeArquivoJsonCommand(ListaDeCompras model){
        this.model = model;
    }

    @Override
    public void executar() {
        model.carregarDeArquivoJson("listaDeCompras.json");
    }
}
