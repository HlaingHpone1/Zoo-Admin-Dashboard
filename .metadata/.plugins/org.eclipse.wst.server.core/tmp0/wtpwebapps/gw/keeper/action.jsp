<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%@ page import = "com.csm.DBManager" %>
    <%@ page import = "com.csm.action.Keepers" %>
    <%@ page import = "com.csm.manager.KeepersManager" %>
    <%@ page import = "java.util.Date" %>
    <%@ page import = "java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />	
		<title>Insert title here</title>
	</head>
		<% 
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		
			String keeperName = request.getParameter("keepers_name");
			String dateOfBirth = request.getParameter("dob");
			Date dob = formatter.parse(dateOfBirth);
			String keeperRank = request.getParameter("keeper_rank");
			
			DBManager dbManager=new DBManager();
			dbManager.getConnection(); // Get connetion 
			
			Keepers k = new Keepers(keeperName, dob, keeperRank);
			
			int rowAffected=-1;
			
			KeepersManager kManager=new KeepersManager();
			rowAffected=kManager.insert(k);
			if (rowAffected==1){
				System.out.println("Succefully inserted Diet Data to our databases");
			}
			
			
		%>
		<%
			response.sendRedirect("./thanks.jsp"); 
		%>
	<body>
	
	</body>
</html>