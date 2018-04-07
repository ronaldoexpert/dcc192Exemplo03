<%@page import="java.util.List"%>
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
        <table border = 1>
            <th>Titulo</th>
            <th>Descricao</th>
            <%
                for(Tarefas tarefas : (List<Tarefas>) request.getAttribute("tarefas")) {
            %>   
            <tr>
                <td><%=tarefas.getTitulo()%></td>
                <td><%=tarefas.getDescricao()%></td>
            </tr>
            <%        
            }
            %>
        <tfoot>
            <tr>
                <td colspan = 2><a href='nova.html'>Nova Tarefas</a></td>
            </tr>        
        </tfoot>
        </table>
            
    </body>
    
</html>
