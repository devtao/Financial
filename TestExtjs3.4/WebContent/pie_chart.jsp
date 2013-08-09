<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<!-- >>>>>>>>>>>>>>>>饼状图<<<<<<<<<<<<< -->

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
    Ext.onReady(function(){  
        Ext.QuickTips.init();  
        Ext.BLANK_IMAGE_URL = 'extjs/resources/images/default/s.gif';  
          
        var record = new Ext.data.Record.create([  
            {name : 'month'},  
            {name : 'number'}  
        ]);  
        var store = new Ext.data.Store({  
            proxy : new Ext.data.HttpProxy({  
                url : 'list.jsp'  
            }),  
            reader : new Ext.data.JsonReader({  
                totalProperty : 'totalProperty',  
                root : 'root',  
                fields: record  
            })  
        });  
        store.load();  
        var p = new Ext.Panel({  
            title : '月份访问量',  
            width : 500,  
            height : 300,  
            items : [{  
                xtype : 'piechart',  
                url : 'extjs/resources/charts.swf',  
                store : store,  
                categoryField : 'month',  
                dataField : 'number'  
           }]  
        });  
        var vp = new Ext.Viewport({  
            items : [p]  
        });  
    });  
    	
    </script>
    <div id="chartPanel"></div>
</body>
</html>