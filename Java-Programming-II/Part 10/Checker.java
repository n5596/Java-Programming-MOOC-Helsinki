

public class Checker {
    public boolean isDayOfWeek(String string){
        String regex = "mon|tue|wed|thu|fri|sat|sun";
        if (string.matches(regex)){
            return true;
        }
        return false;
    }
    
    public boolean allVowels(String string){
        String regex = "[aeiou]*";
        if (string.matches(regex)){
            return true;
        }
        return false;
    }
    
    public boolean timeOfDay(String string){
        String regex = "([0-1][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]";
        if (string.matches(regex)){
            return true;
        }
        return false;
    }
}
