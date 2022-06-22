package ASS;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ChuyenDeTestNgoaiLe {
	ChuyenDe cd;

	@Before
	public void setUp() throws Exception {

		cd = new ChuyenDe();
	}

	@After
	public void tearDown() throws Exception {
		cd = null;
	}

	@Test(expected = IllegalArgumentException.class)
	public void testMaCDnull() {
		String macd = null;
		cd.setMaCD(macd);

	}

	@Test
	public void testMaCDrong() {
		try {
			String macd = "";
			cd.setMaCD(macd);
			fail("Không xảy ra ngoại lệ");
		} catch (Exception e) {
			assertEquals("Mã CD không để trống", e.getMessage());
		}

	}
	@Rule
     public ExpectedException rule = ExpectedException.none();
	@Test
	public void testMaCDkytutrang() {
			String macd = " CD01";
			rule.expect(IllegalArgumentException.class);
			cd.setMaCD(macd);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testMaCDKTDB() {
		String macd = "$@adsds";
		cd.setMaCD(macd);
	}
	@Test
	public void testMaCDbehon3() {
		try {
			String macd = "d3";
			cd.setMaCD(macd);
			fail("Không xảy ra ngoại lệ");
		} catch (Exception e) {
			assertEquals("Không chứa ký tự đặc biệt và lớn hơn 3 ký tự", e.getMessage());
		}
	}
	@Test(expected = IllegalArgumentException.class)
	public void testtenCDTrong() {
		String tencd = null;
		cd.setTenCD(tencd);
	}
	@Test
	public void testTenCDrong() {
		try {
			String tencd = "";
			cd.setTenCD(tencd);
			fail("Không xảy ra ngoại lệ");
		} catch (Exception e) {
			assertEquals("Tên CD không để trống", e.getMessage());
		}

	}
	@Test
	public void testTenCDkytutrang() {
			String macd = " Chuyende";
			rule.expect(IllegalArgumentException.class);
			cd.setTenCD(macd);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testTenCDKTDB() {
		String macd = "$@adsds";
		cd.setTenCD(macd);
	}
	@Test
	public void testtenCDbehon3() {
		try {
			String macd = "d3";
			cd.setTenCD(macd);
			fail("Không xảy ra ngoại lệ");
		} catch (Exception e) {
			assertEquals("Không chứa ký tự đặc biệt và lớn hơn 3 ký tự", e.getMessage());
		}
	}
	@Test(expected = IllegalArgumentException.class)
	public void testhocphiam() {
			cd.setHocPhi(-9);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testhocphilonhon() {
		cd.setHocPhi(Double.MAX_VALUE);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testthoiluongam() {
		cd.setThoiLuong(-9);
	}
	@Test
	public void testthoiluonglonhon() {
		rule.expect(IllegalArgumentException.class);
		cd.setThoiLuong(2147483647);
	}
	@Test
	public void testhinhNull() {
		try {
			cd.setHinh(null);
			fail("Không xảy ra ngoại lệ");
		} catch (Exception e) {
			// TODO: handle exception
			assertEquals("Hình không để trống", e.getMessage());
		}
	}
	@Test
	public void testhinhtrong() {
		try {
			cd.setHinh("");
			fail("Không xảy ra ngoại lệ");
		} catch (Exception e) {
			// TODO: handle exception
			assertEquals("Hình không để trống", e.getMessage());
		}
	}
	@Test
	public void testhinhsai() {
		try {
			cd.setHinh("hinhanh");
			fail("Không xảy ra ngoại lệ");
		} catch (Exception e) {
			// TODO: handle exception
			assertEquals("Hình sai", e.getMessage());
		}
	}
	@Test
	public void testmotaNull() {
		try {
			cd.setMoTa(null);
			fail("Không xảy ra ngoại lệ");
		} catch (Exception e) {
			// TODO: handle exception
			assertEquals("Mô Tả không để trống", e.getMessage());
		}
	}
	@Test
	public void testMoTatrong() {
		try {
			cd.setMoTa("");
			fail("Không xảy ra ngoại lệ");
		} catch (Exception e) {
			// TODO: handle exception
			assertEquals("Mô Tả không để trống", e.getMessage());
		}
	}
}
