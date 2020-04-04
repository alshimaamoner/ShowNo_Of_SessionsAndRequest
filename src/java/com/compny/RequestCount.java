/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compny;

import com.sun.javafx.scene.EnteredExitedHandler;
import java.io.IOException;
import javafx.event.EventDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;


/**
 *
 * @author DELL
 */
public class RequestCount implements ServletRequestListener{
  
    private int servletRequest=0;
    private ServletContext context = null;

  

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("Request Destroyed");
        servletRequest--;
    }
    
    
     @Override
    public void requestInitialized(ServletRequestEvent sre) {
     
         context=sre.getServletContext();
        // servletRequest=(int) context.getAttribute("requestNumber");
        
          if (context == null) {
    context=sre.getServletRequest().getServletContext();
   }
          ++servletRequest;
          context.setAttribute("requestNumber", servletRequest);
         System.out.println("Request Initialized");
        
    }
    
/* public int getServletRequest() {
  return(servletRequest);
}
  public void setServletRequest(int servletRequest) {
   this.servletRequest=servletRequest;
}
    */
   
   

   
}
