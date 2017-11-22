//package wb;
import static org.junit.Assert.*;

import org.junit.*;

public class NextDateStatementCoverageTest {
	
	NextDate date;
	
	@Before
	public void setUp() {
		date = new NextDate(0,0,0);
	}
	
	@Test
	public void statementCoverageTC1() {
		assertEquals("Should return \"invalid Input Date\"","invalid Input Date", date.run(1,12,2032));
	}

	@Test
	public void statementCoverageTC2() {
		assertEquals("Should return \"5/31/2012\"","5/31/2012", date.run(5,30,2012));
	}
	
	@Test
	public void statementCoverageTC3() {
		assertEquals("Should return \"6/1/2012\"","6/1/2012", date.run(5,31,2012));
	}

	@Test
	public void statementCoverageTC4() {
		assertEquals("Should return \"4/30/2012\"","4/30/2012", date.run(4,29,2012));
	}
	
	@Test
	public void statementCoverageTC5() {
		assertEquals("Should return \"5/1/2012\"","5/1/2012", date.run(4,30,2012));
	}

	@Test
	public void statementCoverageTC6() {
		assertEquals("Should return \"Invalid Input Date\"","Invalid Input Date", date.run(4,31,2012));
	}
	
	@Test
	public void statementCoverageTC7() {
		assertEquals("Should return \"12/31/2012\"","12/31/2012", date.run(12,30,2012));
	}
	
	@Test
	public void statementCoverageTC8() {
		assertEquals("Should return \"Invalid Next Year\"","Invalid Next Year", date.run(12,31,2021));
	}
	
	@Test
	public void statementCoverageTC9() {
		assertEquals("Should return \"1/1/2013\"","1/1/2013", date.run(12,31,2012));
	}
	
	@Test
	public void statementCoverageTC11() {
		assertEquals("Should return \"2/28/2012\"","2/28/2012", date.run(2,27,2012));
	}
	
	@Test
	public void statementCoverageTC12() {
		assertEquals("Should return \"2/29/2012\"","2/29/2012", date.run(2,28,2012));
	}

	@Test
	public void statementCoverageTC13() {
		assertEquals("Should return \"3/1/2011\"","3/1/2011", date.run(2,28,2011));
	}
	
	@Test
	public void statementCoverageTC14() {
		assertEquals("Should return \"3/1/2000\"","3/1/2000", date.run(2,29,2000));
	}
	
	@Test
	public void statementCoverageTC15() {
		assertEquals("Should return \"Invalid Input Date\"","Invalid Input Date", date.run(2,29,2011));
	}

	@Test
	public void statementCoverageTC16() {
		assertEquals("Should return \"Invalid Input Date\"","Invalid Input Date", date.run(2,30,2012));
	}
}
