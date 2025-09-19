import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner banPhim = new Scanner(System.in);

        System.out.print("Nhap vao mot chuoi: ");
        String chuoi = banPhim.nextLine();

        int luaChon;

        do {
            System.out.println("1. Dem ky tu va tu trong chuoi");
            System.out.println("2. Kiem tra Palindrome");
            System.out.println("3. Tim ky tu xuat hien nhieu nhat");
            System.out.println("4. Thay the ky tu va doi chu hoa-thuong");
            System.out.println("5. Loai bo khoang trang va ky tu trung lap");
            System.out.println("6. Tim va ghep chuoi");
            System.out.println("7. Chuyen chuoi thanh so nguyen");
            System.out.println("0. Thoat");
            System.out.print("Moi ban chon chuc nang: ");
            luaChon = banPhim.nextInt();
            banPhim.nextLine();

            if (luaChon == 1) {

                int soKyTu = chuoi.length();
                System.out.println("Tong so ky tu (bao gom khoang trang): " + soKyTu);
                String[] cacTu = chuoi.trim().split("\\s+");
                System.out.println("So tu trong chuoi: " + cacTu.length);

            } else if (luaChon == 2) {

                String daoNguoc = new StringBuilder(chuoi).reverse().toString();
                if (chuoi.equals(daoNguoc)) {
                    System.out.println("Chuoi nay la Palindrome");
                } else {
                    System.out.println("Chuoi nay khong phai la Palindrome");
                }

            } else if (luaChon == 3) {

                int[] tanSuat = new int[10];
                for (int i = 0; i < chuoi.length(); i++) {
                    tanSuat[chuoi.charAt(i)]++;
                }
                int max = 0;
                for (int i = 0; i < 10; i++) {
                    if (tanSuat[i] > max) max = tanSuat[i];
                }
                System.out.print("Ky tu xuat hien nhieu nhat: ");
                for (int i = 0; i < 10; i++) {
                    if (tanSuat[i] == max) {
                        System.out.print((char) i + " ");
                    }
                }
                System.out.println();

            } else if (luaChon == 4) {

                String thayThe = chuoi.replace('a', 'b');
                System.out.println("Chuoi sau khi thay the 'a' bang 'b': " + thayThe);

                StringBuilder ketQua = new StringBuilder();
                for (int i = 0; i < chuoi.length(); i++) {
                    char c = chuoi.charAt(i);
                    if (Character.isUpperCase(c)) {
                        ketQua.append(Character.toLowerCase(c));
                    } else if (Character.isLowerCase(c)) {
                        ketQua.append(Character.toUpperCase(c));
                    } else {
                        ketQua.append(c);
                    }
                }
                System.out.println("Chuoi sau khi doi hoa-thuong: " + ketQua);

            } else if (luaChon == 5) {

                String khongKhoangTrang = chuoi.replace(" ", "");
                System.out.println("Chuoi sau khi bo khoang trang: " + khongKhoangTrang);

                StringBuilder ketQua2 = new StringBuilder();
                for (int i = 0; i < khongKhoangTrang.length(); i++) {
                    char c = khongKhoangTrang.charAt(i);
                    if (ketQua2.indexOf(String.valueOf(c)) == -1) {
                        ketQua2.append(c);
                    }
                }
                System.out.println("Chuoi sau khi bo ky tu trung lap: " + ketQua2);

            } else if (luaChon == 6) {

                System.out.print("Nhap vao mot chuoi khac: ");
                String chuoi2 = banPhim.nextLine();
                if (chuoi.contains(chuoi2)) {
                    System.out.println("Chuoi 2 la chuoi con cua chuoi ban dau");
                    System.out.println("Chuoi sau khi ghep: " + chuoi + chuoi2);
                } else {
                    System.out.println("Chuoi 2 khong phai la chuoi con cua chuoi ban dau");
                }

            } else if (luaChon == 7) {

                boolean chiSo = chuoi.matches("\\d+");
                if (chiSo) {
                    int so = Integer.parseInt(chuoi);
                    System.out.println("Chuoi chi chua so. Chuyen thanh so nguyen: " + so);
                } else {
                    System.out.println("Chuoi khong phai chi chua so.");
                }

            } else if (luaChon == 0) {
                System.out.println("Thoat chuong trinh.");

            } else {
                System.out.println("Lua chon khong hop le.");
            }

        } while (luaChon != 0);

        banPhim.close();
    }
}
