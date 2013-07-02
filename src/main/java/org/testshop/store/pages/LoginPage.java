package org.testshop.store.pages;

import org.testshop.config.TestConfiguration;
import org.testshop.store.IPage;
import org.testshop.store.PageBase;

public class LoginPage extends PageBase implements IPage<LoginPage> {

	public LoginPage(TestConfiguration config) {
		super(config);
	}

	public LoginPage get() {
		getConfig().getDriver().get("http://selenium.polteq.com/testshop/index.php?controller=authentication");
		return this;
	}

}
