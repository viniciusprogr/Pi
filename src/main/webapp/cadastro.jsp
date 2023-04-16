<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>

<html>

<head>
    
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

	<title>Cadastro</title>
	
    <link rel="stylesheet" href="./css/cadastro.css">

	
</head>

<body>

    <div class="container">

        <form action="Cadastrar" method="post">
		
          <h2>Cadastro</h2>
          
          
		  <label for="RA">RA:</label>
          <input type="text" id="RA" name="RA" required>
          
          <label for="name">Nome:</label>
          <input type="text" id="name" name="name" required>
		  
          <label for="email">E-mail:</label>
          <input type="email" id="email" name="email" required>
          
          <label for="dataNascimento">Email:</label>
          <input type="date" id="dataNascimento" name="dataNascimento" required>
          
          <label for="password">Senha:</label>
          <input type="password" id="senha" name="senha" required>

          <button type="submit">Cadastrar</button>

        </form>

      </div>

</body>

</html>