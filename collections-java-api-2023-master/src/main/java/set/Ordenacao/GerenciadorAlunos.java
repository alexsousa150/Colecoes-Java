package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;

public class GerenciadorAlunos {

    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(long matricula, String nome, double media){
        alunoSet.add(new Aluno(nome, matricula, media));
    }
    public void removerAluno(long matricula){
        Aluno alunoRemover = null;

    }
}
