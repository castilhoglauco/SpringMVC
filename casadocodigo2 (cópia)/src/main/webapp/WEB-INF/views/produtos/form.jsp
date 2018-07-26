<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/casadocodigo2/produtos2" method="post">
		<div>
			<label>Titulo</label>
			<input type="text" name="nome">
		</div>
		<div>
			<label>Descrição</label>
			<textarea rows="10" cols="20" name="descricao"></textarea>
		</div> 
		<div>
			<label>Paginas</label>
			<input title="text" name="paginas">
		</div>
		<div>
			<label>ISBN</label>
			<input title="text" name="isbn">
		</div>
		<div>
			<label>Genero</label>
			<input title="text" name="genero">
		</div>
		<button type="submit">Cadastrar</button>
	</form>

</body>
</html>