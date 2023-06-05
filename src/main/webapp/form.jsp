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
<h2 style="text-align:center">Registration!</h2>
<div class="form">

<form action="servlet1" method="post">
  <p>Name</p>
  <input type="text"  name="name" placeholder="Enter name" required size="60"><br>
  

  <p>Email</p>
  <input type="email"  name="email" placeholder="Enter Email" required size="60"><br>
  <p>Branch</p>
  <input type="text"  name="branch" placeholder="Enter Branch" required size="60"><br>
  
  <p>Country</p>
  <input type="text"  name="country" placeholder=" Your-Country" required size="60"><br>
   <p>City</p>
  <input type="text"  name="city" placeholder="Enter City" required size="60"><br>
  <p>Password</p>
  <input type="password" name="password" placeholder="Password" required size="60"><br><br>
  <button type="submit">Sign Up</button>
  </form>
  </div>

</html>