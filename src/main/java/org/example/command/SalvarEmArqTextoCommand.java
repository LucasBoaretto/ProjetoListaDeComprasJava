package org.example.command;

import org.example.model.ListaDeCompras;

public class SalvarEmArqTextoCommand implements Command{
    private ListaDeCompras model;

    public SalvarEmArqTextoCommand(ListaDeCompras model){
        this.model = model;
    }

    @Override
    public void executar() {
        model.salvarEmArquivoTexto("listaDeCompras.txt");
    }
}
