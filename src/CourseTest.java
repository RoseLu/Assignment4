

//this test includes student&course
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CourseTest {

	@Test
	public void test() {
		Course a=new Course("java");
		Student s = new Student("chichi", 12);
		a.registerStudent(s);
		Assert.assertEquals(1, a.getNumberOfStudent());
		
	}
	
	@Test
	public void test2() {
		Course a=new Course("java");
		Student s = new Student("chichi", 12);
		for(int i=0; i<10;i++){
			a.registerStudent(s);
		}
		
		Assert.assertTrue(a.isFull());
		
	}

}
