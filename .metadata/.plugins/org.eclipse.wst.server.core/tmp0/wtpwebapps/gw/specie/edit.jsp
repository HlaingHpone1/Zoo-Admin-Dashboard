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
			String specieType = request.getParameter("specie_type");
			String lifeStyle = request.getParameter("life_style");
			String conservationStatus = request.getParameter("conservation_status");
			String specieGroup = request.getParameter("specie_group");
			int id = Integer.parseInt(request.getParameter("species_id"));
			
			DBManager dbManager = new DBManager();
			dbManager.getConnection();
			
			Species s = new Species(id,specieType,lifeStyle,conservationStatus,specieGroup);
			
			
			int rowAffected =0;
			
			SpeciesManager sManager = new SpeciesManager();
			rowAffected = sManager.update(s);
			
			if(rowAffected == 1){
				System.out.println("Success");
			}
			
			
			
			
			response.sendRedirect("./index.jsp"); 
		%>
</body>
</html>