package com.rohant.store.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.rohant.store.bo.StoreBO;

/**
 * Servlet implementation class DeleteStoreServlet
 */
public class DeleteStoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		WebApplicationContext context = WebApplicationContextUtils
				.getRequiredWebApplicationContext(this.getServletContext());
		StoreBO storebo = (StoreBO) context.getBean("storebo");
		storebo.delete(Integer.parseInt(request.getParameter("id")));

		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		
		out.print("Deleted Store..!!");
		out.print("<a href='ViewStoreServlet'>View Stores</a> | ");
		out.println("<br/><br/><a href='store.html'>Add Store</a> | ");
		out.println("<a href='updateStore.html'>Update Store</a> | ");
		out.println("<a href='store.html'>Create Store</a>");
		out.println("</body></html>");
	}

}
