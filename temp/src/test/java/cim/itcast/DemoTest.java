package java.cim.itcast;

import com.itcast.Demo;
import org.junit.Test;
import org.junit.Assert;

public class DemoTest
{
	public void testSay() {
		Demo d = new Demo();
		String ret = d.say("maven");
		Assert.assertEquals("hello maven", ret);

	}
}




