package com.mr.beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class FindPlansReplacer implements MethodReplacer{

	@Override
	public Object reimplement(Object target, Method method, Object[] args)
			throws Throwable {
		int age = 0;
		int zipCode = 0;
		String gender = null;
		int networkType = 0;
		int coverageType = 0;
		int copay = 0;
		if(method.getName().equals("findPlans")) {
			age = (Integer) args[0];
			zipCode = (Integer) args[1];
			gender = (String) args[2];
			networkType = (Integer) args[3];
			coverageType = (Integer) args[4];
			copay = (Integer) args[5];
		}else {
			new Exception("Method :"+method.getName()+" not supported by replace");
		}
		return new String[] {"medicalPlan1", "medicalPlan2"};
	}

}
