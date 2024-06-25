package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros(){
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        for (Integer n: numeros){
            soma+=n;
            }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        if(!numeros.isEmpty()){
            for(Integer n:numeros){
                if (n >= maiorNumero){
                    maiorNumero = n;
                }
            }
            return maiorNumero;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }

    }

    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if(!numeros.isEmpty()){
            for (Integer n: numeros){
                if (n <= menorNumero){
                    menorNumero = n;
                }
            }
            return menorNumero;
        }else {
            throw new RuntimeException("A Lista está vazia!");
        }

    }
    public void exibirNumeros(){
        if (!numeros.isEmpty()){
            System.out.println(this.numeros);
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(-1);
        somaNumeros.adicionarNumero(-5);
        somaNumeros.adicionarNumero(10);

        System.out.println("A soma dos numeros: "+somaNumeros.calcularSoma());
        somaNumeros.exibirNumeros();
        System.out.println("O menor numero: "+somaNumeros.encontrarMenorNumero());
        System.out.println("Maior Numero: "+somaNumeros.encontrarMaiorNumero());
    }
}
