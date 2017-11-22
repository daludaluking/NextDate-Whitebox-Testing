//package wb;
import static org.junit.Assert.*;

import org.junit.*;

public class NextDateDecisionBranchCoverageTest {
	
	NextDate date;
	
	@Before
	public void setUp() {
		date = new NextDate(0,0,0);
	}
	
	@Test
	public void branchCoverageTC1() {
		assertEquals("Should return \"invalid Input Date\"","invalid Input Date", date.run(13,8,2007));
	}

	@Test
	public void branchCoverageTC2() {
		assertEquals("Should return \"8/31/2007\"","8/31/2007", date.run(8,30,2007));
	}

	@Test
	public void branchCoverageTC3() {
		assertEquals("Should return \"11/1/2007\"","11/1/2007", date.run(10,31,2007));
	}

	@Test
	public void branchCoverageTC4() {
		assertEquals("Should return \"4/30/2007\"","4/30/2007", date.run(4,29,2007));
	}

	@Test
	public void branchCoverageTC5() {
		assertEquals("Should return \"7/1/2007\"","7/1/2007", date.run(6,30,2007));
	}

	@Test
	public void branchCoverageTC6() {
		assertEquals("Should return \"Invalid Input Date\"","Invalid Input Date", date.run(4,31,2007));
	}

	@Test
	public void branchCoverageTC7() {
		assertEquals("Should return \"12/31/2007\"","12/31/2007", date.run(12,30,2007));
	}

	@Test
	public void branchCoverageTC8() {
		assertEquals("Should return \"Invalid Next Year\"","Invalid Next Year", date.run(12,31,2021));
	}

	@Test
	public void branchCoverageTC9() {
		assertEquals("Should return \"1/1/2008\"","1/1/2008", date.run(12,31,2007));
	}

	@Test
	public void branchCoverageTC10() {
		assertEquals("Should return \"7/31/2007\"","7/31/2007", date.run(7,30,2007));
	}

	@Test
	public void branchCoverageTC11() {
		assertEquals("Should return \"2/28/2016\"","2/28/2016", date.run(2,27,2016));
	}

	@Test
	public void branchCoverageTC12() {
		assertEquals("Should return \"2/29/2016\"","2/29/2016", date.run(2,28,2016));
	}

	@Test
	public void branchCoverageTC13() {
		assertEquals("Should return \"3/1/2015\"","3/1/2015", date.run(2,28,2015));
	}

	@Test
	public void branchCoverageTC14() {
		assertEquals("Should return \"3/1/2000\"","3/1/2000", date.run(2,29,2000));
	}

	@Test
	public void branchCoverageTC15() {
		assertEquals("Should return \"Invalid Input Date\"","Invalid Input Date", date.run(2,29,2015));
	}
	
	@Test
	public void branchCoverageTC16() {
		assertEquals("Should return \"Invalid Input Date\"","Invalid Input Date", date.run(2,30,2016));
	}
}
