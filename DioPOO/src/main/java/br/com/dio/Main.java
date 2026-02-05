package br.com.dio;

import br.com.dio.dominio.*;

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

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição da mentoria de Java");
        mentoria1.setData(java.time.LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(mentoria1);
//        System.out.println(curso2);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Alice");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Alice: " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteúdos Inscritos Alice: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Alice: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());

        System.out.println("-----------------------------");

        Dev dev2 = new Dev();
        dev2.setNome("Bob");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Bob: " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteúdos Inscritos Bob: " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Bob: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());


    }
}