package Task4;

import Task4.job2.Sweet.Candy;
import Task4.job2.Sweet.KinderSurprise;
import Task4.job2.Sweet.Sweetness;

public class Task4_2Candy {
    public static void main(String[] args) {
        Double totalWeight = 0.0;
        Double totalPrice = 0.0;

        KinderSurprise kinderAgg = new KinderSurprise("KinderSurprise Agg", 0.01, 56.5, "agg");
        KinderSurprise kinderChokolate = new KinderSurprise();
        kinderChokolate.setName("Pingvi");
        kinderChokolate.setForm("chocolate boton");
        kinderChokolate.setWeight(0.2);
        kinderChokolate.setPrice(200.0);
        Candy Step = new Candy("Step", 0.2, 100.2, "nut");
        Sweetness [] gift = {kinderAgg,kinderChokolate,Step};

        for (Sweetness someSweetnes: gift) {
            totalPrice += someSweetnes.getPrice();
            totalWeight += someSweetnes.getWeight();
        }
        System.out.printf("Total price gift = %.2f rubles\n", totalPrice);
        System.out.printf("Total weight gift = %.2f kilogram\n", totalWeight);
        System.out.println("\nAll information about gift:");

        for (Sweetness someSweetnes: gift) {
            System.out.println(someSweetnes.toString());
        }
    }
}
