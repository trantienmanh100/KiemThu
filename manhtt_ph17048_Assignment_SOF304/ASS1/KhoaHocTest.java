package OnTap;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class KhoaHocTest {
	KhoaHoc goi;

	@Before
	public void setUp() throws Exception {
		goi = new KhoaHoc("Ph16402", "java", 10, 200000, "Java note", 20);
	}

	@After
	public void tearDownAfterClass() throws Exception {
		goi = null;
	}
	private KhoaHoc createTestSubject() {
		return new KhoaHoc();
	}
	@Test
	public void testGetMaKH() throws Exception {
		String result = goi.getMaKH();
        String expected = "Ph16402" ;
        
        assertEquals(expected, result);
	}

	@Test
	public void testSetMaKH() throws Exception {
		goi.setMaKH("Ph16401");
		String result = goi.getMaKH();
        String expected = "Ph16401";
        
        assertEquals(expected, result);
	}

	@Test
	public void testGetTenKH() throws Exception {
		String result = goi.getTenKH();
        String expected = "java" ;
        assertEquals(expected, result);
	}

	@Test
	public void testSetTenKH() throws Exception {
		goi.setTenKH("java2");
		String result = goi.getTenKH();
        String expected = "java2";
        assertEquals(expected, result);
	}
	@Test
	public void testGetThoiluong() throws Exception {
		int result = goi.getThoiluong();
        int expected = 10 ;
        assertEquals(expected, result);
	}

	@Test
	public void testSetThoiluong() throws Exception {
		goi.setThoiluong(15);
		int result = goi.getThoiluong();
        int expected = 15;
        assertEquals(expected, result);
	}
	@Test
	public void testGetHocphi() throws Exception {	
		double result = goi.getHocphi();
        double expected = 200000.0 ;
        assertEquals(expected, expected,0.0);
	}

	@Test
	public void testSetHocphi() throws Exception {
		goi.setHocphi(100000);
		double result = goi.getHocphi();
        double expected = 100000.0 ;
        assertEquals(expected, expected,0.0);
	}

	@Test
	public void testGetGhichu() throws Exception {
		String result = goi.getGhichu();
        String expected = "Java note" ;
        assertEquals(expected, result);
	}
	@Test
	public void testSetGhichu() throws Exception {
		goi.setGhichu("Java note 1");
		String result = goi.getGhichu();
        String expected = "Java note 1" ;
        assertEquals(expected, result);
	}

	@Test
	public void testGetSoHV() throws Exception {
		KhoaHoc testSubject;
		int result = goi.getThoiluong();
        int expected = 10;
        assertEquals(expected, result);
	}

	@Test
	public void testSetSoHV() throws Exception {
		goi.setThoiluong(15);
		int result = goi.getThoiluong();
        int expected = 15;
        assertEquals(expected, result);
	}

}
