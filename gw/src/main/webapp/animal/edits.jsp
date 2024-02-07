<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ page import="com.csm.DBManager" %>
    <%@ page import="com.csm.action.Animals" %>
    <%@ page import="com.csm.manager.AnimalsManager" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
				
				String animalName = request.getParameter("animal_name");
				String yearOfArrivel = request.getParameter("year_of_arrival");
				int gender = Integer.parseInt(request.getParameter("gender"));
				int keeperID = Integer.parseInt(request.getParameter("keeper_id"));
				int enclosureID = Integer.parseInt(request.getParameter("enclosure_id"));
				int specieID = Integer.parseInt(request.getParameter("specie_id"));
				int dietID = Integer.parseInt(request.getParameter("diet_id"));
				int id = Integer.parseInt(request.getParameter("animal_id"));
				
				System.out.println(id);
				
				DBManager dbManager = new DBManager();
				dbManager.getConnection();
				
				Animals a = new Animals(id,animalName, gender, yearOfArrivel, keeperID, enclosureID, specieID, dietID);
				
				int rowAffected =0;
				
				AnimalsManager animalM = new AnimalsManager();
				rowAffected = animalM.update(a);
				System.out.println(rowAffected);
				
				if(rowAffected == 1){
					System.out.println("Success");
				}
				
				response.sendRedirect("./index.jsp");
			%>
</body>
</html>