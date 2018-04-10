package dcc192Exemplo03;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/muda-status.html", "/edita.html", "/TarefasServlet.html", "/nova.html", "/excluir.html"})
public class TarefasServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
         if("/TarefasServlet.html".equals(request.getServletPath())){
             listarTarefas(request, response);
         }else if ("/nova.html".equals(request.getServletPath())){
            criarTarefaForm(request, response);
         }else if ("/edita.html".equals(request.getServletPath())){
            editaTarefaForm(request, response);
         }else if ("/muda-status.html".equals(request.getServletPath())){
            mudaStatus(request, response);
         }else if ("/excluir.html".equals(request.getServletPath())){
            exlcuiTarefaForm(request, response);
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
    
    private void editaTarefaForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Tarefas> tarefas = new ListaDeTarefas().getInstance();
        int i = Integer.parseInt(request.getParameter("id"));
        request.setAttribute("tarefas", tarefas.get(i));        
        
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/tarefas-edita.jsp");        
        despachante.forward(request, response);
    }
    private void mudaStatus(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Tarefas> tarefas = new ListaDeTarefas().getInstance();
        request.setAttribute("tarefas", tarefas);
        
        Tarefas tarefa = new Tarefas(ListaDeTarefas.getInstance().get(Integer.parseInt(request.getParameter("id"))).getTitulo(), ListaDeTarefas.getInstance().get(Integer.parseInt(request.getParameter("id"))).getDescricao());
            
        if (!ListaDeTarefas.getInstance().get(Integer.parseInt(request.getParameter("id"))).isConcluida()) {
            tarefa.setConcluida(true);
        }else{
            tarefa.setConcluida(false);
        }            

        ListaDeTarefas.getInstance().set(Integer.parseInt(request.getParameter("id")), tarefa);
            
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/tarefas-listar.jsp");        
        despachante.forward(request, response);
    }
    
    private void exlcuiTarefaForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Tarefas> tarefas = new ListaDeTarefas().getInstance();
        int i = Integer.parseInt(request.getParameter("id"));
        request.setAttribute("tarefas", tarefas.get(i));        
        
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/tarefas-excluir.jsp");        
        despachante.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if ("/nova.html".equals(req.getServletPath())){
            String titulo = req.getParameter("titulo");
            String descricao = req.getParameter("descricao");
            Tarefas tarefa = new Tarefas(titulo, descricao);
            ListaDeTarefas.getInstance().add(tarefa);
              
        }else if ("/edita.html".equals(req.getServletPath())){
            String titulo = req.getParameter("titulo");
            String descricao = req.getParameter("descricao");
            Tarefas tarefa = new Tarefas(titulo, descricao);
            ListaDeTarefas.getInstance().set(Integer.parseInt(req.getParameter("id")), tarefa);
        
        }else if ("/excluir.html".equals(req.getServletPath())){
            ListaDeTarefas.getInstance().remove(Integer.parseInt(req.getParameter("id")));
        }
        
        resp.sendRedirect("TarefasServlet.html"); 
    }
}
