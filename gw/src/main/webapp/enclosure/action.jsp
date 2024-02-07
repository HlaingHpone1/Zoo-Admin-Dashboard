<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%@ page import = "com.csm.DBManager" %>
    <%@ page import = "com.csm.action.Enclosure" %>
    <%@ page import = "com.csm.manager.EnclosureManager" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />	
		<title>Insert title here</title>
	</head>
		<% 
			
			String enclosureType =request.getParameter("enclosure_type");
			String location=request.getParameter("location");
			
			DBManager dbManager=new DBManager();
			dbManager.getConnection(); // Get connetion 
			
			Enclosure e =new Enclosure(enclosureType,location);
			
			int rowAffected=-1;
			
			EnclosureManager eManager=new EnclosureManager();
			
			rowAffected=eManager.insert(e);
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