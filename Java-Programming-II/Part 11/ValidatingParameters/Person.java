package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if (name == null || name == "" || name.length() > 40){
            throw new IllegalArgumentException("Name should be non-null, non-empty and have at most 40 characters");
        }
        
        if (age < 0 || age > 120){
            throw new IllegalArgumentException("Age should be between 0-120");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
