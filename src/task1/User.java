package task1;

import java.util.ArrayList;
public class User {
    public String Username;
    public String Email;
    protected String Password;

    public void setPassword(String password) {
        Password = password;
    }

    public String Address;
    public ArrayList<String> emails;

    public User(String username, String email, String password, String address) {
        Username = username;
        Email = email;
        setPassword(password);
        Address = address;
        emails = new ArrayList<String>();
    }

}