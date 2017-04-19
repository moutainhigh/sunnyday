<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/3/24
  Time: 11:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>分享纪录</title>
    <jsp:include page="/include/common.jsp" />
    <script type="text/javascript" src="<c:url value="/resources/lib/jquery/plugin/jquery.form.min.js" />"></script>
    <script type="text/javascript" src="<c:url value="/resources/js/verify.js" />"></script>
    <script type="text/javascript" src="<c:url value="/resources/lib/My97DatePicker/WdatePicker.js" />"></script>
    <script type="text/javascript">

        $(document).ready(function(){
            $('#dgRecord').datagrid({
                url:'<c:url value="/web/share/getShareRecordListJSON.json" />',
                title:'分享记录&nbsp;|&nbsp;共发出佣金<span style="color:red;">${totalReward}</span>元。',
                singleSelect:true,
                fit:true,
                fitColumns:true,
                toolbar:'#tbRecord',
                striped:true,
                rownumbers:true,
                pagination:true,
                pageSize: 20,
                columns:[[
                    {field:'shareRecordId',title:'编号',align:'center'},
                    {field:'shareNickName',title:'分享人的昵称',width:100,align:'center',formatter:function(val,row){
                    	if (val == '') {
                    		return row.shareOpenId + "(店铺)";
                    	} else {
                    		return val;
                    	}
                    }},
                    {field:'nickname',title:'购买人昵称',width:100,align:'center'},
                    {field:'sku',title:'订单号',width:80,align:'center'},
                    {field:'number',title:'购买苹果箱数',width:80,align:'center'},
                    {field:'createDate',title:'中奖时间',width:100,align:'center'},
                    {field:'sendRedPack',title:'是否发放佣金',width:100,align:'center',formatter:function(val,row){
                    	if (val == 0) {
                    		return "N";
                    	} else {
                    		return "Y";
                    	}
                    }},
                ]],
            });
            formatPagination("dgRecord");
        });
    </script>
</head>
<body class="easyui-layout">
<div data-options="region:'center',border:false" class="mainPanel">
    <div id="tbRecord" class="toolBarPadding">
        <div style="float:left;">
            <a href="<c:url value="/web/share/ShareRecordExcl1.action"/> "
              class="easyui-linkbutton v-align-middle" data-options="iconCls:'icon-edit',plain:true">导出 <span style="color:#e80a0a;">线下支付</span> 记录&nbsp;</a>
          <a href="<c:url value="/web/share/ShareRecordExcl.action"/> "
          class="easyui-linkbutton v-align-middle" data-options="iconCls:'icon-edit',plain:true">导出 线上支付 记录&nbsp;</a>
        </div>
        <div style="float:right;"></div>
        <div style="clear:both;"></div>
    </div>
    <table id="dgRecord"></table>
</div>
</body>
</html>