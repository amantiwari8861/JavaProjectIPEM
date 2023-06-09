<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Bootstrap 5 Thank You Example</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet">
    
    <style type="text/css">
    .cross{
    display: block;
    border:1px solid red;
    padding:40px;
    line-height:100px;
    font-size:3rem;
    border-radius:50%;
    color:red;
    }
    </style>
    </head>

    <body>
        <div class="vh-100 d-flex justify-content-center align-items-center">
            <div class="col-md-4">
                <div class="border border-3 border-danger"></div>
                <div class="card  bg-white shadow p-5">
                    <div class="mb-4 text-center">
                       <span class="cross"> X </span> 
                    </div>
                    <div class="text-center">
                        <h1>unable to add User!</h1>
                        <p>We've send the link to your inbox. Lorem ipsum dolor sit,lorem lorem </p>
                        <button class="btn btn-outline-success">Back Home</button>
                    </div>
                </div>
            </div>
        </div>
    </body>

</html>