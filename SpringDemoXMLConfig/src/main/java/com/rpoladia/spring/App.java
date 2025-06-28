package com.rpoladia.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );

        //Old method: BeanFactory
        //New method: ApplicationContext (BeanFactory + some more features)
        //ApplicationContext is interface which is like a super set of BeanFactory
        //Since, this is a classpath xml app context, it will look for the config in class path which is under 'main' directory.
        //Hence, spring.xml file is under resources folder which is under main folder.
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        //Alien obj = (Alien) context.getBean("alien");

        //Get bean by Type (Unlike search by name, no need to type cast)
        Alien obj = context.getBean("alien", Alien.class);

        //Setter injection
        //obj.setAge(21);
        System.out.println(obj.getAge());
        obj.code();

        //By default, the scope is singleton, so that the bean is created only once and same instance is used through the application
        //Alien obj2 = (Alien) context.getBean("alien");
        //System.out.println(obj2.getAge());
        //obj2.code();

        //Desktop obj3 = (Desktop) context.getBean("com2");

        //No need to provide the name/id of the bean if getting the bean by Type.
        //Desktop obj4 = context.getBean(Desktop.class);

        //In case of getting the bean using Interface type then use the primary attribute of the bean.
        //Computer com = context.getBean(Computer.class);

        //Innerbeans
        //This won't work as the Laptop bean is an inner bean of Alien bean
        //Laptop lap = context.getBean(Laptop.class);
    }
}
