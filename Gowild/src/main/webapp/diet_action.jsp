<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import = "com.connection.DBManager" %>
     <%@ page import = "com.csm.entity.Diet" %>
     <%@ page import = "com.csm.dao.DietManager" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
String dietType =request.getParameter("dietType");
String noofFeed=request.getParameter("noOfFeed");
System.out.println("dietType" + dietType);
System.out.println("noofFeed" + noofFeed);

DBManager dbM=new DBManager();
dbM.getMyConnection(); // Get connetion 

Diet d=new Diet(dietType,noofFeed);

int rowAffected=-1;

DietManager dManager=new DietManager();
rowAffected=dManager.insert(d);
if (rowAffected==1){
	System.out.println("Succefully inserted Diet Data to our databases");
}


%>
<%
response.sendRedirect("thanks.html");
%>

</body>
</html>