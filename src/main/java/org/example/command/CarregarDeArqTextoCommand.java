package org.example.command;

import org.example.model.ListaDeCompras;

public class CarregarDeArqTextoCommand implements Command{
    private ListaDeCompras model;

    public CarregarDeArqTextoCommand(ListaDeCompras model){
        this.model = model;
    }

    @Override
    public void executar() {
        model.carregarDeArquivoTexto("listaDeCompras.txt");
    }
}
