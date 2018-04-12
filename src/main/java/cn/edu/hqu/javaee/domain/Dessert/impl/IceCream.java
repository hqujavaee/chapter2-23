package cn.edu.hqu.javaee.domain.Dessert.impl;

import org.springframework.stereotype.Component;

import cn.edu.hqu.javaee.domain.Dessert.Dessert;

@Component
public class IceCream implements Dessert {
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("吃冰激凌");
		
	}

}
