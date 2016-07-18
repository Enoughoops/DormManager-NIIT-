package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.lero.model.Admin;
import com.lero.model.DormManager;
import com.lero.model.Student;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	if(request.getAttribute("user")==null){
		String userName=null;
		String password=null;
		String userType=null;
		String remember=null;
		
		Cookie[] cookies=request.getCookies();
		for(int i=0;cookies!=null && i<cookies.length;i++){
			if(cookies[i].getName().equals("dormuser")){
				userName=cookies[i].getValue().split("-")[0];
				password=cookies[i].getValue().split("-")[1];
				userType=cookies[i].getValue().split("-")[2];
				remember=cookies[i].getValue().split("-")[3];
			}
		}
		
		if(userName==null){
			userName="";
		}
		
		if(password==null){
			password="";
		}
		
		if(userType==null){
			userType="";
		} else if("admin".equals(userType)){
			pageContext.setAttribute("user", new Admin(userName,password));
			pageContext.setAttribute("userType", 1);
		} else if("dormManager".equals(userType)) {
			pageContext.setAttribute("user", new DormManager(userName,password));
			pageContext.setAttribute("userType", 2);
		} else if("student".equals(userType)) {
			pageContext.setAttribute("user", new Student(userName,password));
			pageContext.setAttribute("userType", 3);
		}
		
		if("yes".equals(remember)) {
			pageContext.setAttribute("remember", 1);
		}
		
	}

      out.write("\r\n");
      out.write("<html lang=\"zh\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>宿舍管理系统登录</title>\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/bootstrap/css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/bootstrap/css/bootstrap-responsive.css\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/bootstrap/js/jQuery.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/bootstrap/js/bootstrap.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction checkForm() {\r\n");
      out.write("\t\tvar userName = document.getElementById(\"userName\").value;\r\n");
      out.write("\t\tvar password = document.getElementById(\"password\").value;\r\n");
      out.write("\t\tvar userTypes = document.getElementsByName(\"userType\");\r\n");
      out.write("\t\tvar userType = null;\r\n");
      out.write("\t\tfor(var i=0;i<userTypes.length;i++) {\r\n");
      out.write("\t\t\tif(userTypes[i].checked) {\r\n");
      out.write("\t\t\t\tuserType=userTypes[i].value;\r\n");
      out.write("\t\t\t\tbreak;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif (userName == null || userName == \"\") {\r\n");
      out.write("\t\t\tdocument.getElementById(\"error\").innerHTML = \"用户名不能为空\";\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif (password == null || password == \"\") {\r\n");
      out.write("\t\t\tdocument.getElementById(\"error\").innerHTML = \"密码不能为空\";\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif (userType == null || userType == \"\") {\r\n");
      out.write("\t\t\tdocument.getElementById(\"error\").innerHTML = \"请选择用户类型\";\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\t  body {\r\n");
      out.write("        padding-top: 200px;\r\n");
      out.write("        padding-bottom: 40px;\r\n");
      out.write("        background-image: url('images/bg.jpg');\r\n");
      out.write("        background-position: center;\r\n");
      out.write("\t\tbackground-repeat: no-repeat;\r\n");
      out.write("\t\tbackground-attachment: fixed;\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      .radio {\r\n");
      out.write("      \tpadding-top: 10px;\r\n");
      out.write("       \tpadding-bottom:10px;\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      .form-signin-heading{\r\n");
      out.write("      \ttext-align: center;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .form-signin {\r\n");
      out.write("        max-width: 300px;\r\n");
      out.write("        padding: 19px 29px 0px;\r\n");
      out.write("        margin: 0 auto 20px;\r\n");
      out.write("        background-color: #fff;\r\n");
      out.write("        border: 1px solid #e5e5e5;\r\n");
      out.write("        -webkit-border-radius: 5px;\r\n");
      out.write("           -moz-border-radius: 5px;\r\n");
      out.write("                border-radius: 5px;\r\n");
      out.write("        -webkit-box-shadow: 0 1px 2px rgba(0,0,0,.05);\r\n");
      out.write("           -moz-box-shadow: 0 1px 2px rgba(0,0,0,.05);\r\n");
      out.write("                box-shadow: 0 1px 2px rgba(0,0,0,.05);\r\n");
      out.write("      }\r\n");
      out.write("      .form-signin .form-signin-heading,\r\n");
      out.write("      .form-signin .checkbox {\r\n");
      out.write("        margin-bottom: 10px;\r\n");
      out.write("      }\r\n");
      out.write("      .form-signin input[type=\"text\"],\r\n");
      out.write("      .form-signin input[type=\"password\"] {\r\n");
      out.write("        font-size: 16px;\r\n");
      out.write("        height: auto;\r\n");
      out.write("        margin-bottom: 15px;\r\n");
      out.write("        padding: 7px 9px;\r\n");
      out.write("      }\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("      <form name=\"myForm\" class=\"form-signin\" action=\"login\" method=\"post\" onsubmit=\"return checkForm()\">\r\n");
      out.write("        <h2 class=\"form-signin-heading\"><font color=\"gray\">宿舍管理系统</font></h2>\r\n");
      out.write("        <input id=\"userName\" name=\"userName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.userName }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" class=\"input-block-level\" placeholder=\"用户名...\">\r\n");
      out.write("        <input id=\"password\" name=\"password\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.password }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"password\" class=\"input-block-level\" placeholder=\"密码...\" >\r\n");
      out.write("        <label class=\"radio inline\">\r\n");
      out.write("      \t  \t<input id=\"admin\" type=\"radio\" name=\"userType\" value=\"admin\"  checked/> 系统管理员\r\n");
      out.write("\t\t</label>\r\n");
      out.write("\t\t<label class=\"radio inline\">\r\n");
      out.write("\t\t\t<input id=\"dormManager\" type=\"radio\" name=\"userType\" value=\"dormManager\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userType==2?'checked':''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" /> 宿舍管理员\r\n");
      out.write("\t\t</label>\r\n");
      out.write("\t\t<label class=\"radio inline\">\r\n");
      out.write("\t\t\t<input id=\"student\" type=\"radio\" name=\"userType\" value=\"student\"  ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userType==3?'checked':''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/> 学生\r\n");
      out.write("\t\t</label>\r\n");
      out.write("        <label class=\"checkbox\">\r\n");
      out.write("          <input id=\"remember\" name=\"remember\" type=\"checkbox\" value=\"remember-me\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${remember==1?'checked':''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">记住我 &nbsp;&nbsp;&nbsp;&nbsp; <font id=\"error\" color=\"red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</font>  \r\n");
      out.write("        </label>\r\n");
      out.write("        <button class=\"btn btn-large btn-primary\" type=\"submit\">登录</button>\r\n");
      out.write("        &nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("        <button class=\"btn btn-large btn-primary\" type=\"button\" >重置</button>\r\n");
      out.write("\r\n");
      out.write("\t\t<p align=\"center\" style=\"padding-top: 15px;\">版权所有  2014  Lero  <a href=\"http://www.lero.com\" target=\"_blank\">http://www.lero.com</a></p>\r\n");
      out.write("      </form>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
