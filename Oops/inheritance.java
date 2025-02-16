package Oops;


// Parent class
class User {
    String username;

    public User(String username) {
        this.username = username;
    }

    public void welcome(){
        System.out.println("Welcome!");
    }

    public void displayInfo() {
        System.out.println("Username: " + username);
    }
}

// Child class 1
class Guest extends User {
    public Guest(String username) {
        super(username);
    }

    public void viewContent() {
        System.out.println(username + " can view content.");
    }
}

// Child class 2
class Admin extends User {
    public Admin(String username) {
        super(username);
    }

    public void manageContent() {
        System.out.println(username + " can manage content.");
    }
}


public class inheritance {
    public static void main(String[] args) {
        Guest guest = new Guest("guestUser");
        Admin admin = new Admin("adminUser");

        guest.welcome();
        guest.displayInfo();
        guest.viewContent();

        admin.displayInfo();
        admin.manageContent();
    }
}
