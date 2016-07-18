package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.lero.model.Admin;
import com.lero.model.DormManager;
import com.lero.model.Student;

public final class mainStudent_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"zh\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>宿舍管理系统</title>\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/style/dorm.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/bootstrap/css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/bootstrap/css/bootstrap-responsive.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/bootstrap-datetimepicker-master/css/bootstrap-datetimepicker.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"http://sandbox.runjs.cn/uploads/rs/238/n8vhm36h/dataTables.bootstra.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://sandbox.runjs.cn/uploads/rs/238/n8vhm36h/jquery.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://sandbox.runjs.cn/uploads/rs/238/n8vhm36h/jquery.dataTables.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://sandbox.runjs.cn/uploads/rs/238/n8vhm36h/bootstrap.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://sandbox.runjs.cn/uploads/rs/238/n8vhm36h/dataTables.bootstrap.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/bootstrap-datetimepicker-master/js/bootstrap-datetimepicker.js\" charset=\"UTF-8\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/bootstrap-datetimepicker-master/js/locales/bootstrap-datetimepicker.fr.js\" charset=\"UTF-8\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/bootstrap/js/bootstrap.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("   \t \t$(\"#DataTables_Table_0_wrapper .row-fluid\").remove();\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\t  .bs-docs-sidenav {\r\n");
      out.write("    background-color: #fff;\r\n");
      out.write("    border-radius: 6px;\r\n");
      out.write("    box-shadow: 0 1px 4px rgba(0, 0, 0, 0.067);\r\n");
      out.write("    padding: 0;\r\n");
      out.write("    width: 228px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bs-docs-sidenav > li > a {\r\n");
      out.write("    border: 1px solid #e5e5e5;\r\n");
      out.write("    display: block;\r\n");
      out.write("    padding: 8px 14px;\r\n");
      out.write("    margin: 0 0 -1px;\r\n");
      out.write("}\r\n");
      out.write(".bs-docs-sidenav > li:first-child > a {\r\n");
      out.write("    border-radius: 6px 6px 0 0;\r\n");
      out.write("}\r\n");
      out.write(".bs-docs-sidenav > li:last-child > a {\r\n");
      out.write("    border-radius: 0 0 6px 6px;\r\n");
      out.write("}\r\n");
      out.write(".bs-docs-sidenav > .active > a {\r\n");
      out.write("    border: 0 none;\r\n");
      out.write("    box-shadow: 1px 0 0 rgba(0, 0, 0, 0.1) inset, -1px 0 0 rgba(0, 0, 0, 0.1) inset;\r\n");
      out.write("    padding: 9px 15px;\r\n");
      out.write("    position: relative;\r\n");
      out.write("    text-shadow: 0 1px 0 rgba(0, 0, 0, 0.15);\r\n");
      out.write("    z-index: 2;\r\n");
      out.write("}\r\n");
      out.write(".bs-docs-sidenav .icon-chevron-right {\r\n");
      out.write("    float: right;\r\n");
      out.write("    margin-right: -6px;\r\n");
      out.write("    margin-top: 2px;\r\n");
      out.write("    opacity: 0.25;\r\n");
      out.write("}\r\n");
      out.write(".bs-docs-sidenav > li > a:hover {\r\n");
      out.write("    background-color: #f5f5f5;\r\n");
      out.write("}\r\n");
      out.write(".bs-docs-sidenav a:hover .icon-chevron-right {\r\n");
      out.write("    opacity: 0.5;\r\n");
      out.write("}\r\n");
      out.write(".bs-docs-sidenav .active .icon-chevron-right, .bs-docs-sidenav .active a:hover .icon-chevron-right {\r\n");
      out.write("    background-image: url(\"../img/glyphicons-halflings-white.png\");\r\n");
      out.write("    opacity: 1;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container-fluid\" style=\"padding-right: 0px;padding-left: 0px;\">\r\n");
      out.write("\t<div region=\"north\" style=\"height: 100px;background-image: url('images/bg.jpg')\">\r\n");
      out.write("\t\t<div align=\"left\" style=\"width: 80%;height:100px ;float: left;padding-top: 40px;padding-left: 30px;\" ><font color=\"white\" size=\"6\" >宿舍管理系统</font></div>\r\n");
      out.write("\t\t<div style=\"padding-top: 70px;padding-right: 20px;\">当前用户：&nbsp;<font color=\"red\" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentUser.userName }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</font></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t\t<div class=\"span2 bs-docs-sidebar\" >\r\n");
      out.write("\t\t\t\t<ul class=\"nav nav-list bs-docs-sidenav\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"blank\"><i class=\"icon-chevron-right\"></i>首页</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"record?action=list\"><i class=\"icon-chevron-right\"></i>缺勤记录</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"password?action=preChange\"><i class=\"icon-chevron-right\"></i>修改密码</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"login.jsp\"><i class=\"icon-chevron-right\"></i>退出系统</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"span10\">\r\n");
      out.write("\t\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mainPage==null?'admin/blank.jsp':mainPage}", java.lang.String.class, (PageContext)_jspx_page_context, null), out, false);
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
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
