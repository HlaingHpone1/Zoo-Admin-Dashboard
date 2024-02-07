<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    	<%@ page import = "com.csm.DBManager" %>
    <%@ page import = "com.csm.action.Diet" %>
    <%@ page import = "com.csm.manager.DietManager" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String dietType =request.getParameter("diet_type");
	String noOfFeed=request.getParameter("no_of_feeds_per_days");
	int id = Integer.parseInt(request.getParameter("diet_id"));
	
	Diet d=new Diet(id,dietType,noOfFeed);
	
	int rowAffected=-1;
	
	DietManager dManager=new DietManager();
	rowAffected=dManager.update(d);
	if (rowAffected==1){
		System.out.println("Succefully inserted Diet Data to our databases");
	}
	
	response.sendRedirect("./index.jsp"); 
	%>
</body>
</html>