<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulario persona</title>
</head>
<body>
	<form:form modelAttribute="persona" action="verPersona" method="post">
		Nombre: <form:input id="nombre" path="nombre" />
		Edad: <form:input id="edad" path="edad" />
		<form:button value="Enviar">Enviar</form:button>
	</form:form>
</body>
</html>