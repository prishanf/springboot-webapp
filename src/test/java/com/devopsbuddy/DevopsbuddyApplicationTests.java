package com.devopsbuddy;

import java.util.Locale;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.devopsbuddy.web.i18n.I18Service;



@RunWith(SpringRunner.class)
@SpringBootTest
public class DevopsbuddyApplicationTests {

	@Autowired
	private I18Service i18Service;
	
	@Test
	public void testMessageByLocalService() throws Exception{
		String expectedResult = "Bootstrap starter template";
		String messageId = "index.main.callout";
		String actual = i18Service.getMessage(messageId);
		Assert.assertEquals("The Actual expected String don't match",expectedResult, actual);
		
		String actual1 = i18Service.getMessage(messageId,Locale.FRENCH);
		System.out.println("actual"+ actual);
		String expected = "Bootstrap starter template FR";
		System.out.println("expected"+ expected);
		Assert.assertEquals("The Actual expected String don't match",expected, actual1);
		
	}

}
