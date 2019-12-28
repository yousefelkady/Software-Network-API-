public interface MessagingController {

	void sendMessage();

	boolean isSent();

	boolean isRecieved();

	void reply();

}