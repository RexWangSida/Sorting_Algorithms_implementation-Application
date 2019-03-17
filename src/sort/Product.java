package sort;
/**
 * This class generates an ADT Product.
 * @author - Sida Wang, L01
 * @version 1.0
 * @since 2019-02-17
 */
public class Product implements Comparable<Product>{
	/**
	 * instance variables
	 */
	private String ID;
	private int sales_amount;
	//Construct a product
	/**
	 * Constructor.
	 * @author - Sida Wang, L01
	 * @param ID - a string representing Product ID.
	 * @param sales_amount - an integer representing Product sales amount.
	 */
	public Product(String ID, int sales_amount) {
		this.ID = ID;
		this.sales_amount = sales_amount;
	}
	
	//Retrieve the sales amount of a product
	/**
	 * Function that retrieves the sales amount of a Product.
	 * @author - Sida Wang, L01
	 * @return - sales_amount of a Product
	 */
	public int Get_sales_amount() {
		return sales_amount;
	}
	
	//Set the sales amount of a product
	/**
	 * Function that set the sales amount of a Product.
	 * @author - Sida Wang, L01
	 * @param amount - an integer representing Product sales amount.
	 */
	public void  Set_amount(int amount) {
		this.sales_amount = amount;
	}
	
	//Retrieve a product ID
	/**
	 * Function that retrieves  a Product ID.
	 * @author - Sida Wang, L01
	 * @return - ID of a Product
	 */
	public String Get_product_ID() {
		return ID;
	}
	
	//String representation of an product
	/**
	 * Function that retrieves a string representation of an Product.
	 * @author - Sida Wang, L01
	 * @return - a string representation of an Product.
	 */
	public String str_rep() {
		return ('{' + ID + ',' + sales_amount + '}');
	}
	
	//compareTo function
	/**
	 * Method to compare object Product with another Product
	 * @author - Sida Wang, L01
	 * @param j - a Product ADT.
	 * @return - an integer representing the result of comparison.
	 */
	@Override
	public int compareTo(Product j)
	{
		//TODO
		if(this.sales_amount > j.sales_amount) return 1;
		else if(this.sales_amount < j.sales_amount) return -1;
		else{
			return this.ID.compareTo(j.ID);
		}
	}


}
