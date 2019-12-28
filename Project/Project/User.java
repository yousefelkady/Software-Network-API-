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

	UserControl(int id , String password){};
	UserControl(int id){};

	@Override
	public void signIn(User existingUser) {
		//take inputs from user
		User obj = new User( id ,  password);
		System.out.println("Enter your ID");
		Scanner input1 = new Scanner(System.in);
		obj.id= input1.nextInt();
		System.out.println("Enter your password");
		Scanner input2 = new Scanner(System.in);
		obj.password = input2.nextLine();


		//check if the ID and password exist
		for (int i; i<3; i++){
			if (isValid(obj.id , obj.password)){ System.out.println("Logged successfully");
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
	public void addFriend(String name) {
		while (true){
			User obj = new User(ID);
			System.out.println("User's ID");
			Scanner input = new Scanner(System.in);
			obj.ID = input.nextInt();
			if (isExist(obj.ID)){
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