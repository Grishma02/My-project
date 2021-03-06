<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<head>
<style>
 body{
 margin:0;
 background:url('https://pbs.twimg.com/media/Cu00KrhUIAAeB8K.jpg');
 background-size:cover;
 }
 </style>
<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" type="text/css" href="assets/css/bootstrap.css">

		<!-- Website CSS style -->
		<link rel="stylesheet" type="text/css" href="assets/css/main.css">

		<!-- Website Font style -->
	    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css">
		
		<!-- Google Fonts -->
		<link href='https://fonts.googleapis.com/css?family=Passion+One' rel='stylesheet' type='text/css'>
		<link href='https://fonts.googleapis.com/css?family=Oxygen' rel='stylesheet' type='text/css'>


<script type="text/javascript">
window.alert = function(){};
var defaultCSS = document.getElementById('bootstrap-css');
function changeCSS(css){
    if(css) $('head > link').filter(':first').replaceWith('<link rel="stylesheet" href="'+ css +'" type="text/css" />'); 
    else $('head > link').filter(':first').replaceWith(defaultCSS); 
}
$( document ).ready(function() {
  var iframe_height = parseInt($('html').height()); 
  window.parent.postMessage( iframe_height, 'http://bootsnipp.com');
});
function validate()
    {
    	alert("welcome");
    	var pwd=document.getElementById("pwd");
    	var cpwd=document.getElementById("pwd");
    	if(pwd==cpwd)
    		{
    		return true;
    		}
    	else
    		{
    		alert("Password does not match");
    		    		return false;
    		}
    }
    </script>j
		
		<title>ADD PRODUCT Form</title>

    <meta charset="utf-8">
    <meta name="robots" content="noindex">

    <title>Product Page</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <style type="text/css">
   
   <!--body-->
html{
     height: 100%;
 	background-repeat: no-repeat;
 	background-color: #d3d3d3;
 	font-family: 'Oxygen', sans-serif;
}

.main{
 	margin-top: 70px;
}



hr{
	width: 10%;
	color: #fff;
}

.form-group{
	margin-bottom: 15px;
}

label{
	margin-bottom: 15px;
}

input,
input::-webkit-input-placeholder {
    font-size: 11px;
    padding-top: 3px;
}

.main-login{
 	background-color: #fff;
    /* shadows and rounded borders */
    -moz-border-radius: 2px;
    -webkit-border-radius: 2px;
    border-radius: 2px;
    -moz-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
    -webkit-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
    box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);

}

.main-center{
 	margin-top: 30px;
 	margin: 0 auto;
 	max-width: 330px;
    padding: 40px 40px;

}

.login-button{
	margin-top: 5px;
}

.login-register{
	font-size: 11px;
	text-align: center;
}

    </style>
 
		<div class="container">
			<div class="row main">
				<div class="panel-heading">
	               <div class="panel-title text-center">
	               		<h3>ADD PRODUCT</h3>
	               		<hr />
	               	</div>
	            </div> 
				<div class="main-login main-center">
					<form:form action="Product" commandName="Product" method="POST" onsubmit="return validate">
						
						<div class="form-group">
							<label >PRODUCT NAME</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
									<form:input type="text" class="form-control" name="pname" id="pname"  placeholder="Name" path="pname" />
								</div>
							</div>
						</div>
							
									

						<div class="form-group">
							<label >PRODUCT BRAND</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-first-order" aria-hidden="true"></i>
</i></span>
									<form:input type="text" class="form-control" name="brand" id="brand"  placeholder="BRAND" path="brand" />
								</div>
							</div>
						</div>
                           
					
						

					<div class="form-group">
							<label >PRODUCT PRICE</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-inr" aria-hidden="true"></i>
</i></span>
									<input type="text" class="form-control" name="pprice" id="pprice"  placeholder="PRICE" path=pprice"/>
								</div>
							</div>
						</div>
						
						<div class="form-group">
							<label >PRODUCT AVAILABILITY</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-money" aria-hidden="true"></i></span>
									<input type="text" class="form-control" name="avail" id="avail"  placeholder=" AVAILABILITY" path=avail"/>
								</div>
							</div>
						</div>
						
						<div class="form-group">
							<label >PRODUCT DESCRIPTION</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-tasks" aria-hidden="true"></i>
</i></span>
									<input type="text" class="form-control" name="pdesc" id="pdesc"  placeholder=" desc" path="pdesc"/>
								</div>
							</div>
						</div>
						
						

						<div class="form-group ">
							<form:button style="background-color:#000000" type="submit" class="btn btn-primary btn-lg btn-block login-button">ADD</form:button>
						</div>
						<div class="view-product">
				            <a href="view.jsp">VIEW</a>
				         </div>
					</form:form>
				</div>
			</div>
		</div>