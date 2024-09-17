package org.example;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {

        KidUser kidUser1 = new KidUser(10, "Kids");
        kidUser1.registerAccount();
        kidUser1.requestBook();

        KidUser kidUser2 = new KidUser(18, "Kids");
        kidUser2.registerAccount();
        kidUser2.requestBook();

        KidUser kidUser3 = new KidUser(10, "Fiction");
        kidUser3.registerAccount();
        kidUser3.requestBook();

        KidUser kidUser4 = new KidUser(18, "Fiction");
        kidUser4.registerAccount();
        kidUser4.requestBook();

        // Test case #2 for AdultUser
        AdultUser adultUser1 = new AdultUser(5, "Kids");
        adultUser1.registerAccount();
        adultUser1.requestBook();

        AdultUser adultUser2 = new AdultUser(23, "Fiction");
        adultUser2.registerAccount();
        adultUser2.requestBook();

        AdultUser adultUser3 = new AdultUser(23, "Kids");
        adultUser3.registerAccount();
        adultUser3.requestBook();
    }
}


