<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<!doctype html>
<html>
  <head>

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>employee</title>
  </head>
  <body>
    <div class="container mt-5">
    <form action="/employeeform" method="post">
        <h1 class="text-center">
            Employee Registration Form
        </h1>
        <div class="form-group">
          <label for="emailId">Email address</label>
          <input type="email" 
          name="email_address" 
          class="form-control" 
          id="emailId" 
          placeholder="Enter email">
        </div>

        <div class="form-group">
            <label for="employeeName">Employee Name</label>
            <input type="name" class="form-control" 
            name="employee_name" id="employeeName" placeholder="enter employee name">
        </div>

        <div class="form-group">
          <label for="employeePassword">Employee Password</label>
          <input type="password" class="form-control" 
          name="password"
          id="password" placeholder="enter Password">
        </div>
       
        <div class="container text-center">
        <button type="submit" class="btn btn-danger">Sign Up</button>
        </div>
    </form>
    </div>

  </body>
</html>