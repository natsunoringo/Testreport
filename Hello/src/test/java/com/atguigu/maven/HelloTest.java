package  com.atguigu.maven;
import  org.junit.Test;
import  static junit.framework.Assert.*;
public  class HelloTest {
     @Test
     public void  testHello() {
	Hello hello = new Hello();
	String results =hello.sayHello("litingwei");
	assertEquals("Hello litingwei!" , results);
	}
}	