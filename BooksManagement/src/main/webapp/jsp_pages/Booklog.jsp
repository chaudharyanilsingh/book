<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
   <script language="javascript" type="text/javascript">  
   $(document).ready(function() {
	    $("#bookregform").submit(function(event){
	        event.preventDefault();
	        uploadItem1();
	    });

	    
	    function uploadItem1(){

	        var itemData = {
	                tittle : $("#tittle").val(),
	                 author : $("#author").val(),
	                 isbn : $("#isbn").val(),
	                 publisher : $("#publisher").val(),
	                 publishDate : $("#publishdate").val(),
	                 category : $("#category").val(),
	                 numberOfBooks : $("#numberofbooks").val()
	               
	                }
	      alert(JSON.stringify(itemData));
	        $.ajax({
	            type : "POST",
	            contentType : "application/json",
	            url :  "/bookreg",
	            data : JSON.stringify(itemData),
	            dataType : 'json',
	            success : function(w){
		        	   
		        	   alert("success");
		           },
	            error : function(e) {
	                alert("Error! "),
	                console.log(e);
	            }
	        });
	    }
   })
  </script>
</head>
<body>
<form action="bookreg" method="post" id="bookregform"> 
  <div class="form-group ">
      <label class="col-sm-2 col-form-label">Tittle :</label>
     <div class="col-sm-10">
<input type="text" class="form-control" id="tittle" placeholder="Enter Tittle">
      </div>
    </div>
     <div class="form-group ">
      <label class="col-sm-2 col-form-label">Author :</label>
      <div class="col-sm-10">
      <input type="text" class="form-control" id="author" placeholder="Enter Author">
    </div>
    </div>
     <div class="form-group ">
      <label class="col-sm-2 col-form-label">ISBN :</label>
      <div class="col-sm-10">
      <input type="text" class="form-control" id="isbn" placeholder="Enter ISBN number">
    </div>
    </div>
     <div class="form-group ">
      <label class="col-sm-2 col-form-label">Publisher :</label>
      <div class="col-sm-10">
      <input type="text" class="form-control" id="publisher" placeholder="Enter Publisher Name">
    </div>
    </div>
     <div class="form-group">
      <label class="col-sm-2 col-form-label">Publish Date :</label>
      <div class="col-sm-10">
      <input type="date" class="form-control" id="publishdate" placeholder="Enter Date of Publish">
    </div>
    </div>
     <div class="form-group">
      <label class="col-sm-2 col-form-label">Category :</label>
      <div class="col-sm-10">
      <input type="text" class="form-control" id="category" placeholder="Enter Category">
    </div>
    </div>
    
     <div class="form-group">
      <label class="col-sm-2 col-form-label" >Number of Stock:</label>
    <div class="col-sm-10">
      <input type="number" class="form-control" id="numberofbooks" placeholder="Enter no of Books">
    </div>
    </div>
   
   
    <button type="submit" class="btn btn-default">Submit</button>
</form>

</body>
</html>