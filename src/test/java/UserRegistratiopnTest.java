import org.example.Main;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistratiopnTest {


    @Test
    public void fnameTest() {
        String fname = Main.fNameValidate("Saqlain");
        Assert.assertEquals("HAPPY", fname);
    }

    @Test
    public void lnameTest() {
        String lname = Main.lNameValidate("Kably");
        Assert.assertEquals("HAPPY", lname);
    }

    @Test
    public void emailTest() {
        String email = Main.emailValidate("Saqlain.kablyy1@gmail.com");
        Assert.assertEquals("HAPPY", email);
    }

    @Test
    public void phoneNumberTest() {
        String phoneNumber = Main.phoneNumberValidate("91 8555829900");
        Assert.assertEquals("HAPPY", phoneNumber);
    }

    @Test
    public void passwordTest() {
        String password = Main.passwordValidate("Saqlain@123");
        Assert.assertEquals("HAPPY", password);
    }
}
