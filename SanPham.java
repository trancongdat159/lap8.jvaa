import java.util.Scanner;

public class Sanpham {
    private String tenSp;
    private double donGia;
    private double giamGia;
    
    private double getThueNhapKhau(){
        return donGia*0.1;
    };
    
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten san pham");
        tenSp = sc.next();
        System.out.println("Nhap don gia");
        donGia = sc.nextDouble();
        System.out.println("Nhap giam gia");
        giamGia = sc.nextDouble();
    };
    
    public void Xuat(){
       System.out.println("Ten san pham"+tenSp);
        System.out.println("Don gia"+donGia);
        System.out.println("Giam gia"+giamGia);
        System.out.println("Thue nhap khau"+ getThueNhapKhau());
    };

    public String getTenSp() {
        return tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    public Sanpham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public Sanpham(String tenSp, double donGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
    }
    
}
