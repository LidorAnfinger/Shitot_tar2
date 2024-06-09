import java.util.ArrayList;

/** SharedData class represent array of integers 
 * @author Lidor Anfinger
 * @version Jun 9, 2024. 
 */
public class SharedData 
{
	/** array of integer, type ArrayList*/
	private ArrayList<Integer> array;
	/** array of boolean*/
	private boolean [] winArray;
	/** boolean flag represent found value*/
	private boolean flag;
	/** integer represent the value to find in array*/
	private final int b;
	/** Constructor for ShareData class
	 * @param array				array of integers
	 * @param b 				represent the number we want to find
	 * @return					Object of the class
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		this.array = array;
		this.b = b;
	}
	
	/** Getter for the variable winArray*/
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/** Setter for the variable winArray
	 * @param winArray		boolean array of winArray
	 * @return 				void method
	 * */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/** Getter for the variable array */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	/** Getter for the variable b*/
	public int getB() 
	{
		return b;
	}

	/** Getter for the variable flag*/
	public boolean getFlag() 
	{
		return flag;
	}

	/** Setter for the variable flag
	 * @param flag 		boolean value of flag
	 * @return			void method  
	 * */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
