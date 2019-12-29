public interface UserControl {


	void signIn(User object);

	void signUp();

	Boolean addFriend(int ID);

    void acceptFriend(User friendRequestObject);
	
	void deleteFriend(String name);

	void subscribeToPremium(User Object);

	
	public static void  main( String[] args) {

		System.out.println("HEllo");
	};
	
}