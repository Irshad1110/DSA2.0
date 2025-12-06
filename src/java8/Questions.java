package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Questions {


    private static void printAnswer(List<Employee> answer) {
        for(Employee employee : answer) {
            System.out.println(employee.name +  " " + employee.age + " " + employee.salary);
        }
    }

    public static void employeesStartingWithA() {
        List<Employee> employees = Arrays.asList(new Employee("Irshad"),
                new Employee("Aman"), new Employee("Malik"), new Employee("Akash"),
                new Employee("Mohd"));

        employees =  employees.stream()
                .filter(e -> e.name.startsWith("A"))
                .collect(Collectors.toList());

        printAnswer(employees);
    }

    public static void mergeTwoListAndSortByAge() {
        List<Employee> employees1 = Arrays.asList(new Employee("Irshad", 26),
                new Employee("Aman", 24), new Employee("Malik", 45),
                new Employee("Akash", 50),
                new Employee("Mohd", 12));

        List<Employee> employees2 = Arrays.asList(new Employee("Irri", 36),
                new Employee("asdasd", 124), new Employee("Mwwsswaalik", 145),
                new Employee("Aawdkash", 0),
                new Employee("Mwasdwaohd", 1));

        List<Employee> answer = Stream.concat(employees1.stream(), employees2.stream())
                .sorted(Comparator.comparingInt(Employee::getAge))
                .collect(Collectors.toList());

        printAnswer(answer);

    }

    public static void findSumOfEvenNumbersFromList() {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 2);
        System.out.print(integerList.stream().filter(num -> num%2 == 0)
                .mapToInt(Integer::intValue)
                .sum());
    }

    public static void sortByNameAndSalary() {
        List<Employee> employees1 = Arrays.asList(new Employee("Irshad", 26, 120000),
                new Employee("Akash", 24, 24000), new Employee("Malik", 45, 40000),
                new Employee("Akash", 50, 50000),
                new Employee("Mohd", 15, 15000));

        List<Employee> answer = employees1.stream()
                .sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary))
                .collect(Collectors.toList());

        //If name asc and salary desc
//        List<Employee> answer = employees1.stream()
//                .sorted(Comparator.comparing(Employee::getName)
//                        .thenComparing(Comparator.comparing(Employee::getSalary).reversed()))
//                .collect(Collectors.toList());

        printAnswer(answer);

    }


    public static void sortOnGenderAndAgeMoreThan30() {

        List<Employee> employees = Arrays.asList(new Employee("Irshad", 'M', 36),
                new Employee("Sadaf", 'F', 34), new Employee("Sahil", 'M', 23));

        List<Employee> answer = employees.stream().filter( e -> e.getAge() > 30)
                .sorted(Comparator.comparing(Employee::getGender))
                .collect(Collectors.toList());

        printAnswer(answer);
    }

    public static void highestInIntegerArray() {
        Integer[] arr = new Integer[]{2, 1, 32, 12, 43, 12, 54, 45, 112, 21, 2, 0, -1};
        System.out.print(Stream.of(arr).max(Comparator.comparing(Integer::valueOf)).get());
    }

    public static void lowestInIntegerArray() {
        Integer[] arr = new Integer[]{2, 1, 32, 12, 43, 12, 54, 45, 112, 21, 2, 0, -1};
        System.out.print(Stream.of(arr).min(Comparator.comparing(Integer::valueOf)).get());
    }

    public static void findAllEven() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 3, 2, 6);
        list.stream().filter(e -> e%2 ==0).forEach(System.out::println);
    }

    public static void findAllEvenDistinct() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 3, 2, 6);
        list.stream().distinct().filter(e -> e%2 ==0).forEach(System.out::println);
    }

}
