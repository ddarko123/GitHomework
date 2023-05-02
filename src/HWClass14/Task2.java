package HWClass14;

public class Task2 {
    static String atDomain = "@";
    String createEmail(String name, String lastname, String domaine) {
        String email=name+lastname+atDomain+domaine;
        return email;
    }

    public static void main(String[] args) {
        Task2 person1 = new Task2();
        String email=person1.createEmail("john","snow","gmail");
        System.out.println(email);
    }
}
