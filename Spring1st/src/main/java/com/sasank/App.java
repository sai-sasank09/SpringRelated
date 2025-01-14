package com.sasank;
import com.sasank.Config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);

        Desktop obj=context.getBean(Desktop.class);
        obj.compile();
        Alien obj1=(Alien) context.getBean(Alien.class);

        System.out.println(obj1.getAge());
        obj1.code();



//        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
//        Alien obj1=(Alien) context.getBean("alien");
////        obj1.setAge(21);
//        System.out.println(obj1.getAge());
//        obj1.code();
////        Laptop lapObj= (Laptop) context.getBean("lapy");

    }
}
