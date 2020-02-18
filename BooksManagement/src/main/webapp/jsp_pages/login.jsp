<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Login </title>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
   <script language="javascript" type="text/javascript">  
   $(document).ready(function() {
	  
	   
	    
	    $("#register").submit(function(event){
	        event.preventDefault();
	        uploadItem2();
	    });

	    
	    function uploadItem2(){

	        var itemDataReg = {
	               
	                firstName : $("#fname").val(),
	                lastName : $("#lname").val(),
	                password : $("#regpassword").val(),
	                email : $("#email").val()
	                }
	     alert(JSON.stringify(itemDataReg));
	        
	        $.ajax({
	            type : "POST",
	            contentType : "application/json",
	            url :  "/register",
	            data : JSON.stringify(itemDataReg),
	            dataType : 'json',
	           success : function(w){
	        	   
	        	   alert("success");
	           },
	            error : function(e) {
	                alert("error in registration"),
	                
	               
	                console.log(e);
	            }
	        });
	    }
	    
	    
	})
</script>      
</head>
<body>

<br>



<form id="register" name="register" action="register" method="POST" style="display: none;">
      First-name: <input type="text" id="fname" /><br/>
      Last-name: <input type="text" id="lname" /><br/>
      
      Email: <input type="text" id="email"/><br/>
      Password: <input type="text" id="regpassword" /> <br/>
      
 <input type="submit">
   </form>
<br>
<br>

</body>
</html>

   