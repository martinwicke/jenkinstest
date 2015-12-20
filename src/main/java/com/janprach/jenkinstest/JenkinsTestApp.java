package com.janprach.jenkinstest;

public class JenkinsTestApp {
	public static String greet(final String name) {
		return "Hello " + name + "!";
	}

	public static void main(final String[] args) {
		System.out.println(JenkinsTestApp.greet("World"));
	}
}
