package ASS;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NhanVienTest {
   NhanVien nv ;
	@Before
	public void setUp() throws Exception {
		nv = new NhanVien("NV01", "123456", "Trần Tiến Mạnh", true);
	}

	@After
	public void tearDown() throws Exception {
		nv =null;
	}

	@Test
	public void testGetMaNV() {
		String result = nv.getMaNV();
		String expected = "NV01";
		assertEquals(expected, result);
	}

	@Test
	public void testSetMaNV() {
		nv.setMaNV("NV01");
		String result = nv.getMaNV();
		String expected = "CD02";
		assertEquals(expected, result);
	}
    
	@Test
	public void testGetPassword() {
		String result = nv.getMatKhau();
		String expected = "123456";
		assertEquals(expected, result);
	}

	@Test
	public void testSetPassword() {
		nv.setTenCD("123456");
		String result = nv.getMatKhau();
		String expected = "123456";
		assertEquals(expected, result);
	}

	@Test
	public void testGetHoTen() {
		double result = nv.getHoTen();
		String expected = "Trần Tiến Mạnh";
		assertEquals(expected, result);
	}

	@Test
	public void testSetHoTen() {
		nv.setHoTen("Nguyễn Văn Đức");
		double result = nv.getHoTen();
		String expected = "Nguyễn Văn Đức";
		assertEquals(expected, result);
	}

	@Test
	public void testGetRole() {
		boolean result = nv.isVaiTro();
		boolean expected = true;
		assertEquals(expected, result);
	}

	@Test
	public void testSetRole() {
		nv.setVaiTro(true);
		boolean result = nv.isVaiTro();
		boolean expected = true;
		assertEquals(expected, result);
	}



}
