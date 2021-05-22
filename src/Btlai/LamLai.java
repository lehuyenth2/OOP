package Btlai;

public class LamLai
{

    private   int id;
    private   String name;
    private   int age;
    private   int diemToan;
    private   int diemVan;
    private   int diemAnh;
    private int dtb;
    private  String xeploai;

    public LamLai(int id, String name, int age, int diemToan, int diemVan, int diemAnh, int dtb, String xeploai) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.diemToan = diemToan;
        this.diemVan = diemVan;
        this.dtb = dtb;
        this.xeploai = xeploai;
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

    public int getDtb() {
        return dtb;
    }

    public void setDtb(int dtb) {
        this.dtb = dtb;
    }

    public String getXeploai() {
        return xeploai;
    }

    public void setXeploai(String xeploai) {
        this.xeploai = xeploai;

    }
    public void inthongtin()
    {
        System.out.println("SV"+ id +"Name"+ name);
        System.out.println("SV"+ diemToan +"diem"+ diemAnh);
        System.out.println("SV"+ diemVan );
        System.out.println("trugn binh:"+ dtb);
        //System.out.println("SV"+ id +"Name"+ name);
    }
    public  double tinhtrungbinhf()
    {

        return (diemVan+diemAnh+diemToan)/3;
    }
//    public String xeploai() {
//        String xeploai;
//        if (diemVan == 0.0 || diemToan == 0.0 || diemAnh == 0) {
//            xeploai = "Yeeu";
//        }
//
//
//        // return  String;
//    }
}



