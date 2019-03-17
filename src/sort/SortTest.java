/**
 * 
 */
package sort;
import java.io.*;

import java.util.Scanner;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.apache.commons.lang3.time.StopWatch;

/**
 * This class is the test for all four sorting algorithms.
 * org.apache.commons.lang3 package is download from https://commons.apache.org/proper/commons-lang/, StopWatch from is this package is imported and used in this class
 * @author Sida Wang
 * @version 1.0
 * @since 2019-02-17
 */
public class SortTest {

	/**
	 * Unsorted arrays with Products.
	 */
	private Product[] unsorted_one;
	private Product[] unsorted_two;
	private Product[] unsorted_three;
	private Product[] unsorted_four;
	private Product[] unsorted_five;
	private Product[] unsorted_six;
	private Product[] unsorted_seven;
	/**
	 * The function reads the data from file and produces unsorted array of Products.
	 * @author - Sida Wang, L01
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		File f = new File("data/a1_in.txt");
		Scanner s = new Scanner(f);
		int len;
		int amount;
		int index;
		
		String line = s.nextLine();
		String clean_line = line.replaceAll("[{}\n]", "");
		String[] product_list = clean_line.split(",");
		len = product_list.length;
		unsorted_one = new Product[len/2];
		index = 0;
		for (int i = 0; i < product_list.length; i+=2) {
			amount = Integer.parseInt(product_list[i+1]);
			Product individual = new Product(product_list[i], amount);
			unsorted_one[index] = individual;
			index++;
		}
		
		
		line = s.nextLine();
		clean_line = line.replaceAll("[{}\n]", "");
		product_list = clean_line.split(",");
		len = product_list.length;
		unsorted_two = new Product[len/2];
		index = 0;
		for (int i = 0; i < product_list.length; i+=2) {
			
			amount = Integer.parseInt(product_list[i+1]);
			Product individual = new Product(product_list[i], amount);
			unsorted_two[index] = individual;
			index++;
		}
		
		
		line = s.nextLine();
		clean_line = line.replaceAll("[{}\n]", "");
		product_list = clean_line.split(",");
		len = product_list.length;
		unsorted_three = new Product[len/2];
		index = 0;
		for (int i = 0; i < product_list.length; i+=2) {
			
			amount = Integer.parseInt(product_list[i+1]);
			Product individual = new Product(product_list[i], amount);
			unsorted_three[index] = individual;
			index++;
		}
		
		line = s.nextLine();
		clean_line = line.replaceAll("[{}\n]", "");
		product_list = clean_line.split(",");
		len = product_list.length;
		unsorted_four = new Product[len/2];
		index = 0;
		for (int i = 0; i < product_list.length; i+=2) {
			
			amount = Integer.parseInt(product_list[i+1]);
			Product individual = new Product(product_list[i], amount);
			unsorted_four[index] = individual;
			index++;
		}
		
		
		
		line = s.nextLine();
		clean_line = line.replaceAll("[{}\n]", "");
		product_list = clean_line.split(",");
		len = product_list.length;
		unsorted_five = new Product[len/2];
		index = 0;
		for (int i = 0; i < product_list.length; i+=2) {
			
			amount = Integer.parseInt(product_list[i+1]);
			Product individual = new Product(product_list[i], amount);
			unsorted_five[index] = individual;
			index++;
		}
		
		line = s.nextLine();
		clean_line = line.replaceAll("[{}\n]", "");
		product_list = clean_line.split(",");
		len = product_list.length;
		unsorted_six = new Product[len/2];
		index = 0;
		for (int i = 0; i < product_list.length; i+=2) {
			
			amount = Integer.parseInt(product_list[i+1]);
			Product individual = new Product(product_list[i], amount);
			unsorted_six[index] = individual;
			index++;
		}
		
		line = s.nextLine();
		clean_line = line.replaceAll("[{}\n]", "");
		product_list = clean_line.split(",");
		len = product_list.length;
		unsorted_seven = new Product[len/2];
		index = 0;
		for (int i = 0; i < product_list.length; i+=2) {
			
			amount = Integer.parseInt(product_list[i+1]);
			Product individual = new Product(product_list[i], amount);
			unsorted_seven[index] = individual;
			index++;
		}
		
		s.close();


	}

	/**
	 * This function tests Top-down merge sort.
	 * @author - Sida Wang, L01
	 */
	@Test
	public void testMergeTD() {
		StopWatch stopwatch1 = StopWatch.createStarted();
		Merge.sortMergeTD(unsorted_one, unsorted_one.length);
		stopwatch1.stop();
		assertTrue(Merge.isSorted(unsorted_one));
		
		StopWatch stopwatch2 = StopWatch.createStarted();
		Merge.sortMergeTD(unsorted_two, unsorted_two.length);
		stopwatch2.stop();
		assertTrue(Merge.isSorted(unsorted_two));
		
		StopWatch stopwatch3 = StopWatch.createStarted();
		Merge.sortMergeTD(unsorted_three, unsorted_three.length);
		stopwatch3.stop();
		assertTrue(Merge.isSorted(unsorted_three));
		
		StopWatch stopwatch4 = StopWatch.createStarted();
		Merge.sortMergeTD(unsorted_four, unsorted_four.length);
		stopwatch4.stop();
		assertTrue(Merge.isSorted(unsorted_four));
		
		StopWatch stopwatch5 = StopWatch.createStarted();		
		Merge.sortMergeTD(unsorted_five, unsorted_five.length);
		stopwatch5.stop();
		assertTrue(Merge.isSorted(unsorted_five));
		
		StopWatch stopwatch6 = StopWatch.createStarted();		
		Merge.sortMergeTD(unsorted_six, unsorted_six.length);
		stopwatch6.stop();
		assertTrue(Merge.isSorted(unsorted_six));
		
		StopWatch stopwatch7 = StopWatch.createStarted();		
		Merge.sortMergeTD(unsorted_seven, unsorted_seven.length);
		stopwatch7.stop();
		assertTrue(Merge.isSorted(unsorted_seven));
		
		System.out.println("testMergeTD");
		System.out.println("2^4  :" + stopwatch1.getNanoTime());
		System.out.println("2^6  :" + stopwatch2.getNanoTime());
		System.out.println("2^8  :" + stopwatch3.getNanoTime());
		System.out.println("2^10 :" + stopwatch4.getNanoTime());
		System.out.println("2^12 :" + stopwatch5.getNanoTime());
		System.out.println("2^14 :" + stopwatch6.getNanoTime());
		System.out.println("2^16 :" + stopwatch7.getNanoTime());
		System.out.println("==================================");
	}
	
