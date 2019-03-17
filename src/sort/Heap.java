package sort;
/**
 * This class including heap sort methods.
 * @author - Sida Wang, L01
 * @version 1.0
 * @since 2019-02-17
 */
public class Heap {
	/**
	 * The function to check if an array with Products is sorted, the code is modified based on code in Algorithm 4th Edition pg245.
	 * @author - Sida Wang, L01
	 * @param x - the input array containing products.
	 * @return - a boolean, where True if the array is in ascending order and False if not
	 * @see Product#compareTo
	 */
	public static boolean isSorted(Comparable<Product> x[]) {
		int count = 0;
		for (int i = 1; i < x.length; i ++)
			if (x[i].compareTo((Product)x[i-1]) < 0) count ++;
		if (count == 0)return true;
		return false;
			
	}
	
	/**
	 * The function to swap positions of two adjacent Products in an array, the code is modified based on code in Algorithm 4th Edition pg245.
	 * @author - Sida Wang, L01
	 * @param a - the input array containing Products.
	 * @param i - index of one Product.
	 * @param j - index of another Product.
	 */
	private static void exch(Comparable<Product>[] a, int i, int j) {
		Comparable<Product> temp = a[i-1];
		a[i-1] = a[j-1];
		a[j-1] = temp;
	}
	
	/**
	 * Top-down reheapify method, the code is modified based on code in Algorithm 4th Edition pg316.
	 * @author - Sida Wang, L01
	 * @param a - the input array containing Products.
	 * @param k - index of a Product.
	 * @param n - size of heap.
	 * @see Product#compareTo
	 * @see exch
	 */
	private static void sink(Comparable<Product>[] a, int k, int n) {
		while(2*k <= n) {
			int i = 2*k;
			if(i < n && a[i-1].compareTo((Product)a[i])<0) i++;
			if(a[k-1].compareTo((Product)a[i-1])>0) break;
			exch(a,k,i);
			k = i;
		}
	}
	/**
	 * heap sort using Comparable, the code is modified based on code in Algorithm 4th Edition pg324.
	 * @author - Sida Wang, L01
	 * @param x - the input array containing jobs that need to be sorted.
	 * @param n - the size of the input array
	 * @see exch
	 */
	public static void sortHeap ( Comparable<Product>[] x, int n ) {
		for (int k = n/2; k >= 1; k--) {
			sink(x,k,n);
		}
		while(n>1) {
			exch(x,1,n--);
			exch(x,1,n);
		}
	}
}
