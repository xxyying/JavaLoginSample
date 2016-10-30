package org.yiying.java;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegServlet
 */
@WebServlet("/RegServlet")
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	StringBuilder csvSkills = new StringBuilder();
    /**
     * Default constructor. 
     */
    public RegServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String fname = request.getParameter("txtFNAME");
		String lname = request.getParameter("txtLName");
		String gender = request.getParameter("rdoGender");
		String email = request.getParameter("txtEmail");
		String state = request.getParameter("cboStates");
		String password = request.getParameter("txtPassword");
		String age = request.getParameter("cboAge");
		String address = request.getParameter("txtarAddress");
		String skill[] = request.getParameterValues("chkSkills");
		
		for(String skills: skill) {
			if(csvSkills.length() > 0) {
				csvSkills.append(",");
				
				csvSkills.append(skills);
			}
			String csvSkill = csvSkills.toString();
			
			GetsSets sets = new GetsSets();
			sets.setFname(fname);
			sets.setLname(lname);
			sets.setGender(gender);
			sets.setEmail(email);
			sets.setPassword(password);
			sets.setState(state);
			sets.setAge(age);
			sets.setAddress(address);
			sets.setSkill(csvSkill);
			
			try {
				DbManager.Insert(sets);
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			} 
			
		}
		
	}

}
