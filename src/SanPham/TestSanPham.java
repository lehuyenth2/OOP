package SanPham;

import javafx.collections.FXCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestSanPham {

    public static void main(String[] args) {
        Thongtinspham sanpham1 = new Thongtinspham("Test00","TV50inches",105453,200,1);
        Thongtinspham sanpham2 = new Thongtinspham("Test01","MicroWave",634455,0,1);
        Thongtinspham sanpham3 = new Thongtinspham("Test02","TuLanh012",5000000,1,1);
        Thongtinspham sanpham4 = new Thongtinspham("Test03","Dieuhoa002",90065,20,1);
        Thongtinspham sanpham5 = new Thongtinspham("Test04","Quat324",645500,23,1);
        ArrayList<Thongtinspham> arrayStd= new ArrayList<>();
        arrayStd.add(sanpham1);
        arrayStd.add(sanpham2);
        arrayStd.add(sanpham3);
        arrayStd.add(sanpham4);
        arrayStd.add(sanpham5);
//        Collections.sort(arrayStd, Comparator.reverseOrder());đoan nay tren mang copy dung roi ma lai k chay:(

        System.out.println("Ma SP|Ten San pham |Gia ban|Soluong|Thanh tien");
        for (Thongtinspham obj : arrayStd)
        {
            System.out.println(obj.getMaSanPham() + "|" + obj.getTenSanPham() + "|" + obj.getGiaBan() + "|" + obj.getSoLuong()
                    + "|"+ obj.soTien() );
        }


    }
}
