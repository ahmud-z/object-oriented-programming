package com.mycompany.inheritance;

class Book {

    public int page;

    void msg() {
        System.out.println("No of pages: " + page);
    }
}

class Dictionary extends Book {

    private int def = 52500;

    void defMsg() {
        System.out.println("Number of definition: " + def);
        System.out.println("Defnition per page: " + (def / page));
    }

}

public class Inheritance {

    public static void main(String[] args) {
        Dictionary ob = new Dictionary();
        ob.page = 1500;

        ob.msg();
        ob.defMsg();
    }
}
