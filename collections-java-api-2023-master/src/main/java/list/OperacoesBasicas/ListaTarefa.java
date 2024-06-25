package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        List<Tarefa> tarefaRemover = new ArrayList<>();
        for(Tarefa t:tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefaRemover);
    }
    public int obterTotalTarefa(){
        return tarefaList.size();
    }
    public void obterDescricaoTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("Número Total de elemento na lista: "+listaTarefa.obterTotalTarefa());
        listaTarefa.adicionarTarefa("Primeira Tarefa");
        System.out.println("Número Total de elemento na lista: "+listaTarefa.obterTotalTarefa());
        listaTarefa.adicionarTarefa("Segunda Tarefa");
        listaTarefa.adicionarTarefa("Segunda Tarefa");
        System.out.println("Número Total de elemento na lista: "+listaTarefa.obterTotalTarefa());

        listaTarefa.removerTarefa("Segunda Tarefa");
        System.out.println("Número Total de elemento na lista: "+listaTarefa.obterTotalTarefa());

        listaTarefa.obterDescricaoTarefas();
    }
}
