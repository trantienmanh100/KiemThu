package Entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class HocVienTestNgoaiLe {
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
	public void TestMaHV() throws Exception {
		int mahv=-1;
		try {
			hocVien.setMaHV(mahv);
			fail("Không bắt được ngoại lệ");
		} catch (Exception e) {
			assertEquals("Mã k hợp lệ", e.getMessage());
			
		}
	}
	
	@Test
	public void TestMaHV1001() throws Exception {
		int mahv=10001;
		try {
			hocVien.setMaHV(mahv);
			fail("Không bắt được ngoại lệ");
		} catch (Exception e) {
			assertEquals("Mã hv <=10000", e.getMessage());
			
		}
	}
	
	@Test
	public void TestMaKH() throws Exception {
		int MaKH=-1;
		try {
			hocVien.setMaKH(MaKH);
			fail("Không bắt được ngoại lệ");
		} catch (Exception e) {
			assertEquals("Mã kh>0", e.getMessage());
			
		}
	}
	
	@Test
	public void TestMaKH10001() throws Exception {
		int MaKH=1001;
		try {
			hocVien.setMaKH(MaKH);
			fail("Không bắt được ngoại lệ");
		} catch (Exception e) {
			assertEquals("Mã kh <=1000", e.getMessage());
			
		}
	}
	@Test
	public void TestDiem1() throws Exception {
		float diem=-1;
		try {
			hocVien.setDiem(diem);
			fail("Không bắt được ngoại lệ");
		} catch (Exception e) {
			assertEquals("điểm >0", e.getMessage());
			
		}
	}
	
	@Test
	public void TestDiem11() throws Exception {
		float diem=11;
		try {
			hocVien.setDiem(diem);
			fail("Không bắt được ngoại lệ");
		} catch (Exception e) {
			assertEquals("điểm <10", e.getMessage());
			
		}
	}
	@Test
    public void testMaNVRong() throws Exception{
    	String maNH="";
    	try {
			hocVien.setMaNH(maNH);
			fail("Không bắt được ngoại lệ");
		} catch (Exception e) {
			assertEquals("Không để trống mã người học", e.getMessage());
			
		}
    }
	@Test
    public void testMaNVKTDB() throws Exception{
    	String maNH="@$";
    	try {
			hocVien.setMaNH(maNH);
			fail("Không bắt được ngoại lệ");
		} catch (Exception e) {
			assertEquals("Mã người học không chứa kí tự đặc biệt", e.getMessage());
			
		}
    }
}
