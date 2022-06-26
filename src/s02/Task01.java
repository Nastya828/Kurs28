package s02;

public class Task01 {
    public static void main(String[] args) {
        int N = 3, M = 4, L = 2;
        int[] battalion = {3, 3, 3, 3, 3, 3, 3, 3};
        int[] h = {2, 2, 3, 4};
        int[] h1 = {1, 1, 1, 2, 1, 3, 2, 1, 2, 2, 2, 3};
        System.out.println("Study:");
        System.out.println(Level1.ConquestCampaign(N, M, L, h));
        System.out.println("test");
        System.out.println(Level1.ConquestCampaign(5, 5, 4, battalion));
        System.out.println("test2");
        System.out.println(Level1.ConquestCampaign(2, 3, 6, h1)); //=1

    }
}
