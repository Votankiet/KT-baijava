package bai1;

public class phongmay {
    private String kichThuoc;
    private int dai;
    private int rong;
    private int SoluongMay;

public phongmay(String kichThuoc, int dai, int rong, int SoluongMay) {
    this.kichThuoc = kichThuoc;
    this.dai = dai;
    this.rong = rong;
    this.SoluongMay = SoluongMay;
}
public String getkichThuoc(){
  return kichThuoc;
}
public void setkichthuoc(String kichthuoc){
    this.kichThuoc = kichthuoc;
}
public int getdai(){
  return dai;
}
public void setdai(int dai) {
    this.dai = dai;
}
public int getrong(){
  return rong;
}
public void setrong(int rong) {
    this.rong = rong; 
}
public int getSoluongMay(){
    return SoluongMay;
}
  public void setSoluongMay(int SoluongMay){
      this.SoluongMay = SoluongMay;
}
}      
