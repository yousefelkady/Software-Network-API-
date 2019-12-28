import java.util.ArrayList;


public class User implements UserControl {

	private String email;
	private String name;
	private String gender;
	private String profilePictureLink;
	private int numberOfFriends;
	private ArrayList<String> friendsList;
	private String userType;

	User(int id , String password){};
	User(int id){};

	@Override
	public void signIn(int ID, String password) {
		// TODO Auto-generated method stub
	}

	@Override
	public void signUp(int ID, String password) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addFriend(int ID) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteFriend(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public void subscribeToPremium() {
		// TODO Auto-generated method stub

	}


	
	

}