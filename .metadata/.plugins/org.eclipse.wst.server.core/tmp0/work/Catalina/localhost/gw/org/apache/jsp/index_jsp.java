/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.12
 * Generated at: 2023-11-14 06:00:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write(" \r\n");
      out.write("<head>\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <style>\r\n");
      out.write("    body {\r\n");
      out.write("      font-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("    }\r\n");
      out.write(" \r\n");
      out.write("    /* Full-width input fields */\r\n");
      out.write("    input[type=text],\r\n");
      out.write("    input[type=password] {\r\n");
      out.write("      width: 100%;\r\n");
      out.write("      padding: 12px 20px;\r\n");
      out.write("      margin: 8px 0;\r\n");
      out.write("      display: inline-block;\r\n");
      out.write("      border: 1px solid #ccc;\r\n");
      out.write("      box-sizing: border-box;\r\n");
      out.write("    }\r\n");
      out.write(" \r\n");
      out.write("    /* Set a style for all buttons */\r\n");
      out.write("    button {\r\n");
      out.write("      background-color: #04AA6D;\r\n");
      out.write("      color: white;\r\n");
      out.write("      padding: 14px 20px;\r\n");
      out.write("      margin: 8px 0;\r\n");
      out.write("      border: none;\r\n");
      out.write("      cursor: pointer;\r\n");
      out.write("      width: 100%;\r\n");
      out.write("    }\r\n");
      out.write(" \r\n");
      out.write("    button:hover {\r\n");
      out.write("      opacity: 0.8;\r\n");
      out.write("    }\r\n");
      out.write(" \r\n");
      out.write("    /* Extra styles for the cancel button */\r\n");
      out.write("    .cancelbtn {\r\n");
      out.write("      width: auto;\r\n");
      out.write("      padding: 10px 18px;\r\n");
      out.write("      background-color: #f44336;\r\n");
      out.write("    }\r\n");
      out.write(" \r\n");
      out.write("    /* Center the image and position the close button */\r\n");
      out.write("    .imgcontainer {\r\n");
      out.write("      text-align: center;\r\n");
      out.write("      margin: 24px 0 12px 0;\r\n");
      out.write("      position: relative;\r\n");
      out.write("    }\r\n");
      out.write(" \r\n");
      out.write("    img.avatar {\r\n");
      out.write("      width: 40%;\r\n");
      out.write("      border-radius: 50%;\r\n");
      out.write("    }\r\n");
      out.write(" \r\n");
      out.write("    .container {\r\n");
      out.write("      padding: 16px;\r\n");
      out.write("    }\r\n");
      out.write(" \r\n");
      out.write("    span.psw {\r\n");
      out.write("      float: right;\r\n");
      out.write("      padding-top: 16px;\r\n");
      out.write("    }\r\n");
      out.write(" \r\n");
      out.write("    /* The Modal (background) */\r\n");
      out.write("    .modal {\r\n");
      out.write("      display: none;\r\n");
      out.write("      /* Hidden by default */\r\n");
      out.write("      position: fixed;\r\n");
      out.write("      /* Stay in place */\r\n");
      out.write("      z-index: 1;\r\n");
      out.write("      /* Sit on top */\r\n");
      out.write("      left: 0;\r\n");
      out.write("      top: 0;\r\n");
      out.write("      width: 100%;\r\n");
      out.write("      /* Full width */\r\n");
      out.write("      height: 100%;\r\n");
      out.write("      /* Full height */\r\n");
      out.write("      overflow: auto;\r\n");
      out.write("      /* Enable scroll if needed */\r\n");
      out.write("      background-color: rgb(0, 0, 0);\r\n");
      out.write("      /* Fallback color */\r\n");
      out.write("      background-color: rgba(0, 0, 0, 0.4);\r\n");
      out.write("      /* Black w/ opacity */\r\n");
      out.write("      padding-top: 60px;\r\n");
      out.write("    }\r\n");
      out.write(" \r\n");
      out.write("    /* Modal Content/Box */\r\n");
      out.write("    .modal-content {\r\n");
      out.write("      background-color: #fefefe;\r\n");
      out.write("      margin: 5% auto 15% auto;\r\n");
      out.write("      /* 5% from the top, 15% from the bottom and centered */\r\n");
      out.write("      border: 1px solid #888;\r\n");
      out.write("      width: 80%;\r\n");
      out.write("      /* Could be more or less, depending on screen size */\r\n");
      out.write("    }\r\n");
      out.write(" \r\n");
      out.write("    /* The Close Button (x) */\r\n");
      out.write("    .close {\r\n");
      out.write("      position: absolute;\r\n");
      out.write("      right: 25px;\r\n");
      out.write("      top: 0;\r\n");
      out.write("      color: #000;\r\n");
      out.write("      font-size: 35px;\r\n");
      out.write("      font-weight: bold;\r\n");
      out.write("    }\r\n");
      out.write(" \r\n");
      out.write("    .close:hover,\r\n");
      out.write("    .close:focus {\r\n");
      out.write("      color: red;\r\n");
      out.write("      cursor: pointer;\r\n");
      out.write("    }\r\n");
      out.write(" \r\n");
      out.write("    /* Add Zoom Animation */\r\n");
      out.write("    .animate {\r\n");
      out.write("      -webkit-animation: animatezoom 0.6s;\r\n");
      out.write("      animation: animatezoom 0.6s\r\n");
      out.write("    }\r\n");
      out.write(" \r\n");
      out.write("    @-webkit-keyframes animatezoom {\r\n");
      out.write("      from {\r\n");
      out.write("        -webkit-transform: scale(0);\r\n");
      out.write("      }\r\n");
      out.write(" \r\n");
      out.write("      to {\r\n");
      out.write("        -webkit-transform: scale(1)\r\n");
      out.write("      }\r\n");
      out.write("    }\r\n");
      out.write(" \r\n");
      out.write("    @keyframes animatezoom {\r\n");
      out.write("      from {\r\n");
      out.write("        transform: scale(0);\r\n");
      out.write("      }\r\n");
      out.write(" \r\n");
      out.write("      to {\r\n");
      out.write("        transform: scale(1)\r\n");
      out.write("      }\r\n");
      out.write("    }\r\n");
      out.write(" \r\n");
      out.write("    /* Change styles for span and cancel button on extra small screens */\r\n");
      out.write("    @media screen and (max-width: 300px) {\r\n");
      out.write("      span.psw {\r\n");
      out.write("        display: block;\r\n");
      out.write("        float: none;\r\n");
      out.write("      }\r\n");
      out.write(" \r\n");
      out.write("      .cancelbtn {\r\n");
      out.write("        width: 100%;\r\n");
      out.write("      }\r\n");
      out.write("    }\r\n");
      out.write(" \r\n");
      out.write("    /* Style for highlighting invalid input fields */\r\n");
      out.write("    .invalid {\r\n");
      out.write("      border: 2px solid red;\r\n");
      out.write("    }\r\n");
      out.write("  </style>\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write(" \r\n");
      out.write("  </script>\r\n");
      out.write("</head>\r\n");
      out.write(" \r\n");
      out.write("<body>\r\n");
      out.write(" \r\n");
      out.write("  <h2>Admin Login form </h2>\r\n");
      out.write(" \r\n");
      out.write("  <button onclick=\"document.getElementById('id01').style.display='block'\" style=\"width:auto;\">Login</button>\r\n");
      out.write(" \r\n");
      out.write("  <div id=\"id01\" class=\"modal\">\r\n");
      out.write(" \r\n");
      out.write("    <form class=\"modal-content animate\" action=\"./main.jsp\" method=\"post\" onsubmit=\"return validateForm()\">\r\n");
      out.write("      <div class=\"imgcontainer\">\r\n");
      out.write("        <span onclick=\"document.getElementById('id01').style.display='none'\" class=\"close\" title=\"Close Modal\">&times;</span>\r\n");
      out.write("        <img src=\"img_avatar2.png\" alt=\"Avatar\" class=\"avatar\">\r\n");
      out.write("      </div>\r\n");
      out.write(" \r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <label for=\"uname\"><b>Username</b></label>\r\n");
      out.write("        <input type=\"text\" placeholder=\"Enter Username\" name=\"uname\" id=\"uname\" required>\r\n");
      out.write(" \r\n");
      out.write("        <label for=\"psw\"><b>Password</b></label>\r\n");
      out.write("        <input type=\"password\" placeholder=\"Enter Password\" name=\"psw\" id=\"psw\" required>\r\n");
      out.write(" \r\n");
      out.write("        <button type=\"submit\">Login</button>\r\n");
      out.write("        <label>\r\n");
      out.write("          <input type=\"checkbox\" checked=\"checked\" name=\"remember\"> Remember me\r\n");
      out.write("        </label>\r\n");
      out.write("      </div>\r\n");
      out.write("    </form>\r\n");
      out.write("  </div>\r\n");
      out.write(" \r\n");
      out.write("  <script>\r\n");
      out.write("    var modal = document.getElementById('id01');\r\n");
      out.write(" \r\n");
      out.write("    window.onclick = function (event) {\r\n");
      out.write("      if (event.target == modal) {\r\n");
      out.write("        modal.style.display = \"none\";\r\n");
      out.write("      }\r\n");
      out.write("    }\r\n");
      out.write(" \r\n");
      out.write("    function validateForm() {\r\n");
      out.write("      var usernameInput = document.getElementById('uname');\r\n");
      out.write("      var passwordInput = document.getElementById('psw');\r\n");
      out.write(" \r\n");
      out.write("      if (usernameInput.value !== 'admin' || passwordInput.value !== '12345') {\r\n");
      out.write("        alert('Invalid username or password. Please try again.');\r\n");
      out.write(" \r\n");
      out.write("        usernameInput.classList.add('invalid');\r\n");
      out.write("        passwordInput.classList.add('invalid');\r\n");
      out.write(" \r\n");
      out.write("        return false;\r\n");
      out.write("      }\r\n");
      out.write(" \r\n");
      out.write("      usernameInput.classList.remove('invalid');\r\n");
      out.write("      passwordInput.classList.remove('invalid');\r\n");
      out.write("      return true;\r\n");
      out.write("    }\r\n");
      out.write("  </script>\r\n");
      out.write(" \r\n");
      out.write("</body>\r\n");
      out.write(" \r\n");
      out.write("</html>\r\n");
      out.write(" \r\n");
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