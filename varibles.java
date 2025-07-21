import java.util.Scanner;

public class varibles {
    public static void main(String[] args) {

        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no.1 : ");
        System.out.print("enter no.2 : ");
        System.out.print("enter no.3 : ");
        System.out.print("enter no.4 : ");
        System.out.print("enter no.5 : ");
        System.out.print("enter no.6 : "); // for GitHub Testing #1
        System.out.print("enter no.7 : "); // for GitHub Testing #2
        x=sc.nextInt();
        System.out.println(x);
//        x=sc.nextInt();
//        System.out.print("enter no.2 :");
//        y=sc.nextInt();
//        System.out.print("result : ");
//        add(x,y);
//
//        String name = "Kundan";
//        int num=4;
//        System.out.println(name+num+"_");
    };
    static void add(int x, int y){
        System.out.println(x+y);
    }
}
