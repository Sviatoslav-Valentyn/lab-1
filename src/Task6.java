import java.util.Objects;

public class Task6 {
    public static void main(final String[] args) {
        final User user = new User();
        user.setFirstName("Sviatoslav-Valentyn");
        user.setLastName("Hvozdyk");
        user.setAge(18);
        user.setEmail("sviatoslav394@gmail.com");

        System.out.println("FirstName and lastName: " + user.getFirstName() + " " + user.getLastName());
        System.out.println("Age: " + user.getAge());
        System.out.println("Email: " + user.getEmail());
    }
}