	/**
	 * This function tests Bottom-up merge sort.
	 * @author - Sida Wang, L01
	 */
	@Test
	public void testMergeBU() {
		StopWatch stopwatch1 = StopWatch.createStarted();
		Merge.sortMergeBU(unsorted_one, unsorted_one.length);
		stopwatch1.stop();
		assertTrue(Merge.isSorted(unsorted_one));
		
		StopWatch stopwatch2 = StopWatch.createStarted();
		Merge.sortMergeBU(unsorted_two, unsorted_two.length);
		stopwatch2.stop();
		assertTrue(Merge.isSorted(unsorted_two));
		
		StopWatch stopwatch3 = StopWatch.createStarted();
		Merge.sortMergeBU(unsorted_three, unsorted_three.length);
		stopwatch3.stop();
		assertTrue(Merge.isSorted(unsorted_three));
		
		StopWatch stopwatch4 = StopWatch.createStarted();
		Merge.sortMergeBU(unsorted_four, unsorted_four.length);
		stopwatch4.stop();
		assertTrue(Merge.isSorted(unsorted_four));
		
		StopWatch stopwatch5 = StopWatch.createStarted();
		Merge.sortMergeBU(unsorted_five, unsorted_five.length);
		stopwatch5.stop();
		assertTrue(Merge.isSorted(unsorted_five));
		
		StopWatch stopwatch6 = StopWatch.createStarted();
		Merge.sortMergeBU(unsorted_six, unsorted_six.length);
		stopwatch6.stop();
		assertTrue(Merge.isSorted(unsorted_six));
		
		StopWatch stopwatch7 = StopWatch.createStarted();
		Merge.sortMergeBU(unsorted_seven, unsorted_seven.length);
		stopwatch7.stop();
		assertTrue(Merge.isSorted(unsorted_seven));
		
		System.out.println("testMergeBU");
		System.out.println("2^4  :" + stopwatch1.getNanoTime());
		System.out.println("2^6  :" + stopwatch2.getNanoTime());
		System.out.println("2^8  :" + stopwatch3.getNanoTime());
		System.out.println("2^10 :" + stopwatch4.getNanoTime());
		System.out.println("2^12 :" + stopwatch5.getNanoTime());
		System.out.println("2^14 :" + stopwatch6.getNanoTime());
		System.out.println("2^16 :" + stopwatch7.getNanoTime());
		System.out.println("==================================");
	}

