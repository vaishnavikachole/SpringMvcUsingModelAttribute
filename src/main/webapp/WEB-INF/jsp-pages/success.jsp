<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored = "false" %>

<!doctype html>
<html>
  <head>

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>employee</title>
  </head>
  <body>
    <div class="container mt-5">
    <h1>
        ${Header}
    </h1>
    <h4>
       ${Description}
    </h4>
    <hr>
    
        <h2>Employee Data</h2>
    <h2>
        Employee email address is ${employee.email_address}
    </h2>
    <h2>
        Employee name is ${employee.employee_name}
    </h2>
    <h2>
        Employee password is ${employee.password}
    </h2>

    <h2>
        ${employee}
    </h2>

    </div>
    </body>
    </html>
    
    