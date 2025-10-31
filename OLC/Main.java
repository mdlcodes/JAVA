public class Main{
    public static void main(String[] args) {

        User user1 = new User("mdlcodes");
        User user2 = new User("hihi13", "gmail.com");
        User user3 = new User("124342", "jsadifah@gmail.com", 11);

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println();
        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println();
        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);
    }
}