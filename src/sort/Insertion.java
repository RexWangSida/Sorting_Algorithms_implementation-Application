package sort;
/**
 * This class including Regular insertion sort, comparable insertion sort, and insertion sort using binary search to find swap element index methods.
 * @author - Sida Wang, L01
 * @version 1.0
 * @since 2019-02-17
 */
public class Insertion {
	
	/**
	 * The function to check if an array with Products is sorted, the code is modified based on code in Algorithm 4th Edition pg245.
	 * @author - Sida Wang, L01
	 * @param x - the input array containing Products.
	 * @return - a boolean, where True if the array is in ascending order and False if not.
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
		Comparable<Product> t = a[i]; a[i] = a[j]; a[j] = t;
	}
	/**
	 * regular insertion sort without using compareTo
	 * @author - Sida Wang, L01
	 * @param x - the input array containing Products that need to be sorted.
	 */
	public static void sortInsert( Product[] x ) {
		
		String first = new String();
		String second = new String();
		int N = x.length;
		for (int i = 1; i < N; i++) {
			for(int j = i; j> 0; j-- ) {
				
				if(x[j].Get_sales_amount() > x[j-1].Get_sales_amount())
					break;
				else if(x[j].Get_sales_amount() == x[j-1].Get_sales_amount()) {
					first = x[j-1].Get_product_ID();
					second = x[j].Get_product_ID();
					int compare = 0;
					for (int index = 0; index < first.length() && index < second.length(); index++) {
						int a = first.charAt(index);
						int b = second.charAt(index);

						if(a > b) {
							compare = 1;
							break;
						}
						if(a < b) {
							compare = -1;
							break;
						}
					}
					if(compare < 0)
						break;
				}
				
				Product temp = x[j];
				x[j] = x[j-1];
				x[j-1] = temp;
			}
		}
}
	
	
	
	
	/**
	 * Binary search function, the code is modified based on code in Algorithm 4th Edition pg251.
	 * @author - Sida Wang, L01
	 * @param a - the array of Products to be searched in.
	 * @param low - the first index that the product that can be possibly inserted in.
	 * @param product - the element to be inserted.
	 * @param high - the last index that the product that can be possibly inserted in.
	 * @return - An integer representing the array index where the Product is to be inserted.
	 * @see Product#compareTo
	 */
	private static int BS(Comparable<Product>[] a, int low, Comparable<Product> product, int high ) {
		int mid = low + (high - low) /2;
		if(high <= low) {
			if(product.compareTo((Product)a[low]) > 0)
				return low+1;
			return low;
		}
		if(((Product)a[mid]).Get_sales_amount() == ((Product)product).Get_sales_amount())
			if(product.compareTo((Product)a[low]) == 0)
				return mid+1;
		
		if(product.compareTo((Product)a[mid]) < 0)
			return BS(a,low, product,mid-1);
		else
			return  BS(a,mid+1, product,high);
			
		
	}
	
	/**
	 * insertion sort using Comparable, the code is modified based on code in Algorithm 4th Edition pg251.
	 * @author - Sida Wang, L01
	 * @param x - the input array containing Products that need to be sorted.
	 * @param n - the size of the input array
	 * @see Product#compareTo
	 * @see exch
	 */
	public static void sortComparable ( Comparable<Product>[] x, int n ) {
		for	(int i = 1; i < n; i++) {
			for (int j =i; j > 0 && x[j].compareTo((Product)x[j-1])<0; j--) {
				exch(x,j,j-1);
			}
				
		}
	}
	/**
	 * optimized insertion sort using Binary search
	 * @author - Sida Wang, L01
	 * @param x - the input array containing Products that need to be sorted.
	 * @param n - the size of the input array
	 */
	public static void sortBinary ( Comparable<Product>[] x, int n ) {
		for	(int i = 1; i < n; i++) {
			Comparable<Product> tmp = x[i];
			int index = BS(x,0,tmp,i-1);
			int j;
			for (j = i - 1; j >= index; j--) {
				x[j+1] = x[j];
			}
				
			x[j+1] = tmp;
			
		}
	}
}
