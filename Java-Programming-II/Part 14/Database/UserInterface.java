package application;

import java.sql.SQLException;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoDao database;

    public UserInterface(Scanner scanner, TodoDao database) {
        this.scanner = scanner;
        this.database = database;
    }

    public void start() throws SQLException {
        int id = 1;
        while (true) {
            System.out.println("");
            System.out.println("Enter command:");
            System.out.println("1) list");
            System.out.println("2) add");
            System.out.println("3) mark as done");
            System.out.println("4) remove");
            System.out.println("x) quit");

            System.out.print("> ");
            String command = this.scanner.nextLine();
            if (command.equals("x")) {
                System.out.println("Thank you!");
                break;
            }

            // implement the functionality here
            if (command.equals("1")){
                System.out.println("Listing the database contents");
                System.out.println(this.database.list());
            } else if (command.equals("2")){
                System.out.println("Adding a new todo");
                System.out.println("Enter name");
                String name = this.scanner.nextLine();
                System.out.println("Enter description");
                String description = this.scanner.nextLine();
                this.database.add(new Todo(id, name, description, false));
                id += 1;
            } else if (command.equals("3")){
                System.out.println("Which todo should be marked as done (give the id)?");
                int mark_id = Integer.valueOf(scanner.nextLine());
                this.database.markAsDone(mark_id);
            } else if (command.equals("4")){
                System.out.println("Which todo should be removed (give the id)?");
                int remove_id = Integer.valueOf(scanner.nextLine());
                this.database.remove(remove_id);
            }
        }

        System.out.println("Thank you!");
    }

}
