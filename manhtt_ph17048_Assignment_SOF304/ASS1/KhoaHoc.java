package OnTap;

public class KhoaHoc {
  private String MaKH;
  private String tenKH;
  private int thoiluong;
  private double hocphi;
  private String ghichu;
  private int soHV;
  public KhoaHoc() {
	// TODO Auto-generated constructor stub
}
public KhoaHoc(String maKH, String tenKH, int thoiluong, double hocphi, String ghichu, int soHV) {
	super();
	this.MaKH = maKH;
	this.tenKH = tenKH;
	this.thoiluong = thoiluong;
	this.hocphi = hocphi;
	this.ghichu = ghichu;
	this.soHV = soHV;
	
}
public String getMaKH() {
	return MaKH;
}
public void setMaKH(String maKH) {
	if(maKH == null) {
		throw new IllegalArgumentException("Mã KH không được trống");
	}
	if(maKH.isBlank()) {
		throw new IllegalArgumentException("Mã KH không được rỗng");
	}
	if(maKH.contains(" ")) {
		throw new IllegalArgumentException("Mã KH không được rỗng");
	}
	if(!checkMa(maKH)) {
		throw new IllegalArgumentException("Mã KH không được chưa ký tự đặc biệt");
	}
	this.MaKH = maKH;
}
public String getTenKH() {
	return tenKH;
}
public void setTenKH(String tenKH) {
	if(tenKH == null) {
		throw new IllegalArgumentException("Tên KH không được trống");
	}
	if(tenKH.isBlank()) {
		throw new IllegalArgumentException("Tên KH không được rỗng");
	}
	if(tenKH.startsWith(" ")) {
		throw new IllegalArgumentException("Tên Kh không được bắt đầu bằng khoảng cách");
	}
	if(!checkTen(tenKH)) {
		throw new IllegalArgumentException("Tên KH không được chưa ký tự đặc biệt");
	}
	this.tenKH = tenKH;
}
public int getThoiluong() {
	return thoiluong;
}
public void setThoiluong(int thoiluong) {
	if(thoiluong < 0 || thoiluong > 120) {
		throw new IllegalArgumentException("Thời lượng chỉ từ 0 đến 120 ");
	}
	this.thoiluong = thoiluong;
}
public double getHocphi() {
	
	return hocphi;
}
public void setHocphi(double hocphi) {
	if(hocphi < 0 || hocphi > 50000000) {
		throw new IllegalArgumentException("Học phí chỉ từ 0 đến  50 triệu");
	}
	this.hocphi = hocphi;
}
public String getGhichu() {
	return ghichu;
}
public void setGhichu(String ghichu) {
	if(tenKH == null) {
		throw new IllegalArgumentException("Ghi chú không được trống");
	}
	if(tenKH.isBlank()) {
		throw new IllegalArgumentException("Ghi chú không được rỗng");
	}
	this.ghichu = ghichu;
}
public int getSoHV() {
	return soHV;
}
public void setSoHV(int soHV) {
	if(soHV < 0 || soHV > 25) {
		throw new IllegalArgumentException("Số HV từ 0 đến 25");
	}
	this.soHV = soHV;
}
public boolean checkMa(String str) {
	String regex = "[a-zA-Z0-9]{3,15}";
	boolean kt = str.matches(regex);
	return kt;
}
public boolean checkTen(String str) {
	String regex = "\\w{3,100}";
	boolean kt = str.matches(regex);
	return kt;
}
}
