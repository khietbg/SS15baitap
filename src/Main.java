import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("nhap canh a");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.println("nhap canh b");
            int b = Integer.parseInt(scanner.nextLine());
            System.out.println("nhap canh c");
            int c = Integer.parseInt(scanner.nextLine());

        try {
            triangelTest(a, b, c);
        } catch (IllegalTriangleException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
        }
    }



    public static void triangelTest(int a,int b, int c) throws IllegalTriangleException{

            if ((a>=0&&b>=0&&c>=0) && (a+b>c&&a+c>b&&b+c>a)){
                System.out.println(a+" "+b+" "+c+" là 3 cạnh của một tam giác");
            }else throw new IllegalTriangleException("khong phai tam　giac");


//            System.err.println("xay ra loi: ");
        }
}