
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Admin Login page</title>

    <link rel="shortcut icon" href="./img/fav.jpg   " type="image/x-icon" />

    <!-- Boostrap 5 CSS -->
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
      crossorigin="anonymous"
    />

    <!--Fontawsome CSS -->
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css"
      integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA=="
      crossorigin="anonymous"
      referrerpolicy="no-referrer"
    />

    <!-- Data Table CSS -->
    <link
      href="https://cdn.datatables.net/v/bs5/dt-1.13.6/datatables.min.css"
      rel="stylesheet"
    />

    <link rel="stylesheet" type="text/css" href="./css/style.css" />
    <style type="text/css">
        body{
            background: #00000073 url("./img/bg12.jpg");
            background-position: center;
            background-repeat: no-repeat;
            background-size: cover;
            background-blend-mode: multiply;
            
        }
    </style>
  </head>

  <body class="vh-100 overflow-hidden">
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
			<a class="navbar-brand me-auto ms-lg-0 ms-3 text-uppercase fs-1 fw-bold" href="../index.jsp">Go Wild Wildlife Park Dashboard</a>
			
			<div class="collapse navbar-collapse" id="topNavBar">

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
					<a class="nav-link px-3" href="./animal/index.jsp">
						<span class="me-2"><i class="fa-solid fa-paw"></i></span>
						<span>Animal</span>
					</a>
                </li>
				<li>
                    <a class="nav-link px-3" href="./specie/index.jsp">
						<span class="me-2"><i class="fa-solid fa-sitemap"></i></span>
						<span>Specie</span>
					</a>
				</li>
				<li>
					<a class="nav-link px-3" href="./keeper/index.jsp">
						<span class="me-2"><i class="fa-solid fa-users-line"></i></span>
						<span>Keeper</span>
					</a>
				</li>
				<li>
					<a class="nav-link px-3" href="./diet/index.jsp">
						<span class="me-2"><i class="fa-solid fa-utensils"></i></span>
						<span>Diet</span>
					</a>
				</li>
				<li>
					<a class="nav-link px-3" href="./enclosure/index.jsp">
						<span class="me-2"><i class="fa-solid fa-mountain-city"></i></span>
						<span>Enclosure</span>
					</a>
				</li>
				<li>
					<a class="nav-link px-3" href="./query/index.jsp">
						<span class="me-2"><i class="fa-solid fa-paperclip"></i></span>
						<span>Report 1</span>
					</a>
				</li>
				<li>
					<a class="nav-link px-3" href="./query/index1.jsp">
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
	
    <div class="container-fluid h-75 d-flex justify-content-center align-items-center">
        <div class="row">
            <div class="col-md-12">
                <img class="img d-block w-50 h-50 mx-auto object-fit-contain" src="./img/bg11.png" alt="">
                <h1 class="display-1 text-center text-white">Hello Welcome to <br> GO Wild Wildlife Park</h1>
                <p class="text-center text-white w-75 mx-auto">
                    Welcome to the Go Wild Wildlife Park admin page, your gateway to the heart of our sanctuary for nature enthusiasts and animal lovers. At Go Wild, we're committed to the preservation and celebration of the world's incredible biodiversity. This admin portal empowers our dedicated team to manage and maintain the park's daily operations, ensuring that our resident wildlife is provided with the best care and attention. Whether you're a member of our staff or a partner in conservation, this platform offers a seamless experience for everything from animal health records and visitor management to conservation initiatives and educational programs. Together, we are working towards a harmonious coexistence between humanity and the wild, fostering a deeper understanding and appreciation for the incredible creatures we share our planet with. Thank you for being a part of this important mission.</p>
            </div>
        </div>
    </div>

    <!-- Boostrap 5 JS -->
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
      crossorigin="anonymous"
    ></script>

    <script
      src="https://code.jquery.com/jquery-3.7.1.js"
      integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4="
      crossorigin="anonymous"
    ></script>

    <!-- Data Table JS -->
    <script src="https://cdn.datatables.net/v/bs5/dt-1.13.6/datatables.min.js"></script>

    <script type="text/javascript">
      $(document).ready(function () {
        $("#datatable").DataTable();
      });
    </script>
  </body>
</html>