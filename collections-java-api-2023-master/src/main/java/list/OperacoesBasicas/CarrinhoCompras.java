package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    List<Item> itemCarrinho;

    public CarrinhoCompras() {
        this.itemCarrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itemCarrinho.add(new Item(nome,preco,quantidade));
    }
    public void remover(String nome){
        List<Item> removerItem = new ArrayList<>();
        for (Item i: itemCarrinho){
            if (i.getNome().equalsIgnoreCase(nome)){
                removerItem.add(i);
            }
        }
        itemCarrinho.removeAll(removerItem);
    }

    public int totalDeItemDentroDoCarrinho(){
        return itemCarrinho.size();
    }

    public double valorTotalDosItens(){
        double valorTotal = 0;
        if(!itemCarrinho.isEmpty()){
            for (Item i: itemCarrinho){
                double valorItem = i.getPreco() * i.getQuantidade();
                valorTotal += valorItem;

            }
            return valorTotal;
        }else {
            throw new RuntimeException("A lista está vazia!");
        }

    }
    public void exibirItens(){
        if (!itemCarrinho.isEmpty()){
            System.out.println(this.itemCarrinho);
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    @Override
    public String toString() {
        return itemCarrinho.toString();
    }

    public static void main(String[] args) {
        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();

        carrinhoCompras.adicionarItem("Arroz", 5.50,3);
        carrinhoCompras.adicionarItem("Feijao",8.50,3);

        System.out.println("Quantos itens tenho no carrinho? " + carrinhoCompras.totalDeItemDentroDoCarrinho());

        carrinhoCompras.exibirItens();

        System.out.println("Você vai gastar: "+carrinhoCompras.valorTotalDosItens());
        carrinhoCompras.remover("arroz");
        carrinhoCompras.exibirItens();
    }

}
