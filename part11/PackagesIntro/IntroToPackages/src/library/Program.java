package library;

import library.domain.Book;

public class Program {
    public static void main(String args[]){
        Book book = new Book("The ABCs of the packages!");
        System.out.println("Hello packageworld: " + book.getName());
    }
}