	/**
	 * This function tests regular insertion sort.
	 * @author - Sida Wang, L01
	 */
	@Test
	public void testSortInsert() {
		StopWatch stopwatch1 = StopWatch.createStarted();
		Insertion.sortInsert(unsorted_one);
		stopwatch1.stop();
		assertTrue(Insertion.isSorted(unsorted_one));
		
		StopWatch stopwatch2 = StopWatch.createStarted();
		Insertion.sortInsert(unsorted_two);
		stopwatch2.stop();
		assertTrue(Insertion.isSorted(unsorted_two));
		
		StopWatch stopwatch3 = StopWatch.createStarted();
		Insertion.sortInsert(unsorted_three);
		stopwatch3.stop();
		assertTrue(Insertion.isSorted(unsorted_three));
		
		StopWatch stopwatch4 = StopWatch.createStarted();
		Insertion.sortInsert(unsorted_four);
		stopwatch4.stop();
		assertTrue(Insertion.isSorted(unsorted_four));
		
		StopWatch stopwatch5 = StopWatch.createStarted();
		Insertion.sortInsert(unsorted_five);
		stopwatch5.stop();
		assertTrue(Insertion.isSorted(unsorted_five));
		
		StopWatch stopwatch6 = StopWatch.createStarted();
		Insertion.sortInsert(unsorted_six);
		stopwatch6.stop();
		assertTrue(Insertion.isSorted(unsorted_six));
		
		StopWatch stopwatch7 = StopWatch.createStarted();
		Insertion.sortInsert(unsorted_seven);
		stopwatch7.stop();
		assertTrue(Insertion.isSorted(unsorted_seven));
		
		System.out.println("testSortInsert");
		System.out.println("2^4  :" + stopwatch1.getNanoTime());
		System.out.println("2^6  :" + stopwatch2.getNanoTime());
		System.out.println("2^8  :" + stopwatch3.getNanoTime());
		System.out.println("2^10 :" + stopwatch4.getNanoTime());
		System.out.println("2^12 :" + stopwatch5.getNanoTime());
		System.out.println("2^14 :" + stopwatch6.getNanoTime());
		System.out.println("2^16 :" + stopwatch7.getNanoTime());
		System.out.println("==================================");
	}
	
	/**
	 * This function tests comparable insertion sort.
	 * @author - Sida Wang, L01
	 */
	@Test
	public void testInsertComparable() {
		StopWatch stopwatch1 = StopWatch.createStarted();
		Insertion.sortComparable(unsorted_one, unsorted_one.length);
		stopwatch1.stop();
		assertTrue(Insertion.isSorted(unsorted_one));
		
		StopWatch stopwatch2 = StopWatch.createStarted();
		Insertion.sortComparable(unsorted_two, unsorted_two.length);
		stopwatch2.stop();
		assertTrue(Insertion.isSorted(unsorted_two));
		
		StopWatch stopwatch3 = StopWatch.createStarted();
		Insertion.sortComparable(unsorted_three, unsorted_three.length);
		stopwatch3.stop();
		assertTrue(Insertion.isSorted(unsorted_three));
		
		StopWatch stopwatch4 = StopWatch.createStarted();
		Insertion.sortComparable(unsorted_four, unsorted_four.length);
		stopwatch4.stop();
		assertTrue(Insertion.isSorted(unsorted_four));
		
		StopWatch stopwatch5 = StopWatch.createStarted();
		Insertion.sortComparable(unsorted_five, unsorted_five.length);
		stopwatch5.stop();
		assertTrue(Insertion.isSorted(unsorted_five));
		
		StopWatch stopwatch6 = StopWatch.createStarted();
		Insertion.sortComparable(unsorted_six, unsorted_six.length);
		stopwatch6.stop();
		assertTrue(Insertion.isSorted(unsorted_six));
		
		StopWatch stopwatch7 = StopWatch.createStarted();
		Insertion.sortComparable(unsorted_seven	, unsorted_seven.length);
		stopwatch7.stop();
		assertTrue(Insertion.isSorted(unsorted_seven));
		
		System.out.println("testInsertComparable");
		System.out.println("2^4  :" + stopwatch1.getNanoTime());
		System.out.println("2^6  :" + stopwatch2.getNanoTime());
		System.out.println("2^8  :" + stopwatch3.getNanoTime());
		System.out.println("2^10 :" + stopwatch4.getNanoTime());
		System.out.println("2^12 :" + stopwatch5.getNanoTime());
		System.out.println("2^14 :" + stopwatch6.getNanoTime());
		System.out.println("2^16 :" + stopwatch7.getNanoTime());
		System.out.println("==================================");
	}
	
