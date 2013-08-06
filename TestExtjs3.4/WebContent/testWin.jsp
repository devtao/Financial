<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!-- 测试组建Ext.Window Ext.Window继承于Ext.panel -->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title></title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <!--ext css-->
    <link rel="stylesheet" type="text/css" href="extjs/resources/css/ext-all.css" />
    <script type="text/javascript" src="extjs/adapter/ext/ext-base.js"></script>
    <script type="text/javascript" src="extjs/ext-all.js"></script>
    <script type="text/javascript" src="extjs/ext-lang-zh_CN.js"></script>
</head>
<body>
    <script type="text/javascript">
    var i=0;
    function newWin()
    {
    var win=new Ext.Window({title:"窗口"+i++,
    width:400,
    height:300,
    maximizable:true,
    layout:"column",
    items:[{
    	xtype:"htmleditor",
    	columnWidth:.5
    	},
    	{
        xtype:"htmleditor",
        columnWidth:.5
        }
    ]
    });
    win.show();
    }
    Ext.onReady(function(){
    Ext.get("btn").on("click",newWin);
    });
    </script>
    <input id="btn" type="button" name="add" value="新窗口" />
</body>
</html>