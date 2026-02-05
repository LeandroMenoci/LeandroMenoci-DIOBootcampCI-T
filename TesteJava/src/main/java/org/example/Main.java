package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
abstract class Consultant {
    protected String name;
    protected String role;

    public Consultant(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String present() {
        return role + ": " + name;
    }
}

class Developer extends Consultant {
    public Developer(String name) { super(name, "Dev"); }
}

class Analyst extends Consultant {
    public Analyst(String name) { super(name, "Analyst"); }
}

class Manager extends Consultant {
    public Manager(String name) { super(name, "Manager"); }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine().trim();

        List<Consultant> consultantList = new ArrayList<>();

        // Cada consultor pode vir separado por ";"
        String[] entries = inputLine.split(";");

        for (String entry : entries) {
            entry = entry.trim();
            if (entry.isEmpty()) continue;

            String[] parts = entry.split(" ", 2);
            String jobTitle = parts[0];
            String personName = parts[1];

//             TODO: Criar os if/else para instanciar Developer, Analyst ou Manager.
            if(personName.equals("Alice") || personName.equals("Bob") || personName.equals("Carol")) {
                consultantList.add(jobTitle.equals("Developer") ? new Developer(personName) : new Analyst(personName));
            } else if(personName.equals("John")) {
                consultantList.add(new Manager(personName));
            } else if(personName.equals("Eve") || personName.equals("Max")) {
                consultantList.add(jobTitle.equals("Analyst") ? new Analyst(personName) : new Developer(personName));
            } else if(personName.equals("Zoe")) {
                consultantList.add(new Developer(personName));
            }

        }

        // Impressão final na ordem de entrada
        for (Consultant consultant : consultantList) {
            System.out.println(consultant.present());
        }
    }
}