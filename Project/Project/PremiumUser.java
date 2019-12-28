public class PremiumUser extends User {

	
	PremiumUser(User object){
		User premiumObject = new User(userType);
		premiumObject.userType  = object.userType;
		premiumObject.userType = "Premium";
		becomePremium();

	}
	
	public boolean becomePremium() {
		
		return true;	
	}

	public void createAD() {
		// TODO - implement PremiumUser.createAD
		throw new UnsupportedOperationException();
	}

}