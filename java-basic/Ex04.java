import java.util.Scanner;
class Ex04{
    public static void main(String [] args){
        int a = 0;
        int b = 0;
        int c = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 수를 입력");
        a = scanner.nextInt();
        System.out.println("두번째 수를 입력");
        b = scanner.nextInt();
        c = a/b;
        System.out.print(String.format("%d/%d=%d",a,b,c)); 

    }
}