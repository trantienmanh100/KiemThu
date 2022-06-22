package ASS;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ChuyenDeTest {
   ChuyenDe cd ;
	@Before
	public void setUp() throws Exception {
		cd = new ChuyenDe("CD01", "Chuyên đề", 20, 20, "/image", "Note");
	}

	@After
	public void tearDown() throws Exception {
		cd =null;
	}

	@Test
	public void testGetMaCD() {
		String result = cd.getMaCD();
		String expected = "CD01";
		assertEquals(expected, result);
	}

	@Test
	public void testSetMaCD() {
		cd.setMaCD("CD02");
		String result = cd.getMaCD();
		String expected = "CD02";
		assertEquals(expected, result);
	}
    
	@Test
	public void testGetTenCD() {
		String result = cd.getTenCD();
		String expected = "Chuyên đề";
		assertEquals(expected, result);
	}

	@Test
	public void testSetTenCD() {
		cd.setTenCD("ChuyenDe2");
		String result = cd.getTenCD();
		String expected = "ChuyenDe2";
		assertEquals(expected, result);
	}

	@Test
	public void testGetHocPhi() {
		double result = cd.getHocPhi();
		double expected = 20;
		assertEquals(expected, result);
	}

	@Test
	public void testSetHocPhi() {
		cd.setHocPhi(30);
		double result = cd.getHocPhi();
		double expected = 30;
		assertEquals(expected, result);
	}

	@Test
	public void testGetThoiLuong() {
		int result = cd.getThoiLuong();
		int expected = 20;
		assertEquals(expected, result);
	}

	@Test
	public void testSetThoiLuong() {
		cd.setThoiLuong(30);
		int result = cd.getThoiLuong();
		int expected = 30;
		assertEquals(expected, result);
	}

	@Test
	public void testGetHinh() {
		String result = cd.getHinh();
		String expected = "/image";
		assertEquals(expected, result);
	}

	@Test
	public void testSetHinh() {
		cd.setHinh("/image/hinh");
		String result = cd.getHinh();
		String expected = "/image/hinh";
		assertEquals(expected, result);
	}

	@Test
	public void testGetMoTa() {
		String result = cd.getMoTa();
		String expected = "Note";
		assertEquals(expected, result);
	} 

	@Test
	public void testSetMoTa() {
		cd.setMoTa("Note 2");
		String result = cd.getMoTa();
		String expected = "Note 2";
		assertEquals(expected, result);
	}


}
