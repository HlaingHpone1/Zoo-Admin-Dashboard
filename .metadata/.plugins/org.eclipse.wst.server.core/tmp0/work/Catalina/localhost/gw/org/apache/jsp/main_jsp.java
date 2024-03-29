/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.12
 * Generated at: 2023-11-14 22:43:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
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

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
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
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"UTF-8\" />\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("    <title>Admin Login page</title>\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"./img/fav.jpg   \" type=\"image/x-icon\" />\r\n");
      out.write("\r\n");
      out.write("    <!-- Boostrap 5 CSS -->\r\n");
      out.write("    <link\r\n");
      out.write("      href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\"\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("      integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\"\r\n");
      out.write("      crossorigin=\"anonymous\"\r\n");
      out.write("    />\r\n");
      out.write("\r\n");
      out.write("    <!--Fontawsome CSS -->\r\n");
      out.write("    <link\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("      href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css\"\r\n");
      out.write("      integrity=\"sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==\"\r\n");
      out.write("      crossorigin=\"anonymous\"\r\n");
      out.write("      referrerpolicy=\"no-referrer\"\r\n");
      out.write("    />\r\n");
      out.write("\r\n");
      out.write("    <!-- Data Table CSS -->\r\n");
      out.write("    <link\r\n");
      out.write("      href=\"https://cdn.datatables.net/v/bs5/dt-1.13.6/datatables.min.css\"\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("    />\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/style.css\" />\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("        body{\r\n");
      out.write("            background: #00000073 url(\"./img/bg12.jpg\");\r\n");
      out.write("            background-position: center;\r\n");
      out.write("            background-repeat: no-repeat;\r\n");
      out.write("            background-size: cover;\r\n");
      out.write("            background-blend-mode: multiply;\r\n");
      out.write("            \r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body class=\"vh-100 overflow-hidden\">\r\n");
      out.write("    <!-- top navigation bar -->\r\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark sticky-top \">\r\n");
      out.write("		<div class=\"container-fluid\">\r\n");
      out.write("			<button\r\n");
      out.write("			class=\"navbar-toggler\"\r\n");
      out.write("			type=\"button\"\r\n");
      out.write("			data-bs-toggle=\"offcanvas\"\r\n");
      out.write("			data-bs-target=\"#sidebar\"\r\n");
      out.write("			aria-controls=\"offcanvasExample\"\r\n");
      out.write("			>\r\n");
      out.write("			<span class=\"navbar-toggler-icon\" data-bs-target=\"#sidebar\"></span>\r\n");
      out.write("			</button>\r\n");
      out.write("			<a class=\"navbar-brand me-auto ms-lg-0 ms-3 text-uppercase fs-1 fw-bold\" href=\"../index.jsp\">Go Wild Wildlife Park Dashboard</a>\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"collapse navbar-collapse\" id=\"topNavBar\">\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</nav>	\r\n");
      out.write("    <!-- top navigation bar -->\r\n");
      out.write("    <!-- offcanvas -->\r\n");
      out.write("	<div\r\n");
      out.write("		class=\"offcanvas offcanvas-start sidebar-nav bg-dark\"\r\n");
      out.write("		tabindex=\"-1\"\r\n");
      out.write("		id=\"sidebar\"\r\n");
      out.write("		>\r\n");
      out.write("		<div class=\"offcanvas-body p-0\">\r\n");
      out.write("			<nav class=\"navbar-dark\">\r\n");
      out.write("			<ul class=\"navbar-nav\">\r\n");
      out.write("				<li>\r\n");
      out.write("                    <div class=\"text-muted small fw-bold text-uppercase px-3\">\r\n");
      out.write("                        Admin\r\n");
      out.write("                    </div>\r\n");
      out.write("				</li>\r\n");
      out.write("				<li>\r\n");
      out.write("                    <a href=\"../index.jsp\" class=\"nav-link px-3 active\">\r\n");
      out.write("                        <span class=\"me-2\"><i class=\"fas fa-tachometer-alt-slow\"></i></span>\r\n");
      out.write("                        <s class=\"text-decoration-none\">Dashboard</s>\r\n");
      out.write("                    </a>\r\n");
      out.write("				</li>\r\n");
      out.write("				<li class=\"my-4\"><hr class=\"dropdown-divider bg-light\" /></li>\r\n");
      out.write("				<li>\r\n");
      out.write("					<div class=\"text-muted small fw-bold text-uppercase px-3 mb-3\">\r\n");
      out.write("						Interface\r\n");
      out.write("					</div>\r\n");
      out.write("				</li>\r\n");
      out.write("				<li>\r\n");
      out.write("					<a class=\"nav-link px-3\" href=\"./animal/index.jsp\">\r\n");
      out.write("						<span class=\"me-2\"><i class=\"fa-solid fa-paw\"></i></span>\r\n");
      out.write("						<span>Animal</span>\r\n");
      out.write("					</a>\r\n");
      out.write("                </li>\r\n");
      out.write("				<li>\r\n");
      out.write("                    <a class=\"nav-link px-3\" href=\"./specie/index.jsp\">\r\n");
      out.write("						<span class=\"me-2\"><i class=\"fa-solid fa-sitemap\"></i></span>\r\n");
      out.write("						<span>Specie</span>\r\n");
      out.write("					</a>\r\n");
      out.write("				</li>\r\n");
      out.write("				<li>\r\n");
      out.write("					<a class=\"nav-link px-3\" href=\"./keeper/index.jsp\">\r\n");
      out.write("						<span class=\"me-2\"><i class=\"fa-solid fa-users-line\"></i></span>\r\n");
      out.write("						<span>Keeper</span>\r\n");
      out.write("					</a>\r\n");
      out.write("				</li>\r\n");
      out.write("				<li>\r\n");
      out.write("					<a class=\"nav-link px-3\" href=\"./diet/index.jsp\">\r\n");
      out.write("						<span class=\"me-2\"><i class=\"fa-solid fa-utensils\"></i></span>\r\n");
      out.write("						<span>Diet</span>\r\n");
      out.write("					</a>\r\n");
      out.write("				</li>\r\n");
      out.write("				<li>\r\n");
      out.write("					<a class=\"nav-link px-3\" href=\"./enclosure/index.jsp\">\r\n");
      out.write("						<span class=\"me-2\"><i class=\"fa-solid fa-mountain-city\"></i></span>\r\n");
      out.write("						<span>Enclosure</span>\r\n");
      out.write("					</a>\r\n");
      out.write("				</li>\r\n");
      out.write("				<li>\r\n");
      out.write("					<a class=\"nav-link px-3\" href=\"./query/index.jsp\">\r\n");
      out.write("						<span class=\"me-2\"><i class=\"fa-solid fa-paperclip\"></i></span>\r\n");
      out.write("						<span>Report 1</span>\r\n");
      out.write("					</a>\r\n");
      out.write("				</li>\r\n");
      out.write("				<li>\r\n");
      out.write("					<a class=\"nav-link px-3\" href=\"./query/index1.jsp\">\r\n");
      out.write("						<span class=\"me-2\"><i class=\"fa-solid fa-paperclip\"></i></span>\r\n");
      out.write("						<span>Report 2</span>\r\n");
      out.write("					</a>\r\n");
      out.write("				</li>\r\n");
      out.write("				<li class=\"my-4\"><hr class=\"dropdown-divider bg-light\" /></li>\r\n");
      out.write("				\r\n");
      out.write("\r\n");
      out.write("			</ul>\r\n");
      out.write("			</nav>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("    <!-- offcanvas -->\r\n");
      out.write("	\r\n");
      out.write("    <div class=\"container-fluid h-75 d-flex justify-content-center align-items-center\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-12\">\r\n");
      out.write("                <img class=\"img d-block w-50 h-50 mx-auto object-fit-contain\" src=\"./img/bg11.png\" alt=\"\">\r\n");
      out.write("                <h1 class=\"display-1 text-center text-white\">Hello Welcome to <br> GO Wild Wildlife Park</h1>\r\n");
      out.write("                <p class=\"text-center text-white w-75 mx-auto\">\r\n");
      out.write("                    Welcome to the Go Wild Wildlife Park admin page, your gateway to the heart of our sanctuary for nature enthusiasts and animal lovers. At Go Wild, we're committed to the preservation and celebration of the world's incredible biodiversity. This admin portal empowers our dedicated team to manage and maintain the park's daily operations, ensuring that our resident wildlife is provided with the best care and attention. Whether you're a member of our staff or a partner in conservation, this platform offers a seamless experience for everything from animal health records and visitor management to conservation initiatives and educational programs. Together, we are working towards a harmonious coexistence between humanity and the wild, fostering a deeper understanding and appreciation for the incredible creatures we share our planet with. Thank you for being a part of this important mission.</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Boostrap 5 JS -->\r\n");
      out.write("    <script\r\n");
      out.write("      src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("      integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\"\r\n");
      out.write("      crossorigin=\"anonymous\"\r\n");
      out.write("    ></script>\r\n");
      out.write("\r\n");
      out.write("    <script\r\n");
      out.write("      src=\"https://code.jquery.com/jquery-3.7.1.js\"\r\n");
      out.write("      integrity=\"sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=\"\r\n");
      out.write("      crossorigin=\"anonymous\"\r\n");
      out.write("    ></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Data Table JS -->\r\n");
      out.write("    <script src=\"https://cdn.datatables.net/v/bs5/dt-1.13.6/datatables.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("      $(document).ready(function () {\r\n");
      out.write("        $(\"#datatable\").DataTable();\r\n");
      out.write("      });\r\n");
      out.write("    </script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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
}
