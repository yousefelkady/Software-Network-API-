import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class UserTest {



    @Test
    public void signUp() {
       User user = new User();
       SystemAuthentication s = new SystemAuthentication();
       Assert.assertEquals(s.userList.size()+1,s.userList.size());
    }


    @Test
    public void addFriend() {
        User user = new User();
        boolean x = user.addFriend(1);
        //Assert.assertEquals(true,x);
        Assert.assertTrue(x);

    }

    @Test
    public void acceptFriend() {
        User user = new User();
        SystemAuthentication s = new SystemAuthentication();
        assertEquals(user.friendsList.size()+1,user.friendsList.size());
    }
}