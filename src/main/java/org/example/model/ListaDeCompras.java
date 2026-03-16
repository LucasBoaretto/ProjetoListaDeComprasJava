package org.example.model;
import java.util.ArrayList;
import java.util.List;

public class ListaDeCompras {
    private List<Produto> produtos;

    public ListaDeCompras(){
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }

    public void removrProduto(String nome){
        produtos.removeIf(p -> p.getNome().equalsIgnoreCase(nome));
    }

    @Override
    public String toString(){
        if(produtos.isEmpty()){
            return "Lista de compras vazioa";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("--- Lista de Compras ---\n");

        for(int i = 0; i < produtos.size(); i++){
            sb.append((i+1)).append(". ").append(produtos.get(i).toString()).append("\n");
        }
        return sb.toString();
    }

}
