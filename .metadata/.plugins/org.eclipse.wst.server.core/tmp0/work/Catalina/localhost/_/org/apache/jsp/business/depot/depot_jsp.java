/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.84
 * Generated at: 2018-03-27 01:57:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.business.depot;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class depot_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/inc.jsp", out, false);
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("   .tdLeft{\r\n");
      out.write("      width:15%;\r\n");
      out.write("      text-align: right;\r\n");
      out.write("   }\r\n");
      out.write("   .tdRight{\r\n");
      out.write("      width:35%;\r\n");
      out.write("      text-align: left;\r\n");
      out.write("   }\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\" charset=\"utf-8\">\r\n");
      out.write("    var searchForm;\r\n");
      out.write("\tvar datagrid;\r\n");
      out.write("\tvar depotAddDialog;\r\n");
      out.write("\tvar depotAddForm;\r\n");
      out.write("\tvar cdescAdd;\r\n");
      out.write("\tvar depotEditDialog;\r\n");
      out.write("\tvar depotEditForm;\r\n");
      out.write("\tvar cdescEdit;\r\n");
      out.write("\tvar showCdescDialog;\r\n");
      out.write("\tvar iframeDialog;\r\n");
      out.write("\tvar formFlag = true;\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t    //查询列表\t\r\n");
      out.write("\t    searchForm = $('#searchForm').form();\r\n");
      out.write("\t\tdatagrid = $('#datagrid').datagrid({\r\n");
      out.write("\t\t\turl : 'depotAction!datagrid.action',\r\n");
      out.write("\t\t\ttitle : '仓库信息列表',\r\n");
      out.write("\t\t\ticonCls : 'icon-save',\r\n");
      out.write("\t\t\tpagination : true,\r\n");
      out.write("\t\t\tpagePosition : 'bottom',\r\n");
      out.write("\t\t\trownumbers : true,\r\n");
      out.write("\t\t\tpageSize : 10,\r\n");
      out.write("\t\t\tpageList : [ 10, 20, 30, 40 ],\r\n");
      out.write("\t\t\tfit : true,\r\n");
      out.write("\t\t\tfitColumns : false,\r\n");
      out.write("\t\t\tnowrap : true,\r\n");
      out.write("\t\t\tsingleSelect:true,\r\n");
      out.write("\t\t\tborder : false,\r\n");
      out.write("\t\t\tidField : 'depotid',\r\n");
      out.write("\t\t\tsortName : '',\r\n");
      out.write("\t\t\tsortOrder : 'desc',\r\n");
      out.write("\t\t\tcolumns : [ [ \r\n");
      out.write("\t\t\t{field:'ck',checkbox:true,\r\n");
      out.write("\t\t\t\t\t\tformatter:function(value,row,index){\r\n");
      out.write("\t\t\t\t\t\t\treturn row.depotid;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t   {field:'depotname',title:'仓库名称',align:'center',sortable:true,width:180,\r\n");
      out.write("\t\t\t\t\tformatter:function(value,row,index){\r\n");
      out.write("\t\t\t\t\t\treturn row.depotname;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},\t\t\t\t\r\n");
      out.write("\t\t\t   {field:'depotman',title:'仓管人',align:'center',sortable:true,width:100,\r\n");
      out.write("\t\t\t\t\tformatter:function(value,row,index){\r\n");
      out.write("\t\t\t\t\t\treturn row.depotman;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},\t\t\t\t\r\n");
      out.write("\t\t\t   {field:'depotaddress',title:'仓库地址',align:'center',sortable:true,width:220,\r\n");
      out.write("\t\t\t\t\tformatter:function(value,row,index){\r\n");
      out.write("\t\t\t\t\t\treturn row.depotaddress;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},\t\t\t\t\r\n");
      out.write("\t\t\t   {field:'phone',title:'联系电话',align:'center',sortable:true,width:110,\r\n");
      out.write("\t\t\t\t\tformatter:function(value,row,index){\r\n");
      out.write("\t\t\t\t\t\treturn row.phone;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},\t\t\t\t\r\n");
      out.write("\t\t\t   {field:'isactive',title:'是否启用',align:'center',sortable:true,width:80,\r\n");
      out.write("\t\t\t\t\tformatter:function(value,row,index){\r\n");
      out.write("\t\t\t\t\t\treturn dictGetName('004',row.isactive);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},\t\t\t\t\r\n");
      out.write("\t\t\t   {field:'modifydate',title:'修改日期',align:'center',sortable:true,width:80,\r\n");
      out.write("\t\t\t\t\tformatter:function(value,row,index){\r\n");
      out.write("\t\t\t\t\t\treturn dateFormatYMD(row.modifydate);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},\t\t\t\t\r\n");
      out.write("\t\t\t   {field:'createdate',title:'创建日期',align:'center',sortable:true,width:80,\r\n");
      out.write("\t\t\t\t\tformatter:function(value,row,index){\r\n");
      out.write("\t\t\t\t\t\treturn dateFormatYMD(row.createdate);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\t\t\t\t\r\n");
      out.write("\t\t\t ] ],\r\n");
      out.write("\t\t\ttoolbar : [ {\r\n");
      out.write("\t\t\t\ttext : '增加',\r\n");
      out.write("\t\t\t\ticonCls : 'icon-add',\r\n");
      out.write("\t\t\t\thandler : function() {\r\n");
      out.write("\t\t\t\t\tadd();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}, '-', {\r\n");
      out.write("\t\t\t\ttext : '删除',\r\n");
      out.write("\t\t\t\ticonCls : 'icon-remove',\r\n");
      out.write("\t\t\t\thandler : function() {\r\n");
      out.write("\t\t\t\t\tdel();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}, '-', {\r\n");
      out.write("\t\t\t\ttext : '修改',\r\n");
      out.write("\t\t\t\ticonCls : 'icon-edit',\r\n");
      out.write("\t\t\t\thandler : function() {\r\n");
      out.write("\t\t\t\t\tedit();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}, '-', {\r\n");
      out.write("\t\t\t\ttext : '取消选中',\r\n");
      out.write("\t\t\t\ticonCls : 'icon-undo',\r\n");
      out.write("\t\t\t\thandler : function() {\r\n");
      out.write("\t\t\t\t\tdatagrid.datagrid('unselectAll');\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}, '-' ],\r\n");
      out.write("\t\t\tonRowContextMenu : function(e, rowIndex, rowData) {\r\n");
      out.write("\t\t\t\te.preventDefault();\r\n");
      out.write("\t\t\t\t$(this).datagrid('unselectAll');\r\n");
      out.write("\t\t\t\t$(this).datagrid('selectRow', rowIndex);\r\n");
      out.write("\t\t\t\t$('#menu').menu('show', {\r\n");
      out.write("\t\t\t\t\tleft : e.pageX,\r\n");
      out.write("\t\t\t\t\ttop : e.pageY\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\tdepotAddForm = $('#depotAddForm').form({\r\n");
      out.write("\t\t\turl : 'depotAction!add.action',\r\n");
      out.write("\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\tvar json = $.parseJSON(data);\r\n");
      out.write("\t\t\t\tif (json && json.success) {\r\n");
      out.write("\t\t\t\t\t$.messager.show({\r\n");
      out.write("\t\t\t\t\t\ttitle : '成功',\r\n");
      out.write("\t\t\t\t\t\tmsg : json.msg\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\tdatagrid.datagrid('reload');\r\n");
      out.write("\t\t\t\t\tdepotAddDialog.dialog('close');\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t$.messager.show({\r\n");
      out.write("\t\t\t\t\t\ttitle : '失败',\r\n");
      out.write("\t\t\t\t\t\tmsg : '操作失败！'\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tformFlag = true ;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\tdepotAddDialog = $('#depotAddDialog').show().dialog({\r\n");
      out.write("\t\t\ttitle : '添加仓库信息',\r\n");
      out.write("\t\t\tmodal : true,\r\n");
      out.write("\t\t\tclosed : true,\r\n");
      out.write("\t\t\tmaximizable : true,\r\n");
      out.write("\t\t\tbuttons : [ {\r\n");
      out.write("\t\t\t\ttext : '添加',\r\n");
      out.write("\t\t\t\thandler : function() {\r\n");
      out.write("\t\t\t\t  if (depotAddForm.form('validate')){\r\n");
      out.write("\t\t\t\t\tif(formFlag){\r\n");
      out.write("\t\t\t\t\t\tformFlag = false ;\r\n");
      out.write("\t\t\t\t\t\tdepotAddForm.submit();\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t }\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t} ]\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\tcdescAdd = $('#cdescAdd').xheditor({\r\n");
      out.write("\t\t\ttools : 'mini',\r\n");
      out.write("\t\t\thtml5Upload : true,\r\n");
      out.write("\t\t\tupMultiple : 4,\r\n");
      out.write("\t\t\tupLinkUrl : 'depotAction!upload.action',\r\n");
      out.write("\t\t\tupLinkExt : 'zip,rar,txt,doc,docx,xls,xlsx',\r\n");
      out.write("\t\t\tupImgUrl : 'depotAction!upload.action',\r\n");
      out.write("\t\t\tupImgExt : 'jpg,jpeg,gif,png'\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\tdepotEditForm = $('#depotEditForm').form({\r\n");
      out.write("\t\t\turl : 'depotAction!edit.action',\r\n");
      out.write("\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\tvar json = $.parseJSON(data);\r\n");
      out.write("\t\t\t\tif (json && json.success) {\r\n");
      out.write("\t\t\t\t\t$.messager.show({\r\n");
      out.write("\t\t\t\t\t\ttitle : '成功',\r\n");
      out.write("\t\t\t\t\t\tmsg : json.msg\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\tdatagrid.datagrid('reload');\r\n");
      out.write("\t\t\t\t\tdepotEditDialog.dialog('close');\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t$.messager.show({\r\n");
      out.write("\t\t\t\t\t\ttitle : '失败',\r\n");
      out.write("\t\t\t\t\t\tmsg : '操作失败！'\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tformFlag = true ;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\tdepotEditDialog = $('#depotEditDialog').show().dialog({\r\n");
      out.write("\t\t\ttitle : '编辑仓库信息',\r\n");
      out.write("\t\t\tmodal : true,\r\n");
      out.write("\t\t\tclosed : true,\r\n");
      out.write("\t\t\tmaximizable : true,\r\n");
      out.write("\t\t\tbuttons : [ {\r\n");
      out.write("\t\t\t\ttext : '编辑',\r\n");
      out.write("\t\t\t\thandler : function() {\r\n");
      out.write("\t\t\t\t  if (depotEditForm.form('validate')){\r\n");
      out.write("\t\t\t\t\tif(formFlag){\r\n");
      out.write("\t\t\t\t\t\tformFlag = false ;\r\n");
      out.write("\t\t\t\t\t\tdepotEditForm.submit();\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t  }\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t} ]\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\tcdescEdit = $('#cdescEdit').xheditor({\r\n");
      out.write("\t\t\ttools : 'mini',\r\n");
      out.write("\t\t\thtml5Upload : true,\r\n");
      out.write("\t\t\tupMultiple : 4,\r\n");
      out.write("\t\t\tupLinkUrl : 'depotAction!upload.action',\r\n");
      out.write("\t\t\tupLinkExt : 'zip,rar,txt,doc,docx,xls,xlsx',\r\n");
      out.write("\t\t\tupImgUrl : 'depotAction!upload.action',\r\n");
      out.write("\t\t\tupImgExt : 'jpg,jpeg,gif,png'\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\tshowCdescDialog = $('#showCdescDialog').show().dialog({\r\n");
      out.write("\t\t\ttitle : '仓库信息描述',\r\n");
      out.write("\t\t\tmodal : true,\r\n");
      out.write("\t\t\tclosed : true,\r\n");
      out.write("\t\t\tmaximizable : true\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\tiframeDialog = $('#iframeDialog').show().dialog({\r\n");
      out.write("\t\t\ttitle : 'POP弹出页面',\r\n");
      out.write("\t\t\tmodal : true,\r\n");
      out.write("\t\t\tclosed : true,\r\n");
      out.write("\t\t\tmaximizable : true\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\tfunction _search() {\r\n");
      out.write("\t\tdatagrid.datagrid('load', sy.serializeObject(searchForm));\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction cleanSearch() {\r\n");
      out.write("\t\tdatagrid.datagrid('load', {});\r\n");
      out.write("\t\tsearchForm.find('input').val('');\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction add() {\r\n");
      out.write("\t\tdepotAddForm.find('input,textarea').val('');\r\n");
      out.write("\t\t$('div.validatebox-tip').remove();\r\n");
      out.write("\t\tdepotAddDialog.dialog('open');\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction del() {\r\n");
      out.write("\t\tvar rows = datagrid.datagrid('getSelections');\r\n");
      out.write("\t\tvar ids = [];\r\n");
      out.write("\t\tif (rows.length > 0) {\r\n");
      out.write("\t\t\t$.messager.confirm('请确认', '您要删除当前所选项目？', function(r) {\r\n");
      out.write("\t\t\t\tif (r) {\r\n");
      out.write("\t\t\t\t\tfor ( var i = 0; i < rows.length; i++) {\r\n");
      out.write("\t\t\t\t\t\tids.push(rows[i].depotid);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\t\turl : 'depotAction!delete.action',\r\n");
      out.write("\t\t\t\t\t\tdata : {\r\n");
      out.write("\t\t\t\t\t\t\tids : ids.join(',')\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\tdataType : 'json',\r\n");
      out.write("\t\t\t\t\t\tsuccess : function(response) {\r\n");
      out.write("\t\t\t\t\t\t\tdatagrid.datagrid('load');\r\n");
      out.write("\t\t\t\t\t\t\tdatagrid.datagrid('unselectAll');\r\n");
      out.write("\t\t\t\t\t\t\t$.messager.show({\r\n");
      out.write("\t\t\t\t\t\t\t\ttitle : '提示',\r\n");
      out.write("\t\t\t\t\t\t\t\tmsg : response.msg\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\t$.messager.alert('提示', '请选择要删除的记录！', 'error');\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction edit() {\r\n");
      out.write("\t\tvar rows = datagrid.datagrid('getSelections');\r\n");
      out.write("\t\tif (rows.length == 1) {\r\n");
      out.write("\t\t\t$.messager.progress({\r\n");
      out.write("\t\t\t\ttext : '数据加载中....',\r\n");
      out.write("\t\t\t\tinterval : 100\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\turl : 'depotAction!showDesc.action',\r\n");
      out.write("\t\t\t\tdata : {\r\n");
      out.write("\t\t\t\t\tdepotid : rows[0].depotid\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tdataType : 'json',\r\n");
      out.write("\t\t\t\tcache : false,\r\n");
      out.write("\t\t\t\tsuccess : function(response) {\r\n");
      out.write("\t\t\t\t\tdepotEditForm.find('input,textarea').val('');\r\n");
      out.write("\t\t\t\t\tdepotEditForm.form('load', response);\r\n");
      out.write("\t\t\t\t\t$('div.validatebox-tip').remove();\r\n");
      out.write("\t\t\t\t\tdepotEditDialog.dialog('open');\r\n");
      out.write("\t\t\t\t\t$.messager.progress('close');\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\t$.messager.alert('提示', '请选择一项要编辑的记录！', 'error');\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction showCdesc(index) {\r\n");
      out.write("\t\tvar rows = datagrid.datagrid('getRows');\r\n");
      out.write("\t\tvar row = rows[index];\r\n");
      out.write("\t\t$.messager.progress({\r\n");
      out.write("\t\t\ttext : '数据加载中....',\r\n");
      out.write("\t\t\tinterval : 100\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl : 'depotAction!showDesc.action',\r\n");
      out.write("\t\t\tdata : {\r\n");
      out.write("\t\t\t\tdepotid : row.depotid\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tdataType : 'json',\r\n");
      out.write("\t\t\tcache : false,\r\n");
      out.write("\t\t\tsuccess : function(response) {\r\n");
      out.write("\t\t\t\tif (response && response.cdesc) {\r\n");
      out.write("\t\t\t\t\tshowCdescDialog.find('div[name=cdesc]').html(response.cdesc);\r\n");
      out.write("\t\t\t\t\tshowCdescDialog.dialog('open');\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t$.messager.alert('提示', '没有仓库信息描述！', 'error');\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t$.messager.progress('close');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tdatagrid.datagrid('unselectAll');\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"easyui-layout\">\r\n");
      out.write("\t<div region=\"north\" border=\"false\" title=\"过滤条件\" collapsed=\"true\"  style=\"height: 60px;overflow: hidden;display: none;\" align=\"left\">\r\n");
      out.write("\t\t<form id=\"searchForm\">\r\n");
      out.write("\t\t\t<table class=\"tableForm datagrid-toolbar\" style=\"width: 100%;height: 100%;\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>仓库名称</td>\r\n");
      out.write("\t\t\t\t\t<td><input name=\"depotname\" style=\"width:120px;\" class=\"easyui-validatebox\"/></td>\r\n");
      out.write("\t\t\t\t\t<td>仓管人</td>\r\n");
      out.write("\t\t\t\t\t<td><input name=\"depotman\" style=\"width:120px;\" class=\"easyui-validatebox\"/></td>\r\n");
      out.write("\t\t\t\t\t<td>仓库地址</td>\r\n");
      out.write("\t\t\t\t\t<td><input name=\"depotaddress\" style=\"width:120px;\" class=\"easyui-validatebox\"/></td>\r\n");
      out.write("\t\t\t\t\t<td>联系电话</td>\r\n");
      out.write("\t\t\t\t\t<td><input name=\"phone\" style=\"width:120px;\" class=\"easyui-validatebox\"/></td>\r\n");
      out.write("\t\t\t\t\t<td>是否启用</td>\r\n");
      out.write("\t\t\t\t\t<td><input name=\"isactive\" style=\"width:120px;\" class=\"easyui-validatebox\"/></td>\r\n");
      out.write("\t\t\t    <td><a href=\"javascript:void(0);\" class=\"easyui-linkbutton\" onclick=\"_search();\">过滤</a><a href=\"javascript:void(0);\" class=\"easyui-linkbutton\" onclick=\"cleanSearch();\">取消</a></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div region=\"center\" border=\"false\">\r\n");
      out.write("\t\t<table id=\"datagrid\"></table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"menu\" class=\"easyui-menu\" style=\"width:120px;display: none;\">\r\n");
      out.write("\t\t<div onclick=\"add();\" iconCls=\"icon-add\">增加</div>\r\n");
      out.write("\t\t<div onclick=\"del();\" iconCls=\"icon-remove\">删除</div>\r\n");
      out.write("\t\t<div onclick=\"edit();\" iconCls=\"icon-edit\">编辑</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"depotAddDialog\" style=\"display: none;width: 350px;height: 250px;padding:10px;\" align=\"center\">\r\n");
      out.write("\t\t<form id=\"depotAddForm\" method=\"post\">\r\n");
      out.write("\t\t\t<table class=\"tableForm\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t \t\t\t\t\t\t<td class=\"tdLeft\">仓库名称</td>\r\n");
      out.write("\t\t \t\t\t\t\t\t<td class=\"tdRight\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input name=\"depotname\" type=\"text\" maxlength=\"100\" class=\"easyui-validatebox\" data-options=\"required:true\" missingMessage=\"请填写仓库名称\"  style=\"width: 155px;\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t \t\t\t\t\t\t<td class=\"tdLeft\">仓管人</td>\r\n");
      out.write("\t\t \t\t\t\t\t\t<td class=\"tdRight\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input name=\"depotman\" type=\"text\" maxlength=\"20\" class=\"easyui-validatebox\" data-options=\"required:true\" missingMessage=\"请填写仓管人\"  style=\"width: 155px;\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t \t\t\t\t\t\t<td class=\"tdLeft\">仓库地址</td>\r\n");
      out.write("\t\t \t\t\t\t\t\t<td class=\"tdRight\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input name=\"depotaddress\" type=\"text\" maxlength=\"80\" class=\"easyui-validatebox\" data-options=\"required:true\" missingMessage=\"请填写仓库地址\"  style=\"width: 155px;\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t \t\t\t\t\t\t<td class=\"tdLeft\">联系电话</td>\r\n");
      out.write("\t\t \t\t\t\t\t\t<td class=\"tdRight\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input name=\"phone\" type=\"text\" maxlength=\"15\" class=\"easyui-validatebox\" data-options=\"required:true\" missingMessage=\"请填写联系电话\"  style=\"width: 155px;\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t \t\t\t\t\t\t<td class=\"tdLeft\">是否启用</td>\r\n");
      out.write("\t\t \t\t\t\t\t\t<td class=\"tdRight\">\r\n");
      out.write("\t\t \t\t\t\t\t\t    <select id=\"isactiveAdd\" name=\"isactive\" type=\"text\"  class=\"easyui-combobox\" data-options=\"required:true,\r\n");
      out.write("\t\t \t\t\t\t\t\t        url : 'dictParamAction!dictCombobox.action?paramLevel=004',\r\n");
      out.write("\t\t\t\t\t\t                valueField : 'paramValue',\r\n");
      out.write("\t\t\t\t\t\t                panelHeight:45,\r\n");
      out.write("\t\t\t\t\t\t                textField : 'paramName',\r\n");
      out.write("\t\t\t\t\t\t                editable:false\r\n");
      out.write("\t\t \t\t\t\t\t\t       \"  missingMessage=\"请填写是否启用\"  style=\"width: 159px;\">\r\n");
      out.write("\t\t \t\t\t\t\t\t     </select>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"depotEditDialog\" style=\"display: none;width: 350px;height: 250px;padding:10px;\" align=\"center\">\r\n");
      out.write("\t\t<form id=\"depotEditForm\" method=\"post\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"depotid\" />\r\n");
      out.write("\t\t\t<table class=\"tableForm\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t \t\t\t\t\t\t<td class=\"tdLeft\">仓库名称</td>\r\n");
      out.write("\t\t \t\t\t\t\t\t<td class=\"tdRight\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input name=\"depotname\" type=\"text\" maxlength=\"100\" class=\"easyui-validatebox\" data-options=\"required:true\" missingMessage=\"请填写仓库名称\"  style=\"width: 155px;\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t \t\t\t\t\t\t<td class=\"tdLeft\">仓管人</td>\r\n");
      out.write("\t\t \t\t\t\t\t\t<td class=\"tdRight\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input name=\"depotman\" type=\"text\" maxlength=\"20\" class=\"easyui-validatebox\" data-options=\"required:true\" missingMessage=\"请填写仓管人\"  style=\"width: 155px;\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t \t\t\t\t\t\t<td class=\"tdLeft\">仓库地址</td>\r\n");
      out.write("\t\t \t\t\t\t\t\t<td class=\"tdRight\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input name=\"depotaddress\" type=\"text\" maxlength=\"80\" class=\"easyui-validatebox\" data-options=\"required:true\" missingMessage=\"请填写仓库地址\"  style=\"width: 155px;\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t \t\t\t\t\t\t<td class=\"tdLeft\">联系电话</td>\r\n");
      out.write("\t\t \t\t\t\t\t\t<td class=\"tdRight\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input name=\"phone\" type=\"text\" maxlength=\"15\" class=\"easyui-validatebox\" data-options=\"required:true\" missingMessage=\"请填写联系电话\"  style=\"width: 155px;\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t \t\t\t\t\t\t<td class=\"tdLeft\">是否启用</td>\r\n");
      out.write("\t\t \t\t\t\t\t\t<td class=\"tdRight\">\r\n");
      out.write("\t\t \t\t\t\t\t\t   <select id=\"isactiveEdit\" name=\"isactive\" type=\"text\"  class=\"easyui-combobox\" data-options=\"required:true,\r\n");
      out.write("\t\t \t\t\t\t\t\t        url : 'dictParamAction!dictCombobox.action?paramLevel=004',\r\n");
      out.write("\t\t\t\t\t\t                valueField : 'paramValue',\r\n");
      out.write("\t\t\t\t\t\t                panelHeight:45,\r\n");
      out.write("\t\t\t\t\t\t                textField : 'paramName',\r\n");
      out.write("\t\t\t\t\t\t                editable:false\r\n");
      out.write("\t\t \t\t\t\t\t\t       \"  missingMessage=\"请填写是否启用\"  style=\"width: 159px;\">\r\n");
      out.write("\t\t \t\t\t\t\t\t     </select>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"showCdescDialog\" style=\"display: none;overflow: auto;width: 500px;height: 400px;\">\r\n");
      out.write("\t\t<div name=\"cdesc\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"iframeDialog\" style=\"display: none;overflow: auto;width: 600px;height: 400px;\">\r\n");
      out.write("\t<iframe name=\"iframe\" id=\"iframe\" src=\"\"  scrolling=\"auto\" frameborder=\"0\" style=\"width:100%;height:100%;\">\r\n");
      out.write("    </iframe>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
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
}