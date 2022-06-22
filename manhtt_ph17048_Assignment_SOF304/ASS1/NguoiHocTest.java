package ASS;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ASS.NguoiHoc;

public class NguoiHocTest {
   NguoiHoc cd ;
	@Before
	public void setUp() throws Exception {
		cd = new NguoiHoc("NH01", "Nguyen Van A", true, "0985840363", "itachi020914@gmail.com", "Note", "NV01");
		
	}

	@After
	public void tearDown() throws Exception {
		cd =null;
	}

	@Test
	public void testGetMaCD() {
		String result = cd.getMaNH();
		String expected = "NH01";
		assertEquals(expected, result);
	}

	@Test
	public void testSetMaCD() {
		cd.setMaNH("CD02");
		String result = cd.getMaNH();
		String expected = "CD02";
		assertEquals(expected, result);
	}
    
	@Test
	public void testGetHoTen() {
		String result = cd.getHoTen();
		String expected = "Chuyên đề";
		assertEquals(expected, result);
	}

	@Test
	public void testSetHoTen() {
		cd.setHoTen("ChuyenDe2");
		String result = cd.getHoTen();
		String expected = "ChuyenDe2";
		assertEquals(expected, result);
	}

	@Test
	public void testGetGioiTinh() {
		boolean result = cd.isGioiTinh();
		boolean expected = true;
		assertEquals(expected, result);
	}

	@Test
	public void testSetgioitinh() {
		cd.setGioiTinh(false);;
		boolean result = cd.isGioiTinh();
		boolean expected = false;
		assertEquals(expected, result);
	}

	@Test
	public void testGetSĐT() {
		String result = cd.getDienThoai();
		String expected = "0985840363";
		assertEquals(expected, result);
	}

	@Test
	public void testSetSĐT() {
		cd.setDienThoai("09999");
		String result = cd.getDienThoai();
		String expected = "09999";
		assertEquals(expected, result);
	}

	@Test
	public void testGetEmail() {
		String result = cd.getEmail();
		String expected = "itachi020914@gmail.com";
		assertEquals(expected, result);
	}

	@Test
	public void testSetEmail() {
		cd.setEmail("itachi0209145@gmail.com");
		String result = cd.getEmail();
		String expected = "itachi0209145@gmail.com";
		assertEquals(expected, result);
	}

	@Test
	public void testGetNote() {
		String result = cd.getGhiChu();
		String expected = "Note";
		assertEquals(expected, result);
	} 

	@Test
	public void testSetNote() {
		cd.setGhiChu("Note 2");
		String result = cd.getGhiChu();
		String expected = "Note 2";
		assertEquals(expected, result);
	}
	@Test
	public void testGetMaNV() {
		String result = cd.getMaNV();
		String expected = "NV01";
		assertEquals(expected, result);
	} 

	@Test
	public void testSetMaNV() {
		cd.setGhiChu("MANV02");
		String result = cd.getGhiChu();
		String expected = "MANV02";
		assertEquals(expected, result);
	}


}
