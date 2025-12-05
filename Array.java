import java.util.Scanner;

public class Array{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num []= new int[5];
System.out.println("Enter first number");
num[0] = sc.nextInt();
System.out.println("Enter Second number");
num[1] = sc.nextInt();
System.out.println("Enter third number");
num[2] = sc.nextInt();
System.out.println("Enter fourth number");
num[3] = sc.nextInt();
System.out.println("Enter fifth number");
num[4] = sc.nextInt();
System.out.println("Array values");
for(int i =0;i < 5;i++ ){
    
    System.out.println(num[i]);
}
}

//System.Out.Println()


}