package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Practice {

    public static void employeeNameWithA() {
        List<Employee> employees = Arrays.asList(new Employee("Irshad"),
                new Employee("Akash"),
                new Employee("Aman"),
                new Employee("Malik"));

        employees.stream().filter(e -> e.getName()
                .startsWith("A")).forEach(e -> System.out.println(e.getName()));
    }

    public static void mergeTwoAndSortByAge() {
        List<Employee> employees1 = Arrays.asList(new Employee("Irshad", 112),
                new Employee("Akash", 22),
                new Employee("Aman", 32),
                new Employee("Malik", 21));
        List<Employee> employees2 = Arrays.asList(new Employee("asdIrshad", 12),
                new Employee("asdAkash", 122),
                new Employee("asdAman", 31),
                new Employee("asdMalik", 11));

        Stream.concat(employees1.stream(), employees2.stream())
                .sorted(Comparator.comparing(Employee::getAge))
                .forEach(e -> System.out.println(e.getAge()));
    }

    public static void sumOfEven() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 8);
        System.out.println(list.stream().filter(num -> num%2 == 0).mapToInt(Integer::intValue).sum());

    }

    public static void sortByNameAndAge() {
        List<Employee> employees = Arrays.asList(new Employee("Irshad", 112),
                new Employee("Akash", 22),
                new Employee("Aman", 32),
                new Employee("Malik", 21));
        employees.stream()
                .sorted(Comparator.comparing(Employee::getName)
                        .thenComparing(Employee::getAge))
                .forEach(e->System.out.println(e.getName() + " " + e.getAge()));
    }




}
