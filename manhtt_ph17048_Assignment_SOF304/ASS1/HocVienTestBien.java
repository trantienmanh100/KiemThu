package Entity;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class HocVienTestBien {
   
	HocVien hocVien;
	@Before
	public void setUp() throws Exception {
		hocVien = new HocVien();
	}
	@After
	public void tearDown() throws Exception {
	hocVien = null;
	}
	@Rule
    public ExpectedException exception = ExpectedException.none();
	
	@Test
	public void TestMaHv() throws Exception{
		exception.expect(IllegalArgumentException.class);
		hocVien.setMaHV(0);
		hocVien.setMaHV(-1);
		hocVien.setMaHV(1);
		
		hocVien.setMaHV(9999);
		hocVien.setMaHV(10001);
	}
	@Test
	public void TestMaKH() throws Exception{
		exception.expect(IllegalArgumentException.class);
		hocVien.setMaKH(0);
		hocVien.setMaKH(-1);
		hocVien.setMaKH(1);
		
		hocVien.setMaKH(999);
		hocVien.setMaKH(1001);
	}
	@Test
	public void TestDiem() throws Exception{
		exception.expect(IllegalArgumentException.class);
		hocVien.setMaKH(0);
		hocVien.setMaKH(-1);
		hocVien.setMaKH(1);
		
		hocVien.setMaKH(9);
		hocVien.setMaKH(11);
	}
}
