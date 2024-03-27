package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Ahsan Habib
 */
public class DateUtilTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "223123562";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Zainab";
		Assert.assertNotNull("Student name is null", studentName);
	}

	@Test
	public void testMaxJanuary31ShouldIncrementToFebruary1() {
		// January max boundary area: max+1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldIncrementToFebruary1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	
	
	@Test
	public void testNominalJanuary() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 1, 2024);
        System.out.println("testJanuaryNominal > " + date);
        date.increment();
        System.out.println(date);
	}
	
	/*
	 * Complete below test cases.
	 */
	
	@Test
	public void testMinJanuary1ShouldIncrementToJanuary2() {
		// Code here
		DateUtil date = new DateUtil(1, 1, 2024);
        date.increment();
        Assert.assertEquals(2, date.getDay());
        Assert.assertEquals(1, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void testMinJanuary1ShouldDecrementToDecember31() {
		// Code here
		DateUtil date = new DateUtil(1, 1, 2024);
        date.increment();
        Assert.assertEquals(2, date.getDay());
        Assert.assertEquals(1, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
	}
	
	/*
	 * Write tests for rest months of year 2024.
	 */
	@Test
	public void testBoundaryJune1() {
	    DateUtil date = new DateUtil(1, 6, 1994);
	    System.out.println("BoundaryJune1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testBoundaryJune2() {
	    DateUtil date = new DateUtil(2, 6, 1994);
	    System.out.println("BoundaryJune2 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(3, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}
	
	@Test
	public void testMaxFebruary29LeapYearShouldIncrementToMarch1() {
	    DateUtil date = new DateUtil(29, 2, 2024);
	    System.out.println("MaxFebruary29LeapYearShouldIncrementToMarch1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(3, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}

	@Test
	public void testMaxFebruary28NonLeapYearShouldIncrementToMarch1() {
	    DateUtil date = new DateUtil(28, 2, 2001);
	    System.out.println("MaxFebruary28NonLeapYearShouldIncrementToMarch1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(3, date.getMonth());
	    Assert.assertEquals(2001, date.getYear());
	}

	


	@Test
	public void testBoundaryJune15() {
	    DateUtil date = new DateUtil(15, 6, 2024);
	    System.out.println("BoundaryJune15 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}

	@Test
	public void testBoundaryFebruary1() {
	    DateUtil date = new DateUtil(1, 2, 2024);
	    System.out.println("BoundaryFebruary1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getDay());
	    Assert.assertEquals(2, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}

	@Test
	public void testBoundaryFebruary28LeapYear() {
	    DateUtil date = new DateUtil(28, 2, 2024);
	    System.out.println("BoundaryFebruary28LeapYear > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(29, date.getDay());
	    Assert.assertEquals(2, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}


	@Test
	public void testBoundaryFebruary28NonLeapYear() {
	    DateUtil date = new DateUtil(28, 2, 2001);
	    System.out.println("BoundaryFebruary28NonLeapYear > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(3, date.getMonth());
	    Assert.assertEquals(2001, date.getYear());
	}

	@Test
	public void testBoundaryFebruary1NonLeapYear() {
	    DateUtil date = new DateUtil(1, 2, 2001);
	    System.out.println("BoundaryFebruary1NonLeapYear > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getDay());
	    Assert.assertEquals(2, date.getMonth());
	    Assert.assertEquals(2001, date.getYear());
	}

	@Test
	public void testNominalMarch() {
	    DateUtil date = new DateUtil(1, 3, 2024);
	    System.out.println("March > " + date);
	    date.increment();
	    System.out.println(date);
	}

	@Test
	public void testNominalApril() {
	    DateUtil date = new DateUtil(1, 4, 2024);
	    System.out.println("April > " + date);
	    date.increment();
	    System.out.println(date);
	}

	@Test
	public void testNominalMay() {
	    DateUtil date = new DateUtil(3, 5, 2024);
	    System.out.println("May > " + date);
	    date.increment();
	    System.out.println(date);
	}

	@Test
	public void testNominalJune() {
	    DateUtil date = new DateUtil(17, 6, 2024);
	    System.out.println("June > " + date);
	    date.increment();
	    System.out.println(date);
	}
	@Test
	public void testNominalJuly() {
	    DateUtil date = new DateUtil(6, 7, 2024);
	    System.out.println("July > " + date);
	    date.increment();
	    System.out.println(date);
	}

	@Test
	public void testNominalAugust() {
	    DateUtil date = new DateUtil(9, 8, 2024);
	    System.out.println("August > " + date);
	    date.increment();
	    System.out.println(date);
	}
	





	
}
