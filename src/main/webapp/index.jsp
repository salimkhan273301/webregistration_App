<html>
<head>
<style type="text/css">
p{
color:yellow;
font-size:18px;

}
h2{
color:yellow;
background-color:green;
font-size:30px;
}
input{
background-color:pink;
height:5%;
}
.form{
display:flex;
justify-content:center;
}
button{
background-color:yellow;
width:40%;
font-size:20px;
color:green;
}

</style>
</head>

<body style="background-color:blue">
<h2 >Registration!</h2>
<div class="signUp">


  <button><a href="form.jsp">Sign Up</a></button>
  
  </div>
  <div class="list">
  <form action="servlet2" method="get">
  
  <h2> List of All Student</h2>
  <button type="submit">List of Student </button>
  
  </form>
  
  </div>
   <div class="delete">
  <form action="servlet2" method="get">
  
  <h2> Delete  Student by Id</h2>
  <input type="text"  name="id" placeholder="Enter student Id" required size="60"><br>
  <button type="submit">Delete </button>
  
  </form>
  
  </div>
   <div class="search">
  <form action="servlet2" method="get">
  
  <h2> Get  Student by Id</h2>
  <input type="text"  name="id" placeholder="Enter student Id" required size="60"><br>
  <button type="submit">Search </button>
  
  </form>
  
  </div>
</body>
</html>