class Book {
    private String maSach;
    private String tenSach;
    private double giaSach;
    private double giamGia;

    // Constructor 1: chỉ có mã sách và tên sách
    public Book(String maSach, String tenSach) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.giaSach = 0; // giá mặc định là 0
        this.giamGia = 0; // giảm giá mặc định là không
    }

    // Constructor 2: đầy đủ 4 thông tin
    public Book(String maSach, String tenSach, double giaSach, double giamGia) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.giaSach = giaSach;
        this.giamGia = giamGia;
    }

    // Getter và Setter cho maSach
    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    // Getter và Setter cho tenSach
    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    // Getter và Setter cho giaSach
    public double getGiaSach() {
        return giaSach;
    }

    public void setGiaSach(double giaSach) {
        this.giaSach = giaSach;
    }

    // Getter và Setter cho giamGia
    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    // Tính giá bán
    public double tinhGiaBan() {
        return giaSach - (giaSach * giamGia / 100);
    }

    // In thông tin quyển sách
    public void hienThiThongTin() {
        System.out.println("Mã sách: " + maSach);
        System.out.println("Tên sách: " + tenSach);
        System.out.println("Giá sách: " + giaSach);
        System.out.println("Giảm giá: " + giamGia + "%");
        System.out.println("Giá bán: " + tinhGiaBan());
    }
}

public class bai_lap_2 {   // ⚠️ tên file phải là bai_lap_2.java
    public static void main(String[] args) {
        // Tạo 1 quyển sách bằng constructor đầy đủ
        Book sach1 = new Book("B001", "Lập trình Java cơ bản", 100000, 10);

        System.out.println("Thông tin quyển sách ban đầu:");
        sach1.hienThiThongTin();

        // Dùng setter để thay đổi giảm giá
        sach1.setGiamGia(20);

        System.out.println("\nThông tin quyển sách sau khi thay đổi giảm giá:");
        sach1.hienThiThongTin();

        // Dùng getter để lấy giá bán ra ngoài
        System.out.println("\nGiá bán cuối cùng: " + sach1.tinhGiaBan());
    }
}

//