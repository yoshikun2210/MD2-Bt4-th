import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a ");
        int a = scanner.nextInt();
        System.out.println("NHập b");
        int b = scanner.nextInt();
        System.out.println("Nhập c");
        int c = scanner.nextInt();
        if (a!=0){
            int x = (c-b)/a;
            System.out.println("Phương trình có nghiệm x :" + x);
        }else {
            if (b == c){
                System.out.println("Phương trình có vô số nghiệm");
            }else {
                System.out.println("Phương trình vô nghiệm");
            }
        }


    }
}
