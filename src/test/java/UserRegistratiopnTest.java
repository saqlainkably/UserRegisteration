import org.example.CustomException;
import org.example.Main;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.provider.ValueSource;

public class UserRegistratiopnTest {


    @Test
    public void fnameTest() throws CustomException {
        String fname = String.valueOf(Main.fNameValidate("Saqlain"));
        Assert.assertEquals("HAPPY", fname);
    }

    @Test
    public void lnameTest() throws CustomException {
        String lname = String.valueOf(Main.lNameValidate("Kably"));
        Assert.assertEquals("HAPPY", lname);
    }

    @Test
    public void emailTest() throws CustomException {
        String email = String.valueOf(Main.emailValidate("Saqlain.kablyy1@gmail.com"));
        Assert.assertEquals("HAPPY", email);
    }

    @Test
    public void phoneNumberTest() throws CustomException {
        String phoneNumber = String.valueOf(Main.phoneNumberValidate("91 8555829900"));
        Assert.assertEquals("HAPPY", phoneNumber);
    }

    @Test
    public void passwordTest() throws  CustomException{
        String password = String.valueOf(Main.passwordValidate("Saqlain@123"));
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
    void validEmail (String mail) throws CustomException {
        String result= String.valueOf(Main.emailValidate(mail));
        Assert.assertEquals("HAPPY",result);
    }

}
