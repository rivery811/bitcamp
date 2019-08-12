import java.util.Scanner;
class GenderChecker{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("주민번호를 입력하세요");
      
        String ssn = " ";
        ssn = scan.next(); 
        String sex = ssn.substring(7, 8);
        String year = ssn.substring(0, 2);


        if(year.equals("18")){
            if(sex.equals("9")){
                System.out.println("1800 ~ 1899년에 태어난 남성");
            }else if(sex.equals("0")){
                System.out.println("1800 ~ 1899년에 태어난 여성");
            }
        }else if(year.equals("19")){
            if(sex.equals("1")){
                System.out.println("1900 ~ 1999년에 태어난 남성");
            }else if(sex.equals("2")){
                System.out.println("1900 ~ 1999년에 태어난 여성");
            }else if(sex.equals("5")){
                System.out.println("1900 ~ 1999년에 태어난 외국인 남성");
            }else if(sex.equals("6")){
                System.out.println("1900 ~ 1999년에 태어난 외국인 여성");
            }

        }else if(year.equals("02")){
            if(sex.equals("3")){
                System.out.println("2000 ~ 2099년에 태어난 남성");
            }else if(sex.equals("4")){
                System.out.println("2000 ~ 2099년에 태어난 여성");
            }else if(sex.equals("7")){
                System.out.println("2000 ~ 2099년에 태어난 외국인 남성");
            }else if(sex.equals("8")){
                System.out.println("2000 ~ 2099년에 태어난 외국인 여성");
            }
                
        }



    }
}