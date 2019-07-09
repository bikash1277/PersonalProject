package testNGProgram;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

	@DataProvider(name = "dataProvider", parallel=true)
	public Object[][] valuesToTest(Method m) {

		Object[][] values = null;
		if (m.getName().equals("goToFacebook")) {
			values = new Object[][] { { "akanksha24.a@gmail.com", "password1" },
					{ "ashishmishra.manit@gmail.com", "password2" } };
		} else if (m.getName().equals("printName")) {
			values = new Object[][] { { "akanksha" }, { "ashish" }, { "Amita" } };
		}
		return values;
	}

}
