package academy.belhard.entity;

public class User extends Person {
    private String email;
    private String password;

    public User(String firstname, String lastname, String email, String password){
        super (firstname, lastname);
        this.email = email;
        this.password = password;

    }

    public String getFullInfo(){
        return "Имя: " + firstName + " " + lastName + "\n" + "E-mail: " + email;

    }

    public boolean isPasswordCorrect(String password){
        return this.password.equals(password);


    }

    }





