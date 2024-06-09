import java.util.ArrayList;

/** SharedData class represent array of integers 
 * @author Lidor Anfinger
 * @version June 9, 2024. 
 */
public class SharedData 
{
	/** array of integer, type ArrayList*/
	private ArrayList<Integer> array;
	/** array of boolean values*/
	private boolean [] winArray;
	/** boolean flag represent found value*/
	private boolean flag;
	/** integer represent the value to find in array*/
	private final int b;
	/** Constructor for ShareData class
	 * @param array				array of integers
	 * @param b 				represent the number we want to find
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		this.array = array;
		this.b = b;
	}
	
	/** Getter for the variable winArray
	 * @return 		boolean array
	 * */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/** Setter for the array winArray
	 * @param winArray		boolean array of winArray
	 * */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/** Getter for the variable array 
	 * @return 		List that represents the array
	 * */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	/** Getter for the variable b
	 * @return 		integer
	 * */
	public int getB() 
	{
		return b;
	}

	/** Getter for the variable flag
	 * @return 			boolean
	 * */
	public boolean getFlag() 
	{
		return flag;
	}

	/** Setter for the variable flag
	 * @param flag 		boolean value of flag 
	 * */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
