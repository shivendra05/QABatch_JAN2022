<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>

//declration tag


<%!Connection con;
	PreparedStatement ps1;
	ResultSet rs;

	public void jspinit() {

		try {
			//config inilization
			ServletConfig config = getServletConfig();
			//read init paramaters
			//get dirver
			String driver = config.getInitParameter("driver");
			//get url
			String url = config.getInitParameter("url");
			//get username
			String uname = config.getInitParameter("uname");
			//get password
			String pws = config.getInitParameter("pws");
			//load class
			Class.forName(driver);
			//create connection
			con = DriverManager.getConnection(url, uname, pws);
			ps1 = con.prepareStatement("SELECT NAME,ENAME,PASSWORD FROM EMPLOYEE");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}%>
<%
	String pval = request.getParameter("s1");
	if (pval.equalsIgnoreCase("link")) {
		rs = ps1.executeQuery();
		while (rs.next()) {
			rs.getString(1);
			rs.getString(2);
			rs.getString(3);
		}
	}
%>


<%!public void distroy() {
		try {
			if (rs != null) {
				rs.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if (ps1 != null) {
				ps1.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if (con != null) {
				con.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}%>


