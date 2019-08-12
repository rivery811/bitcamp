import java.util.Scanner;
class Ex02{
    public static void main(String[] args){
        int a =0;
        int b =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 수 입력");
        a = scanner.nextInt();
        System.out.println("두번째 수 입력");
        b = scanner.nextInt();
        System.out.print(a-b);
    }
    

}