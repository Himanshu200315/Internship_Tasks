package com.Internship.Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestEmployeeSort {
public static void main(String[] args) {
        
     
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Himanshu", 25, 55000));
        employees.add(new Employee("Anuj", 28, 70000));
        employees.add(new Employee("Anshu", 22, 45000));
        employees.add(new Employee("Ravi", 30, 65000));

        //Sort by salary (descending)
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Double.compare(e2.salary, e1.salary); // desc
            }
        });

        System.out.println("Sorted by Salary (Descending):");
        for (Employee e : employees) {
            System.out.println(e);
        }

        // Sort by name (ascending)
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.nm.compareTo(e2.nm); 
            }
        });

        System.out.println("\nSorted by Name (Ascending):");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}



