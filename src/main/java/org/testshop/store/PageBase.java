package org.testshop.store;

import org.openqa.selenium.support.PageFactory;
import org.testshop.config.TestConfiguration;

public class PageBase {
	protected TestConfiguration config;

	public PageBase(TestConfiguration config) {
		this.config = config;
		PageFactory.initElements(config.getDriver(), this);
	}

	public TestConfiguration getConfig() {
		return config;
	}

}
