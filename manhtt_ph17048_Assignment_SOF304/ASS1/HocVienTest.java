package Entity;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class HocVienTest {
   
	HocVien hocVien;
	@Before
	public void setUp() throws Exception {
		hocVien = new HocVien();
	}
	@After
	public void tearDown() throws Exception {
	hocVien = null;
	}
	
	@Test
	public void TestMaHV() throws Exception{
		int mahv=2;
		hocVien.setMaHV(mahv);
		assertEquals(mahv, hocVien.getMaHV());
		
	}
	@Test
	public void TestMakh() throws Exception{
		int makh=3;
		hocVien.setMaKH(makh);
		assertEquals(makh, hocVien.getMaKH());
		
	}
	@Test
	public void TestMaNH() throws Exception{
		String mahv="Hv01";
		hocVien.setMaNH(mahv);
		assertEquals(mahv, hocVien.getMaNH());
		
	}
	
	@Test
	public void TestDiem() throws Exception{
		float diem=4;
		hocVien.setDiem(diem);
		assertEquals(diem, hocVien.getDiem(),0.0);
		
	}
}
