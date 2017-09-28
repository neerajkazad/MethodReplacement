package com.mr.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.mr.beans.PlanFinder;

public class MRTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/mr/common/application-context.xml"));
		PlanFinder pf = factory.getBean("planFinder",PlanFinder.class);
		String[] plans = pf.findPlans(10, 500073, "male", 1, 2, 10);
		/*String[] plans = pf.findPlans(10, 500073, "male");*/
		System.out.println("Matching Plans: ");
		for(String plan: plans) {
			System.out.println(plan);
		}
		
	}
}
