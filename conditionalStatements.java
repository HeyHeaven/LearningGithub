import java.util.Scanner;

public class conditionalStatements {
     static int withRecursionFactorial(int x){
        if(x!= 1){
            return x*withRecursionFactorial(x-1);
        }return 1;
    }
    static int withoutRecursionFactorial(int x){
        int result = 1;
        for (int i = x; i >= 1; i--) {
            result*=i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(withoutRecursionFactorial(3));
        System.out.println(withRecursionFactorial(3));
//        System.out.print("enter btw 0-4 : ");
        int day=sc.nextInt();
//        switch (day){
//            case 1:
//                System.out.println("mon");
//                break;
//            case 2:
//                System.out.println("tue");
//                break;
//            case 3:
//                System.out.println("wed");
//                break;
//            case 4:
//                System.out.println("thru");
//                break;
//            default:
//                System.out.println("sun");
//        }
    }




}
