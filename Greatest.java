public class Greatest {
    public static void main(String[] args){
        int n1=20,n2=30,n3=10;
        if(n1>n2&&n1>n3){
            System.out.println(n1+" is greatest");
        }else if(n2>n1&&n2>n3){
            System.out.println(n2+" is greatest");
        }else{
            System.out.println(n3+" is greatest");
        }
    }
}
