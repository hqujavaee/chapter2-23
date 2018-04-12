package cn.edu.hqu.javaee;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.edu.hqu.javaee.domain.Dessert.Dessert;
import cn.edu.hqu.javaee.domain.Dessert.impl.Child;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=Config.class)
public class Chapter223ApplicationTests {
	
	@Autowired
	private Child child;
	
	@Autowired 
	private Dessert dessert;
	@Test
	public void dessertShouldNotBeNull() {
		assertNotNull(dessert);
	}
	
	@Test
	public void childShouldNotBeNull() {
		assertNotNull(child);
	}
	
	@Test
	public void play() {
		child.consume();;
	}

}
