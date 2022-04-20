import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            System.out.println("Title:");
            String name = scanner.nextLine();
            if (name.equals("")){
                break;
            }
            System.out.println("Pages:");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year:");
            int year = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(name, pages, year));
        }
        
        System.out.println("What information will be printed?");
        String info = scanner.nextLine();
        
        for (Book b:books){
            if(info.equals("everything")){
                System.out.println(b.getName() +", "+b.getPages()+" pages, "+b.getYear());
            } else {
                System.out.println(b.getName());
            }
        }
    }
}
