package testing;

import static org.junit.Assert.*;
import org.junit.Test;
import model.User;

public class TestUser {
	User user = new User("Rama", "Krishna", "r@ma1234", "Developer", 
			"Thought Works", "rama@gmail.com");
	@Test
	public void testSetterGetter() {
		assertEquals("Rama", user.getFirstName());
		assertEquals("Krishna", user.getLastName());
		assertEquals("r@ma1234", user.getPassword());
		assertEquals("rama@gmail.com",user.getEmailId());
		assertEquals("Developer",user.getDesignation());
		assertEquals("Thought Works", user.getCompany());
		try {
			user.setFirstName(null);
			user.setLastName(null);
			user.setCompany(null);
			user.setDesignation(null);
			user.setEmailId(null);
			user.setPassword(null);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
