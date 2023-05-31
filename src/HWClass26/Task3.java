package HWClass26;

import java.util.LinkedHashSet;

public class Task3 {
    public static void main(String[] args) {

        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.add("Darko");
        names.add("Marko");
        names.add("Adam");
        names.add("Connor");

       StringBuilder allConcatinated = new StringBuilder();
       for (String name:names) {
           allConcatinated.append(names);
       }
        System.out.println(allConcatinated.toString());
    }
}
