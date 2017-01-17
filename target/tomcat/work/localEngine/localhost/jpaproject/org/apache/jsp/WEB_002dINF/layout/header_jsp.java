package org.apache.jsp.WEB_002dINF.layout;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<h3>Welcome!</h3>\r\n");
      out.write("\r\n");
      out.write("<div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("\r\n");
      out.write("\t<ol class=\"carousel-indicators\">\r\n");
      out.write("\t\t<li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("\t\t<li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\r\n");
      out.write("\t</ol>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"carousel-inner\" role=\"listbox\">\r\n");
      out.write("\t\t<div class=\"item active\">\r\n");
      out.write("\t\t\t<img src=\"http://www.smallbusinessdoctors.com/wp-content/uploads/2015/09/business-consulting2.jpg\" alt=\"Carts\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"item\">\r\n");
      out.write("\t\t\t<img src=\"http://betaland.hu/wp-content/uploads/kapcsolat2.jpg\" alt=\"Users\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<a class=\"left carousel-control\" href=\"#myCarousel\" role=\"button\"\r\n");
      out.write("\t\tdata-slide=\"prev\"> <span class=\"glyphicon glyphicon-chevron-left\"\r\n");
      out.write("\t\taria-hidden=\"true\"></span> <span class=\"sr-only\">Previous</span>\r\n");
      out.write("\t</a> <a class=\"right carousel-control\" href=\"#myCarousel\" role=\"button\"\r\n");
      out.write("\t\tdata-slide=\"next\"> <span class=\"glyphicon glyphicon-chevron-right\"\r\n");
      out.write("\t\taria-hidden=\"true\"></span> <span class=\"sr-only\">Next</span>\r\n");
      out.write("\t</a>\r\n");
      out.write("</div>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
