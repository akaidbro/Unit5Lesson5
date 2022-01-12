import java.io.*;
import static java.lang.System.*;
import java.util.Scanner;


class Main {
  public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Book b = new Book("I am Malala", "Malala Yousafzai", 2013, 288, true);
        System.out.println(b);
        Book b1 = new Book("I am Malala", "Bob", 2013, 288, true);

        System.out.println(b);

        Book g = new Book("The Kite Runner", "Khaled Hosseini", 2003, 371, true);

        System.out.println(g);

        System.out.println("Numpages of The Kite Runner: " + g.getNumPages());
        System.out.println("Is Malala hardcover: " + b.getHardCover());
        
        System.out.println("Reset numPages for Malala. Enter new number of pages for Malala: ");
        int np = scan.nextInt();
        b.setNumPages(np);
        System.out.println(b);
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Change Author for The Kite Runner: ");
        String na = scan2.nextLine();
        g.setAuthor(na);
        System.out.println(g);

        System.out.println("Are the books equals? " + b.equals(b));
        System.out.println("Are the books equals? " + b.equals(g));
        System.out.println("Are the books equals? " + b.equals(b1));
        
        Book def1 = new Book();
        Book def2 = new Book();
        System.out.println("This is Default book 1" + def1);
        System.out.println("This is Default book 2" + def2);
        System.out.println("Are the default books equal?" + def2.equals(def2));

        //Create Library
        Library lib = new Library();
        System.out.println(lib);

        //add books to our Library
        lib.addBooks(b);
        lib.addBooks(b1);
        lib.addBooks(g);
        lib.addBooks(def1);
        lib.addBooks(def2);
        lib.addBooks(b);
        lib.addBooks(b1);
        lib.addBooks(g);
        lib.addBooks(def1);
        lib.addBooks(def2);
        System.out.println("Increasing Size of array");
        lib.increaseSize();
        System.out.println(lib);

        lib.addBooks(def2);
        System.out.println(lib);
  }
}