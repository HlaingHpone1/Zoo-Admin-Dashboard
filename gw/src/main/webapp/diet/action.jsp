<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%@ page import = "com.csm.DBManager" %>
    <%@ page import = "com.csm.action.Diet" %>
    <%@ page import = "com.csm.manager.DietManager" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />	
		<title>Insert title here</title>
	</head>
		<% 
			String dietType =request.getParameter("diet_type");
			String noOfFeed=request.getParameter("no_of_feeds_per_days");
			
			DBManager dbM=new DBManager();
			dbM.getConnection(); // Get connetion 
			
			Diet d=new Diet(dietType,noOfFeed);
			
			int rowAffected=-1;
			
			DietManager dManager=new DietManager();
			rowAffected=dManager.insert(d);
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