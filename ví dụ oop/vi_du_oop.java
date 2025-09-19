import java.util.ArrayList;   // ✅ Đặt lên đầu

class KhachHang {
    private String ten;
    private String diaChi;
    private String sdt;

    public KhachHang(String ten, String diaChi, String sdt) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }

    public String getTen() { return ten; }
    public String getDiaChi() { return diaChi; }
    public String getSdt() { return sdt; }

    @Override
    public String toString() {
        return ten + " - " + diaChi + " - " + sdt;
    }
}

class MonMenu {
    private String tenMon;
    private double gia;

    public MonMenu(String tenMon, double gia) {
        this.tenMon = tenMon;
        this.gia = gia;
    }

    public String getTenMon() { return tenMon; }
    public double getGia() { return gia; }

    @Override
    public String toString() {
        return tenMon + " - " + gia + "đ";
    }
}

class Topping {
    private String tenTopping;
    private double gia;

    public Topping(String tenTopping, double gia) {
        this.tenTopping = tenTopping;
        this.gia = gia;
    }

    public String getTenTopping() { return tenTopping; }
    public double getGia() { return gia; }

    @Override
    public String toString() {
        return tenTopping + " - " + gia + "đ";
    }
}

class KhuyenMai {
    private String ma;
    private double soTienGiam;

    public KhuyenMai(String ma, double soTienGiam) {
        this.ma = ma;
        this.soTienGiam = soTienGiam;
    }

    public String getMa() { return ma; }
    public double getSoTienGiam() { return soTienGiam; }

    @Override
    public String toString() {
        return ma + " - giảm " + soTienGiam + "đ";
    }
}

class DonHang {
    private KhachHang khachHang;
    private MonMenu mon;
    private ArrayList<Topping> toppings;
    private int soLuong;
    private KhuyenMai khuyenMai;
    private double phiShip;

    public DonHang(KhachHang khachHang, MonMenu mon, ArrayList<Topping> toppings, int soLuong, KhuyenMai khuyenMai, double phiShip) {
        this.khachHang = khachHang;
        this.mon = mon;
        this.toppings = toppings;
        this.soLuong = soLuong;
        this.khuyenMai = khuyenMai;
        this.phiShip = phiShip;
    }

    public double tinhTongTien() {
        double tienMon = mon.getGia() * soLuong;
        double tienTopping = 0;
        for (Topping t : toppings) {
            tienTopping += t.getGia();
        }
        double giamGia = (khuyenMai != null) ? khuyenMai.getSoTienGiam() : 0;
        return tienMon + tienTopping + phiShip - giamGia;
    }

    public void inHoaDon() {
        System.out.println("========== HÓA ĐƠN ==========");
        System.out.println("Khách hàng: " + khachHang);
        System.out.println("Món: " + mon + " x" + soLuong);
        System.out.println("Topping:");
        for (Topping t : toppings) {
            System.out.println(" - " + t);
        }
        System.out.println("Phí ship: " + phiShip + "đ");
        if (khuyenMai != null) {
            System.out.println("Khuyến mãi: " + khuyenMai);
        }
        System.out.println("TỔNG TIỀN: " + tinhTongTien() + "đ");
        System.out.println("=============================");
    }
}

public class vi_du_oop {   // ✅ khớp với tên file vi_du_oop.java
    public static void main(String[] args) {
        KhachHang kh = new KhachHang("Nguyễn Mai Việt Tú", "ngõ 1008 đường quang trung", "0988910762");
        MonMenu mon = new MonMenu("Trà sữa fulltoping", 30000);

        ArrayList<Topping> danhSachTopping = new ArrayList<>();
        danhSachTopping.add(new Topping("Trân châu", 5000));
        danhSachTopping.add(new Topping("Thạch dừa", 4000));

        int soLuong = 2;
        KhuyenMai km = new KhuyenMai("GIAM10K", 10000);
        double phiShip = 15000;

        DonHang don = new DonHang(kh, mon, danhSachTopping, soLuong, km, phiShip);
        don.inHoaDon();
    }
}
