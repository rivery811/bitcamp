import java.util.Scanner;
class Sum{
public static void main(String[] args){
    int a, b, c =0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("ù��° ���� �Է��ϼ���");
    a = scanner.nextInt();
    System.out.println("�ι�° ���� �Է��ϼ���");
    b = scanner.nextInt();
    
     System.out.println(a +b);
     //System.out.print("���Ѱ���"+c+"�Դϴ�")
     //                (a + "+" + b+ "=" +c)
     String op = " ";
     System.out.println("���������� �����ϼ��� + , - , * , / ");
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
         System.out.println("�߸��� �Է��Դϴ�");
     }

     
 }
}