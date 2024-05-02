package task1;

import task1.User;

import java.util.ArrayList;
public class UserListProcessor {
    private ArrayList<User> Users;
    private ArrayList<User> Admins;
    public UserListProcessor(ArrayList<User> usernames) {
        this.Users = usernames;
    }

    public void processUserList() {
        for(User u : Users){
            System.out.println("Processing user: " + u.Username);
            if (u.Username.equalsIgnoreCase("admin")) {
                System.out.println("Admin user detected!");
                Admins.add(u);
                Users.remove(u);
            }
        }
    }

    public int countAdminUsers() {
        return Admins.size();
    }

    public void addUser(User user) {
        Users.add(user);
    }

    public void sendEmailToUser(User user, String email) {
        user.emails.add(email);
    }
}

