import java.util.Objects;

public class Task6 {
    public static void main(String[] args) {

    }
    static class User{
        String firstName;
        String lastName;
        int age;
        String email;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return age == user.age && Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName) && Objects.equals(email, user.email);
        }

        @Override
        public int hashCode() {
            return Objects.hash(firstName, lastName, age, email);
        }
    }
}
