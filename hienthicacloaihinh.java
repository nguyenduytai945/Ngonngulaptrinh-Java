import java.util.Scanner;
public class hienthicacloaihinh {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. In hình chữ nhật");
        System.out.println("2. n tam giác vuông");
        System.out.println("3. In tam giác cân");
        System.out.println("4. Thoát");
        System.out.println("Nhập sự lựa chọn của bạn: ");
        choice = input.nextInt();
        switch (choice){
            case 1:
                for (int i =0; i<3;i++){
                    for (int j=0;j<5;j++){
                        System.out.print("* ");
                    }
                    System.out.println(" ");
                }
                break;
            case 2:
                for (int i =0; i<5;i++){
                    for (int j=0;j<i+1;j++){
                        System.out.print("* ");
                    }
                    System.out.println(" ");
                }
                break;
            case 3:
                for (int i =6; i>0;i--){
                    for (int j=0;j<i-1;j++){
                        System.out.print("* ");
                    }
                    System.out.println(" ");
                }
                break;
            case 4:
                System.exit(4);
            default:
                System.out.println("No choice!");
        }
    }
}