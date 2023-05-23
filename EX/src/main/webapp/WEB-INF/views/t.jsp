<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div style="width: 100%; display: flex">
	<div class="forTextLabel">
		이메일
	</div>
	<div class="forText">
		<input type="email" id="emailText">
	</div>
	<div>
		<button id="emailCheck" onclick="emailSend()">인증번호 받기</button>
	</div>
</div>
<div style="width: 100%; display: flex">
	<div class="forTextLabel">
		인증번호
	</div>
	<div class="forText">
		<input type="text" id="certificationNumber">
	</div>
	<div>
		<button id="certificationBtn" onclick="emailCertification()">인증하기</button>
		<input type="hidden" id="certificationYN" value="false">
	</div>
</div>

</body>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script src="https://code.jquery.com/ui/1.13.2/jquery-ui.js"></script>
<script>
function emailSend() {
	let clientEmail = document.getElementById(elementId:'emailText').value;
	let emailYN = isEmail(clientEmail);
	
	console.log('입력 이메일'+clientEmail);
	
	if(emailYN == true) {
		alert('이메일 형식입니다');
		
		$.ajax({
			type:"post",
			url:"/api/member/email",
			data:{userEmail:clientEmail},
			success: function(data) {
				
			}, error : function(e) {
				alert('오류입니다. 잠시 후 다시 시도해주세요.');
			}
		});
	
	} else {
		alert('이메일 형식에 알맞게 입력해주세요 xxx@xxx.com');
	}
}

function isEmail(asValue) {
	var regExp = /^[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/i;
	return regExp.test(asValue);	// 형식에 맞는 경우 true 리턴
}

</script>

</html>