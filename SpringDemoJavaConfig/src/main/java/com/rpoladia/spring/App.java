package com.rpoladia.spring;

import com.rpoladia.spring.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        //Starting with Java configuration
        //Desktop dt = context.getBean(Desktop.class);
        //dt.compile();

        /*
            By default, the name of the bean is the method name
         */
        //Desktop dt = context.getBean("desktop1", Desktop.class);
        //Desktop dt2 = context.getBean(Desktop.class);

        Alien obj1 = context.getBean(Alien.class);
        System.out.println(obj1.getAge());
        obj1.code();
    }
}