	/**
	 * This function tests Binary insertion sort.
	 * @author - Sida Wang, L01
	 */
	@Test
	public void testInsertBinary() {
		StopWatch stopwatch1 = StopWatch.createStarted();
		Insertion.sortBinary(unsorted_one, unsorted_one.length);
		stopwatch1.stop();
		assertTrue(Insertion.isSorted(unsorted_one));
		

		StopWatch stopwatch2 = StopWatch.createStarted();
		Insertion.sortBinary(unsorted_two, unsorted_two.length);
		stopwatch2.stop();
		assertTrue(Insertion.isSorted(unsorted_two));

		StopWatch stopwatch3 = StopWatch.createStarted();
		Insertion.sortBinary(unsorted_three, unsorted_three.length);
		stopwatch3.stop();
		assertTrue(Insertion.isSorted(unsorted_three));
		
		StopWatch stopwatch4 = StopWatch.createStarted();
		Insertion.sortBinary(unsorted_four, unsorted_four.length);
		stopwatch4.stop();
		assertTrue(Insertion.isSorted(unsorted_four));
		
		StopWatch stopwatch5 = StopWatch.createStarted();
		Insertion.sortBinary(unsorted_five, unsorted_five.length);
		stopwatch5.stop();
		assertTrue(Insertion.isSorted(unsorted_five));
		
		StopWatch stopwatch6 = StopWatch.createStarted();
		Insertion.sortBinary(unsorted_six, unsorted_six.length);
		stopwatch6.stop();
		assertTrue(Insertion.isSorted(unsorted_six));
		
		StopWatch stopwatch7 = StopWatch.createStarted();
		Insertion.sortBinary(unsorted_seven, unsorted_seven.length);
		stopwatch7.stop();
		assertTrue(Insertion.isSorted(unsorted_seven));
		
		
		System.out.println("testInsertBinary");
		System.out.println("2^4  :" + stopwatch1.getNanoTime());
		System.out.println("2^6  :" + stopwatch2.getNanoTime());
		System.out.println("2^8  :" + stopwatch3.getNanoTime());
		System.out.println("2^10 :" + stopwatch4.getNanoTime());
		System.out.println("2^12 :" + stopwatch5.getNanoTime());
		System.out.println("2^14 :" + stopwatch6.getNanoTime());
		System.out.println("2^16 :" + stopwatch7.getNanoTime());
		System.out.println("==================================");
	}
	
	/**
	 * This function tests basic quick sort.
	 * @author - Sida Wang, L01
	 */
	@Test
	public void testBasicQuick() {
		StopWatch stopwatch1 = StopWatch.createStarted();
		Quick.sortBasicQuick (unsorted_one);
		stopwatch1.stop();
		assertTrue(Quick.isSorted(unsorted_one));
		
		StopWatch stopwatch2 = StopWatch.createStarted();
		Quick.sortBasicQuick(unsorted_two);
		stopwatch2.stop();
		assertTrue(Quick.isSorted(unsorted_two));
		
		StopWatch stopwatch3 = StopWatch.createStarted();
		Quick.sortBasicQuick(unsorted_three);
		stopwatch3.stop();
		assertTrue(Quick.isSorted(unsorted_three));
		
		StopWatch stopwatch4 = StopWatch.createStarted();
		Quick.sortBasicQuick(unsorted_four);
		stopwatch4.stop();
		assertTrue(Quick.isSorted(unsorted_four));
		
		StopWatch stopwatch5 = StopWatch.createStarted();
		Quick.sortBasicQuick(unsorted_five);
		stopwatch5.stop();
		assertTrue(Quick.isSorted(unsorted_five));
		
		StopWatch stopwatch6 = StopWatch.createStarted();
		Quick.sortBasicQuick(unsorted_six);
		stopwatch6.stop();
		assertTrue(Quick.isSorted(unsorted_six));
		
		StopWatch stopwatch7 = StopWatch.createStarted();
		Quick.sortBasicQuick(unsorted_seven);
		stopwatch7.stop();
		assertTrue(Quick.isSorted(unsorted_seven));
		
		System.out.println("testBasicQuick");
		System.out.println("2^4  :" + stopwatch1.getNanoTime());
		System.out.println("2^6  :" + stopwatch2.getNanoTime());
		System.out.println("2^8  :" + stopwatch3.getNanoTime());
		System.out.println("2^10 :" + stopwatch4.getNanoTime());
		System.out.println("2^12 :" + stopwatch5.getNanoTime());
		System.out.println("2^14 :" + stopwatch6.getNanoTime());
		System.out.println("2^16 :" + stopwatch7.getNanoTime());
		System.out.println("==================================");
	}
	
