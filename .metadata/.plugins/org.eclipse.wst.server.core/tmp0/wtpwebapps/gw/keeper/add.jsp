<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="UTF-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<title>Admin Add Keeper page</title>

	<link rel="shortcut icon" href="./img/fav.jpg   " type="image/x-icon">

	 <!-- Boostrap 5 CSS -->
     <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

     <!--Fontawsome CSS -->
     <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css" integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==" crossorigin="anonymous" referrerpolicy="no-referrer" />

	<link rel="stylesheet" type="text/css" href="../css/style.css">
	<style type="text/css">
          body{
             background: #00000093 url("../img/bg5.jpg");
             background-position: center;
             background-size: cover;
             background-blend-mode: multiply;
          }
     </style>
</head>

<body class="bg-secondary vh-100 d-flex justify-content-center align-items-center">
    <div class="container-fluid my-3 " >
        <!-- Create a form -->
        <form class="" action="./action.jsp" method="GET" enctype="multipart/form-data">
        	<div class="row justify-content-center">
                <div class="col-md-6">
                    <a class="shadow-none text-white" href="javascript:history.back()"><i class="fa-solid fa-arrow-left fa-2xl"></i></a>
                </div>
            </div>
            <div class="row">
                <div class="col-md-12">
                    <!-- Header info -->
                    <h1 class="display-1 text-white text-center mb-5">Add Keeper</h1>
                </div>
            </div>
            

            <div class="row justify-content-center py-3">
                <div class="col-md-6">
                    <div class="form-floating">
                        <input type="text" class="form-control" id="floatingInput" name="keepers_name" placeholder="Keeper Name" required>
                        <label for="floatingPassword">Keeper Name</label>
                    </div>
                </div>
            </div>

            <div class="row justify-content-center py-3">
                <div class="col-md-3">
                    <div class="form-floating">
                        <input type="text" class="form-control" id="floatingInput" name="dob" placeholder="Date Of Birth" required>
                        <label for="floatingInput">Date Of Birth (yyyy-mm-dd)</label>
                    </div>
                </div>
                <div class="col-md-3">
                    <div class="form-floating">
                        <input type="text" class="form-control" id="floatingInput" name="keeper_rank" placeholder="Keeper Rank" required>
                        <label for="floatingInput">Keeper Rank</label>
                    </div>
                </div>
            </div>

            <!-- Submit button start -->
            <div class="row justify-content-center">
                <div class="col-md-6">
                    <button type="submit" class="btn btn-primary btn-lg">Submit</button>
                </div>
            </div>
            <!-- Submit button end -->
        </form>
    </div>

	<!-- Boostrap 5 JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

    <script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>

</body>

</html>