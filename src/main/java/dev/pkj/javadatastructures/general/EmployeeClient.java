package dev.pkj.javadatastructures.general;

import org.springframework.http.converter.json.GsonBuilderUtils;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeClient {
    public static void main(String[] args) {
        List<Employee> ls = new ArrayList<>(Arrays.asList(new Employee("Piyush", 2000),
                new Employee("Piyush1", 10000),
                new Employee("Piyush2", 15000),
                new Employee("Piyush3", 20000)
        ));

        List<Employee> salaries = ls.stream().filter(x -> x.salary > 10000)
                .sorted(Comparator.comparingInt(Employee::getSalary).reversed()).collect(Collectors.toList());

        for(Employee em: salaries) {
            System.out.println(em.getName());
        }
    }
}
