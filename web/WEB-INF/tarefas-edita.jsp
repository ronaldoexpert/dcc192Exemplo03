<%@page import="java.util.List"%>
<%@page import="dcc192Exemplo03.ListaDeTarefas"%>
<%@page import="dcc192Exemplo03.Tarefas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Tarefa</title>
    </head>
    <body>
        <h1>Editar Tarefa</h1>
            <%
                Tarefas t;
                t = (Tarefas)request.getAttribute("tarefas");
            %>   
        <form method="post">
            <label>ID: <input type="text" name="id" size="2" value="<%=request.getParameter("id")%>" disabled="disable" /> </label>
            <br>
            <label>Título: <input type="text" name="titulo" value="<%=t.getTitulo()%>"/> </label>
            <br>
            <label>Descrição:</label>
            <BR>    
            <textarea name="descricao" rows="5"><%=t.getDescricao()%></textarea> 
            <br>
            <input type="submit" value="Gravar" />
            
        </form>
    </body>
</html>