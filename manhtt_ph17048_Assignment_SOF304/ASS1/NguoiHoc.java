/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASS;

import java.util.Date;

/**
 *
 * @author 84985
 */
public class NguoiHoc {
    String maNH;
    String hoTen;
    boolean gioiTinh;
    Date ngaySinh;
    String dienThoai;
    String email;
    String ghiChu;
    String maNV;
    Date ngayDK;

    public NguoiHoc() {
    }

    public NguoiHoc(String maNH, String hoTen, boolean gioiTinh, String dienThoai, String email, String ghiChu, String maNV) {
        this.maNH = maNH;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.dienThoai = dienThoai;
        this.email = email;
        this.ghiChu = ghiChu;
        this.maNV = maNV;
    }

    public String getMaNH() {
        return maNH;
    }

    public void setMaNH(String maNH) {
    	if(maNH == null) {
    		throw new IllegalArgumentException("Mã KH không được trống");
    	}
    	if(maNH.isBlank()) {
    		throw new IllegalArgumentException("Mã KH không được rỗng");
    	}
    	if(maNH.contains(" ")) {
    		throw new IllegalArgumentException("Mã KH không được rỗng");
    	}
    	if(!checkMa(maNH)) {
    		throw new IllegalArgumentException("Mã KH không được chưa ký tự đặc biệt");
    	}
        this.maNH = maNH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
    	if(hoTen == null) {
    		throw new IllegalArgumentException("Tên KH không được trống");
    	}
    	if(hoTen.isBlank()) {
    		throw new IllegalArgumentException("Tên KH không được rỗng");
    	}
    	if(hoTen.startsWith(" ")) {
    		throw new IllegalArgumentException("Tên Kh không được bắt đầu bằng khoảng cách");
    	}
    	if(!checkTen(hoTen)) {
    		throw new IllegalArgumentException("Tên KH không được chưa ký tự đặc biệt");
    	}
        this.hoTen = hoTen;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
    	if(dienThoai == null) {
    		throw new IllegalArgumentException("Tên KH không được trống");
    	}
    	if(dienThoai.isBlank()) {
    		throw new IllegalArgumentException("Tên KH không được rỗng");
    	}
    	if(dienThoai.startsWith(" ")) {
    		throw new IllegalArgumentException("Tên Kh không được bắt đầu bằng khoảng cách");
    	}
    	if(!checkTen(dienThoai)) {
    		throw new IllegalArgumentException("Tên KH không được chưa ký tự đặc biệt");
    	}
        this.dienThoai = dienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
    	if(email == null) {
    		throw new IllegalArgumentException("Tên KH không được trống");
    	}
    	if(email.isBlank()) {
    		throw new IllegalArgumentException("Tên KH không được rỗng");
    	}
    	if(email.startsWith(" ")) {
    		throw new IllegalArgumentException("Tên Kh không được bắt đầu bằng khoảng cách");
    	}
    	if(!checkTen(email)) {
    		throw new IllegalArgumentException("Tên KH không được chưa ký tự đặc biệt");
    	}
        this.email = email;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
    	if(ghiChu == null) {
    		throw new IllegalArgumentException("Ghi chú không được trống");
    	}
    	if(ghiChu.isBlank()) {
    		throw new IllegalArgumentException("Ghi chú không được rỗng");
    	}
        this.ghiChu = ghiChu;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
    	if(maNV == null) {
    		throw new IllegalArgumentException("Mã KH không được trống");
    	}
    	if(maNV.isBlank()) {
    		throw new IllegalArgumentException("Mã KH không được rỗng");
    	}
    	if(maNV.contains(" ")) {
    		throw new IllegalArgumentException("Mã KH không được rỗng");
    	}
    	if(!checkMa(maNV)) {
    		throw new IllegalArgumentException("Mã KH không được chưa ký tự đặc biệt");
    	}
        this.maNV = maNV;
    }

    public Date getNgayDK() {
        return ngayDK;
    }

    public void setNgayDK(Date ngayDK) {
        this.ngayDK = ngayDK;
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
