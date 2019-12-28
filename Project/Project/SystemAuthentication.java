import java.util.ArrayList;

public class SystemAuthentication {

	private String userName;
	private String userPassword;
	private ArrayList<User> userList;

	/**
	 * 
	 * @param ID
	 * @param password
	 */
	public boolean isValid(int ID, String password) {
		// TODO - implement SystemAuthentication.isValid
		ArrayList<user> arr1 = new ArrayList<user>;
		ArrayList<user> arr2 = new ArrayList<user>;
		boolean ans1 = arr1.contains(ID);
		boolean ans2 = arr2.contains(password);

		if (ans1){return true;
		} else{
			return false;}

		if (ans2){return true;
		}else{
			return false;}
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param name
	 */
	public boolean isExist(int ID) {
		// TODO - implement SystemAuthentication.isExist
		ArrayList<user> arr = new ArrayList<user>;
		boolean ans = arr.contains(ID);
		if (ans){return true;
		}else{
			return false;}

		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ID
	 * @param password
	 */
	public void addUser(int ID, String password) {
		// TODO - implement SystemAuthentication.addUser
		throw new UnsupportedOperationException();
	}

}