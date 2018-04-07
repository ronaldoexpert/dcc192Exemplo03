<%@page import="dcc192Exemplo03.ListaDeTarefas"%>
<%@page import="dcc192Exemplo03.Tarefas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Tarefas</title>
    </head>
    <body>
        <h1>Lista de Tarefas</h1>
        <ul>
            <%
                for(Tarefas tarefas : ListaDeTarefas.getInstance()) {
            %>   
                <li><%=tarefas.getTitulo()%></li>
            <%        
            }
            %>
        </ul>
            
    </body>
</html>
