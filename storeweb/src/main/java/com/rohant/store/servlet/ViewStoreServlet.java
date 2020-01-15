package com.rohant.store.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.rohant.store.bo.StoreBO;
import com.rohant.store.dto.Store;

/**
 * Servlet implementation class ViewStoreServlet
 */
public class ViewStoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		WebApplicationContext context = WebApplicationContextUtils
				.getRequiredWebApplicationContext(this.getServletContext());
		StoreBO storebo = (StoreBO) context.getBean("storebo");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		List<Store> allStores = storebo.getAllStores();
		for (int i = 0; i < allStores.size(); i++) {
			
			out.print("<br/>Store Id : "+ allStores.get(i).getId() + "<br/>");
			out.print("Store Name : "+ allStores.get(i).getName()+ "<br/>");
			out.print("Store Description : "+ allStores.get(i).getDescription() + "<br/>");
			out.print("----------------------------------");
			
		}
		out.println("<br/><br/><a href='store.html'>Add Store</a> | ");
		out.println("<a href='updateStore.html'>Update Store</a> | ");
		out.println("<a href='deleteStore.html'>Delete Store</a>");
		out.println("</body></html>");
	}

}
