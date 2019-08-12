import java.util.Scanner;
import java.util.Random;
class Dice{
    /** 
     * 홀수인지짝수인지맞추는 게임
     * 일단 컴퓨터가던져서 얻은 값은 3
     * 사용자는입력을 홀수인거 같으면 홀 나머지는 짝 선택
     * 결과를 출력하세요
    */

    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();
        System.out.println("홀?,짝?");
        int dice =0;
        dice = ran.nextInt(6)+1;
        System.out.println(String.format("랜덤으로 나온 수 %d", dice));
        String dap = "";
        if(dice==1){
            dap = "홀";
        }else if(dice==2){
            dap = "짝";
        }else if(dice==3){
            dap="홀";
        }else if(dice==4){
            dap="짝";
        }else if(dice==5){
            dap="홀";
        }else{
            dap="짝";
        }
        System.out.println(String.format("%s", dap));
        System.out.println("주사위 값을 예측한 홀 짝 입력 [  ]");
        String answer= "";
        answer= scan.next();
        if(answer.equals(dap)){
            System.out.println("이겼습니다");
        }else if(!answer.equals(dap)){
            System.out.println("졌습니다");
        }else{
            System.out.println("졌습니다");
        }
    }
    }