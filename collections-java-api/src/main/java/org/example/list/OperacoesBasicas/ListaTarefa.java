package org.example.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    //atributo
    private List<Tarefa> tarefaList;

    // construtor

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    //métodos
    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa tarefa : tarefaList) {
            if (tarefa.getDescricao().equals(descricao)) {
                tarefasParaRemover.add(tarefa);
            }
        }

        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTarefa("Comprar leite");
        listaTarefa.adicionarTarefa("Pagar contas");
        listaTarefa.adicionarTarefa("Lavar o carro");

        System.out.println("Número total de tarefas: " + listaTarefa.obterNumeroTotalTarefas());

        System.out.println("Descrições das tarefas:");
        listaTarefa.obterDescricoesTarefas();

        listaTarefa.removerTarefa("Pagar contas");

        System.out.println("Número total de tarefas após remoção: " + listaTarefa.obterNumeroTotalTarefas());
    }
}
