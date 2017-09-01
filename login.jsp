<!DOCTYPE html>
<html lang="en">
<head>
  <title>LOGIN</title>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <title>PROJECT</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <div class="navbar navbar-inverse navbar-fixed-top navbar-custom">
      <div class="container">
        <a class="navbar-brand text-muted" href="#">FashioNista</a>
          <div class="collapse navbar-collapse">

            <ul class="nav navbar-nav navbar-right">
            <li><a href="index.jsp">Home</a></li>
            <li><a href="Brands.jsp">Brands</a></li>
            <li><a href="AboutUs.jsp">About Us</a></li>
            <li><a href="login.jsp">SIGN IN</a></li>
            <li><a href="Register.jsp">SIGN UP</a></li>
            <li><a href="ContactUs.jsp">Contact Us </a></li>
            
            
            </ul>
          
           </div>
       </div>
    </div>
  
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>


<div class="container">
<div class="container" style="background-image: url('C:\bg.png');">
    <h2>SIGN-IN</h2>
  <form class="form-horizontal" action="/action_page.php">
    <div class="form-group">
      <label class="control-label col-sm-2" for="email">Email or User name:</label>
      <div class="col-sm-10">
        <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="pwd">Password:</label>
      <div class="col-sm-10">          
        <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pwd">
      </div>
    </div>
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <div class="checkbox">
          <label><input type="checkbox" name="remember"> Remember me</label>
         
</div>

  
        </div>
      </div>
    </div>
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-default">Submit</button>
      </div>
    </div>
</div>
</form>
</body>
</html>
