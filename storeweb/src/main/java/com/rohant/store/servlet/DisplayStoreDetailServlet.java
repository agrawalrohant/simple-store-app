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
 * Servlet implementation class DisplayStoreDetailServlet
 */
public class DisplayStoreDetailServlet extends HttpServlet {
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
		Store store = storebo.find(Integer.parseInt(request.getParameter("id")));

		PrintWriter out = response.getWriter();
		out.print("Store Details : ");
		out.print("Store ID : " + store.getId());
		out.print("Store Name : " + store.getName());
		out.print("Store Address : " + store.getDescription());
	}

}
