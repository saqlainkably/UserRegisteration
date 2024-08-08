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
        String lname = Main.fNameValidate("Kably");
        Assert.assertEquals("HAPPY", lname);
    }

    @Test
    public void emailTest() {
        String email = Main.fNameValidate("Saqlain");
        Assert.assertEquals("HAPPY", email);
    }

    @Test
    public void phoneNumberTest() {
        String phoneNumber = Main.fNameValidate("Saqlain");
        Assert.assertEquals("HAPPY", phoneNumber);
    }

    @Test
    public void passwordTest() {
        String password = Main.fNameValidate("Saqlain");
        Assert.assertEquals("HAPPY", password);
    }

}
