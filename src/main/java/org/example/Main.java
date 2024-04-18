package org.example;

import entities.Employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Scanner sc = new Scanner(System.in);

        employee.setName("João Silva");
        employee.setGrossSalary(6000.00);
        employee.setTax(1000.00);

        System.out.println("EMPLOYEE: " + employee.getName() + ", $ " + employee.netSalary());

        System.out.println("WHICH PERCENTAGE TO INCREASE SALARY?");
        Double percentage = sc.nextDouble();
        System.out.println("UPDATED DATA: " + employee.getName() + ", $ " + employee.increaseSalary(percentage));

        sc.close();
    }
}