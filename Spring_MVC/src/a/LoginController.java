package a;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class LoginController implements Controller {
	
	LoginModel l;
	
	

	public void setL(LoginModel l) {
		this.l = l;
	}



	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		
		String s=arg0.getParameter("t1");
		s=l.convert(s);
		arg0.setAttribute("k", s);
		return new ModelAndView("/output.jsp");
	}

}
