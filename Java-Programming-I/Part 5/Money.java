
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition){
        Money new_money = new Money(this.euros+addition.euros(), this.cents+addition.cents());
        return new_money;
    }
    
    public boolean lessThan(Money compared){
        if (this.euros < compared.euros){
            return true;
        } else if (this.euros == compared.euros && this.cents < compared.cents){
            return true;
        }
        return false;
    }

    public Money minus(Money decreaser){
        if (this.lessThan(decreaser)){
            Money new_money = new Money(0,0);
            return new_money;
        } else {
            int e = this.euros-decreaser.euros;
            int c = this.cents-decreaser.cents;
            if (c < 0){
                e -= 1;
                c += 100;
            }
            Money new_money = new Money(e, c);
            return new_money;
        }
    }
}
