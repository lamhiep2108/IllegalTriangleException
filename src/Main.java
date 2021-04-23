import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try {
            System.out.println("nhập cạnh thứ 1");
            int a=Integer.parseInt(scanner.nextLine());
            System.out.println(" nhạp cạnh thứ 2");
            int b=Integer.parseInt(scanner.nextLine());
            System.out.println("nhập cạnh thứ 3");
            int c=Integer.parseInt(scanner.nextLine());
            if (a<0||b<0||c<0){
                throw new Triangle();
            }
            if (a+b<c||a+c<b||b+c<a){
                throw new Triangle1();
            }
        } catch (Exception  e) {
            System.out.println("lỗi");
        }
    }
}
