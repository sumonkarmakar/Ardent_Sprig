package a;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Resource res = new ClassPathResource("hello.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		Table t = (Table) factory.getBean("c3");
		t.create();
		System.out.println("done.....");

	}

}
