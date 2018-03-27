package ${bussiPackage}.action.${entityPackage};

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletInputStream;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.dispatcher.multipart.MultiPartRequestWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.FileCopyUtils;

<#include "/include/actionInclude.ftl">

import ${bussiPackage}.page.${entityPackage}.${entityName}Page;
import ${bussiPackage}.entity.${entityPackage}.${entityName}Entity;
import ${bussiPackage}.service.${entityPackage}.${entityName}ServiceI;
<#list subTab as sub>
import ${bussiPackage}.page.${sub.entityPackage}.${sub.entityName}Page;
import ${bussiPackage}.entity.${sub.entityPackage}.${sub.entityName}Entity;
</#list>

import com.opensymphony.xwork2.ModelDriven;

/**   
 * @Title: Action
 * @Description: ${ftl_description}
 * @author zhangdaihao
 * @date ${ftl_create_time}
 * @version V1.0   
 *
 */
@Action(value = "${entityName?uncap_first}Action", results = { @Result(name = "${entityName?uncap_first}", location = "/${bussiPackage?replace(".","/")}/${entityPackage}/${entityName?uncap_first}.jsp"),
													   @Result(name = "${entityName?uncap_first}-main-add", location = "/${bussiPackage?replace(".","/")}/${entityPackage}/${entityName?uncap_first}-main-add.jsp"),
													   @Result(name = "${entityName?uncap_first}-main-edit", location = "/${bussiPackage?replace(".","/")}/${entityPackage}/${entityName?uncap_first}-main-edit.jsp")})
public class ${entityName}Action extends BaseAction implements ModelDriven<${entityName}Page> {

	private static final Logger logger = Logger.getLogger(${entityName}Action.class);

	private ${entityName}ServiceI ${entityName?uncap_first}Service;

	private ${entityName}Page ${entityName?uncap_first}Page = new ${entityName}Page();

	<#list subTab as sub>
	/**${sub.ftlDescription}*/
	private List<${sub.entityName}Page> ${sub.entityName?uncap_first}List = new ArrayList<${sub.entityName}Page>();
	public List<${sub.entityName}Page> get${sub.entityName}List() {
		return ${sub.entityName?uncap_first}List;
	}
	public void set${sub.entityName}List(List<${sub.entityName}Page> ${sub.entityName?uncap_first}List) {
		this.${sub.entityName?uncap_first}List = ${sub.entityName?uncap_first}List;
	}
	</#list>
	
	public ${entityName}Page getModel() {
		return ${entityName?uncap_first}Page;
	}


	public ${entityName}ServiceI get${entityName}Service() {
		return ${entityName?uncap_first}Service;
	}

	@Autowired
	public void set${entityName}Service(${entityName}ServiceI ${entityName?uncap_first}Service) {
		this.${entityName?uncap_first}Service = ${entityName?uncap_first}Service;
	}


	/**
	 * 跳转到${ftl_description}管理页面
	 * 
	 * @return
	 */
	public String go${entityName}() {
		return "${entityName?uncap_first}";
	}

	
	/**
	 * 跳转一对多添加页面
	 * 
	 * @return
	 */
	public String to${entityName}MainAdd() {
		return "${entityName?uncap_first}-main-add";
	}
	
