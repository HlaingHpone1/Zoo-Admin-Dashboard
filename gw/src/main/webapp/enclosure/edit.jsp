<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "com.csm.DBManager" %>
    <%@ page import = "com.csm.action.Enclosure" %>
    <%@ page import = "com.csm.manager.EnclosureManager" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
			
			String enclosureType =request.getParameter("enclosure_type");
			String location=request.getParameter("location");
			int id = Integer.parseInt(request.getParameter("enclosure_id"));
			
			Enclosure e =new Enclosure(id,enclosureType,location);
			
			int rowAffected=-1;
			
			EnclosureManager eManager=new EnclosureManager();
			
			rowAffected=eManager.update(e);
			if (rowAffected==1){
				System.out.println("Succefully inserted Enclosure Data to our databases");
			}
			
			
			response.sendRedirect("./index.jsp"); 
		%>
</body>
</html>