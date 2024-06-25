package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivro {
    //atributo
    List<Livro> listaLivro;

    public CatalagoLivro() {
        this.listaLivro = new ArrayList<>();
    }

    public void adicionarLivro(String titulo,String autor, int anoPublicacao){
        listaLivro.add(new Livro(titulo,autor,anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!listaLivro.isEmpty()) {
            for (Livro l : listaLivro) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }

        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial,int anoFinal){
        List<Livro> livrosPorIntervaloAno = new ArrayList<>();
        if(!listaLivro.isEmpty()){
            for (Livro l: listaLivro){
                if (l.getAnoPublicacao()>=anoInicial && l.getAnoPublicacao()<= anoFinal){
                    livrosPorIntervaloAno.add(l);
                }
            }
        }
        return livrosPorIntervaloAno;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!listaLivro.isEmpty()){
            for (Livro l:listaLivro){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalagoLivro catalagoLivro = new CatalagoLivro();

        catalagoLivro.adicionarLivro("Teste 1", "Autor 1", 2000);
        catalagoLivro.adicionarLivro("Teste 2", "Autor 2", 2001);
        catalagoLivro.adicionarLivro("Teste 3", "Autor 2", 2002);
        catalagoLivro.adicionarLivro("Teste 1", "Autor 1", 2003);
        catalagoLivro.adicionarLivro("Teste 4", "Autor 3", 2004);
        catalagoLivro.adicionarLivro("Teste 5", "Autor 3", 2005);
        catalagoLivro.adicionarLivro("Teste 5", "Autor 4", 2006);
        catalagoLivro.adicionarLivro("Teste 2", "Autor 5", 2007);

        System.out.println(catalagoLivro.pesquisarPorAutor("Autor 2"));
        catalagoLivro.adicionarLivro("Teste 10", "Autor 3", 2010);
        System.out.println(catalagoLivro.pesquisarPorIntervaloAnos(2000,2005));
        System.out.println(catalagoLivro.pesquisarPorTitulo("Teste 1"));


    }
}
