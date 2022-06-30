package s09;



public class Task09 {

    public static void main(String[] args) {
        String s = "настя и митчи";
        boolean flag1 = true;
        String result = Level1.TheRabbitsFoot(s, flag1);
        System.out.println(result);
        boolean flag2 = false;
        System.out.println(Level1.TheRabbitsFoot(result, flag2));
        String str = "омоюу толл дюиа акчп йрьк";
        String res = Level1.TheRabbitsFoot(str, false);
        System.out.println(res);
        System.out.println(Level1.TheRabbitsFoot((Level1.TheRabbitsFoot(str, false)), true));

    }
}
