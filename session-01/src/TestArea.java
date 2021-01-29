import static org.junit.Assert.*;

import org.junit.Test;

public class TestArea {

	@Test
	public void test() {
		AreaOfCircle a=new AreaOfCircle();
		a.init();
		float areaTest=(float) (3.14*a.radius*a.radius);
		float area=a.calcArea();
		
		assertEquals(areaTest, area, 0);
		
	}

}
