package java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
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

    public static void findDuplicate() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 3, 2, 2, 4);
        Set<Integer> set = new HashSet<>();
        list.stream().filter(e -> !set.add(e)).forEach(System.out::println);
    }

    public static void findFirst() {
        List<Integer> list = Arrays.asList(22, 1, 2, 3, 4, 5, 6, 7, 1, 3, 2, 2, 4);
        list.stream().findFirst().ifPresent(System.out::print);
    }

    public static void findCount() {
        List<Integer> list = Arrays.asList(22, 1, 2, 3, 4, 5, 6, 7, 1, 3, 2, 2, 4);
        System.out.print(list.stream().count());
    }

    public static void firstNonRepeatingChar() {
        String str = "Java articles are awesome";
        str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() == 1)
                .map(entry -> entry.getKey())
                .findFirst()
                .ifPresent(System.out::println);
    }

    public static void firstRepeatingChar() {
        String str = "Java articles are awesome";
        str.chars().mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(e -> e.getKey())
                .findFirst()
                .ifPresent(System.out::print);
    }

    public static void sortIntegerList() {
        List<Integer> list = Arrays.asList(22, -1, 6, 7, 1, 3, 2, 4);
        list.stream().sorted().forEach(System.out::println);
    }

    public static void sortIntegerListDesc() {
        List<Integer> list = Arrays.asList(22, -1, 6, 7, 1, 3, 2, 4);
        list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
    }

    public static void cubeAndGreaterThan50() {
        List<Integer> list = Arrays.asList(5, -1, 6, 7, 1, 3, 2, 4);
        list.stream().map(e -> e*e*e)
                .filter(e -> e > 50)
                .forEach(System.out::println);
    }

    public static void stringToUpperCase() {
        List<String> list = Arrays.asList("asd", "wdsdw", "irshadII");
        list.stream().map(String::toUpperCase)
                .forEach(System.out::println);
    }

    public static void countInStringArray() {
        List<String> list = Arrays.asList("aa", "bb", "aa", "cc");
        String input = "java is very good java good";
        String[] strList = input.split(" ");
        List<String> list2 = Arrays.asList(strList);
        Map<String,Long> map = list2.stream()
                .collect(Collectors.groupingBy(str -> str, LinkedHashMap::new, Collectors.counting()));
        System.out.println(map);
    }

    public static void countInStringArray2() {
        String input = "java is very good java good";
        Map<String,Long> map = Arrays.stream(input.split(" "))
                .collect(Collectors.groupingBy(str -> str, LinkedHashMap::new, Collectors.counting()));
        System.out.println(map);
    }

    public static void countInStringArrayOnlyDuplicate() {
        String input = "java is very good java good";
        String[] strList = input.split(" ");
        List<String> list2 = Arrays.asList(strList);
        Map<String,Long> map = list2.stream()
                .filter(e -> Collections.frequency(list2, e) > 1)
                .collect(Collectors.groupingBy(str -> str, LinkedHashMap::new, Collectors.counting()));
        System.out.println(map);
    }

    public static void countCharsInStringArray() {
        String input = "java is very good java good";
        Map<String,Long> map = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(str -> str, LinkedHashMap::new, Collectors.counting()));
        System.out.println(map);
    }

    public static void countCharsInStringArray2() {
        String input = "java is very good java good";
        Map<Character,Long> map = input.chars().mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(str -> str, LinkedHashMap::new, Collectors.counting()));
        System.out.println(map);
    }

    public static void stringPrefixSuffixDelimiter() {
        List<String> list = Arrays.asList("aa", "bb", "aa", "cc");
        System.out.print(list.stream().collect(Collectors.joining(",", "[", "]")));
    }


    public static void mergeSortTwoArrays() {
        int[] arr1 = new int[]{5, -1, 6, 7, 11, 3, 2, 40};
        int[] arr2 = new int[]{15, -10, 60, 17, 4, 30, 2, 42};
        int[] ans =  IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().toArray();
        for(int val : ans){
            System.out.print(val + " ");
        }
    }

    public static void threeMaxAndMin() {
        List<Integer> list = Arrays.asList(5, -1, 6, 7, 11, 3, 2, 40);
        List<Integer> threeMin = list.stream().sorted().limit(3).collect(Collectors.toList());
        System.out.println("three min: " +  threeMin);
        List<Integer> threeMax = list.stream().sorted(Collections.reverseOrder()).limit(3).collect(Collectors.toList());
        System.out.println("three max: " + threeMax);
    }

    public static void checkAnagrams() {
        String s1 = "racecar";
        String s2 = "carrace";
        s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        s2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        System.out.print(s1.equals(s2));
    }

    public static void sumOfDigits() {
        int num = 12241;
        System.out.print(Stream.of(String.valueOf(num).split("")).collect(Collectors.summingInt(Integer::valueOf)));
    }

    public static void sortStringOnLength() {
        List<String> list = Arrays.asList("aaaaa", "bba", "aaaaaaa", "cc");
        List<String> ans = list.stream().sorted(Comparator.comparing(String::length)).toList();
        for(String val : ans){
            System.out.print(val + " ");
        }
    }

    public static void sumAndAverage() {
        int[] arr1 = new int[]{5, -1, 6, 7, 11, 3, 2, 40};
        int sum = Arrays.stream(arr1).sum();
        double average = Arrays.stream(arr1).average().getAsDouble();
        System.out.println("sum: " + sum);
        System.out.print("average: " + average);
    }

    public static void commonElements() {
        List<Integer> list1 = Arrays.asList(5, -1, 6, 7, 11, 3, 2, 0);
        List<Integer> list2 = Arrays.asList(50, -11, 60, 7, 11, 13, 2, 0);
        list1.stream().filter(e -> list2.contains(e)).forEach(System.out::println);

    }

    public static void reverseEachWord() {
        String str = "java is very good";
        String ans = Arrays.stream(str.split(" "))
                .map(word -> new StringBuilder(word).reverse()).collect(Collectors.joining(" "));
        System.out.print(ans);
    }

    public static void mostFrequentWordInString() {
        List<String> list = Arrays.asList("aa", "aa", "bb", "bb","aa", "aa", "cc", "cc");
        Map<String, Long> map = list.stream()
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));
        Map.Entry<String, Long> ans = map.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.print("key : " + ans.getKey() + " value: " + ans.getValue());

    }

    public static void palindrome() {
        String str = "ROTATOR";
        System.out.print(IntStream.range(0, str.length()/2)
                .noneMatch(i -> str.charAt(i)!=str.charAt(str.length()-i-1)));
    }


}
