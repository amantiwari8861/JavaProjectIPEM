<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="cdns/allcsscdn.jsp" %>
</head>
<body>
<section class="h-100 h-custom" style="background-color: #8fc4b7;">
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-lg-8 col-xl-6">
        <div class="card rounded-3">
          <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-registration/img3.webp"
            class="w-100" style="border-top-left-radius: .3rem; border-top-right-radius: .3rem;"
            alt="Sample photo">
          <div class="card-body p-4 p-md-5">
            <h3 class="mb-4 pb-2 pb-md-0 mb-md-5 px-md-2">Update User Details</h3>

            <form class="px-md-2" action="UpdateUser"  method="post">

              <div class="form-outline mb-4">
                <label class="form-label" for="form3Example1q">Id</label>
                <input type="number" id="form3Example1q" class="form-control" name="id" />
              </div>

              <div class="form-outline mb-4">
                <label class="form-label" for="form3Example1q">Name</label>
                <input type="text" id="form3Example1q" class="form-control" name="name"/>
              </div>

              <div class="form-outline mb-4">
                <label class="form-label" for="form3Example1q">Salary</label>
                <input type="number" id="form3Example1q" class="form-control" name="salary"/>
              </div>

              <div class="form-outline mb-4">
                <label class="form-label" for="form3Example1q">Phone No.</label>
                <input type="tel" id="form3Example1q" class="form-control" name="phone" />
              </div>

            
              <button type="submit" class="btn btn-success btn-lg mb-1">Submit</button>

            </form>

          </div>
        </div>
      </div>
    </div>
  </div>
</section>
</body>
</html>