package com.Test;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeSuite;

import com.base.Baseclass;

public class Testclass extends Baseclass {
	@BeforeSuite
	public void SetUp() throws Exception {
		Initialization();
		reportIniIt();

	}
	@org.testng.annotations.Test
	public void Test() {
		Assert.assertTrue( false);
	}
	@org.testng.annotations.Test
	public void Test02() {
		Assert.assertEquals(driver.getTitle(),"JavaByKiran | Log in");
	}@org.testng.annotations.Test

	public void Test03() {
		throw new SkipException("Skip");
	}
}
