package OnTap;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class KhoaHocTestDuongBien {
	KhoaHoc goi;

	@Before
	public void setUp() throws Exception {
		goi = new KhoaHoc();
	}

	@After
	public void tearDownAfterClass() throws Exception {
		goi = null;
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testDuongbienThoiluongam1() {
		int thoiluong = -1;
		goi.setThoiluong(thoiluong);
	}
	@Test
	public void testDuongbienThoiluong0() {
		int thoiluong = 0;
		goi.setThoiluong(thoiluong);
	}
	@Test
	public void testDuongbienThoiluong1() {
		int thoiluong = 1;
		goi.setThoiluong(thoiluong);
	}
	@Test
	public void testDuongbienThoiluong119() {
		int thoiluong = 119;
		goi.setThoiluong(thoiluong);
	}
	@Test
	public void testDuongbienThoiluong120() {
		int thoiluong = 120;
		goi.setThoiluong(thoiluong);
	}
	@Test
	public void testDuongbienThoiluong121() {
		try {
			int thoiluong = 121;
			goi.setThoiluong(thoiluong);
			fail("Không ngoại lệ");
		} catch (Exception e) {
			// TODO: handle exception
			assertEquals("Thời lượng chỉ từ 0 đến 120 ", e.getMessage());
		}
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testDuongbienhocphiam1() {
		double hocphi = -1;
		goi.setHocphi(hocphi);
	}
	@Test
	public void testDuongbienhocphi0() {
		double hocphi = 0;
		goi.setHocphi(hocphi);
	}
	@Test
	public void testDuongbienhocphi1() {
		double hocphi = 1;
		goi.setHocphi(hocphi);
	}
	@Test
	public void testDuongbienhocphi49999999() {
		double hocphi = 49999999;
		goi.setHocphi(hocphi);
	}
	@Test
	public void testDuongbien50000000() {
		double hocphi = 50000000;
		goi.setHocphi(hocphi);
	}
	@Test
	public void testDuongbienThoiluong50000001() {
		try {
			double hocphi = 50000001;
			goi.setHocphi(hocphi);
			fail("Không xảy ra ngoại lệ");
		} catch (Exception e) {
			// TODO: handle exception
			assertEquals("Học phí chỉ từ 0 đến  50 triệu", e.getMessage());
		}
	}
	 public ExpectedException rule = ExpectedException.none();
	@Test
	public void testDuongbienSoHVam1() {
		
		try {
			int hocvien = -1;
			
			goi.setSoHV(hocvien);
			fail("Không xảy ra ngoại lệ");
		} catch (Exception e) {
			// TODO: handle exception
			assertEquals("Số HV từ 0 đến 25", e.getMessage());
		}
	}
	@Test
	public void testDuongbiensoHV0() {
		int hocvien = 0;
		goi.setSoHV(hocvien);
	}
	@Test
	public void testDuongbiensoHV1() {
		int hocvien = 1;
		goi.setSoHV(hocvien);
	}
	@Test
	public void testDuongbiensoHV24() {
		int hocvien = 24;
		goi.setSoHV(hocvien);
	}
	@Test
	public void testDuongbiensoHV25() {
		int hocvien = 25;
		goi.setSoHV(hocvien);
	}
	@Test
	public void testDuongbiensoHV26() {
		try {
			int hocvien = 26;
			
			goi.setSoHV(hocvien);
			fail("Không xảy ra ngoại lệ");
		} catch (Exception e) {
			// TODO: handle exception
			assertEquals("Số HV từ 0 đến 25", e.getMessage());
		}
	}
}
