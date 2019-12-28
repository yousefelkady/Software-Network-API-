public interface GroupController {

	/**
	 * 
	 * @param groupName
	 */
	void createGroup(String groupName);

	/**
	 * 
	 * @param memberName
	 */
	void addMember(String memberName);

	/**
	 * 
	 * @param memberName
	 */
	void removeMember(String memberName);

	void addPost();

	void deletePost();

	/**
	 * 
	 * @param memberName
	 */
	User searchForMember(String memberName);

}