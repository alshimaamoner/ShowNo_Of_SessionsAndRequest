/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compny;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Web application lifecycle listener.
 *
 * @author DELL
 */
public class SessionCounter extends HttpServlet implements ServletContextListener, HttpSessionListener {
private int totalSessionCount = 0;
  private int currentSessionCount = 0;
  private ServletContext context = null;
    @Override
    public void contextInitialized(ServletContextEvent sce) {
      //  super.contextInitialized(sce); //To change body of generated methods, choose Tools | Templates.
    }

     
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
       // super.contextDestroyed(sce); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
   totalSessionCount++;
   currentSessionCount++;
   if (context == null) {
    storeInServletContext(se);
   }  
   }
 
        
        
    

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
          currentSessionCount--;
      
    }
    public int getTotalSessionCount() {
  return(totalSessionCount);
}
 
    public int getCurrentSessionCount() {
  return(currentSessionCount);
}
     private void storeInServletContext(HttpSessionEvent event) {
    HttpSession session = event.getSession();
    context = session.getServletContext();
    context.setAttribute("sessionCounter", this);
    //context.setAttribute("requestNumber", getNumberOfRequest());
  
  }

    
  
  

  

}
