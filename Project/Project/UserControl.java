public interface UserControl {




	void signIn(User object);


	void signUp(User Object);


	void addFriend(int ID);

	
	void deleteFriend(String name);

	void subscribeToPremium(User Object);

	
	public static void  main(String[] args){

		System.out.println("HEllo");
	};
	
}