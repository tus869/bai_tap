import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner banPhim = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu cua mang: ");
        int soLuong = banPhim.nextInt();
        int[] a = new int[soLuong]; 
        int tong = 0;
        int tich = 1;
        for (int i = 0; i < soLuong; i++) {
            System.out.print("Nhap vao phan tu a[" + i + "]: ");
            a[i] = banPhim.nextInt();
            tong = tong + a[i];
            tich = tich * a[i];
        }
        int trungBinh = tong / soLuong;
        System.out.println("Tong cac phan tu cua mang: " + tong);
        System.out.println("Tich cac phan tu cua mang: " + tich);
        System.out.println("Gia tri trung binh cac phan tu cua mang: " + trungBinh);
        banPhim.close();
    }
}