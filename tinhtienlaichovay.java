import java.util.Scanner;
public class tinhtienlaichovay {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interset_rate = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("\n" + "Nhập số tiền đầu tư: ");
        money = input.nextDouble();
        System.out.println("Nhập số tháng: ");
        month = input.nextInt();
        System.out.println("Nhập tỷ lệ gián đoạn hàng năm theo tỷ lệ phần trăm: ");
        interset_rate = input.nextDouble();
        double total_interset = 0;
        for (int i = 0; i < month; i++) {
            total_interset = money * (interset_rate / 100) / 12 * 3;
            System.out.println("Tổng số giao nhau: " + total_interset);
        }
    }
}
