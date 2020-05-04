package com.atguigu.maven;

import org.junit.Test;

import junit.framework.Assert;

public class CountTest {
	@Test
	public void testCount() {
		int b=Count.add(4, 10);
		Assert.assertEquals(b, 28);
	}

}
