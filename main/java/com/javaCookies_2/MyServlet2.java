package com.javaCookies_2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet2
 */
@WebServlet("/MyServlet2")
public class MyServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		  try{
		       response.setContentType("text/html");
		       PrintWriter pwriter = response.getWriter();
		 
		       //Reading cookies
		       Cookie c[]=request.getCookies(); 
		       //Displaying User name value from cookie
		       pwriter.print("Name: "+c[1].getValue()); 
		       //Displaying user password value from cookie
		       pwriter.print("Password: "+c[2].getValue());
		 
		       pwriter.close();
		    }catch(Exception exp){
		       System.out.println(exp);
		     }
		  }
		}



