import java.util.Scanner;
class Sum{
public static void main(String[] args){
    int a, b, c =0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("첫번째 수를 입력하세요");
    a = scanner.nextInt();
    System.out.println("두번째 수를 입력하세요");
    b = scanner.nextInt();
    
     System.out.println(a +b);
     //System.out.print("더한값은"+c+"입니다")
     //                (a + "+" + b+ "=" +c)
     String op = " ";
     System.out.println("연산종류를 선택하세요 + , - , * , / ");
     op=scanner.next();
     if(op.equals("+")){
         c = a+b;
         System.out.println(String.format("%d+%d=%d",a,b,c));
     }else if(op.equals("-")){
         c = a-b;
         System.out.println(String.format("%d-%d=%d",a,b,c));
     }else if(op.equals("*")){
         c = a*b;
         System.out.println(String.format("%d*%d=%d",a,b,c));
     }else if(op.equals("/")){
         c= a/b;
         System.out.println(String.format("%d/%d=%d",a,b,c));
     }else{
         System.out.println("잘못된 입력입니다");
     }

     
 }
}