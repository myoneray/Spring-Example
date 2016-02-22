package me.myone.spring.iface.ApplicationContext;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Title:MainTest.java <br>
 * Description:
 *
 * @author Wangming
 * @since 2016年2月22日
 */
public class MainTest {
    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml ");

        AnimalEventService personService = (AnimalEventService) context.getBean("AnimalEventService");

        context.registerShutdownHook();
    }
}
