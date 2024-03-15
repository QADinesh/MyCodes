package com.gitpractice;

public class GitPractice {
	
	private void tc1() {

		System.out.println("tc1");
		System.out.println("Branch2 modification");
		System.out.println("Branch3 modification");


	}
	private void tc2() {
		System.out.println("tc2");

		System.out.println("Branch2 modification");
		System.out.println("Branch3 modification");

	}
	private void tc3() {
		System.out.println("tc3");
		System.out.println("tc3--->After edit");

	}
	
	
	public static void main(String[] args) {
		
		GitPractice gitPractice=new GitPractice();
		gitPractice.tc1();
		
		
	}

}
