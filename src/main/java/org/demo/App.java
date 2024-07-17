package org.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Dev o = context.getBean(Dev.class);
        o.build();
        laptop h =context.getBean(laptop.class);
        h.compiler();

    }
}
