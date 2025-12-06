package java8;

public class Employee {

    public String name;
    public int age;
    public double salary;
    public char gender;

    public Employee(String name){
        this.name = name;
    }

    public Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Employee(String name, char gender, int age){
        this.gender = gender;
        this.age = age;
        this.name = name;
    }

    public Employee(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getAge(){
        return this.age;
    }

    public double getSalary(){
        return this.salary;
    }

    public String getName() {
        return this.name;
    }

    public char getGender(){
        return this.gender;
    }

}
