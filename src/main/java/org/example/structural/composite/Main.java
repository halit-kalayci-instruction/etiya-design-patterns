package org.example.structural.composite;

public class Main {
    public static void main(String[] args) {
        Employee CEO = new Employee("Engin","Demiroğ","CEO");
        Employee headOfDevelopment = new Employee("Emre","Yılmaz","HeadOfDev");
        Employee developer1 = new Employee("Sehl", "Sevgili","FullStack");
        Employee developer2 = new Employee("Furkan","Baysan","FullStack");
        // ast
        CEO.addSubordinate(headOfDevelopment);
        headOfDevelopment.addSubordinate(developer1);
        headOfDevelopment.addSubordinate(developer2);

        for(Employee head: CEO.subordinates)
        {
            System.out.println("CEO -> " + head.name);
            for(Employee worker: head.subordinates)
            {
                System.out.println("CEO -> " + head.name + " -> " + worker.name);
            }
        }
    }
}
