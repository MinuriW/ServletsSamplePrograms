import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;


 
@WebServlet("/Display")
public class Display extends HttpServlet {
    private static final long serialVersionUID = 1L;


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        String eventType = request.getParameter("eventType");
        String type=request.getParameter("type");
        int no = Integer.parseInt(request.getParameter("tickets"));
        double cost=0.0;
        if(type.equals("Platinum")){
           cost=250.0*no; 
        }
        else if(type.equals("Gold")){
            cost=200.0*no;
        }
        else if(type.equals("Silver")){
            cost=150.0*no;
        }
        pw.println("<h1>Welcome to "+eventType+"</h1>");
        pw.println("<p>The total ticket cost for the type "+type+" and number of tickets "+no+" is "+cost+" only.</p>");
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

}