
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
    public boolean equals(Object compared){
        if (this.getClass() != compared.getClass()){
            return false;
        }
        Person person2 = (Person) compared;
        if (this.name.equals(person2.name) && this.height == person2.height && this.weight == person2.weight){
            if (this.birthday.getDay() == person2.birthday.getDay() && this.birthday.getMonth() == person2.birthday.getMonth() && this.birthday.getYear() == person2.birthday.getYear()){
                return true;
            }
        }
        return false;
    }
}
