package bai1;

public abstract class maytinh {
    protected String maMay;
    protected String soMay;
    protected boolean tinhTrang;

public maytinh(String maMay, String soMay, boolean tinhTrang) {
    this.maMay = maMay;
    this.soMay = soMay;
    this.tinhTrang = tinhTrang;
}
public String getmaMay() {
    return maMay;
}
public void setmaMay(String maMay){
    this.maMay = maMay;
}
public String getsoMay() {
    return soMay;
}
public void setsoMay(String soMay){
    this.soMay = soMay;
}
public boolean gettinhTrang() {
    return tinhTrang;
}
public void settinhTrang(boolean tinhTrang){
    this.tinhTrang = tinhTrang;
}
public String kiemTratinhtrang() {
    if(tinhTrang) {
        return "Đang sử dụng";
    }else {
        return "Đang trống";
    }
}
public abstract String kiemtraTinhtrang();
@Override
public String toString(){
    return "Mã máy: " + maMay + ",Số máy:" + soMay + "tình trạng:" + tinhTrang;
}
}

    
