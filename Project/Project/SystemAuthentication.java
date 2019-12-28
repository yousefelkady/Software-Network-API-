import java.util.ArrayList;

public class SystemAuthentication {

	private String userName;
	private String userPassword;
	public ArrayList<User> userList;

	/**
	 * 
	 * @param ID
	 * @param password
	 */
	public boolean isValid(int ID, String password) {
		// TODO - implement SystemAuthentication.isValid
		ArrayList<User> arr1 = new ArrayList<User>();
		boolean ans1 = arr1.contains(ID);

		if (ans1){return true;
		} else{
			return false;
		}
	}

	
	public boolean isExist(int ID) {
		// TODO - implement SystemAuthentication.isExist
		ArrayList<User> arr = new ArrayList<User>();
		boolean ans = arr.contains(ID);
		if (ans){return true;
		}else{
			return false;
		}
	}


	public void addUser(int ID, String password) {
		// TODO - implement SystemAuthentication.addUser
		throw new UnsupportedOperationException();
	}

}