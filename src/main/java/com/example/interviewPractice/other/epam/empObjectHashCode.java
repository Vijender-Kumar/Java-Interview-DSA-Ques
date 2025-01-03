package com.example.interviewPractice.other.epam;

import lombok.Builder;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class empObjectHashCode {
    public static void main(String[] args) {
        HashMap<Employee, String> hm = new HashMap<>();

        Employee e1 = new Employee(1001, "Vijender");
        Employee e2 = new Employee(1002, "Kumar");
        Employee e3 = new Employee(1002, "Kumar");
//        how to store the key as object
        System.out.println("HashCode of e1: " + e1.hashCode());  // Should print 1
        System.out.println("HashCode of e2: " + e2.hashCode());  // Should print 2
        System.out.println("HashCode of e3: " + e3.hashCode());  // Should print 2

        hm.put(e1, "Team Lead");
        hm.put(e2, "Manager");
        hm.put(e3, "Tester");

        for(Map.Entry<Employee, String> ls: hm.entrySet()){
            System.out.println(ls.getKey()+":"+ls.getValue());
        }
//        System.out.println();
    }
}

@Data
@Builder
class Employee {
    private int id;
    private String name;

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public boolean equals(Object obj) {
//        return this == obj;
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Employee employee = (Employee) obj;
        return id == employee.id;
    }
}