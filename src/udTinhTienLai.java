import java.util.Scanner;

public class udTinhTienLai {
    public static void main(String[] args) {
        double tien = 1.0;
        int thang = 1;
        double laiSuat = 1.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền :");
        tien = scanner.nextDouble();
        System.out.println("Nhập số tháng :");
        thang = scanner.nextInt();
        System.out.println("Nhập số lãi suất :");
        laiSuat = scanner.nextDouble();
        double tienLai =0;
        for (int i=0;i<thang; i++){
            tienLai += tien *(laiSuat/100)/12 * thang;
        }
        System.out.println("Tiền lãi cho vay: " + tienLai);
    }
}
