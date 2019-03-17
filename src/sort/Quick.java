package sort;
/**
 * This class including Regular quick sort and three-way quick sort methods.
 * @author - Sida Wang, L01
 * @version 1.0
 * @since 2019-02-17
 */
public class Quick {
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
	 * The function to swap positions of two adjacent Products in an array, the code is modified based on code in Algorithm 4th Edition pg245.
	 * @author - Sida Wang, L01
	 * @param a - the input array containing Products.
	 * @param i - index of one Product.
	 * @param j - index of another Product.
	 */
	private static void exch(Comparable<Product>[] a, int i, int j) {
		Comparable <Product>t = a[i]; a[i] = a[j]; a[j] = t;
	}
	/**
	 * Partition function to be used by sort, the code is modified based on code in Algorithm 4th Edition pg291
	 * @author - Sida Wang, L01
	 * @param a - the input array containing Products.
	 * @param low - index of first Product.
	 * @param high - index of last Product.
	 * @see Product#compareTo
	 * @see exch
	 */
	private static int partition(Comparable<Product>[] a, int low, int high) {
		int i = low, j = high+1;
		Comparable<Product> v = a[low];
		while(true) {
			while(a[++i].compareTo((Product)v)<0) if(i == high) break;
			while(v.compareTo((Product)a[--j])<0) if(j == low) break;
			if(i>= j) break;
			exch(a,i,j);
		}
		exch(a,low,j);
		return j;
	}
	/**
	 * The function recursively sorts the array of Products in left and right parts by calling partition function, the code is modified based on code in Algorithm 4th Edition pg289.
	 * @author - Sida Wang, L01
	 * @param a - the input array containing Products.
	 * @param low - index of first Product.
	 * @param high - index of last Product.
	 */
	private static void sort(Comparable<Product>[] a, int low, int high) {
		if(high <= low) return;
		int j = partition(a,low,high);
		sort(a,low,j-1);
		sort(a,j+1,high);
	}
	/**
	 * basic quick sort, the code is modified based on code in Algorithm 4th Edition pg289.
	 * @author - Sida Wang, L01
	 * @param x - the input array containing products that need to be sorted.
	 */
	public static void sortBasicQuick (  Product[] x ) {
		sort(x,0,x.length-1);
	}
	
	
	
	/**
	 * Three-way partition function, the code is modified based on code in Algorithm 4th Edition pg299.
	 * @author - Sida Wang, L01
	 * @param a - the input array containing Products.
	 * @param low - index of first Product.
	 * @param high - index of last Product.
	 * @see Product#compareTo
	 * @see exch
	 */
	private static void Threesort(Comparable<Product>[] a, int low, int high) {
		if(high <= low) return;
		int lt =low, i = low +1, gt= high;
		Comparable<Product> v = a[low];
		while(i <= gt) {
			int cmp = a[i].compareTo((Product)v);
			if (cmp < 0) exch(a,lt++,i++);
			else if (cmp > 0) exch(a,i,gt--);
			else i++;
		}
		sort(a,low,lt-1);
		sort(a,gt+1,high);
	}
	
	/**
	 * three partition quick sort using Comparable, the code is modified based on code in Algorithm 4th Edition pg289.
	 * @author - Sida Wang, L01
	 * @param x - the input array containing Products that need to be sorted.
	 * @param n - the size of the input array.
	 */
	public static void sortThreePartition ( Comparable<Product>[] x, int n ) {
		Threesort(x,0,x.length-1);
	}

}
