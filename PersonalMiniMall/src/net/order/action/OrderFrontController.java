package net.order.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OrderFrontController extends javax.servlet.http.HttpServlet
		implements javax.servlet.Servlet {
	private void execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		String RequestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = RequestURI.substring(contextPath.length());
		System.out.println(command+ "<--- command OrderFrontController");

		ActionForward forward = null;
		Action action = null;
		
		if (command.equals("/goods_order/OrderStart.or")) {
			action  = new OrderStartAction();
			try {
				forward=action.execute(request, response );
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if (command.equals("/goods_order/OrderList.or")) {
			action  = new OrderListAction();
			try {
				forward=action.execute(request, response );
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if (command.equals("/goods_order/OrderAdd.or")) {
			action  = new OrderAddAction();
			try {
				forward=action.execute(request, response );
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if (command.equals("/goods_order/OrderOk.or")){
			forward=new ActionForward();
			forward.setRedirect(false);
			forward.setPath("/goods_order/goods_order_ok.jsp");
		}
       if(forward != null){
		if (forward.isRedirect()) {
			response.sendRedirect(forward.getPath());
		} else {
			RequestDispatcher dispatcher = request.getRequestDispatcher(forward
					.getPath());
			dispatcher.forward(request, response);
		}
       }
	}
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet OrderFrontController");
		execute(request, response);
	}
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost OrderFrontController");
		execute(request, response);
	}
}