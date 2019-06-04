import java.util.Scanner;
public class timuocsochunglonnhat {
    public static void main(String[] args) {
        int a, b;
        Scanner nhap = new Scanner(System.in);
        System.out.println("nhập a: ");
        a = nhap.nextInt();
        System.out.println("nhập b: ");
        b = nhap.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0)
            System.out.println("Không có yếu tố chung lớn nhất");
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("\n" +"Yếu tố chung lớn nhất: " + a);
    }
}
