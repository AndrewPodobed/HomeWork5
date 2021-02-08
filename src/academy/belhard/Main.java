package academy.belhard;

import academy.belhard.entity.Person;
import academy.belhard.entity.User;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("Tom","Hollywood","add.dda@mail.ru", "qwerty123");
        User user2 = new User("Michael","Jackson","m.j@mail.ru", "forever");
        User user3 = new User("Andrew","Winston","a.winston@mail.ru", "@butlfeel}}");

        System.out.println(user1.getFullInfo());
        System.out.println("Password is " + user1.equals(user1));
        System.out.println("");
        System.out.println(user2.getFullInfo());
        System.out.println("Password is " + user2.equals(user2));
        System.out.println("");
        System.out.println(user3.getFullInfo());
        System.out.println("Password is " + user3.equals(user3));




    }
}
