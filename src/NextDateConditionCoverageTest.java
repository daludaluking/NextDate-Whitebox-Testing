
import static org.junit.Assert.assertEquals;

import org.junit.*;

public class NextDateConditionCoverageTest {
	
	NextDate date;
	
	@Before
	public void setUp() {
		date = new NextDate(0,0,0);
	}

	@Test
	public void conditionCoverageTC1() {
		assertEquals("Should return \"invalid Input Date\"","invalid Input Date", date.run(0,0,2002));
	}
	
	@Test
	public void conditionCoverageTC2() {
		assertEquals("Should return \"invalid Input Date\"","invalid Input Date", date.run(0,1,2002));
	}

	
	@Test
	public void conditionCoverageTC3() {
		assertEquals("Should return \"invalid Input Date\"","invalid Input Date", date.run(14,6,2002));
	}
	
	@Test
	public void conditionCoverageTC4() {
		assertEquals("Should return \"invalid Input Date\"","invalid Input Date", date.run(8,6,1800));
	}
	
	@Test
	public void conditionCoverageTC5() {
		assertEquals("Should return \"invalid Input Date\"","invalid Input Date", date.run(10,20,2022));
	}

	@Test
	public void conditionCoverageTC6() {
		assertEquals("Should return \"3/21/1975\"","3/21/1975", date.run(3,20,1975));
	}

	@Test
	public void conditionCoverageTC7() {
		assertEquals("Should return \"4/1/2002\"","4/1/2002", date.run(3,31,2002));
	}

	@Test
	public void conditionCoverageTC8() {
		assertEquals("Should return \"6/30/2016\"","6/30/2016", date.run(6,29,2016));
	}

	@Test
	public void conditionCoverageTC9() {
		assertEquals("Should return \"7/1/2016\"","7/1/2016", date.run(6,30,2016));
	}

	@Test
	public void conditionCoverageTC10() {
		assertEquals("Should return \"Invalid Input Date\"","Invalid Input Date", date.run(6,31,2003));
	}

	@Test
	public void conditionCoverageTC11() {
		assertEquals("Should return \"12/31/2001","12/31/2001", date.run(12,30,2001));
	}

	@Test
	public void conditionCoverageTC12() {
		assertEquals("Should return \"Invalid Next Year\"","Invalid Next Year", date.run(12,31,2021));
	}

	@Test
	public void conditionCoverageTC13() {
		assertEquals("Should return \"1/1/2005\"","1/1/2005", date.run(12,31,2004));
	}

	@Test
	public void conditionCoverageTC14() {
		assertEquals("Should return \"8/1/2003\"","8/1/2003", date.run(7,31,2003));
	}

	@Test
	public void conditionCoverageTC15() {
		assertEquals("Should return \"2/27/1974\"","2/27/1974", date.run(2,26,1974));
	}

	@Test
	public void conditionCoverageTC16() {
		assertEquals("Should return \"2/29/2000\"","2/29/2000", date.run(2,28,2000));
	}

	@Test
	public void conditionCoverageTC17() {
		assertEquals("Should return \"3/1/1974\"","3/1/1974", date.run(2,28,1974));
	}

	@Test
	public void conditionCoverageTC18() {
		assertEquals("Should return \"3/1/1996\"","3/1/1996", date.run(2,29,1996));
	}

	@Test
	public void conditionCoverageTC19() {
		assertEquals("Should return \"Invalid Input Date\"","Invalid Input Date", date.run(2,29,1975));
	}

	@Test
	public void conditionCoverageTC20() {
		assertEquals("Should return \"Invalid Input Date\"","Invalid Input Date", date.run(2,30,2004));
	}

}
