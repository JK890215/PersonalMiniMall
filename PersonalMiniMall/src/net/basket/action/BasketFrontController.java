package net.basket.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 public class BasketFrontController extends javax.servlet.http.HttpServlet 
 		implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   protected void doProcess(HttpServletRequest request, HttpServletResponse response) 
   throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
	   String RequestURI=request.getRequestURI();
	   String contextPath=request.getContextPath();
	   String command=RequestURI.substring(contextPath.length());
	   System.out.println(command + " <--- command BasketFrontController.java");

	   ActionForward forward=null;
	   Action action=null;
	   
	   if(command.equals("/goods/BasketList.ba")){
		   action  = new BasketListAction();
		   try {
			   forward=action.execute(request, response );
		   } catch (Exception e) {
			   e.printStackTrace();
		   }
	   }else if(command.equals("/goods/BasketAdd.ba")){
		   action  = new BasketAddAction();
		   try {
			   forward=action.execute(request, response );
		   } catch (Exception e) {
			   e.printStackTrace();
		   }
	   }else if(command.equals("/goods/BasketDelete.ba")){
		   action=new BasketDeleteAction();
		   try {
			   forward=action.execute(request, response );
		   } catch (Exception e) {
			   e.printStackTrace();
		   }
	   }
	   if(forward != null){
	   if(forward.isRedirect()){
		   response.sendRedirect(forward.getPath());
	   }else{
		   RequestDispatcher dispatcher=
			   request.getRequestDispatcher(forward.getPath());
		   dispatcher.forward(request, response);
	   }
	   }
   }
   
   protected void doGet(HttpServletRequest request, HttpServletResponse response) 
   throws ServletException, IOException {
	   System.out.println("doGet BasketFrontController.java");
		doProcess(request,response);
	}  	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		System.out.println("doPost BasketFrontController.java");
		doProcess(request,response);
	}   	  	    
}