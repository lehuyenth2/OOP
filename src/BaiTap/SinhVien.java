package BaiTap;

public class SinhVien {

    public   int id;
    public   String name;
    public   int age;
    public   int diemToan;
    public   int diemVan;
    public   int diemAnh;
    public SinhVien(int id, String name, int age, int diemToan, int diemVan, int diemAnh) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.diemToan = diemToan;
        this.diemVan = diemVan;
        this.diemAnh = diemAnh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(int diemToan) {
        this.diemToan = diemToan;
    }

    public int getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(int diemVan) {
        this.diemVan = diemVan;
    }

    public int getDiemAnh() {
        return diemAnh;
    }

    public void setDiemAnh(int diemAnh) {
        this.diemAnh = diemAnh;
    }

    }

