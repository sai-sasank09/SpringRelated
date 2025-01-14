<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Telusko Job Portal</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="style.css">
<link rel="stylesheet" type="text/css" href="style1.css">
<style>
/* Global Styling */
body {
	font-family: 'Arial', sans-serif;
	background-color: #f8f9fa;
	margin: 0;
	padding: 0;
}

.navbar {
	box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
}

.bg-clr {
	background-color: #f1faee !important;
}

.nav-link {
	font-size: 16px;
	font-weight: 500;
	color: #333 !important;
	transition: color 0.3s ease;
}

.nav-link:hover {
	color: #0056b3 !important;
}

/* Card Styling */
.card {
	border: none;
	border-radius: 8px;
	box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
}

.card-title {
	font-size: 1.25rem;
	font-weight: bold;
	color: #343a40;
	margin-bottom: 15px;
}

.card-body {
	padding: 20px;
}

.bg-warning {
	background-color: #ffd166 !important;
}

.btn {
	padding: 10px 20px;
	font-size: 14px;
	font-weight: bold;
	border-radius: 5px;
}

.btn-primary {
	background-color: #007bff;
	border: none;
	transition: background-color 0.3s ease;
}

.btn-primary:hover {
	background-color: #0056b3;
}

/* Container Styling */
.container {
	max-width: 900px;
}

.row {
	margin: 0 -15px;
}

.col-md-6 {
	padding: 15px;
}

/* Mobile Responsiveness */
@media (max-width: 576px) {
	.card-body {
		padding: 15px;
	}

	.card-title {
		font-size: 1rem;
	}

	.btn {
		width: 100%;
		font-size: 13px;
		padding: 8px;
	}
}
</style>
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-light bg-clr">
		<div class="container">
			<a class="navbar-brand fs-1 fw-medium " href="#">Telusko Job
				Portal Web App</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarNav"
				aria-controls="navbarNav" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav ms-auto">
					<li class="nav-item"><a class="nav-link" href="home">Home</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="viewalljobs">All
							Jobs</a></li>

					<li class="nav-item"><a class="nav-link"
						href="https://telusko.com/">Contact</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container mt-5">
		<div class="row">
			<!-- Card 1 -->
			<div class="col-md-6 mb-5">
				<div class="card bg-warning">
					<div class="card-body text-center">
						<h5 class="card-title">View All Jobs</h5>
						<form action="/viewalljobs" method="get">
							<button type="submit" class="btn btn-primary">Go</button>
						</form>
					</div>
				</div>
			</div>

			<!-- Card 2 -->
			<div class="col-md-6 mb-5">
				<div class="card">
					<div class="card-body text-center">
						<h5 class="card-title">Add Job</h5>
						<form action="/addjob" method="get">
							<button type="submit" class="btn btn-primary">Submit</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Add the Bootstrap JS and Popper.js scripts -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
		crossorigin="anonymous"></script>
</body>
</html>
