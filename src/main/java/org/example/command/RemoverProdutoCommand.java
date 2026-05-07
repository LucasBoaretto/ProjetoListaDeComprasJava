package org.example.command;

import org.example.model.ListaDeCompras;
import org.example.view.ListaDeComprasView;

public class RemoverProdutoCommand implements Command{
    private ListaDeCompras model;
    private ListaDeComprasView view;

    public RemoverProdutoCommand(ListaDeCompras mode, ListaDeComprasView view){
        this.model = model;
        this.view = view;
    }
    @Override
    public void executar() {
        String nome = view.lerNomeProduto();
        model.removrProduto(nome);
    }
}
