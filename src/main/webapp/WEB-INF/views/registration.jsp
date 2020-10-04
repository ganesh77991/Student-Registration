<%@ page contentType="text/html;charset=UTF-8" language="java"
	isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<title>Student portal</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

</head>
<body>
	<nav class="navbar navbar-dark bg-primary">
		<a class="navbar-brand" href="#">Enter Student Details</a>
	</nav>

	<div class="container-fluid" style="margin-top: 50px">
		<div class="container">
			<form action="register" method="post">
				<div class="form-group">
					<label>Student ID</label> <input type="text" class="form-control"
						name="studentId">
				</div>
				<div class="form-group">
					<label>Student Name</label> <input type="text" class="form-control"
						name="studentName">
				</div>
				<div class="radio" name="gender">
      <label><input type="radio" name="gender" value="Male" checked>Male</label>
    
      <label><input type="radio" name="gender" value="Female" checked>Female</label>
    </div>

				<div class="form-group">
					<label for="course">Select Course:</label> <select
						class="form-control" name="course" id="course" >
						<option></option>
						<option value="MCA" >MCA</option>
						<option value="MBA">MBA</option>
						<option value="BTech">BTech</option>
					</select>
				</div>

			
				<div class="form-group">
					<label>Branch</label> <input type="text" class="form-control"
						name="branch">
				</div>
				<div class="form-group">
					<label>Date of birth</label> <input type="date"
						class="form-control" placeholder = "dd/mm/yy" name="dob">
				</div>
				<div class="form-group">
					<label>email</label> <input type="email" class="form-control"
						name="email">
				</div>
				<div class="form-group">
					<label>password</label> <input type="password" class="form-control"
						name="password">
				</div>
				<div class="form-group">
					<label>Address</label> <input type="text" class="form-control"
						name="address">
				</div>
				<button class="btn btn-primary">submit</button>
			</form>
		</div>
	</div>
	
</body>
</html>