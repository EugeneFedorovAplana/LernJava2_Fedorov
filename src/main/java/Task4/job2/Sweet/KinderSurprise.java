package Task4.job2.Sweet;

public class KinderSurprise extends Sweetness {

    private String form;

    public KinderSurprise(String name, double weight, double price, String form) {
        super(name, weight, price);
        this.form = form;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }
}
