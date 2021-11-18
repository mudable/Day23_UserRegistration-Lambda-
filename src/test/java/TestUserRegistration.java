import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.bridgelabz.lambda.UserRegistration;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestUserRegistration {

	private boolean expected_Result;
	private String email;
	private UserRegistration user;

	public TestUserRegistration(boolean expected_Result, String email) {
		this.expected_Result = expected_Result;
		this.email = email;
	}

	@Before
	public void initialize() {
		user = new UserRegistration();
	}

	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] { { true, "abc.zxy@yahoo.com.in" }, { true, "abc.100@yahoo.com" },
				{ true, "abc111@abc.com" }, { true, "abc-100@yahoo.net" }, { true, "abc.100@abc.com.au" },
				 { true, "abc@.com.my" }, { false, "abc()*@gmail.com" },
				{ false, ".abc@abc.com" }, { false, ".abc@abc.com" } });
	}

	@Test
	public void givenAEmailPatternWhenMatchedShouldReturnTrue() {
		Assert.assertEquals(expected_Result, user.Email(email));
	}
}