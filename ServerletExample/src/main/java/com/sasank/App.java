package com.sasank;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws LifecycleException {

        System.out.println( "Hello World!" );
        Tomcat tomcat=new Tomcat();

        Context context= tomcat.addContext("",null);
        Tomcat.addServlet(context,"HS",new HelloServlet());
        context.addServletMappingDecoded("/hello","HS");

        tomcat.start();
        tomcat.getServer().await();


    }
}
