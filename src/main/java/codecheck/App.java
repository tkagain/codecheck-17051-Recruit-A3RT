package codecheck;

import codecheck.mypackage.MyUtil;

public class App {
	public static void main(String[] args) {
		System.out.println(
				MyUtil.getImageInfluence(System.getenv("API_KEY_INFLUENCE"), "/root/codecheck/images/sample.jpg"));
	}
}
