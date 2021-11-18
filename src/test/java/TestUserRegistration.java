import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.bridgelabz.lambda.UserRegistration;

class TestUserRegistration {
	UserRegistration userRegistration = new UserRegistration();

	@Test
	public void givenFirstName_WhenInFormat_ShouldReturnTrue() {
		boolean result = userRegistration.Name("Shilpa");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenFirstName_WhenOurOfFormat_ShouldReturnFlase() {
		boolean result = userRegistration.Name("shilpa");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenLastName_WhenInFormat_ShouldReturnTrue() {
		boolean result = userRegistration.LastName("Mudable");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenLastName_WhenOurOfFormat_ShouldReturnFalse() {
		boolean result = userRegistration.LastName("mudable");
		Assert.assertEquals(false, result);

	}

	@Test
	public void givenEmail_WhenInFormat_ShouldReturnTrue() {
		boolean result = userRegistration.Email("abc@gmail.com.com");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenEmail_WhenOurOfFormat_ShouldReturnFalse() {
		boolean result = userRegistration.Email("abc()*@gmail.com");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenPhoneNumber_WhenInFormat_ShouldReturnTrue() {
		boolean result = userRegistration.Number("91 9604315270");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPhoneNumber_WhenOurOfFormat_ShouldReturnFlase() {
		boolean result = userRegistration.Number("+91 9604315270");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenPassword_WhenInFormat_ShouldReturnFalse() {
		boolean result = userRegistration.Password("abcdegfhij");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenPassword_WhenOurOfFormat_ShouldReturnFalse() {
		boolean result = userRegistration.Password("abcd");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenPasswordRule2_WhenOurOfFormat_ShouldReturnFalse() {
		boolean result = userRegistration.Password("abcdefghij");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail3_WhenInFormat_ShouldReturnTrue() {
		boolean result = userRegistration.Email("abc.100@abc.com.au");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenEmail3_WhenOurOfFormat_ShouldReturnFalse() {
		boolean result = userRegistration.Email("abc()*@gmail.com");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail4_WhenInFormat_ShouldReturnTrue() {
		boolean result = userRegistration.Email("abc@1.com");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenEmail4_WhenOurOfFormat_ShouldReturnFalse() {
		boolean result = userRegistration.Email("aabc.@gmail.com");
		Assert.assertEquals(false, result);
	}
}
