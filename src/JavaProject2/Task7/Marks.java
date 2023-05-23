package JavaProject2.Task7;

abstract class Marks {
 abstract double getPercentage();

}

class A extends Marks {
    double subject1;
    double subject2;
    double subject3;
    public A(double subject1, double subject2, double subject3) {
        this.subject1=subject1;
        this.subject2=subject2;
        this.subject3=subject3;
    }

    @Override
    double getPercentage() {
        double totalMarks = subject1+subject2+subject3;
        return totalMarks/3;
    }
}

class B extends Marks {
    double subject1;
    double subject2;
    double subject3;
    double subject4;

    public B(double subject1, double subject2, double subject3, double subject4) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }

    @Override
    double getPercentage() {
        double totalMarks = subject1+subject2+subject3+subject4;
        return totalMarks/4;
    }
}

class MarksTester {
    public static void main(String[] args) {

        A a=new A(45.0,44.0,78.0);
        B b=new B(45.0,12.0,88.0,56.0);

        System.out.println(a.getPercentage());
        System.out.println(b.getPercentage());
    }

}