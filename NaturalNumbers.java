import java.util.Scanner;
public class NaturalNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int sum=0;
        for(int i=0;i<N;i++){
            int num = in.nextInt();
            sum+=num;
        }
        System.out.println("The sum is "+sum);
        in.close();
    }
}
