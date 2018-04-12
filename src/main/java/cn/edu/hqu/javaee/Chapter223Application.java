package cn.edu.hqu.javaee;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cn.edu.hqu.javaee.domain.Dessert.impl.Child;

public class Chapter223Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		Child child=context.getBean(Child.class);
		child.consume();
		context.close();
	}
}
