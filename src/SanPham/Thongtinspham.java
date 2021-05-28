package SanPham;

public class Thongtinspham {
private  String  maSanPham;
    private  String  tenSanPham;
    private  double  giaBan;
    private  double  soLuong;
    private double thanhtien;

    public double soTien() {
        return thanhtien;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(Long giaBan) {
        this.giaBan = giaBan;
    }

    public double getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public void setThanhtien(double thanhtien){
        this.thanhtien= thanhtien;
    }

    public Thongtinspham(String maSanPham, String tenSanPham, double giaBan, double soLuong, double soTien) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
        this.thanhtien= TinhDiscount(giaBan,soLuong);
    }
    public double TinhDiscount(double giaBan, double soLuong){
        double thanhtien=0;
        if(soLuong>20)
        {thanhtien= giaBan* soLuong* 0.15;}
        else thanhtien= giaBan * soLuong ;
        return thanhtien;
    }}

