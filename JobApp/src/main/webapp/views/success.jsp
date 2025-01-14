<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.sasank.JobApp.model.JobPost" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Job Post Details</title>
    <!-- Add Bootstrap CSS link -->
    <link
        href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
        rel="stylesheet"
        integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
        crossorigin="anonymous">
    <style>
        /* General Styles */
        body {
            background-color: #f9f9f9;
            font-family: Arial, sans-serif;
        }

        .card {
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }

        .bg-clr {
            background-color: #f1faee !important;
        }

        .card-title {
            font-size: 1.5rem;
            font-weight: bold;
        }

        .card-text {
            font-size: 1rem;
            line-height: 1.5;
        }

        h2 {
            font-weight: bold;
            color: #343a40;
        }

        ul {
            padding-left: 20px;
        }

        li {
            font-size: 0.9rem;
        }

        .card-footer {
            text-align: center;
            font-size: 0.85rem;
            color: #6c757d;
        }

        /* Responsive Adjustments */
        @media (max-width: 576px) {
            .card-title {
                font-size: 1.25rem;
            }

            .card-text {
                font-size: 0.9rem;
            }
        }
    </style>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-clr">
    <div class="container">
        <a class="navbar-brand fs-1 fw-medium" href="#">Telusko Job Portal Web App</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item">
                    <a class="nav-link" href="home">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="viewalljobs">All Jobs</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="https://telusko.com/">Contact</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<%
JobPost myJobPost= (JobPost)request.getAttribute("jobPost");
%>

<div class="container mt-5">
    <h2 class="mb-4 text-center">Job Post Details</h2>

    <div class="row justify-content-center">
        <div class="col-md-6">
            <div class="card border-dark bg-light">
                <div class="card-body">
                    <h5 class="card-title text-dark">${jobPost.postProfile}</h5>
                    <p class="card-text">
                        <strong>Job-Id:</strong> ${jobPost.postId}
                    </p>
                    <p class="card-text">
                        <strong>Description:</strong> ${jobPost.postDesc}
                    </p>
                    <p class="card-text">
                        <strong>Experience Required:</strong> ${jobPost.reqExperience} years
                    </p>
                    <p class="card-text">
                        <strong>Tech Stack Required:</strong>
                        <ul>
                            <c:forEach var="tech" items="${jobPost.postTechStack}">
                                <li>${tech}</li>
                            </c:forEach>
                        </ul>
                    </p>
                </div>

            </div>
        </div>
    </div>
</div>

<script
    src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
    crossorigin="anonymous"></script>
</body>
</html>
