package org.rodnansol;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println(new User());
        System.out.println(new Address());
        System.out.println(new Phone());
        System.out.println(new HelloThere());
    }

}

class HelloThere {
    public String newField;
}

class User {
    public String name;
}

class Address {
    public String city;
}

class Phone {
    public String brand;
}
