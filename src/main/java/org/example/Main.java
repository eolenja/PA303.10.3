package org.example;

public class Main {
    public static void main(String[] args) {

        KidUser kid = new KidUser(10, "Kids");
        kid.registerAccount();
        kid.requestBook();


        AdultUser adult = new AdultUser(30, "Fiction");
        adult.registerAccount();
        adult.requestBook();
    }
}
