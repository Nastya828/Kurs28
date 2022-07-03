package s12;

public class Task12 {
    public static void main(String[] args) {
        int N = 3;
        int[] Votes = {16, 15, 10};
        System.out.println(Level1.MassVote(N, Votes));

        int[] x = {20, 60, 10, 15, 5};
        System.out.println(Level1.MassVote(x.length, x));

        int[] x1 = {111, 111, 110, 110};
        System.out.println(Level1.MassVote(x1.length, x1));

    }

}
