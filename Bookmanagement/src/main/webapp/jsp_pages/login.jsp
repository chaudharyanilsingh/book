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
	    $("#userdata").submit(function(event){
	        event.preventDefault();
	        uploadItem1();
	    });

	    
	    function uploadItem1(){

	        var itemData = {
	                "name" : $("#name").val(),
	                 "password" : $("#password").val(),
	               
	                }
	      alert(JSON.stringify(itemData));
	        $.ajax({
	            type : "POST",
	            contentType : "application/json",
	            url :  "/login",
	            data : JSON.stringify(itemData),
	            dataType : 'json',
	            success : function(w){
		        	   
		        	   alert("success");
		           },
	            error : function(e) {
	                alert("Error! "),
	                console.log();
	            }
	        });
	    }
	    
	    $("#signup").click(function sign(){
	    	
	    	$("#userdata").hide();
	    	$("#register").slideDown();
	    	$("#login").show();
	    	$("#signup").hide();
	    	
	    }
	    
	    )
	     $("#login").click(function logup(){
	    	
	    	$("#userdata").show();
	    	$("#register").hide();
	    	$("#login").hide();
	    	$("#signup").show();
	    	
	    }
	    
	    )
	    
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
<form id="userdata" name="userdata" action="login" enctype="multipart/form-data" method="POST" >
E-mail : <input type="text" name="name" id="name">
Password : <input type="text" name="password" id="password">
<input type="submit">

</form>
<br>



<form id="register" name="register" action="register" method="POST" style="display: none;">
      First-name: <input type="text" id="fname" /><br/>
      Last-name: <input type="text" id="lname" /><br/>
      
      Email: <input type="text" id="email"/><br/>
      Password: <input type="text" id="regpassword" /> <br/>
      
 <input type="submit">
   </form>
<br>
<button type="button" id="signup"> signup </button>
<br>
<button type="button" id="login" style="display: none;">login</button>
</body>
</html>

   