/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASS;

import java.util.Objects;

/**
 *
 * @author 84985
 */
public class ChuyenDe {

   private String maCD;
    private String tenCD;
    private double hocPhi;
    private int thoiLuong;
    private String hinh;
    private String moTa;
     
    
    public ChuyenDe() {
		// TODO Auto-generated constructor stub
	}
    
    public ChuyenDe(String maCD, String tenCD, double hocPhi, int thoiLuong, String hinh, String moTa) {
		super();
		this.maCD = maCD;
		this.tenCD = tenCD;
		this.hocPhi = hocPhi;
		this.thoiLuong = thoiLuong;
		this.hinh = hinh;
		this.moTa = moTa;
	}

	@Override
    public String toString(){
        return this.tenCD;
    }

    public String getMaCD() {
        return maCD;
    }

    public void setMaCD(String maCD) {
    	if(maCD == null) {
    		throw new IllegalArgumentException("Mã CD không để trống");
    	}
    	if(maCD.isBlank()) {
    		throw new IllegalArgumentException("Mã CD không để trống");
    	}
    	
    	if(maCD.startsWith(" ")) {
    		throw new IllegalArgumentException("Không được có ký tự Trắng ở đầu");
    	} 
    	if(!checkMa(maCD)) {
    		throw new IllegalArgumentException("Không chứa ký tự đặc biệt và lớn hơn 3 ký tự");
    	}
    	
        this.maCD = maCD;
    }

    public String getTenCD() {
        return tenCD;
    }

    public void setTenCD(String tenCD) {
    	if(tenCD == null) {
    		throw new IllegalArgumentException("Tên CD không để trống");
    	}
    	if(tenCD.isBlank()) {
    		throw new IllegalArgumentException("Tên CD không để trống");
    	}
    	if(tenCD.startsWith(" ")) {
    		throw new IllegalArgumentException("Không được có ký tự Trắng ở đầu");
    	} 
    	if(!checkTen(tenCD)) {
    		throw new IllegalArgumentException("Không chứa ký tự đặc biệt và lớn hơn 3 ký tự");
    	}
        this.tenCD = tenCD;
    }

    public double getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(double hocPhi) {
    	if(hocPhi < 0 || hocPhi > 1.7976931348623157E307) {
    		throw new IllegalArgumentException("Học phí Trong khoảng từ 0 đến Double.Max ");
    	}
        this.hocPhi = hocPhi;
    }

    public int getThoiLuong() {
        return thoiLuong;
    }

    public void setThoiLuong(int thoiLuong) {
    	if(thoiLuong < 0 || thoiLuong > 2147483646) {
    		throw new IllegalArgumentException("Thời lượng Trong khoảng từ 0 đến Integer.Max ");
    	}
        this.thoiLuong = thoiLuong;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
    	if(hinh == null) {
    		throw new IllegalArgumentException("Hình không để trống");
    	}
    	if(hinh.isBlank()) {
    		throw new IllegalArgumentException("Hình không để trống");
    	}
    	if(!hinh.contains(".")) {
    		throw new IllegalArgumentException("Hình sai");
    	}
        this.hinh = hinh;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
    	if(hinh == null) {
    		throw new IllegalArgumentException("Mô Tả không để trống");
    	}
    	if(hinh.isBlank()) {
    		throw new IllegalArgumentException("Mô Tả không để trống");
    	}
        this.moTa = moTa;
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
