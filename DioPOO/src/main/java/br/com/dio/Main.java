package br.com.dio;

import br.com.dio.dominio.Conteudo;
import br.com.dio.dominio.Curso;
import br.com.dio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso C#");
        curso2.setDescricao("Descrição do curso C#");
        curso2.setCargaHoraria(10);

        Conteudo conteudo = new Curso();
        conteudo.setTitulo("Curso Python");
        conteudo.setDescricao("Descrição do curso Python");

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição da mentoria de Java");
        mentoria1.setData(java.time.LocalDate.now());

        System.out.println(curso1);
        System.out.println(mentoria1);
        System.out.println(curso2);
        System.out.println(conteudo);
    }
}