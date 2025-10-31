
public class User {
    
    String username;
    String email;
    int age;

    User(String username){
        this.username = username;
        this.email = "hihi@gmail.com";
        this.age = 133;
    }

    User(String username, String email){
        this.username = username;
        this.email = email;
        this.age = 18;
    }

    User(String username, String email, int age){
        this.username = username;
        this.email = email;
        this.age = age;
    }
}
