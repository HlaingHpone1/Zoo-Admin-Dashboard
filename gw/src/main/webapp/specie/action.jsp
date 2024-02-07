<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%@ page import = "com.csm.DBManager" %>
    <%@ page import = "com.csm.action.Species" %>
    <%@ page import = "com.csm.manager.SpeciesManager" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />	
		<title>Insert title here</title>
	</head>
		<% 
			String specieType = request.getParameter("specie_type");
			String lifeStyle = request.getParameter("life_style");
			String conservationStatus = request.getParameter("conservation_status");
			String specieGroup = request.getParameter("specie_group");
			
			DBManager dbManager = new DBManager();
			dbManager.getConnection();
			
			Species s = new Species(specieType,lifeStyle,conservationStatus,specieGroup);
			
			
			int rowAffected =0;
			
			SpeciesManager sManager = new SpeciesManager();
			rowAffected = sManager.insert(s);
			
			if(rowAffected == 1){
				System.out.println("Success");
			}
			
			
			
			
		%>
		<%
			response.sendRedirect("./thanks.jsp"); 
		%>
	<body>
	
	</body>
</html>