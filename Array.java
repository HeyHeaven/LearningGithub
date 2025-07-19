import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int [] num = {1,4};
        num[1] = 10;
        System.out.println(Arrays.toString(num));
        try{
            System.out.println(num[10]);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println(num);
        System.out.println(Arrays.stream(num).min());
        for (int i = 0; i < num.length; i++) {
            System.out.println(Arrays.toString(num));
        }
    }
}
