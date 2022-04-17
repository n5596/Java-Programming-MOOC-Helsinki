
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        String stars = "";
        for (int i=1; i<= number; i++){
            stars = stars + "*";
        }
        System.out.println(stars);
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        String spaces = "";
        for (int i=1; i<= number; i++){
            spaces = spaces + " ";
        }
        System.out.print(spaces);
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int i=1; i<=size; i++){
            printSpaces(size-i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int stars, spaces;
        for (int i=1; i<=height; i++){
            stars = 2*i-1;
            spaces = (2*height-stars)/2;
            printSpaces(spaces);
            printStars(stars);
        }
        for (int i=1; i<=2; i++){
            spaces = (2*height-3)/2;
            printSpaces(spaces);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
