import org.example.Main;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.provider.ValueSource;

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

    @ParameterizedTest
    @ValueSource(strings = {
            "test.sds@example.co.ij",
            "user.name+tag+sorting@example.com",
            "user.name@example.co.uk",
//            "invalid-email@",
//            "@example.com",
//            "user@.com.my"
    })
    void validEmail (String mail){
        String result= Main.emailValidate(mail);
        Assert.assertEquals("HAPPY",result);
    }


}
