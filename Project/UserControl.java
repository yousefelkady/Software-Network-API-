public interface UserControl {


	void signIn(User existingUser);

	
	void signUp(User newUser);


	void addFriend(String name);


	void deleteFriend(String name);

	void subscribeToPremium();

	
	public static void  main(String[] args){

		System.out.println("HEllo");
	};
	
}
