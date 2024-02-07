<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
         <%@ page import = "com.csm.DBManager" %>
     <%@ page import = "com.csm.action.Species" %>
     <%@ page import = "com.csm.manager.SpeciesManager" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
		int id = Integer.parseInt(request.getParameter("id"));
		
		DBManager dbManager = new DBManager();
		dbManager.getConnection();
		
		SpeciesManager sManager = new SpeciesManager();
		sManager.Delete(id);
		
		response.sendRedirect("./index.jsp");
	%>
</body>
</html>