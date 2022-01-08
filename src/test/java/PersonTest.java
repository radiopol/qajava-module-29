import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PersonTest {

	@DataProvider(name = "ageProvider")
	Object[][] ageDataProvider() {
		return new Object[][] {
			{12, false},
			{13, true},
			{14, true},
			{18, true},
			{19, true},
			{20, false},
		};
	}

	@Test(dataProvider = "ageProvider")
	public void testTeenager(int age, boolean expected) {
		boolean result = Person.isTeenager(age);
		assert result == expected;
	}
}
