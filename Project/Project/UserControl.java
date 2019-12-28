public interface UserControl {

	/**
	 * 
	 * @param ID
	 * @param password
	 */
	UserControl(int id , String password){};
	UserControl(int id){};

	void signIn(int ID, String password){
		//take inputs from user
		User obj = new User(int id , String password);
		System.out.println("Enter your ID")
		Scanner input1 = new Scanner(System.in);
		obj.id= input1.nextInt();
		System.out.println("Enter your password")
		Scanner input2 = new Scanner(System.in);
		obj.password = input2.nextLine();


		//check if the ID and password exist
		for (int i; i<3, i++){
			if (isValid(obj.id , obj.password)){ System.out.println("Logged successfully");
				break;
			}else{
				System.out.println("Invalid ID or Password");
				System.out.println("Re-Enter ID & Password")
				Scanner input1 = new Scanner(System.in);
				ID = input1.nextInt();
				Scanner input2 = new Scanner(System.in);
				password = input2.nextLine();
			}
			if (i>=2){
				System.out.println("Invalid data please try again later");
				break;
			}

		}
	};

	/**
	 * 
	 * @param ID
	 * @param password
	 */
	void signUp(int ID, String password);

	/**
	 * 
	 * @param name
	 */
	void addFriend(int ID){
		while (true){
		User obj = new User(int ID);
		System.out.println("User's ID")
		Scanner input = new Scanner(System.in);
		obj.ID = input.nextInt();
		if (isExist(obj.ID)){
			ArraylList<int> friendsList = new ArrayList<int>;
			friendsList.add(obj.ID);
			numberOfFriends++;
			break;
		}else{
			System.out.println("Wrong ID");
		}

	}};

	/**
	 * 
	 * @param name
	 */
	void deleteFriend(String name);

	void subscribeToPremium();

	
	public static void  main(String[] args){

		System.out.println("HEllo");
	};
	
}