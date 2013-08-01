<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

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
        //在ext 4以前的版本中这个非常重要，不然会引起界面的混乱
        Ext.BLANK_IMAGE_URL = 'extjs/resources/images/default/s.gif'; 
        //Ext的标准提示初始化，当然没有它也可以
        Ext.QuickTips.init();

        //很熟悉吧，Jquery(document).ready(); ^^
        Ext.onReady(function () {
            var north = new Ext.Panel({
                id:'south',
                html : '<div>这里是我们的管理系统标题哦</div>',
                bodyStyle: 'background:#133984;padding:20px',
                height : 60,
                region : 'north',
                split : false                                    //禁止拖动
            });

            var south = new Ext.Panel({
                id : 'north',
                html : '<div style="text-align:center">这里是版权哦</div>',
                region : 'south',
                split : false
            });

            var west = new Ext.Panel({
                id : 'west',
                html : '<div>这里是树导航哦</div>',
                width : 200,
                region : 'west',
                split : 'true'
            })

            var content = new Ext.Panel({
                id : 'center',
                html : '这里是主体内容哦',
                split : 'true',
                region : 'center'                                //这里是最重要的，在4版本后如果没有center渲染会报错的
            });

            var view = new Ext.Viewport({
                layout:'border',
                items : [north,south,west,content]
            })
        })
    </script>
</body>
</html>