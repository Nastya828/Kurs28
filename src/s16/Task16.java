package s16;

public class Task16 {
    public static void main(String[] args) {
        int[] price = {100, 350, 25, 300, 10, 400, 200, 150, 800};
        int sale = Level1.MaximumDiscount(price.length, price);
        System.out.println(sale);

    }
}
