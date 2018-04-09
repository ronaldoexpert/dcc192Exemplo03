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
            <th>ID</th>
            <th>Status</th>
            <th>Titulo</th>
            <th colspan = 2>Descricao</th>
            <%
                int i = 0;
                for(Tarefas tarefas : (List<Tarefas>) request.getAttribute("tarefas")) {
            %>   
            <tr>
                <td><%=i%></td>
                <td><a href='muda-status.html'><%=tarefas.isConcluida()%></a></td>
                <td><%=tarefas.getTitulo()%></td>
                <td><%=tarefas.getDescricao()%></td>
                <td><a href='edita.html?id=<%=i%>'>Editar</a> <a href='apaga.html?id=<%=i%>'>Excluir</a></td>                
            </tr>
            <%
                i++;
            }            
            %>
        <tfoot>
            <tr>
                <td colspan = 5><a href='nova.html'>Nova Tarefas</a></td>
            </tr>        
        </tfoot>
        </table>
            
    </body>
    
</html>
