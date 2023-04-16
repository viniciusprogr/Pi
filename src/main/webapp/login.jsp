<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>

<head>
    
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

	  <title>Login</title>
	
    <link rel="stylesheet" href="./css/login.css">

	
</head>

<body>

    <div class="container">

        <form>

          <h2>Login</h2>

          <label for="RA">RA:</label>
          <input type="text" id="RA" name="RA" required>

          <label for="password">Senha:</label>
          <input type="password" id="password" name="password" required>

          <button type="submit">Login</button>

        </form>

      </div>

</body>

</html>