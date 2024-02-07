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
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		
			String keeperName = request.getParameter("keepers_name");
			String dateOfBirth = request.getParameter("dob");
			Date dob = formatter.parse(dateOfBirth);
			String keeperRank = request.getParameter("keeper_rank");
			int id = Integer.parseInt(request.getParameter("keeper_id"));
			
			DBManager dbManager=new DBManager();
			dbManager.getConnection(); // Get connetion 
			
			Keepers k = new Keepers(id,keeperName, dob, keeperRank);
			
			int rowAffected=-1;
			
			KeepersManager kManager=new KeepersManager();
			rowAffected=kManager.update(k);
			if (rowAffected==1){
				System.out.println("Succefully inserted Keeper Data to our databases");
			}
			
			
			response.sendRedirect("./index.jsp"); 
		%>
</body>
</html>