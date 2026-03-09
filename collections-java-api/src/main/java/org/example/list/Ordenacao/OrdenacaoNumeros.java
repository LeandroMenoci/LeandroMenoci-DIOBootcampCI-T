package org.example.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    //atributos
    private List<Integer> numerosList;

    //construtor

    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numerosList.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAscedentes = new ArrayList<>(this.numerosList);
        if (!numerosList.isEmpty()) {
            Collections.sort(numerosAscedentes);
            return numerosAscedentes;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosAscedentes = new ArrayList<>(this.numerosList);
        if (!numerosList.isEmpty()) {
            numerosAscedentes.sort(Collections.reverseOrder());
            return numerosAscedentes;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void exibirNumeros() {
        if(!numerosList.isEmpty()) {
            System.out.println(this.numerosList);
        } else {
            System.out.println("A lista está vazia.");
        }
    }

    public static void main(String[] args) {
        // Criando a instância
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        // Adicionando numeros a lista
        numeros.adicionarNumero(3);
        numeros.adicionarNumero(7);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(67);
        numeros.adicionarNumero(99);

        // exibir a lista adicionada
        numeros.exibirNumeros();

        // Ordenando lista ascendentes
        System.out.println(numeros.ordenarAscendente());

        // Ordenando lista descendente
        System.out.println(numeros.ordenarDescendente());
    }
}
