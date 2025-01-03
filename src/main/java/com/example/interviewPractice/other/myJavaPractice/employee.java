package com.example.interviewPractice.other.myJavaPractice;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class employee {
    public static void main(String[] args){
        List<Employee> data = new ArrayList<>();
        data.add(new Employee("Vijender", "IT", 99939));
        data.add(new Employee("Ashish", "HR", 78000));
        data.add(Employee.builder()
                .username("Sourabh")
                .department("IT")
                .salary(85000).build());
        data.add(new Employee("Sitender", "Support", 80000));
        Map<String, List<Employee>> hm = data.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        hm.forEach((dept, emp) -> {
            System.out.println("Dept:"+dept);
            emp.forEach(System.out::println);
        });
        Map<Boolean, List<Employee>> pb = data.stream()
                .collect(Collectors.partitioningBy(employee -> employee.getSalary() > 84999));
        System.out.println("======================");
        pb.get(true).forEach(System.out::println);
        System.out.println("++++++++++++++++++++++");
        pb.get(false).forEach(System.out::println);
    }

    @Builder
    @Data
    public static class Employee{
        private String username;
        private String department;
        private Integer salary;

    }
}
