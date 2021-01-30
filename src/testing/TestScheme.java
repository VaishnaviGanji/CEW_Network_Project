package testing;

import static org.junit.Assert.*;
import org.junit.Test;
import model.Scheme;

public class TestScheme {
	Scheme post = new Scheme("Post1", "Description of the post", "#happy", "", "contact 9876543210");
	@Test
	public void testSetterGetter() {
		assertEquals("Post1", post.getTitle());
		assertEquals("Description of the post", post.getDescription());
		assertEquals("work experience", post.getType());
		assertEquals("#happy", post.getTag());
		assertEquals("", post.getImageURL());
		try {
			post.setDescription(null);
			post.setTag(null);
			post.setTitle(null);
			post.setTimestamp(null);
			post.setType(null);
			post.setImageURL(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
