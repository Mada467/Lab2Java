package ro.ulbs.paradigme.lab3.util;
public class Main {
    public static void main(String[] args) {
        PasswordMaker pm = new PasswordMaker("Madalin");
        System.out.println("Generated Password: " + pm.getPassword());
    }
}

