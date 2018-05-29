<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css"> 
body{
    font-size:70%;
    font-family:verdana,helvetica,arial,sans-serif;
}
#coordiv{
	position: absolute;

}
</style>
</head>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.6.4.js"></script>
<script type="text/javascript">
function getPoint(){
	var nodeText = document.getElementById("nodeText");
	var value = nodeText.value;

	$.ajax({
		type:'post',
		url:'${pageContext.request.contextPath}/getString?nodeString='+value,
		dataType:'json',
		success:function(data){
			if(null != data && "" != data){
				var c1=document.getElementById("coordiv");
				var cxt1=c1.getContext("2d");
				cxt1.fillStyle="#FF0000";
				for(var i=0;i < data.length; i++){//循环遍历list，填充颜色
					cxt1.beginPath();
					cxt1.arc(data[i].x,data[i].y,15,0,Math.PI*2,true);
					cxt1.fill();
					cxt1.closePath();
				}
			}else{//如果查询不到，即返回空值
				$('textarea').val('查询失败，请确认告警节点是否输入正确');
			}

		},
		error:function(e) { 
			console.error(e); 
			} 
	});
	var time = document.getElementById("timeNode");
	var str = $('textarea').val();
	$('textarea').val(str+"查询共用了"+time.value+"ns");
}
</script>

<body style="margin:0px;">

<p>把鼠标悬停在下面的矩形上可以看到坐标：</p>

<canvas id="coordiv" width="600" height="600" style="border:1px solid #c3c3c3" onmousemove="cnvs_getCoordinates(event)" onmouseout="cnvs_clearCoordinates()"></canvas>
<br />
<br />
<br />
<div id="xycoordinates"></div>
<div id="text"  style="position:absolute;right:500px">
	<form action="${pageContext.request.contextPath}/getNode" method="post">
		<h3>输入告警的设备(注意用逗号","隔开)</h3>
		<input id="nodeText" type="text" name="voice" value="${nodeString}"/>
		<input id="timeNode" type="hidden" value="${time }"/>
		<button type="submit" >查&nbsp询</button>
		
	</form>
	<h3>查询结果如下:</h3><br/>
	<table border="1" style="color:black">
		<tr>
			<td>节点编号</td>
			<td>横坐标</td>
			<td>纵坐标</td>
		</tr>
		<c:forEach items="${list }" var="node">
			<tr>
				<td>${node.index }</td>
				<td>${node.x }</td>
				<td>${node.y }</td>
			</tr>
		</c:forEach>
	</table>
	<h3>点击下面的按钮查看控制台信息:</h3><button type="button" onclick="javascript:getPoint();">查&nbsp看</button></br>
	<textarea rows="10" cols="20"></textarea>
</div>
 

</body>
<script type="text/javascript"> 
	function cnvs_getCoordinates(e){
	    x=e.clientX;
	    y=e.clientY;
	    document.getElementById("xycoordinates").innerHTML="当前坐标: (" + x + "," + y + ")";
	}
	 
	function cnvs_clearCoordinates(){
	    document.getElementById("xycoordinates").innerHTML="";
	}
	var c=document.getElementById("coordiv");
	var cxt=c.getContext("2d");
	cxt.font="15px Arial";
	// cxt.fillStyle="#FF0000";
	var x = 55;
	var y = 305;
	var x1 = 75;
	var y1 = 300;
	for(let i=1;i<=7;i++){//红色路径
		if(i==4||i==7){
			if(i==4){
				cxt.fillText("E3",x,y);
			}else{
				cxt.fillText("E4",x,y);
			}
		}else if(i>=5){
			i = i+1;
			cxt.fillText(i,x,y);
			i = i-1;
		}else{
			cxt.fillText(i,x,y);
		}
		
		cxt.beginPath();
		cxt.arc(60*i,300,15,0,Math.PI*2,true);
		cxt.closePath();
		cxt.stroke();
		if(i < 7){//画线
			cxt.strokeStyle = 'red';
			cxt.moveTo(x1,y1);
			cxt.lineTo(x1+30,y1);
			cxt.stroke();
		}
		x += 60;
		x1 += 60;
	}
	x = 55;
	y = 375;
	x1 = 75;
	y1 = 370;

	for(let i = 1;i < 7;i++){//绿色路径
		if(i<3||i>=6){
			if(i==6){
				i=9;
				cxt.fillText(i,x,y);
				cxt.stroke();
				i=6;
			}else{
				cxt.fillText(i+3,x,y);
				cxt.stroke();
			}
			cxt.beginPath();
			cxt.arc(60*i,370,15,0,Math.PI*2,true);
			cxt.closePath();

		}
		if(i < 2){
			cxt.strokeStyle = 'green';
			cxt.moveTo(x1,y1);
			cxt.lineTo(x1+30,y1);
			cxt.stroke();
		}
		x += 60;
		x1 += 60;
	}
	cxt.moveTo(130,360);
	cxt.lineTo(170,313);

	cxt.moveTo(190,290);
	cxt.lineTo(230,245);

	cxt.moveTo(250,245);
	cxt.lineTo(290,290);
	cxt.stroke();

	x = 235;
	y = 240;
	for(let i = 10;i < 12;i++){//最上方的两个节点
		cxt.fillText("E"+(i-9),x-3,y);
		cxt.beginPath();
		cxt.arc(240*(i-9),235,15,0,Math.PI*2,true);
		cxt.closePath();
		cxt.stroke();
		x += 240;
	}
	//最下方的节点
		cxt.fillText(8,295,455);
		cxt.beginPath();
		cxt.arc(60*5,450,15,0,Math.PI*2,true);
		cxt.closePath();
		cxt.stroke();
	//画线
	cxt.strokeStyle = 'LightSkyBlue';
	cxt.moveTo(305,435);
	cxt.lineTo(350,380);

	cxt.moveTo(370,360);
	cxt.lineTo(410,310);

	cxt.moveTo(430,290);
	cxt.lineTo(470,245);
	cxt.stroke();
	// cxt.fill();

</script>
</html>