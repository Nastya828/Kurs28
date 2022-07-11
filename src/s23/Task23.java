package s23;

public class Task23 {

    public static void main(String[] args) {
//"axxb6===4xaf5===eee5" => true
//"5==ooooooo=5=5" => false
//"abc=7==hdjs=3gg1=======5" => true
//"aaS=8" => false
//"9===1===9===1===9" => true
        System.out.println("axxb6===4xaf5===eee5 => " + Level1.white_walkers("axxb6===4xaf5===eee5"));
        System.out.println("5==ooooooo=5=5 => " + Level1.white_walkers("5==ooooooo=5=5"));
        System.out.println("abc=7==hdjs=3gg1=======5 => " + Level1.white_walkers("abc=7==hdjs=3gg1=======5"));
        System.out.println("aaS=8 => " + Level1.white_walkers("aaS=8"));
        System.out.println("9===1===9===1===9 => " + Level1.white_walkers("9===1===9===1===9"));
        System.out.println("8==2=23  => " + Level1.white_walkers("8==2=23"));


    }
}
