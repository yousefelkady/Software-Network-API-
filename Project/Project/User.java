import java.util.ArrayList;
import java.util.Scanner;


public class User implements UserControl {

	
	private int ID;
	private String password;
	private String name;
	private String gender;
	private String email;
	private String profilePictureLink;
	private String country;
	private String dateOfBirth;
	private int numberOfFriends;
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
	public void signUp() {
		Scanner num = new Scanner(System.in);
		Scanner cin = new Scanner(System.in);
		int id;
		String name , password , gender , email , country , dateOfBirth , profilePictureLink;
		System.out.print("Enter ID : ");        id = num.nextInt();
		System.out.print("Enter Name : ");      name = cin.nextLine();
		System.out.print("Enter Password : ");  password = cin.nextLine();
		System.out.print("Enter Gender : ");    gender = cin.nextLine();
		System.out.print("Enter Email : ");     email = cin.nextLine();
		System.out.print("Enter Country : ");   country = cin.nextLine();
		System.out.print("Enter DOB : ");       dateOfBirth = cin.nextLine();


		if(name.isEmpty() || password.isEmpty() || gender.isEmpty() || email.isEmpty()
				|| dateOfBirth.isEmpty() || id == 0)
		{
			System.out.println("Name, ID, Password, Gender, Email, DOB, Profile picture link are required");
		}
		else
		{
			User user = new User();
			user.ID = id;
			user.name=name;
			user.password=password;
			user.email=email;
			user.country=country;
			user.dateOfBirth= dateOfBirth;
			user.gender=gender;
			user.friendsList = new ArrayList<>();
			user.userType="Normal";
			user.numberOfFriends = 0;

			SystemAuthentication obj = new SystemAuthentication();
			obj.userList = new ArrayList();
			obj.userList.add(user);
			int x = obj.userList.size();
			for (int i=0; i<= x ;i++){
				System.out.println(obj.userList.get(i).ID);
				System.out.println(obj.userList.get(i).name);
				System.out.println(obj.userList.get(i).password);
				System.out.println(obj.userList.get(i).gender);
				System.out.println(obj.userList.get(i).email);
				System.out.println(obj.userList.get(i).country);
				System.out.println(obj.userList.get(i).dateOfBirth);




			}
		}


	}
	
	
	
	@Override
	public Boolean addFriend(int userID) {
		while (true){
			User obj = new User(ID);
			System.out.println("User's ID");
			Scanner input = new Scanner(System.in);
			obj.ID = input.nextInt();
			SystemAuthentication newSearchObject = new SystemAuthentication();
			if (newSearchObject.isExist(obj.ID)){
				
				obj.friendsList.add(obj.friendsList.size(),obj.toString());
				numberOfFriends++;
				break;
				return true;
				
			}else{
				return false;
				break;
			}
	
		}
	}

	
	
	@Override
	public void acceptFriend(User friendRequestObject){
		User myUser = new User();
		if (myUser.friendsList.contains(friendRequestObject)){
			return;
		}
		else{
			myUser.friendsList.add(friendsList.size(),friendRequestObject.toString());
			myUser.numberOfFriends++;

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