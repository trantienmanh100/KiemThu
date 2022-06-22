package OnTap;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.After;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NhanVienTestNgoaiLe {
	NhanVien goi;
	@Rule
	 public ExpectedException rule = ExpectedException.none();
	@Before
	public void setUp() throws Exception {
		goi = new NhanVien();
	}
	@After
	public void tearDownAfterClass() throws Exception {
		goi = null;
	}
	@Test(expected = IllegalArgumentException.class)
	public void testMaNVNull() {
		String manv = null;
		goi.setMaNV(manv);
		
	}
	@Test
	public void testMaNVrong() {
		try {
			String manv = "";
			goi.setMaNV(manv);
			fail("Không xảy ra ngoại lệ");
		} catch (Exception e) {
			assertEquals("Mã NV không được rỗng", e.getMessage());
		}

	}
	@Test
	public void testMaNVbatdauspace() {
		String manv = " NV01";
		rule.expect(IllegalArgumentException.class);
		goi.setMaNV(manv);
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testMaNVKTDB() {
		String manv = "@#$NV";
		goi.setMaNV(manv);
		
	}
	@Test(expected = IllegalArgumentException.class)
	public void testMaMVbehon3() {
		String manv = "NV";
		goi.setMaNV(manv);
		
	}
	@Test(expected = IllegalArgumentException.class)
	public void testTenNVNull() {
		String tenNV = null;
		goi.setHoTen(tenNV);
		
	}
	@Test
	public void testTenNVrong() {
		try {
			String TenNV = "";
			goi.setTenKH(TenNV);
			fail("Không xảy ra ngoại lệ");
		} catch (Exception e) {
			assertEquals("Tên KH không được rỗng", e.getMessage());
		}

	}
	@Test
	public void testTenKHbatdauspace() {
		String TenNV = "NV01";
		rule.expect(IllegalArgumentException.class);
		goi.setHoTen(TenNV);
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testTenKHKTDB() {
		String ten = "@#$NV";
		goi.setHoTen(ten);
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testPasswordNull() {
		String password = null;
		goi.setMatKhau(password);
		
	}
	@Test
	public void testPasswordrong() {
		try {
			String password = "";
			goi.setMaNV(password);
			fail("Không xảy ra ngoại lệ");
		} catch (Exception e) {
			assertEquals("Mã NV không được rỗng", e.getMessage());
		}

	}
	@Test
	public void testPasswordbatdauspace() {
		String password = " 1234567";
		rule.expect(IllegalArgumentException.class);
		goi.setMaNV(password);
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testPasswordKTDB() {
		String password = "@#$pass";
		goi.setMaNV(password);
		
	}
	@Test(expected = IllegalArgumentException.class)
	public void testPasswordbehon3() {
		String password = "NV";
		goi.setMaNV(password);
		
	}
	
}
