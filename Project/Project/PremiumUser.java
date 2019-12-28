public class PremiumUser extends User {
	boolean paid = true;
	
	PremiumUser(User object){
		User premiumObject = new User(userType);
		premiumObject.userType  = object.userType;
		premiumObject.userType = "Premium";
		becomePremium();
		

	}
	
	public boolean becomePremium() {
		if (payForSubscription() == true)		
		return paid;

		else{
			return false;
		}
	}

	public void createAD() {
		// TODO - implement PremiumUser.createAD
		throw new UnsupportedOperationException();
	}

	public Boolean payForSubscription(){
		//implement payment with external API payment integration
		return true;

	}
}