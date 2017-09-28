package com.mr.beans;

public class PlanFinder {
	
	public String[] findPlans(int age,int zipCode,String gender,int networkType,int coverageType,int copay) {
		return new String[] {"plan1", "plan2"};
	}
	
	public String[] findPlans(int age,int zipCode,String gender) {
		return new String[] {"plan3","plan4"};
	}
	
	
}
