package HWClass17;
/* Write a java class that have 4 constructors with 4 different access levels
 of constructors(private,public,default,protected) and create 4 objects of
 this class: 1 - inside same class; 2 - from outside the class; 3 -
 from different class inside different package  and observe result.*/
public class Task2 {
String name1;
int number;
double decimal;
boolean isTrue;
    private Task2 (String name1) {
        this.name1=name1;
        System.out.println("private constructor");
    };
    public Task2 (int number) {
        this.number=number;
        System.out.println("public constructor");
    };

    Task2 (double decimal) {
        this.decimal=decimal;
        System.out.println("default constructor");
    };
    protected Task2 (boolean isTrue) {
        this.isTrue=isTrue;
        System.out.println("protected constructor");
    }

    public static void main(String[] args) {
        Task2 obj1 = new Task2("Darko");
    }
}

class outsideClass {
    public static void main(String[] args) {
        Task2 obj2 = new Task2(1.5);
    }


}
