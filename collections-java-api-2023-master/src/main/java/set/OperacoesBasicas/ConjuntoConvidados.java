package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //atributo
    private Set<Convidado> listaConvidado;

    public ConjuntoConvidados() {
        this.listaConvidado = new HashSet<>();
    }

    public void adicionarConvidado(String nome,int codigoConvite){
        listaConvidado.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoRemover = null;
        for (Convidado c: listaConvidado){
            if(c.getCodigoConvite()== codigoConvite){
                convidadoRemover = c;
                break;
            }
        }
        listaConvidado.remove(convidadoRemover);
    }

    public int contarConvidados(){
        return listaConvidado.size();
    }
    public void exibirConvidados(){
        System.out.println(listaConvidado);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem "+ conjuntoConvidados.contarConvidados()+" convidados dentro do Set Convidados");

        conjuntoConvidados.adicionarConvidado("Alex", 1);
        conjuntoConvidados.adicionarConvidado("Sousa", 2);
        conjuntoConvidados.adicionarConvidado("Santos", 3);
        conjuntoConvidados.adicionarConvidado("Anne", 4);
        conjuntoConvidados.adicionarConvidado("Hellen", 4);

        System.out.println("Existem "+ conjuntoConvidados.contarConvidados()+" convidados dentro do Set Convidados");

        conjuntoConvidados.exibirConvidados();
    }
}
