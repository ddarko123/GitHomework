package HWClass26;

import java.util.Map;
import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) {

        TreeMap<String, Integer> employeesMap = new TreeMap<>();
        employeesMap.put("John Smith", 100000);
        employeesMap.put("Anthony J", 90000);
        employeesMap.put("Darko Kochovski", 95000);

        int highestSalary=0;
        String employeewithHighestSalary="";

        for (var stringIntegerEntry : employeesMap.entrySet()) {
            String name= stringIntegerEntry.getKey();
            int salary = stringIntegerEntry.getValue();

            if(salary>highestSalary) {
                highestSalary=salary;
                employeewithHighestSalary=name;
            }

        }
        System.out.println(employeewithHighestSalary+"=$"+highestSalary);

    }
}
