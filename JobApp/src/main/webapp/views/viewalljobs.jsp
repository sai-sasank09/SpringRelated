<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Job Post List</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
          crossorigin="anonymous">
    <style>
        body {
            background-color: #f9f9f9;
        }

        .card {
            border-radius: 8px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
        }

        h2 {
            color: #343a40;
        }

        .navbar {
            margin-bottom: 20px;
        }

        .card-title {
            font-size: 1.3rem;
            font-weight: bold;
        }

        .card-text {
            font-size: 1rem;
            line-height: 1.5;
        }
    </style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-warning">
    <div class="container">
        <a class="navbar-brand fs-1 fw-medium" href="#">Telusko Job Portal Web App</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item"><a class="nav-link" href="home">Home</a></li>
                <li class="nav-item"><a class="nav-link" href="viewalljobs">All Jobs</a></li>
                <li class="nav-item"><a class="nav-link" href="https://telusko.com/">Contact</a></li>
            </ul>
        </div>
    </div>
</nav>

<div class="container">
    <h2 class="mb-4 text-center font-weight-bold">Job Post List</h2>

    <c:if test="${jobPosts != null && not empty jobPosts}">
        <div class="row row-cols-1 row-cols-md-2 g-4">
            <c:forEach var="jobPost" items="${jobPosts}">
                <div class="col">
                    <div class="card border-dark bg-light">
                        <div class="card-body">
                            <h5 class="card-title text-dark">${jobPost.postProfile}</h5>
                            <p class="card-text"><strong>Job-Id: </strong>${jobPost.postId}</p>
                            <p class="card-text"><strong>Description:</strong> ${jobPost.postDesc}</p>
                            <p class="card-text"><strong>Experience Required:</strong> ${jobPost.reqExperience} years</p>
                            <p class="card-text">
                                <strong>Tech Stack Required:</strong>
                                <ul>
                                    <c:forEach var="tech" items="${jobPost.postTechStack}">
                                        <li>${tech}</li>
                                    </c:forEach>
                                </ul>
                            </p>
                        </div>
                        <div class="card-footer text-muted">
                            <!-- Optional footer content -->
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
    </c:if>

    <c:if test="${jobPosts == null || empty jobPosts}">
        <div class="alert alert-warning text-center">
            <strong>No job posts available.</strong> Please check back later.
        </div>
    </c:if>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
        crossorigin="anonymous"></script>
</body>
</html>
