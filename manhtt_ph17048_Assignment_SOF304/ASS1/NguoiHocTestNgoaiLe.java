package ASS;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.After;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NguoiHocTestNgoaiLe {
     NguoiHoc goi;
	@Rule
	 public ExpectedException rule = ExpectedException.none();
	@Before
	public void setUp() throws Exception {
		goi = new NguoiHoc();
	}
	@After
	public void tearDownAfterClass() throws Exception {
		goi = null;
	}
	@Test(expected = IllegalArgumentException.class)
	public void testMaKHNull() {
		String makh = null;
		goi.setMaNH(makh);
		
	}
	@Test
	public void testMaNHrong() {
		try {
			String macd = "";
			goi.setMaNH(macd);
			fail("Không xảy ra ngoại lệ");
		} catch (Exception e) {
			assertEquals("Mã KH không được rỗng", e.getMessage());
		}

	}
	@Test
	public void testMaNHbatdauspace() {
		String makh = " KH01";
		rule.expect(IllegalArgumentException.class);
		goi.setMaNH(makh);
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testMaNHKTDB() {
		String makh = "@#$KH";
		goi.setMaNH(makh);
		
	}
	@Test(expected = IllegalArgumentException.class)
	public void testMaNHbehon3() {
		String makh = "KH";
		goi.setMaNH(makh);
		
	}
	@Test(expected = IllegalArgumentException.class)
	public void testNguoiHocNull() {
		String tenKH = null;
		goi.setHoTen(tenKH);
		
	}
	@Test
	public void testHOTenrong() {
		try {
			String TenKh = "";
			goi.setHoTen(TenKh);
			fail("Không xảy ra ngoại lệ");
		} catch (Exception e) {
			assertEquals("Tên KH không được rỗng", e.getMessage());
		}

	}
	@Test
	public void testHOTenbatdauspace() {
		String Tenkh = " KH01";
		rule.expect(IllegalArgumentException.class);
		goi.setHoTen(Tenkh);
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void teshotentKTDB() {
		String ten = "@#$KH";
		goi.setHoTen(ten);
		
	}
	@Test(expected = IllegalArgumentException.class)
	public void testsdtNull() {
		String tenKH = null;
		goi.setDienThoai(tenKH);
		
	}
	@Test
	public void testSDTrong() {
		try {
			String TenKh = "";
			goi.setDienThoai(TenKh);
			fail("Không xảy ra ngoại lệ");
		} catch (Exception e) {
			assertEquals("Tên KH không được rỗng", e.getMessage());
		}

	}
	@Test
	public void testsdtbatdauspace() {
		String Tenkh = " KH01";
		rule.expect(IllegalArgumentException.class);
		goi.setDienThoai(Tenkh);
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void tesSDTtKTDB() {
		String ten = "@#$KH";
		goi.setDienThoai(ten);
		
	}

	@Test(expected = IllegalArgumentException.class)
	public void testemailNull() {
		String tenKH = null;
		goi.setEmail(tenKH);
		
	}
	@Test
	public void testemailrong() {
		try {
			String TenKh = "";
			goi.setEmail(TenKh);
			fail("Không xảy ra ngoại lệ");
		} catch (Exception e) {
			assertEquals("Tên KH không được rỗng", e.getMessage());
		}

	}
	@Test
	public void testemailbatdauspace() {
		String Tenkh = " KH01";
		rule.expect(IllegalArgumentException.class);
		goi.setEmail(Tenkh);
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void tesemailtKTDB() {
		String ten = "@#$KH";
		goi.setEmail(ten);
		
	}
	@Test
	public void testghichuNull() {
		try {
			goi.setGhiChu(null);
			fail("Không xảy ra ngoại lệ");
		} catch (Exception e) {
			// TODO: handle exception
			assertEquals("Ghi chú không được trống", e.getMessage());
		}
	}
	@Test
	public void testGhiCHutrong() {
		try {
			goi.setGhiChu("");
			fail("Không xảy ra ngoại lệ");
		} catch (Exception e) {
			// TODO: handle exception
			assertEquals("Ghi chú không được trống", e.getMessage());
		}
	}
	@Test(expected = IllegalArgumentException.class)
	public void testMaNVNull() {
		String makh = null;
		goi.setMaNV(makh);
		
	}
	@Test
	public void testMaNVrong() {
		try {
			String macd = "";
			goi.setMaNV(macd);
			fail("Không xảy ra ngoại lệ");
		} catch (Exception e) {
			assertEquals("Mã KH không được rỗng", e.getMessage());
		}

	}
	@Test
	public void testMaNVbatdauspace() {
		String makh = " KH01";
		rule.expect(IllegalArgumentException.class);
		goi.setMaNV(makh);
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testMaNVKTDB() {
		String makh = "@#$KH";
		goi.setMaNV(makh);
		
	}
	@Test(expected = IllegalArgumentException.class)
	public void testMaNVbehon3() {
		String makh = "KH";
		goi.setMaNV(makh);
		
	}
}
