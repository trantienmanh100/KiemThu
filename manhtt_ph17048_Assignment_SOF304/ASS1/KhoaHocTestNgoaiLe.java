package OnTap;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.After;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class KhoaHocTestNgoaiLe {
	KhoaHoc goi;
	@Rule
	 public ExpectedException rule = ExpectedException.none();
	@Before
	public void setUp() throws Exception {
		goi = new KhoaHoc();
	}
	@After
	public void tearDownAfterClass() throws Exception {
		goi = null;
	}
	@Test(expected = IllegalArgumentException.class)
	public void testMaKHNull() {
		String makh = null;
		goi.setMaKH(makh);
		
	}
	@Test
	public void testMaKHrong() {
		try {
			String macd = "";
			goi.setMaKH(macd);
			fail("Không xảy ra ngoại lệ");
		} catch (Exception e) {
			assertEquals("Mã KH không được rỗng", e.getMessage());
		}

	}
	@Test
	public void testMaKHbatdauspace() {
		String makh = " KH01";
		rule.expect(IllegalArgumentException.class);
		goi.setMaKH(makh);
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testMaKHKTDB() {
		String makh = "@#$KH";
		goi.setMaKH(makh);
		
	}
	@Test(expected = IllegalArgumentException.class)
	public void testMaKHbehon3() {
		String makh = "KH";
		goi.setMaKH(makh);
		
	}
	@Test(expected = IllegalArgumentException.class)
	public void testTenKHNull() {
		String tenKH = null;
		goi.setTenKH(tenKH);
		
	}
	@Test
	public void testTenKHrong() {
		try {
			String TenKh = "";
			goi.setTenKH(TenKh);
			fail("Không xảy ra ngoại lệ");
		} catch (Exception e) {
			assertEquals("Tên KH không được rỗng", e.getMessage());
		}

	}
	@Test
	public void testTenKHbatdauspace() {
		String Tenkh = " KH01";
		rule.expect(IllegalArgumentException.class);
		goi.setTenKH(Tenkh);
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testTenKHKTDB() {
		String ten = "@#$KH";
		goi.setTenKH(ten);
		
	}
	@Test(expected = IllegalArgumentException.class)
	public void testthoiluongam() {
		goi.setThoiluong(-9);
	}
	@Test
	public void testthoiluonglonhon() {
		rule.expect(IllegalArgumentException.class);
		goi.setThoiluong(125);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testhocphiam() {
		goi.setThoiluong(-9);
	}
	@Test
	public void testhocphilonhon() {
		rule.expect(IllegalArgumentException.class);
		goi.setThoiluong(55000000);
	}
	@Test
	public void testghichuNull() {
		try {
			goi.setGhichu(null);
			fail("Không xảy ra ngoại lệ");
		} catch (Exception e) {
			// TODO: handle exception
			assertEquals("Ghi chú không được trống", e.getMessage());
		}
	}
	@Test
	public void testGhiCHutrong() {
		try {
			goi.setGhichu("");
			fail("Không xảy ra ngoại lệ");
		} catch (Exception e) {
			// TODO: handle exception
			assertEquals("Ghi chú không được trống", e.getMessage());
		}
	}
	@Test(expected = IllegalArgumentException.class)
	public void testSoHVam() {
		goi.setSoHV(-9);
	}
	@Test
	public void testSoHVlonhon() {
		rule.expect(IllegalArgumentException.class);
		goi.setSoHV(30);
	}
}
