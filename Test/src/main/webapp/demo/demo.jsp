<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="jquery.min.js"></script>
<script type="text/javascript" src="jquery.easyui.min.js"></script>
<script type="text/javascript" src="easyui-lang-zh_CN.js"></script>
<link rel="stylesheet" href="icon.css" type="text/css"></link>
<link rel="stylesheet" href="easyui.css" type="text/css"></link>


</head>
<BODY class="easyui-layout">
    <div data-options="region:'north',title:'',split:false" style="height:50px;"></div>   
    <div data-options="region:'south',title:'',split:false" style="height:30px; line-height:30px;" align="center">
		此程序由XXX开发
	</div>   
     
    <div data-options="region:'west',title:'系统菜单',split:true" style="width:200px;">
	
	<ul id="tt">
		
	</ul>
	
	</div>   
    <div data-options="region:'center',title:''" style="padding:0px;background:#eee;">
		<div id="tabsInfo" class="easyui-tabs" data-options="fit:true">
			
  		</div>
	
	</div>   

 </BODY>
</html>