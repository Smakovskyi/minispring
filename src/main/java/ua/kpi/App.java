package ua.kpi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.kpi.controller.Controller;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = new AnnotationConfigApplicationContext(
            //Config.class
            "ua.kpi");

        Controller controller = context.getBean(Controller.class);
        controller.process();
        System.out.println( "Hello World!" );
    }
}
