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
            <label>Descrição: <input type="text" name="descricao" value="" rows=4 /> </label>
            
            <input type="submit" value="Gavar" />
            <input type="reset" value="Apagar" />
        </form>
    </body>
</html>
