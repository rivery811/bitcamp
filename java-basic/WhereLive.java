import java.util.Scanner;
class WhereLive {
    public static void main(String [] args){
        System.out.println("���缼��?");
        String where = "";
        Scanner scanner = new Scanner(System.in);
        where =scanner.next();
        System.out.println(String.format("���� %s�� ���", where));
    }
}
