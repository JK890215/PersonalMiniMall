package net.admin.goods.action;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*@WebServlet("*.ag")
*/
public class AdminGoodsFrontController extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doGet AdminGoodsFrontController.java");
		this.processRequest(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doPost AdminGoodsFrontController.java");
		this.processRequest(request, response);
	}

	private void processRequest(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {
		request.setCharacterEncoding("euc-kr");
		
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());
		System.out.println(command+" <-- command AdminGoodsFrontController.java");

		
		ActionForward forward=null;
		Action action=null;
		if(command.equals("/admingoods/GoodsAddForm.ag")){
			forward = new ActionForward();
			forward.setPath("/admingoods/admin_goods_write.jsp");
		}				
		if(command.equals("/admingoods/GoodsAddAction.ag")){
			action= new AdminGoodsAddAction();
			try {
				forward=action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}		
		}		
		else if(command.equals("/admingoods/GoodsList.ag")){
			action=new AdminGoodsListAction();
			try {
				forward=action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}		
		else if(command.equals("/admingoods/GoodsAdd.ag")){
			forward=new ActionForward();
			forward.setRedirect(false);
			forward.setPath("/admingoods/admin_goods_write.jsp");
		}else if(command.equals("/admingoods/GoodsDelete.ag")){
			action=new AdminGoodsDeleteAction();
			try {
				forward=action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("/admingoods/GoodsModify.ag")){
			action=new AdminGoodsModifyForm();
			try {
				forward=action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("/admingoods/GoodsModifyAction.ag")){
			action=new AdminGoodsModifyAction();
			try {
				forward=action.execute(request, response);
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
}
