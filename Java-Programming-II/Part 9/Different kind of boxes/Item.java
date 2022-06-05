
public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    
    public boolean equals(Object obj){
        if (obj == null || obj.getClass() != this.getClass()){
            return false;
        }
        Item compared = (Item) obj;
        if (compared.getName() == this.name){
            return true;
        }
        return false;
    }
    
    public int hashCode(){
        int code = 0;
 
        char c;
        for (int i=0; i < this.name.length(); i++){
            c = this.name.charAt(i);  
            code = code*10 + (int)c-(int)'a';
        }
        
        return code;
    }

}
