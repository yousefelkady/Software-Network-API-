import java.util.ArrayList;


public class User implements UserControl {

	
	private int ID;
	private String password;
	private String name;
	private String gender;
	private String profilePictureLink;
	private int numberOfFriends;
	private int numberOfFrineds;
	private ArrayList<String> friendsList;
	public String userType;


	@Override
	public void signIn(User existingUser) {
		// TODO Auto-generated method stub

	}

	@Override
	public void signUp(User newUser) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addFriend(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteFriend(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public void subscribeToPremium(User Object) {
		User obj = new User();
		obj = object;
		if (obj.userType == "normal" || obj.userType == "Normal"){
			PremiumUser(obj);
		}
		else{
			return;
		}

	}

	

	
	

}