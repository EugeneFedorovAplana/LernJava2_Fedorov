package Task4.job2.Sweet;

public class Candy extends Sweetness {
    private  String filling;

    public Candy(String name, double weight, double price, String filling) {
        super(name, weight, price);
        this.filling = filling;
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    @Override
    public String toString() {
        return "Candy = " + super.toString() + " filling: " + filling;
    }
}