	/**
	 * This function tests three-way quick sort.
	 * @author - Sida Wang, L01
	 */
	@Test
	public void testThreePartition() {
		StopWatch stopwatch1 = StopWatch.createStarted();
		Quick.sortThreePartition (unsorted_one,unsorted_one.length);
		stopwatch1.stop();
		assertTrue(Quick.isSorted(unsorted_one));
		
		StopWatch stopwatch2 = StopWatch.createStarted();
		Quick.sortThreePartition(unsorted_two,unsorted_two.length);
		stopwatch2.stop();
		assertTrue(Quick.isSorted(unsorted_two));
		
		StopWatch stopwatch3 = StopWatch.createStarted();
		Quick.sortThreePartition(unsorted_three,unsorted_three.length);
		stopwatch3.stop();
		assertTrue(Quick.isSorted(unsorted_three));
		
		StopWatch stopwatch4 = StopWatch.createStarted();
		Quick.sortThreePartition(unsorted_four,unsorted_four.length);
		stopwatch4.stop();
		assertTrue(Quick.isSorted(unsorted_four));
		
		StopWatch stopwatch5 = StopWatch.createStarted();
		Quick.sortThreePartition(unsorted_five,unsorted_five.length);
		stopwatch5.stop();
		assertTrue(Quick.isSorted(unsorted_five));
		
		StopWatch stopwatch6 = StopWatch.createStarted();
		Quick.sortThreePartition(unsorted_six,unsorted_six.length);
		stopwatch6.stop();
		assertTrue(Quick.isSorted(unsorted_six));
		
		StopWatch stopwatch7 = StopWatch.createStarted();
		Quick.sortThreePartition(unsorted_seven,unsorted_seven.length);
		stopwatch7.stop();
		assertTrue(Quick.isSorted(unsorted_seven));
		
		System.out.println("testThreePartition");
		System.out.println("2^4  :" + stopwatch1.getNanoTime());
		System.out.println("2^6  :" + stopwatch2.getNanoTime());
		System.out.println("2^8  :" + stopwatch3.getNanoTime());
		System.out.println("2^10 :" + stopwatch4.getNanoTime());
		System.out.println("2^12 :" + stopwatch5.getNanoTime());
		System.out.println("2^14 :" + stopwatch6.getNanoTime());
		System.out.println("2^16 :" + stopwatch7.getNanoTime());
		System.out.println("==================================");
	}
	/**
	 * This function tests heap sort.
	 * @author - Sida Wang, L01
	 */
	@Test
	public void testHeap() {
		StopWatch stopwatch1 = StopWatch.createStarted();
		Quick.sortThreePartition (unsorted_one,unsorted_one.length);
		stopwatch1.stop();
		assertTrue(Quick.isSorted(unsorted_one));
		
		StopWatch stopwatch2 = StopWatch.createStarted();
		Quick.sortThreePartition(unsorted_two,unsorted_two.length);
		stopwatch2.stop();
		assertTrue(Quick.isSorted(unsorted_two));
		
		StopWatch stopwatch3 = StopWatch.createStarted();
		Quick.sortThreePartition(unsorted_three,unsorted_three.length);
		stopwatch3.stop();
		assertTrue(Quick.isSorted(unsorted_three));
		
		StopWatch stopwatch4 = StopWatch.createStarted();
		Quick.sortThreePartition(unsorted_four,unsorted_four.length);
		stopwatch4.stop();
		assertTrue(Quick.isSorted(unsorted_four));
		
		StopWatch stopwatch5 = StopWatch.createStarted();
		Quick.sortThreePartition(unsorted_five,unsorted_five.length);
		stopwatch5.stop();
		assertTrue(Quick.isSorted(unsorted_five));
		
		StopWatch stopwatch6 = StopWatch.createStarted();
		Quick.sortThreePartition(unsorted_six,unsorted_six.length);
		stopwatch6.stop();
		assertTrue(Quick.isSorted(unsorted_six));
		
		StopWatch stopwatch7 = StopWatch.createStarted();
		Quick.sortThreePartition(unsorted_seven,unsorted_seven.length);
		stopwatch7.stop();
		assertTrue(Quick.isSorted(unsorted_seven));
		
		System.out.println("testHeap");
		System.out.println("2^4  :" + stopwatch1.getNanoTime());
		System.out.println("2^6  :" + stopwatch2.getNanoTime());
		System.out.println("2^8  :" + stopwatch3.getNanoTime());
		System.out.println("2^10 :" + stopwatch4.getNanoTime());
		System.out.println("2^12 :" + stopwatch5.getNanoTime());
		System.out.println("2^14 :" + stopwatch6.getNanoTime());
		System.out.println("2^16 :" + stopwatch7.getNanoTime());
		System.out.println("==================================");
	}
	

}
