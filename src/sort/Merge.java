package sort;
import java.lang.Math;
/**
 * This class including Bottom-up and Top-down merge sort methods.
 * @author - Sida Wang, L01
 * @version 1.0
 * @since 2019-02-17
 */
public class Merge {
	/**
	 * Auxiliary array of Products
	 */
	private static Comparable<Product>[] aux;
	/**
	 * The function to check if an array with Products is sorted, the code is modified based on code in Algorithm 4th Edition pg245.
	 * @author - Sida Wang, L01
	 * @param x - the input array containing Products.
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
	 * The function merges elements in sorted order, the code is modified based on code in Algorithm 4th Edition pg271.
	 * @author - Sida Wang, L01
	 * @param a - the input array containing Products that need to be sorted.
	 * @param low - first element index in array
	 * @param mid - element index in array: mid = low + (high - low)/2
	 * @param high - last element index in array
	 * @see Product#compareTo
	 */
	public static void merge(Comparable<Product>[] a, int low, int mid, int high) {
		int i = low, j = mid+1;
		
		for (int k = low; k <= high; k++) {
			aux[k] = a[k];
		}
		for (int k =low; k <= high; k++) {
			if(i > mid)      a[k] = aux[j++];
			else if(j > high)  a[k] = aux[i++];
			else if(aux[j].compareTo((Product) aux[i])<0) a[k] = aux[j++];
			else             a[k] =aux[i++];
		}
	}
	/**
	 * function recursively divides the array in two sub-array and call merge function to merge them together,the code is modified based on code in Algorithm 4th Edition pg273.
	 * @author - Sida Wang, L01
	 * @param a - the input array containing Products that need to be sorted.
	 * @param low - first element index in array.
	 * @param high - last element index in array.
	 */
	private static void sort(Comparable<Product>[] a, int low, int high) {
		
		if(high <= low) return;
		int mid = low + (high - low)/2;
		sort(a,low,mid);
		sort(a, mid+1, high);
		merge(a, low, mid, high);
		
	}
	/**
	 * top-down merge sort using Comparable, the code is modified based on code in Algorithm 4th Edition pg273.
	 * @author - Sida Wang, L01
	 * @param x - the input array containing products that need to be sorted.
	 * @param n - the size of the input array.
	 */
	public static void sortMergeTD ( Comparable<Product>[] x, int n ) {
		aux = new Product [n];
		sort(x,0,n-1);
	}
	
	/**
	 * bottom-up merge sort using Comparable, the code is modified based on code in Algorithm 4th Edition pg278.
	 * @author - Sida Wang, L01
	 * @param x - the input array containing Products that need to be sorted.
	 * @param n - the size of the input array.
	 */
	public static void sortMergeBU ( Comparable<Product>[] x, int n ) {
		aux = new Product[n];
		for	(int sz = 1; sz < n; sz = sz+sz)
			for (int low = 0; low < n-sz; low+=sz+sz)
				merge(x,low,low+sz-1,Math.min(low+sz+sz-1,n-1));
	}
}
