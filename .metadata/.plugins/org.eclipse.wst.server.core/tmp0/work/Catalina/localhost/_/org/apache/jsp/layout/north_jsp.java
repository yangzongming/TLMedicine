/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.84
 * Generated at: 2018-03-27 01:56:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.layout;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class north_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
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
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<script type=\"text/javascript\" charset=\"utf-8\">\r\n");
      out.write("\tfunction logout(b) {\r\n");
      out.write("\t\t$.post('userAction!logout.action', function() {\r\n");
      out.write("\t\t\tif (b) {\r\n");
      out.write("\t\t\t\tif (sy.isLessThanIe8()) {\r\n");
      out.write("\t\t\t\t\t//loginAndRegDialog.dialog('open');\r\n");
      out.write("\t\t\t\t\twindow.location.href=\"login.jsp\";\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\tlocation.replace(sy.bp());\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\t//loginAndRegDialog.dialog('open');\r\n");
      out.write("\t\t\t\twindow.location.href=\"login.jsp\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tvar userInfoWindow;\r\n");
      out.write("\tfunction showUserInfo() {\r\n");
      out.write("\t\tuserInfoWindow = $('<div/>').window({\r\n");
      out.write("\t\t\tmodal : true,\r\n");
      out.write("\t\t\ttitle : '当前用户信息',\r\n");
      out.write("\t\t\twidth : 350,\r\n");
      out.write("\t\t\theight : 300,\r\n");
      out.write("\t\t\tcollapsible : false,\r\n");
      out.write("\t\t\tminimizable : false,\r\n");
      out.write("\t\t\tmaximizable : false,\r\n");
      out.write("\t\t\thref : 'userAction!showUserInfo.action',\r\n");
      out.write("\t\t\tonClose : function() {\r\n");
      out.write("\t\t\t\t$(this).window('destroy');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("<div style=\"position: absolute; right: 0px; bottom: 0px; \">欢迎&nbsp;<B>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.sessionInfo.realName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</B>&nbsp;光临！\r\n");
      out.write("\t<!--<a href=\"javascript:void(0);\" class=\"easyui-menubutton\" menu=\"#layout_north_pfMenu\" iconCls=\"icon-ok\">更换皮肤</a> \r\n");
      out.write("\t--><a href=\"javascript:void(0);\" class=\"easyui-menubutton\" menu=\"#layout_north_kzmbMenu\" iconCls=\"icon-help\">控制面板</a> <a href=\"javascript:void(0);\" class=\"easyui-menubutton\" menu=\"#layout_north_zxMenu\" iconCls=\"icon-back\">退出</a>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"layout_north_pfMenu\" style=\"width: 120px; display: none;\">\r\n");
      out.write("\t<div onclick=\"sy.changeTheme('default');\">default</div>\r\n");
      out.write("\t<div onclick=\"sy.changeTheme('gray');\">gray</div>\r\n");
      out.write("\t<div onclick=\"sy.changeTheme('cupertino');\">cupertino</div>\r\n");
      out.write("\t<div onclick=\"sy.changeTheme('dark-hive');\">dark-hive</div>\r\n");
      out.write("\t<div onclick=\"sy.changeTheme('pepper-grinder');\">pepper-grinder</div>\r\n");
      out.write("\t<div onclick=\"sy.changeTheme('sunny');\">sunny</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"layout_north_kzmbMenu\" style=\"width: 100px; display: none;\">\r\n");
      out.write("\t<div onclick=\"showUserInfo();\">个人信息</div>\r\n");
      out.write("\t<div class=\"menu-sep\"></div>\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<span>更换主题</span>\r\n");
      out.write("\t\t<div style=\"width: 120px;\">\r\n");
      out.write("\t\t\t<div onclick=\"sy.changeTheme('default');\">default</div>\r\n");
      out.write("\t\t\t<div onclick=\"sy.changeTheme('gray');\">gray</div>\r\n");
      out.write("\t\t\t<div onclick=\"sy.changeTheme('cupertino');\">cupertino</div>\r\n");
      out.write("\t\t\t<div onclick=\"sy.changeTheme('dark-hive');\">dark-hive</div>\r\n");
      out.write("\t\t\t<div onclick=\"sy.changeTheme('pepper-grinder');\">pepper-grinder</div>\r\n");
      out.write("\t\t\t<div onclick=\"sy.changeTheme('sunny');\">sunny</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"layout_north_zxMenu\" style=\"width: 100px; display: none;\">\r\n");
      out.write("\t<div onclick=\"logout(true);\">锁定窗口</div>\r\n");
      out.write("\t<div class=\"menu-sep\"></div>\r\n");
      out.write("\t<div onclick=\"logout();\">切换用户</div>\r\n");
      out.write("\t<div onclick=\"logout(true);\">退出系统</div>\r\n");
      out.write("</div>\r\n");
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
}
