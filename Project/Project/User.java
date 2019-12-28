import java.lang.Character.UnicodeScript;
import java.util.ArrayList;
import java.util.Scanner;


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

	User(int id , String password){};
	User(int id){};
	User(String userString){}
	User(){};

	@Override
	public void signIn(User existingUser) {
		//take inputs from user
		User obj = new User( ID ,  password);
		System.out.println("Enter your ID");
		Scanner input1 = new Scanner(System.in);
		obj.ID= input1.nextInt();
		System.out.println("Enter your password");
		Scanner input2 = new Scanner(System.in);
		obj.password = input2.nextLine();


		//check if the ID and password exist
		SystemAuthentication searchObject = new SystemAuthentication();
		for (int i=0; i<3; i++){
			if (searchObject.isValid(obj.ID , obj.password)){ System.out.println("Logged successfully");
				break;
			}else{
				System.out.println("Invalid ID or Password");
				System.out.println("Re-Enter ID & Password");
				Scanner input3 = new Scanner(System.in);
				ID = input3.nextInt();
				Scanner input4 = new Scanner(System.in);
				password = input4.nextLine();
			}
			if (i>=2){
				System.out.println("Invalid data please try again later");
				break;
			}

		}
	}

	

	@Override
	public void signUp(User newUser) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addFriend(int userID) {
		while (true){
			User obj = new User(ID);
			System.out.println("User's ID");
			Scanner input = new Scanner(System.in);
			obj.ID = input.nextInt();
			SystemAuthentication newSearchObject = new SystemAuthentication();
			if (newSearchObject.isExist(obj.ID)){
				ArrayList<Integer> friendsList = new ArrayList<Integer>();
				friendsList.add(obj.ID);
				numberOfFriends++;
				break;
			}else{
				System.out.println("Wrong ID");
			}
	
		}
	}

	@Override
	public void deleteFriend(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public void subscribeToPremium(User Object) {
		User obj = new User(userType);
		obj.userType = Object.userType;
		if (obj.userType == "normal" || obj.userType == "Normal"){
			PremiumUser userObj = new PremiumUser(obj);
		}
		else{
			return;
		}

	}





	

	
	

}