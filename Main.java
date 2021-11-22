import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

class Main{
    public static void main (String str[]){
        Scanner input = new Scanner(System.in);
        Book b = new Book("I am Malala", "Malala Yousafzai", 2013, 288, true);
        Book b2 = new Book("I am Malala", "Bob", 40000, 3, true);
        System.out.println(b);
        Book c = new Book("The Grapes of Wrath", "John Steinbeck", 1939, 464, false);
        System.out.println("\n" + c);

        System.out.println("Numpages in The Grapes of Wrath: " + c.getNumPages());
        System.out.println("Is Malala hardcover? " + b.getHardCover());
        System.out.println("\nEnter new number of pages for Malala: ");
        int g = input.nextInt();
        b.setNumPages(g);
        System.out.println("\n" + b);
        Scanner input2 = new Scanner(System.in);
        System.out.println("\nChange Author for The Grapes of Wrath: ");
        String newAuthor = input2.nextLine();
        c.setAuthor(newAuthor);
        System.out.println("\n" + c);

        System.out.println("\nAre the books equal? " + b.equals(b));
        System.out.println("Are the books equal? " + b.equals(c));
        System.out.println("Are the books equal? " + b.equals(b2));
    }
}

