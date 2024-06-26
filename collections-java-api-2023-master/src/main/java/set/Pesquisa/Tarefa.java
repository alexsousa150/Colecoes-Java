package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

class Tarefa {
    private String descricao;
    private boolean concluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Tarefa tarefa = (Tarefa) obj;
        return descricao.equals(tarefa.descricao);
    }

    @Override
    public int hashCode() {
        return descricao.hashCode();
    }

    @Override
    public String toString() {
        return descricao + (concluida ? " (Concluída)" : " (Pendente)");
    }
}

class ListaTarefas {
    private Set<Tarefa> tarefas;

    public ListaTarefas() {
        tarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        tarefas.removeIf(t -> t.getDescricao().equals(descricao));
    }

    public void exibirTarefas() {
        tarefas.forEach(System.out::println);
    }

    public int contarTarefas() {
        return tarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> concluidas = new HashSet<>();
        for (Tarefa tarefa : tarefas) {
            if (tarefa.isConcluida()) {
                concluidas.add(tarefa);
            }
        }
        return concluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> pendentes = new HashSet<>();
        for (Tarefa tarefa : tarefas) {
            if (!tarefa.isConcluida()) {
                pendentes.add(tarefa);
            }
        }
        return pendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getDescricao().equals(descricao)) {
                tarefa.setConcluida(true);
                break;
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getDescricao().equals(descricao)) {
                tarefa.setConcluida(false);
                break;
            }
        }
    }

    public void limparListaTarefas() {
        tarefas.clear();
    }

    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();
        lista.adicionarTarefa("Comprar leite");
        lista.adicionarTarefa("Ir ao banco");
        lista.exibirTarefas();
        lista.marcarTarefaConcluida("Comprar leite");
        lista.exibirTarefas();
        System.out.println("Tarefas Concluídas: " + lista.obterTarefasConcluidas());
        System.out.println("Tarefas Pendentes: " + lista.obterTarefasPendentes());
    }
}