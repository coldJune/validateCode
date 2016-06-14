<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<img alt="看不清，换一张" src="SecurityCodeImageAction" id="verify" >
	<input type="text" name="securityCode">
	<script type="text/javascript" src="webjars/jquery/2.1.4/jquery.js"></script>
	<script type="text/javascript">
		$(function(){
			$("verify").click(function(){
				$(this).attr("src","SecurityCodeImageAction?timestamp="+new Date().getTime());
				});
			});

		window.onload=function(){
			var verituObj = document.getElementById("verity");
			verituObj.onclick=function(){
					this.src="SecurityCodeImageAction?timestamp="+new Date().getTime();
				};
			}
	</script>
</body>
</html>