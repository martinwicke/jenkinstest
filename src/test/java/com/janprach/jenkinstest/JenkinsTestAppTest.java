package com.janprach.jenkinstest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class JenkinsTestAppTest {
	@Test
	public void greetGivenPerson() {
		assertEquals("Hello foo!", JenkinsTestApp.greet("foo"));
	}
}
