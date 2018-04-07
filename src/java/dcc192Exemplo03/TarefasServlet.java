package dcc192Exemplo03;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/TarefasServlet.html", "/nova.html"})
public class TarefasServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
         if("/TarefasServlet.html".equals(request.getServletPath())){
             listarTarefas(request, response);
         }else if ("/nova.html".equals(request.getServletPath())){
            criarTarefaForm(request, response);
         }
    }

    private void listarTarefas(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List<Tarefas> tarefas = new ListaDeTarefas().getInstance();
        request.setAttribute("tarefas", tarefas);

        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/tarefas-listar.jsp");
        despachante.forward(request, response);
    }

    private void criarTarefaForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Tarefas> tarefas = new ListaDeTarefas().getInstance();
        request.setAttribute("tarefas", tarefas);

        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/tarefas-novo.jsp");
        despachante.forward(request, response);
    }

}
