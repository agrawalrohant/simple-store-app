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
import com.rohant.store.dto.Store;

/**
 * Servlet implementation class UpdateStoreServlet
 */
public class UpdateStoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Integer id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String description = request.getParameter("address");

		Store store = new Store();
		store.setDescription(description);
		store.setId(id);
		store.setName(name);

		WebApplicationContext context = WebApplicationContextUtils
				.getRequiredWebApplicationContext(this.getServletContext());
		StoreBO storebo = (StoreBO) context.getBean("storebo");
		storebo.update(store);

		PrintWriter out = response.getWriter();
		out.println("<html><body>");

		out.print("Store Updated...!!!");
		out.print("<a href='ViewStoreServlet'>View Stores</a> | ");
		out.println("<br/><br/><a href='store.html'>Add Store</a> | ");
		out.println("<a href='deleteStore.html'>Delete Store</a> | ");
		out.println("<a href='store.html'>Create Store</a>");
		out.println("</body></html>");
	}

}
