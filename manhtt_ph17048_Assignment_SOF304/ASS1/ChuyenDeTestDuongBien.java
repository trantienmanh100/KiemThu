package ASS;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ChuyenDeTestDuongBien {
ChuyenDe cd;
	@Before
	public void setUp() throws Exception {
		cd = new ChuyenDe();
	}

	@After
	public void tearDown() throws Exception {
		cd = null;
	}
   @Rule
   public ExpectedException rule = ExpectedException.none();
	@Test
	public void testhocphiam1() {
		rule.expect(IllegalArgumentException.class);
		cd.setHocPhi(-1);
		
	}
	@Test
	public void testhocphi0() {
		cd.setHocPhi(0);
	}
	@Test
	public void testhocphi1() {
		cd.setHocPhi(1);
	}
	@Test
	public void testhocphinhohonMax() {
		cd.setHocPhi(1.7976931348623157E306);
	}
	@Test
	public void testhocphiMax() {
		cd.setHocPhi(1.7976931348623157E307);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testhocphilonhonMax() {
		cd.setHocPhi(1.7976931348623157E308);
	}
	
	
	@Test
	public void testthoiluongam1() {
		rule.expect(IllegalArgumentException.class);
		cd.setThoiLuong(-1);
		
	}
	@Test
	public void testthoiluong0() {
		cd.setThoiLuong(0);
	}
	@Test
	public void testthoiluong1() {
		cd.setThoiLuong(1);
	}
	@Test
	public void testthoiluongnhohonMax() {
		cd.setThoiLuong(2147483645);
	}
	@Test
	public void testthoiluongMax() {
		cd.setThoiLuong(2147483646);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testthoiluonglonhonMax() {
		cd.setThoiLuong(2147483647);
	}

}
