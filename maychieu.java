package bai1;

public class maychieu extends maytinh{
    private String kichThuoc;
    private int soGiodung;
    private int soluongTruycap;
public maychieu(String maMay, String soMay, boolean tinhTrang,String kichThuoc, int soGiodung, int soluongTruycap) {
    super(maMay, soMay, tinhTrang);
    this.kichThuoc = kichThuoc;
    this.soGiodung = soGiodung;
    this.soluongTruycap = soluongTruycap;

}
public String getkichThuoc(){
    return kichThuoc;
}
public void setkichthuoc(String kichThuoc){
    this.kichThuoc = kichThuoc;
}
public int getsoGiodung(){
    return soGiodung;
}
public void setsoGiodung(int soGiodung){
    this.soGiodung = soGiodung;
}
public int getsoluongTruycap(){
    return soluongTruycap;
}
public void setsoluongTruycap(int soluongTruycap){
    this.soluongTruycap = soluongTruycap;
}
@Override
public String kiemtraTinhtrang(){
    if(tinhTrang){
        return "máy chiếu đang hoạt động";
    }else{
        return "máy chiếu đang không hoạt động";
    }
}
}

