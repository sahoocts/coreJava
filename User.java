package Others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class User {
    int id;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    String name;
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        User user = (User) obj;
        return id == user.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    public static void main( String args[] ) {
       // ArrayList<User> users = new ArrayList<>();

        List<User> users= Arrays.asList(new User(10, "Jaga"),
                new User(10, "Jaga"),
                new User(11, "saroj"));
        /*User user1 = new User(10, "Jaga");
        User user2 = new User(10, "Jaga");
        users.add(user1);
        users.add(user2);*/

        System.out.println("List with Duplicates");
        System.out.println(users);

        List<User> uniqueUser = users
                .stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("List without Duplicates");
        System.out.println(uniqueUser);
    }
}