	/**
	 * 跳转一对多编辑页面
	 * 
	 * @return
	 */
	public String to${entityName}MainEdit() {
		//主表KEY参数
		${primary_key_type} ${jeecg_table_id} = this.${entityName?uncap_first}Page.get${jeecg_table_id?cap_first}();
		//[1].根据主键ID，查询抬头信息
		${entityName}Entity ${entityName?uncap_first}Entity  = this.${entityName?uncap_first}Service.get(${jeecg_table_id});
		try {
			MyBeanUtils.copyBean2Bean(this.${entityName?uncap_first}Page, ${entityName?uncap_first}Entity);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//[2].根据主表ID,查询子表明细
		<#list subTab as sub>
		//${sub.ftlDescription}
		${sub.entityName?uncap_first}List = ${entityName?uncap_first}Service.get${sub.entityName}ListByFkey(<#list sub.foreignKeys as key><#if key?lower_case?index_of("${jeecg_table_id}")!=-1>${entityName?uncap_first}Entity.get${jeecg_table_id?cap_first}()<#else>${entityName?uncap_first}Entity.get${key}()</#if><#if key_has_next>,</#if></#list>);
		</#list>
		return "${entityName?uncap_first}-main-edit";
	}
	
	
	/**
	 * 跳转到查看desc页面
	 * 
	 * @return
	 */
	public void showDesc() {
		writeJson(${entityName?uncap_first}Service.get(${entityName?uncap_first}Page));
	}

	/**
	 * 获得pageHotel数据表格
	 */
	public void datagrid() {
		writeJson(${entityName?uncap_first}Service.datagrid(${entityName?uncap_first}Page));
	}
	
	
	/**
	 * 获得无分页的所有数据
	 */
	public void  combox(){
		writeJson(${entityName?uncap_first}Service.listAll(${entityName?uncap_first}Page));
	}

	/**
	 * 添加一对多
	 */
	public void addMain() {
		Json j = new Json();
		try {
			${entityName?uncap_first}Service.addMain(${entityName?uncap_first}Page, <#list subTab as sub>${sub.entityName?uncap_first}List<#if sub_has_next>,</#if></#list>);
			j.setSuccess(true);
			j.setMsg("添加成功！");
		} catch (Exception e) {
			j.setMsg("添加失败！");
			logger.error(ExceptionUtil.getExceptionMessage(e));
		}
		writeJson(j);
	}
	
	/**
	 * 编辑${ftl_description}
	 */
	public void editMain() {
		Json j = new Json();
		try {
			${entityName?uncap_first}Service.editMain(${entityName?uncap_first}Page, <#list subTab as sub>${sub.entityName?uncap_first}List<#if sub_has_next>,</#if></#list>);
			j.setSuccess(true);
			j.setMsg("修改${ftl_description}成功！");
		} catch (Exception e) {
			j.setMsg("修改失败！");
			logger.error(ExceptionUtil.getExceptionMessage(e));
		}
		writeJson(j);
	}

	/**
	 * 删除${ftl_description}
	 */
	public void delete() {
		Json j = new Json();
		${entityName?uncap_first}Service.delete(${entityName?uncap_first}Page.getIds());
		j.setSuccess(true);
		writeJson(j);
	}

	/**
	 * 文件上传
	 */
	public void upload() {
		String savePath = ServletActionContext.getServletContext().getRealPath("/") + ResourceUtil.getUploadDirectory() + "/";// 文件保存目录路径
		String saveUrl = "/" + ResourceUtil.getUploadDirectory() + "/";// 文件保存目录URL

		String contentDisposition = ServletActionContext.getRequest().getHeader("Content-Disposition");// 如果是HTML5上传文件，那么这里有相应头的

		if (contentDisposition != null) {// HTML5拖拽上传文件
			Long fileSize = Long.valueOf(ServletActionContext.getRequest().getHeader("Content-Length"));// 上传的文件大小
			String fileName = contentDisposition.substring(contentDisposition.lastIndexOf("filename=\""));// 文件名称
			fileName = fileName.substring(fileName.indexOf("\"") + 1);
			fileName = fileName.substring(0, fileName.indexOf("\""));

			ServletInputStream inputStream;
			try {
				inputStream = ServletActionContext.getRequest().getInputStream();
			} catch (IOException e) {
				uploadError("上传文件出错！");
				ExceptionUtil.getExceptionMessage(e);
				return;
			}

			if (inputStream == null) {
				uploadError("您没有上传任何文件！");
				return;
			}

			if (fileSize > ResourceUtil.getUploadFileMaxSize()) {
				uploadError("上传文件超出限制大小！", fileName);
				return;
			}

			// 检查文件扩展名
			String fileExt = fileName.substring(fileName.lastIndexOf(".") + 1).toLowerCase();
			if (!Arrays.<String> asList(ResourceUtil.getUploadFileExts().split(",")).contains(fileExt)) {
				uploadError("上传文件扩展名是不允许的扩展名。\n只允许" + ResourceUtil.getUploadFileExts() + "格式！");
				return;
			}

			savePath += fileExt + "/";
			saveUrl += fileExt + "/";

			SimpleDateFormat yearDf = new SimpleDateFormat("yyyy");
			SimpleDateFormat monthDf = new SimpleDateFormat("MM");
			SimpleDateFormat dateDf = new SimpleDateFormat("dd");
			Date date = new Date();
			String ymd = yearDf.format(date) + "/" + monthDf.format(date) + "/" + dateDf.format(date) + "/";
			savePath += ymd;
			saveUrl += ymd;

			File uploadDir = new File(savePath);// 创建要上传文件到指定的目录
			if (!uploadDir.exists()) {
				uploadDir.mkdirs();
			}

			String newFileName = UUID.randomUUID().toString().replaceAll("-", "") + "." + fileExt;// 新的文件名称
			File uploadedFile = new File(savePath, newFileName);

			try {
				FileCopyUtils.copy(inputStream, new FileOutputStream(uploadedFile));
			} catch (FileNotFoundException e) {
				uploadError("上传文件出错！");
				ExceptionUtil.getExceptionMessage(e);
				return;
			} catch (IOException e) {
				uploadError("上传文件出错！");
				ExceptionUtil.getExceptionMessage(e);
				return;
			}

			uploadSuccess(ServletActionContext.getRequest().getContextPath() + saveUrl + newFileName, fileName, 0);// 文件上传成功

			return;
		}

		MultiPartRequestWrapper multiPartRequest = (MultiPartRequestWrapper) ServletActionContext.getRequest();// 由于struts2上传文件时自动使用了request封装
		File[] files = multiPartRequest.getFiles(ResourceUtil.getUploadFieldName());// 上传的文件集合
		String[] fileNames = multiPartRequest.getFileNames(ResourceUtil.getUploadFieldName());// 上传文件名称集合

		if (files == null || files.length < 1) {
			uploadError("您没有上传任何文件！");
			return;
		}

		for (int i = 0; i < files.length; i++) {// 循环所有文件
			File file = files[i];// 上传的文件(临时文件)
			String fileName = fileNames[i];// 上传文件名

			if (file.length() > ResourceUtil.getUploadFileMaxSize()) {
				uploadError("上传文件超出限制大小！", fileName);
				return;
			}

			// 检查文件扩展名
			String fileExt = fileName.substring(fileName.lastIndexOf(".") + 1).toLowerCase();
			if (!Arrays.<String> asList(ResourceUtil.getUploadFileExts().split(",")).contains(fileExt)) {
				uploadError("上传文件扩展名是不允许的扩展名。\n只允许" + ResourceUtil.getUploadFileExts() + "格式！");
				return;
			}

			savePath += fileExt + "/";
			saveUrl += fileExt + "/";

			SimpleDateFormat yearDf = new SimpleDateFormat("yyyy");
			SimpleDateFormat monthDf = new SimpleDateFormat("MM");
			SimpleDateFormat dateDf = new SimpleDateFormat("dd");
			Date date = new Date();
			String ymd = yearDf.format(date) + "/" + monthDf.format(date) + "/" + dateDf.format(date) + "/";
			savePath += ymd;
			saveUrl += ymd;

			File uploadDir = new File(savePath);// 创建要上传文件到指定的目录
			if (!uploadDir.exists()) {
				uploadDir.mkdirs();
			}

			String newFileName = UUID.randomUUID().toString().replaceAll("-", "") + "." + fileExt;// 新的文件名称
			File uploadedFile = new File(savePath, newFileName);

			try {
				FileCopyUtils.copy(file, uploadedFile);// 利用spring的文件工具上传
			} catch (Exception e) {
				uploadError("上传文件失败！", fileName);
				return;
			}

			uploadSuccess(ServletActionContext.getRequest().getContextPath() + saveUrl + newFileName, fileName, i);// 文件上传成功

		}

	}

	private void uploadError(String err, String msg) {
		Map<String, Object> m = new HashMap<String, Object>();
		m.put("err", err);
		m.put("msg", msg);
		writeJson(m);
	}

	private void uploadError(String err) {
		uploadError(err, "");
	}

	private void uploadSuccess(String newFileName, String fileName, int id) {
		Map<String, Object> m = new HashMap<String, Object>();
		m.put("err", "");
		Map<String, Object> nm = new HashMap<String, Object>();
		nm.put("url", newFileName);
		nm.put("localfile", fileName);
		nm.put("id", id);
		m.put("msg", nm);
		writeJson(m);
	}
	
	public ${entityName}Page get${entityName}Page() {
		return ${entityName?uncap_first}Page;
	}


	public void set${entityName}Page(${entityName}Page ${entityName?uncap_first}Page) {
		this.${entityName?uncap_first}Page = ${entityName?uncap_first}Page;
	}
}
