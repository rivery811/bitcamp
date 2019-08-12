import java.util.Scanner;
import java.util.Random;
class Rock{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();
        int com =0;
        com = ran.nextInt(3)+1;
        System.out.println("가위 바위 보!");
        String answer =" ";
        answer =  scan.next();
        if(com==1){
            if(answer.equals("가위")){
                System.out.println("비겼습니다.");
            }else if(answer.equals("바위")){
                System.out.println("이겼습니다.");
            }else if(answer.equals("보")){
                System.out.println("졌습니다.");
            }else{
                System.out.println("에러");
            }
        }else if(com==2){
            if(answer.equals("가위")){
                System.out.println("졌습니다.");
            }else if(answer.equals("바위")){
                System.out.println("비겼습니다.");
            }else if(answer.equals("보")){
                System.out.println("이겼습니다.");
            }else{
                System.out.println("에러");
            }
        }else if(com==3){
            if(answer.equals("가위")){
                System.out.println("이겼습니다.");
            }else if(answer.equals("바위")){
                System.out.println("졌습니다.");
            }else if(answer.equals("보")){
                System.out.println("비겼습니다.");
            }else{
                System.out.println("에러");
            }
        }

    }
}