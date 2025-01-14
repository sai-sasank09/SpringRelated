<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Telusko Job Portal</title>
    <link
        href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
        rel="stylesheet"
        integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
        crossorigin="anonymous">
    <style>
        body {
            background: linear-gradient(to bottom, #f9f9f9, #e0e7ff);
            font-family: 'Arial', sans-serif;
            margin: 0;
            padding: 0;
        }
        nav {
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        }
        .navbar {
            background-color: #ffcc33;
        }
        .navbar-brand {
            font-size: 1.8rem;
            font-weight: 600;
            color: #333 !important;
        }
        .nav-link {
            color: #333 !important;
            font-size: 1rem;
        }
        .card {
            box-shadow: 0px 4px 15px rgba(0, 0, 0, 0.1);
            border: none;
            border-radius: 12px;
        }
        .card-body {
            padding: 2rem;
        }
        .form-label {
            font-size: 1rem;
            font-weight: 600;
            color: #333;
        }
        .form-control {
            border-radius: 8px;
            box-shadow: inset 0px 2px 5px rgba(0, 0, 0, 0.1);
        }
        .form-control:focus {
            outline: none;
            border-color: #6c63ff;
            box-shadow: 0px 0px 5px rgba(108, 99, 255, 0.8);
        }
        .form-select {
            border-radius: 8px;
            box-shadow: inset 0px 2px 5px rgba(0, 0, 0, 0.1);
        }
        button {
            background-color: #6c63ff;
            border: none;
            padding: 10px 20px;
            color: #fff;
            border-radius: 8px;
            cursor: pointer;
            font-size: 1rem;
            font-weight: 600;
        }
        button:hover {
            background-color: #5146d9;
        }
        h2 {
            font-size: 1.5rem;
            color: #6c63ff;
            margin-bottom: 1rem;
            font-weight: 700;
        }
    </style>
</head>
<body>
    <nav class="navbar navbar-expand-lg">
        <div class="container">
            <a class="navbar-brand" href="#">Telusko Job Portal</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false"
                aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav ms-auto">
                    <li class="nav-item"><a class="nav-link" href="home">Home</a></li>
                    <li class="nav-item"><a class="nav-link" href="viewalljobs">About</a></li>
                    <li class="nav-item"><a class="nav-link" href="https://telusko.com/">Contact</a></li>
                </ul>
            </div>
        </div>
    </nav>

    <div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="card">
                    <div class="card-body">
                        <h2 class="text-center">Post a New Job</h2>
                        <form:form action="handleForm" method="post" modelAttribute="jobPost">
                            <div class="mb-3">
                                <label for="postId" class="form-label">Post ID</label>
                                <input type="text" class="form-control" id="postId" name="postId" required>
                            </div>
                            <div class="mb-3">
                                <label for="postProfile" class="form-label">Post Profile</label>
                                <input type="text" class="form-control" id="postProfile" name="postProfile" required>
                            </div>
                            <div class="mb-3">
                                <label for="postDesc" class="form-label">Post Description</label>
                                <textarea class="form-control" id="postDesc" name="postDesc" rows="3" required></textarea>
                            </div>
                            <div class="mb-3">
                                <label for="reqExperience" class="form-label">Required Experience</label>
                                <input type="number" class="form-control" id="reqExperience" name="reqExperience" required>
                            </div>
                            <div class="mb-3">
                                <label for="postTechStack" class="form-label">Tech Stack</label>
                                <select multiple class="form-select" id="postTechStack" name="postTechStack" required>
                                    <option value="Java">Java</option>
                                    <option value="JavaScript">JavaScript</option>
                                    <option value="Python">Python</option>
                                    <option value="React">React</option>
                                    <option value="Spring Boot">Spring Boot</option>
                                </select>
                            </div>
                            <button type="submit" class="btn btn-primary w-100">Submit</button>
                        </form:form>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <script
        src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
        crossorigin="anonymous">
    </script>
</body>
</html>
