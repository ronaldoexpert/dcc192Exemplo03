<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nova Tarefa</title>
    </head>
    <body>
        <h1>Nova Tarefa</h1>
        <form method="post">
            <label>Título: <input type="text" name="titulo" value="" /> </label>
            <br>
            <label>Descrição:</label>
            <BR>
            <textarea name="descricao" rows="5"></textarea> 
            <br>
            <input type="submit" value="Gavar" />
            
        </form>
    </body>
</html>
