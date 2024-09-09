package anhduy.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/home", "/trangchu" })
public class HomeController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		RequestDispatcher rd = req.getRequestDispatcher("/home");
		rd.forward(req, resp);

		resp.sendRedirect("index.html");

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Set response content type
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");

		resp.setContentType("text/html");

		// Nhận dữ liệu từ request URL
		String ten = req.getParameter("ten");
		String holot = req.getParameter("holot");
		
		req.setAttribute("ten1", ten);
		
		RequestDispatcher rd = req.getRequestDispatcher("view/home.jsp");
		rd.forward(req, resp);
	}
}
