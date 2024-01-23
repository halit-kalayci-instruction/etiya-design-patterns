package org.example.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee
{
    public String name;
    public String surname;
    public String role;
    public List<Employee> subordinates;

    public Employee(String name, String surname, String role) {
        this.name = name;
        this.surname = surname;
        this.role = role;
        subordinates = new ArrayList<>();
    }

    public void addSubordinate(Employee employee)
    {
        subordinates.add(employee);
    }
    public void removeSubordinate(Employee employee)
    {
        subordinates.remove(employee);
    }
}
