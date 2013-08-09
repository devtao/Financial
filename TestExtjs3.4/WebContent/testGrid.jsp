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
    Ext.onReady(function(){
    var sm = new Ext.grid.CheckboxSelectionModel();    //复选框	
    	
    var cm = new Ext.grid.ColumnModel({
					   columns : [
						 sm,
						{header:'曲目编号', dataIndex:'music_id'},
						{header:'曲目名称', dataIndex:'music_name', sortable:true},//sortable排序功能
						{header:'作曲家', dataIndex:'composer'},
						{header:'演奏乐器', dataIndex:'instrument'}
								 ]
    });
    
    var data = [
            	['1','001', 'Oasis', 'Kotaro Oshio', '吉他'],
            	['2','002', 'Classical Gas', 'Tommy.Emmanuel','吉他'],
            	['3','003', 'THIS WAY', 'Depapepe', '吉他']
            ];
    
    var store = new Ext.data.Store({
    	proxy:new Ext.data.MemoryProxy(data),
    	reader:new Ext.data.ArrayReader({},[
			{name:'id',mapping:0},
    		{name:'music_id',mapping:1},
    		{name:'music_name',mapping:2},
    		{name:'composer',mapping:3},
    		{name:'instrument',mapping:4}
    	])
    });
    
    store.load();

    var gridPanel = new Ext.grid.GridPanel({
    	renderTo:'gridPanel',
    	autoHeight:true,
    	enableColumnMove:false,   //  阻止移动列和改变列的宽度：
    	enableColumnResize:false, //  阻止移动列和改变列的宽度：
    	store:store,
    	cm:cm,
    	sm:sm //在每列加上复选框 
    });
    });
    
    function deleteCheckbox(){                
        //从后往前扫描             
        for(var i = store.getCount();i>=0;i--){           
           if(mm.isSelected(i)){         
                   //删除当前行  
                   store.removeAt(i);  
               }  
        }        
        //重新加载表数据        
        gridPanel.reconfigure(store,cm);         
     };   
    
    </script>
    <div id="gridPanel"></div>
    <input type = "button" value = "删除选中行" onclick = "deleteCheckbox()" style = "margin-top:20px"/>  //有bug删不掉，待调整
    
</body>
</html>