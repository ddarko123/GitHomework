package HWClass26;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Person {
    private String name;
    private String lastName;
    private int age;
    private double salary;

    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
    Person(String name, String lastName, int age, double salary) {
        this.name=name;
        this.lastName=lastName;
        this.age=age;
        this.salary=salary;
    }

    void printInfo() {
        System.out.println(getName()+" "+getLastName()+" "+getAge()+" "+getSalary());
    }
}
class PersonTester {
    public static void main(String[] args) {

        TreeMap<String, Person> person = new TreeMap<>();

        Person person1 = new Person("Darko", "Kochovski",29,95000.0);
        Person person2 = new Person ("Mike", "Brown",36,110000.0);

        person.put("A-1231", person1);
        person.put("A-1232", person2);

        for (var PersonEntry : person.entrySet()) {

            String personId = PersonEntry.getKey();
            Person persons = PersonEntry.getValue();

            System.out.println(personId);
            persons.printInfo();
        }


    }
}
