/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.28
 * Generated at: 2016-02-23 22:08:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastro_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("/add-on/footer.jspf", Long.valueOf(1453569762000L));
    _jspx_dependants.put("jar:file:/home/dragonshit/Documents/Copy/TSI/P5/PWEBII/prova1/Calendar/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/CalendarWarS/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098721890000L));
    _jspx_dependants.put("/add-on/header.jspf", Long.valueOf(1455728398000L));
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1194286810000L));
    _jspx_dependants.put("jar:file:/home/dragonshit/Documents/Copy/TSI/P5/PWEBII/prova1/Calendar/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/CalendarWarS/WEB-INF/lib/standard.jar!/META-INF/fn.tld", Long.valueOf(1098721890000L));
    _jspx_dependants.put("/add-on/menu.jspf", Long.valueOf(1456077387000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("\t\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>CalendarWars</title>\n");
      out.write("\n");
      out.write("<!-- Latest compiled and minified CSS -->\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\"\n");
      out.write("\tintegrity=\"sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7\"\n");
      out.write("\tcrossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("<!-- Optional theme -->\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css\"\n");
      out.write("\tintegrity=\"sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r\"\n");
      out.write("\tcrossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("<!-- Latest compiled and minified JavaScript -->\n");
      out.write("<script src=\"js/jquery.js\"></script>\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"\n");
      out.write("\tintegrity=\"sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS\"\n");
      out.write("\tcrossorigin=\"anonymous\"></script>\n");
      out.write("\t<script src=\"js/cWars.js\"></script>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://code.getmdl.io/1.1.1/material.indigo-pink.min.css\">\n");
      out.write("<script defer src=\"https://code.getmdl.io/1.1.1/material.min.js\"></script>\n");
      out.write("\t<!-- Uses a transparent header that draws on top of the layout's background -->\n");
      out.write("\t<style>\n");
      out.write(".demo-layout-transparent {\n");
      out.write("\tbackground: #303F9F;\n");
      out.write("}\n");
      out.write(".mdl-layout-title a{\n");
      out.write("\tcolor:white;\n");
      out.write("\t\n");
      out.write("}\n");
      out.write(".mdl-layout-title:hover{\n");
      out.write("\tcolor:white;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("}\n");
      out.write(".demo-layout-transparent .mdl-layout__header, .demo-layout-transparent .mdl-layout__drawer-button\n");
      out.write("\t{\n");
      out.write("\tcolor: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".title-calendar {\n");
      out.write("\tfont-weight:bold;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t");
      out.write('\n');
      out.write("<div class=\"demo-layout-transparent mdl-layout mdl-js-layout\">\n");
      out.write("\t<header class=\"mdl-layout__header mdl-layout__header--transparent\">\n");
      out.write("\t\t<div class=\"mdl-layout__header-row\">\n");
      out.write("\t\t\t<!-- Title -->\n");
      out.write("\t\t\t<span class=\"mdl-layout-title\"> <a href=\"");
      out.print(request.getContextPath());
      out.write("/index.jsp\" ><img src=\"img/img2.png\"\n");
      out.write("\t\t\t\twidth=\"60\"> <span class=\"title-calendar\">CalendarWars - Welcome ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ sessionScope.user.name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" </span></a>\n");
      out.write("\t\t\t</span>\n");
      out.write("\t\t\t<!-- Add spacer, to align navigation to the right -->\n");
      out.write("\t\t\t<div class=\"mdl-layout-spacer\"></div>\n");
      out.write("\t\t\t<!-- Navigation -->\n");
      out.write("\t\t\t<nav class=\"mdl-navigation\">\n");
      out.write("\t\t\t\t<a class=\"mdl-navigation__link\" href=\"");
      out.print(request.getContextPath());
      out.write("/login.jsp\">Login</a>\n");
      out.write("\t\t\t</nav>\n");
      out.write("\t\t</div>\n");
      out.write("\t</header>\n");
      out.write("\t<div class=\"mdl-layout__drawer\">\n");
      out.write("\t\t<span class=\"mdl-layout-title\"> <img src=\"img/img2.png\"\n");
      out.write("\t\t\twidth=\"60\"> <span class=\"title-calendar\">CalendarWars</span>\n");
      out.write("\t\t</span>\n");
      out.write("\t\t<nav class=\"mdl-navigation\">\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t<a class=\"mdl-navigation__link\" href=\"cadastro\">Cadastrar</a>\n");
      out.write("\t\t\t<a class=\"mdl-navigation__link\" href=\"logout\">Sair</a> \n");
      out.write("\t\t</nav>\n");
      out.write("\t</div>\n");
      out.write("\t<main class=\"mdl-layout__content\"> ");
      out.write("\n");
      out.write("<!-- Square card -->\n");
      out.write("<style>\n");
      out.write(".demo-card-square.mdl-card {\t\n");
      out.write("\theight: 420px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".demo-card-square>.mdl-card__title {\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tbackground: url('img/img2.png') bottom right 15% no-repeat #303F9F;\n");
      out.write("\tbackground-size: 35%; \n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("\t<div class=\"row\">\n");
      out.write("\t\t<div class=\"col-md-4 col-md-offset-4\" style=\"margin-top: 10px;\">\n");
      out.write("\t\t\t<p class=\"text-center\" style=\"color:white\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ error }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("\t\t\t<div class=\"demo-card-square mdl-card mdl-shadow--2dp\">\n");
      out.write("\t\t\t\t<div class=\"mdl-card__title mdl-card--expand\">\n");
      out.write("\t\t\t\t\t<h2 class=\"mdl-card__title-text\">Cadastro</h2>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"mdl-card__supporting-text\">\n");
      out.write("\t\t\t\t\t<form action=\"cadastro\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t<div class=\"mdl-textfield mdl-js-textfield\">\n");
      out.write("\t\t\t\t\t\t    <input class=\"mdl-textfield__input\" type=\"text\" name=\"name\" id=\"name\">\n");
      out.write("\t\t\t\t\t\t    <label class=\"mdl-textfield__label\" for=\"name\">What you name?</label>\n");
      out.write("\t\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t\t<div class=\"mdl-textfield mdl-js-textfield\">\n");
      out.write("\t\t\t\t\t\t    <input class=\"mdl-textfield__input\" type=\"text\" name=\"login\" id=\"login\">\n");
      out.write("\t\t\t\t\t\t    <label class=\"mdl-textfield__label\" for=\"login\">Login...</label>\n");
      out.write("\t\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t\t  <div class=\"mdl-textfield mdl-js-textfield\">\n");
      out.write("\t\t\t\t\t\t    <input class=\"mdl-textfield__input\" type=\"password\" name=\"pass\" id=\"pass\">\n");
      out.write("\t\t\t\t\t\t    <label class=\"mdl-textfield__label\" for=\"pass\">Password...</label>\n");
      out.write("\t\t\t\t\t\t  </div>\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"mdl-card__actions mdl-card--border\">\n");
      out.write("\t\t\t\t\t<button type=\"submit\" class=\"mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect\">\n");
      out.write("\t\t\t\t\t\tEntrar</button>\n");
      out.write("\t\t\t\t</div></form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("</main>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /add-on/menu.jspf(21,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ sessionScope.user != null}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t<a class=\"mdl-navigation__link\" href=\"admin\">Admin</a> \n");
        out.write("\t\t\t\t<a class=\"mdl-navigation__link\" href=\"calendar\">Calendar</a> \n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }
}
