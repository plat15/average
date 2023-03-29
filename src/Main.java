import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String rank;

        System.out.println("Điểm Trung Bình");
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập điểm môn Toán: ");
        double math = sc.nextDouble();

        System.out.println("Nhập điểm môn Vật Lý: ");
        double physics = sc.nextDouble();
        System.out.println("Nhập điểm môn Hóa Học");
        double chemistry = sc.nextDouble();

        double dtb = (math + physics + chemistry) / 3;

        if (dtb >= 8.0) {
            rank = "A";
        } else if (dtb >= 6.5) {
            rank = "B";
        } else if (dtb >= 5.0) {
            rank = "C";
        } else {
            rank = "D";
        }

        System.out.println("=================================================");
        System.out.println("Điểm trung bình của bạn là: " + dtb);
        System.out.println("Thứ hạng của bạn đạt được là: " + rank);
        System.out.println("=================================================");

    }
}