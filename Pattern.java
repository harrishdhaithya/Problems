import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number(Odd Number):");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("please enter a odd number");
        }else{
            int spaces = (int)n/2;
            int stars;
            for(int i=0;i<(int)n/2+1;i++){
                stars = 2*i +1;
                for(int j=0;j<spaces;j++){
                    System.out.print(" ");
                }
                for(int j=0;j<stars;j++){
                    System.out.print("*");
                }
                spaces=spaces-1;
                System.out.println();
            
            }
        }
        
        
    }
}
