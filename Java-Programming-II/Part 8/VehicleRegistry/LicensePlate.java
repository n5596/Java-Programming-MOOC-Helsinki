
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    public boolean equals(Object object){
        if (object == null || object.getClass() != this.getClass()){
            return false;
        }
        
        LicensePlate compared = (LicensePlate) object;
        if (this.country == compared.country && this.liNumber == compared.liNumber){
            return true;
        }
        return false;
    }
    
    public int hashCode(){
        int num = 0;
        for (int i=0; i<this.country.length(); i++){
            num = num*10 + (int)this.country.charAt(i);
        }
        for (int i=0; i<this.liNumber.length(); i++){
            num = num*10 + (int)this.liNumber.charAt(i);
        }
        return num;
    }
}
