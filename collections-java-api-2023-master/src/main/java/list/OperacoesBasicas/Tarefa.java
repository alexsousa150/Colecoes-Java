package main.java.list.OperacoesBasicas;

public class Tarefa {


    //Atributo
    private String Descricao;
    public Tarefa(String descricao) {
        Descricao = descricao;
    }
    public String getDescricao() {
        return Descricao;
    }

    @Override
    public String toString() {
        return Descricao;
    }
}
