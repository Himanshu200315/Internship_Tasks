package com.Internship.Task3;


class Employee {
 String nm;
 int age;
 double salary;


 public Employee(String nm, int age, double salary) {
     this.nm = nm;
     this.age = age;
     this.salary = salary;
 }


 public String toString() {
     return nm + " || Age: " + age + " || Salary: " + salary;
 }
}


