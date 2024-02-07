<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="com.csm.DBManager" %>
<%@ page import="com.csm.action.Animals" %>
<%@ page import="com.csm.manager.AnimalsManager" %>
<%@ page import="java.util.ArrayList" %>


<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="UTF-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<title>Admin Animal Index page</title>

	<link rel="shortcut icon" href="./img/fav.jpg   " type="image/x-icon">

	 <!-- Boostrap 5 CSS -->
     <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

     <!--Fontawsome CSS -->
     <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css" integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==" crossorigin="anonymous" referrerpolicy="no-referrer" />

     <!-- Data Table CSS -->
     <link href="https://cdn.datatables.net/v/bs5/dt-1.13.6/datatables.min.css" rel="stylesheet">
     
</head>

<body>
	 <main class="mt-5">
        <div class="container-fluid ">
            <div class="row justify-content-end">
            	<div class="display-1 text-center">Keeper Dashboard</div>
                
                <div class="col-md-12">
                    <div class="card">
                        <div class="card-header">
                            <i class="fa-solid fa-paw me-2"></i>Animals
                        </div>
                        <div class="card-body">
                            <div class="table-responsive">
                                <%
                                	DBManager dbManager = new DBManager();
                                	dbManager.getConnection();
                                	
                                	AnimalsManager aManager = new AnimalsManager();
                                	ArrayList<Animals> myAnimal = aManager.keeper();
                                %>
                                <table id="datatable" class="table w-100">
                                    <thead>
                                    	
                                        <tr>
                                            <th class="text-center">Keeper Name</th>
                                            <th class="text-center">Total Animals</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                    	<%for(Animals animals:myAnimal){ %>
                                        <tr>
											<td class="text-center"><%= animals.getKeeperName() %></td>
											<td class="text-center"><%= animals.getNoOfAnimal() %></td>
										</tr>
										<%} %>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </main>

	<!-- Boostrap 5 JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

    <script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>

    <!-- Data Table JS -->
    <script src="https://cdn.datatables.net/v/bs5/dt-1.13.6/datatables.min.js"></script>


    <script type="text/javascript">
        $(document).ready( function () {
            $('#datatable').DataTable();

        } );
    </script>

</body>

</html>