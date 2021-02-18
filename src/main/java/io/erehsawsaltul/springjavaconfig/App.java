package io.erehsawsaltul.springjavaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Service dao = context.getBean(Service.class);
        Service dao2 = context.getBean(Service.class);
        System.out.println(dao.hashCode());
        System.out.println(dao2.hashCode());
        //dao.save();
        //dao.destroy();
        //dao2.destroy();
        context.close();
    }
}
