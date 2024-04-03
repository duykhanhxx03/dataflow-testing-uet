import java.util.Scanner;

public class HoaDon {
    /**
     * @param tuoi   Tuoi cua khach hang.
     * @param hoaDon So tien hoa don.
     * @return So tien hoa don sau khi da giam, tra ve -1 neu tuoi<0 hoac hoaDon<0
     */
    public static double giamGia(double tuoi, double hoaDon) {
        if (!isInteger(tuoi) || tuoi < 0 || tuoi > 120 || hoaDon < 0) {
            return -1; // Khong hop le
        }
        if (tuoi < 7) {
            hoaDon = 0; // Giam gia 100%
        } else if (hoaDon >= 5000000) {
            hoaDon = hoaDon*(1-0.1); // Giam gia 10%
        } else if (hoaDon >= 1000000) {
            hoaDon = hoaDon*(1-0.05); // Giam gia 5%
        }

        return hoaDon;
    }

    public static boolean isInteger(double num) {
        return num % 1 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tuổi khách hàng: ");
        double x = scanner.nextDouble();

        System.out.print("Nhập hóa đơn phải trả: ");
        double y = scanner.nextDouble();

        double giamGia = giamGia(x, y);

        System.out.println("Số tiền phải trả là: " + giamGia);
    }
}
