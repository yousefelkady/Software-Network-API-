import java.util.ArrayList;

public class Group implements GroupController {

	private String groupName;
	private String groupType;
	private String dateCreated;
	private int followersNumber;
	private int numberOfPosts;
	private ArrayList<String> membersName;

	@Override
	public void createGroup(String groupName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addMember(String memberName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeMember(String memberName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addPost() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePost() {
		// TODO Auto-generated method stub

	}

	@Override
	public User searchForMember(String memberName) {
		// TODO Auto-generated method stub
		return null;
	}

}