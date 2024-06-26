package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoDePalavrasUnicas {
    private Set<Palavras> palavrasSet;

    public ConjuntoDePalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavras){
        palavrasSet.add(new Palavras(palavras));
    }

    public void removerPalavra(String palavras){
        Palavras palavraRemover = null;
        for (Palavras p:palavrasSet){
            if (p.getPalavras()==palavras){
                palavraRemover = p;
                break;
            }
        }
        palavrasSet.remove(palavraRemover);
    }

    public boolean verificarPalavra(String palavra){
        return palavrasSet.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        if (!palavrasSet.isEmpty()){
            System.out.println(palavrasSet);
        }else {
            System.out.println("A lista Set está vazia!");
        }
    }

    public static void main(String[] args) {
        ConjuntoDePalavrasUnicas palavrasUnicas = new ConjuntoDePalavrasUnicas();

        palavrasUnicas.adicionarPalavra("Java");
        palavrasUnicas.adicionarPalavra("JavaScript");
        palavrasUnicas.adicionarPalavra("Python");
        palavrasUnicas.adicionarPalavra("Kotlin");

        palavrasUnicas.exibirPalavrasUnicas();
        System.out.println("A palavra 'Java' está no cojunto ? "+ palavrasUnicas.verificarPalavra("Java"));
    }
}
