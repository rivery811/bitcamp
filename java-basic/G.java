import java.util.Scanner;
class G{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("주민번호를 입력하세요");
        String ssn= "";
        ssn = scan.next(); 
        String a = ssn.substring(7,8);

        if(a.equals("9")){
            System.out.println("9");
        }
        }
    }