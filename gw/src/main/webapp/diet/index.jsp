<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import = "com.csm.DBManager" %>
     <%@ page import = "com.csm.action.Diet" %>
     <%@ page import = "com.csm.manager.DietManager" %>
     <%@ page import = "java.util.ArrayList" %>


<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="UTF-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<title>Admin Diet Index page</title>

	<link rel="shortcut icon" href="./img/fav.jpg   " type="image/x-icon">

	 <!-- Boostrap 5 CSS -->
     <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

     <!--Fontawsome CSS -->
     <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css" integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==" crossorigin="anonymous" referrerpolicy="no-referrer" />

     <!-- Data Table CSS -->
     <link href="https://cdn.datatables.net/v/bs5/dt-1.13.6/datatables.min.css" rel="stylesheet">

	<link rel="stylesheet" type="text/css" href="../css/style.css">
</head>

<body>
	<!-- top navigation bar -->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark sticky-top ">
		<div class="container-fluid">
			<button
			class="navbar-toggler"
			type="button"
			data-bs-toggle="offcanvas"
			data-bs-target="#sidebar"
			aria-controls="offcanvasExample"
			>
			<span class="navbar-toggler-icon" data-bs-target="#sidebar"></span>
			</button>
			<a class="navbar-brand me-auto ms-lg-0 ms-3 text-uppercase fs-1 fw-bold" href="../main.jsp">Go Wild Wildlife Park Dashboard</a>

			<div class="collapse navbar-collapse" id="topNavBar">
			<!-- <ul class="navbar-nav d-flex ms-auto my-3 my-lg-0">
				<li class="nav-item dropdown">
				<a
					class="nav-link dropdown-toggle ms-2"
					href="#"
					role="button"
					data-bs-toggle="dropdown"
					aria-expanded="false"
				>
					<i class="fas fa-user-circle me-2"></i>
				</a>
				<ul class="dropdown-menu dropdown-menu-end">
					<li>
					<a class="dropdown-item" href="../logout.php">Log Out</a>
					</li>
				</ul>
				</li>
			</ul> -->
			</div>
		</div>
	</nav>	
    <!-- top navigation bar -->
    <!-- offcanvas -->
	<div
		class="offcanvas offcanvas-start sidebar-nav bg-dark"
		tabindex="-1"
		id="sidebar"
		>
		<div class="offcanvas-body p-0">
			<nav class="navbar-dark">
			<ul class="navbar-nav">
				<li>
                    <div class="text-muted small fw-bold text-uppercase px-3">
                        Admin
                    </div>
				</li>
				<li>
                    <a href="../index.jsp" class="nav-link px-3 active">
                        <span class="me-2"><i class="fas fa-tachometer-alt-slow"></i></span>
                        <s class="text-decoration-none">Dashboard</s>
                    </a>
				</li>
				<li class="my-4"><hr class="dropdown-divider bg-light" /></li>
				<li>
					<div class="text-muted small fw-bold text-uppercase px-3 mb-3">
						Interface
					</div>
				</li>
				<li>
					<a class="nav-link px-3" href="../animal/index.jsp">
						<span class="me-2"><i class="fa-solid fa-paw"></i></span>
						<span>Animal</span>
					</a>
                </li>
				<li>
                    <a class="nav-link px-3" href="../specie/index.jsp">
						<span class="me-2"><i class="fa-solid fa-sitemap"></i></span>
						<span>Specie</span>
					</a>
				</li>
				<li>
					<a class="nav-link px-3" href="../keeper/index.jsp">
						<span class="me-2"><i class="fa-solid fa-users-line"></i></span>
						<span>Keeper</span>
					</a>
				</li>
				<li>
					<a class="nav-link px-3" href="../diet/index.jsp">
						<span class="me-2"><i class="fa-solid fa-utensils"></i></span>
						<span>Diet</span>
					</a>
				</li>
				<li>
					<a class="nav-link px-3" href="../enclosure/index.jsp">
						<span class="me-2"><i class="fa-solid fa-mountain-city"></i></span>
						<span>Enclosure</span>
					</a>
				</li>
				<li>
					<a class="nav-link px-3" href="../query/index.jsp">
						<span class="me-2"><i class="fa-solid fa-paperclip"></i></span>
						<span>Report 1</span>
					</a>
				</li>
				<li>
					<a class="nav-link px-3" href="../query/index1.jsp">
						<span class="me-2"><i class="fa-solid fa-paperclip"></i></span>
						<span>Report 2</span>
					</a>
				</li>
				<li class="my-4"><hr class="dropdown-divider bg-light" /></li>
				

			</ul>
			</nav>
		</div>
	</div>
    <!-- offcanvas -->
	 <main class="mt-5">
        <div class="container-fluid">
            <div class="row justify-content-end">
           	 	<div class="display-1 text-white text-center">Diet Dashboard</div>
                    
	            <div class="col-md-2 mb-3">
	               <a class="btn btn-primary" href="./add.jsp" role="button"><i class="fa-solid fa-utensils me-2"></i>Add Diet</a>
	            </div>
                <div class="col-md-12">
                    
                
                    <div class="card">
                        <div class="card-header">
                            <i class="fa-solid fa-utensils me-2"></i>Diets
                        </div>
                        <div class="card-body">
                            <div class="table-responsive">
                                <%
									DBManager dbM = new DBManager();
									dbM.getConnection();
									 
									DietManager dietM=new DietManager();
									ArrayList<Diet> mydiet=dietM.fetchAll();
									
								%>
                                <table id="datatable" class="table w-100">
                                    <thead>
                                    
                                        <tr>
                                            <th class="text-center">Diet ID</th>
                                            <th class="text-center">Diet Type</th>
                                            <th class="text-center">No Feeds per Days</th>
                                            <th class="text-center">Action</th>
                                            <th class="text-center">Action</th>
                                        </tr>
                                    
                                    </thead>
                                    <tbody>
                                    	<% for(Diet diets:mydiet){%>
                                        <tr>
											<td class="text-center"><%=diets.getDietID() %></td>
											<td class="text-center"><%=diets.getDietType() %></td>
											<td class="text-center"><%=diets.getNoOfFeed() %></td>
											<td class="text-center">
                                                <a href="./update.jsp?id=<%= diets.getDietID() %>" class="btn btn-primary"><i class="fa-solid fa-pen-to-square me-2" role="button"></i>Edit</a>
                                            </td>
                                            <td class="text-center">
                                                <a href="./delete.jsp?id=<%= diets.getDietID() %>" class="btn btn-danger" onclick="myFunction()"><i class="fa-solid fa-trash me-2" role="button"></i>Delete</a>
                                            </td>
										</tr>
										<% }  %>
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
        
        function myFunction() {
        	  alert("Are u sure to Delete");
        	}
    </script>

</body>

</html>