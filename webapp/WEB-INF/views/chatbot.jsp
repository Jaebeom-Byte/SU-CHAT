<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css"
	rel="stylesheet" type="text/css">
<style type="text/css">
@charset "UTF-8"; 

.container {
	max-width: 1170px;
	margin: auto;
	text-align: center;
}

img {
	max-width: 100%;
}

.inbox_people {
	background: #f8f8f8 none repeat scroll 0 0;
	float: left;
	overflow: hidden;
	width: 40%;
	border-right: 1px solid #c4c4c4;
}

.inbox_msg {
	border: 1px solid #c4c4c4;
	clear: both;
	overflow: hidden;
}

.top_spac {
	margin: 20px 0 0;
}

.recent_heading {
	float: left;
	width: 40%;
}

.srch_bar {
	display: inline-block;
	text-align: right;
	width: 60%;
	padding:
}

.headind_srch {
	padding: 10px 29px 10px 20px;
	overflow: hidden;
	border-bottom: 1px solid #c4c4c4;
}

.recent_heading h4 {
	color: #05728f;
	font-size: 21px;
	margin: auto;
}

.srch_bar input {
	border: 1px solid #cdcdcd;
	border-width: 0 0 1px 0;
	width: 80%;
	padding: 2px 0 4px 6px;
	background: none;
}

.srch_bar .input-group-addon button {
	background: rgba(0, 0, 0, 0) none repeat scroll 0 0;
	border: medium none;
	padding: 0;
	color: #707070;
	font-size: 18px;
}

.srch_bar .input-group-addon {
	margin: 0 0 0 -27px;
}

.chat_ib h5 {
	font-size: 15px;
	color: #464646;
	margin: 0 0 8px 0;
}

.chat_ib h5 span {
	font-size: 13px;
	float: right;
}

.chat_ib p {
	font-size: 14px;
	color: #989898;
	margin: auto
}

.chat_img {
	float: left;
	width: 11%;
}

.chat_ib {
	float: left;
	padding: 0 0 0 15px;
	width: 88%;
}

.chat_people {
	overflow: hidden;
	clear: both;
}

.chat_list {
	border-bottom: 1px solid #c4c4c4;
	margin: 0;
	padding: 18px 16px 10px;
}

.inbox_chat {
	height: 550px;
	overflow-y: scroll;
}

.active_chat {
	background: #ebebeb;
}

.incoming_msg_img {
	display: inline-block;
	width: 6%;
}

.received_msg {
	display: inline-block;
	padding: 0 0 0 10px;
	vertical-align: top;
	width: 92%;
}

.received_with_msg p {
	background: #ebebeb none repeat scroll 0 0;
	border-radius: 3px;
	color: #646464;
	font-size: 14px;
	margin: 0;
	padding: 5px 10px 5px 12px;
	width: 100%;
}

.time_date {
	color: #747474;
	display: block;
	font-size: 12px;
	margin: 8px 0 0;
}

.received_with_msg {
	width: 57%;
}

.mesgs {
	padding: 30px 15px 0 25px;
	width: 440px;
}

.sent_msg p {
	background: #05728f none repeat scroll 0 0;
	border-radius: 3px;
	font-size: 14px;
	margin: 0;
	color: #fff;
	padding: 5px 10px 5px 12px;
	width: 100%;
}

.outgoing_msg {
	overflow: hidden;
	margin: 26px 0 26px;
}

.sent_msg {
	float: right;
	width: 46%;
}

.input_msg_write input {
	background: rgba(0, 0, 0, 0) none repeat scroll 0 0;
	border: medium none;
	color: #4c4c4c;
	font-size: 15px;
	min-height: 48px;
	width: 100%;
}

.type_msg {
	border-top: 1px solid #c4c4c4;
	position: relative;
}

.msg_send_btn {
	background: #05728f none repeat scroll 0 0;
	border: medium none;
	border-radius: 50%;
	color: #fff;
	cursor: pointer;
	font-size: 17px;
	height: 33px;
	position: absolute;
	right: 7px;
	top: 7px;
	width: 33px;
}

.messaging {
	padding: 0 0 50px 0;
}

.msg_history {
	height: 516px;
	overflow-y: auto;
}

.loading {
	position: fixed;
	z-index: 999;
	width: 400px;
	height: 516px;
    background: rgba( 255, 255, 255, 0.8 ) 
                url('/su-chat/assets/images/loading-circle.gif')
				50% 50%
                no-repeat;
}
</style>
<script>
	var getDateTime = function() {
		var today = new Date()
		var date_time = today.toLocaleTimeString()
		return date_time
	}

	var setRequest = function(msg) {
		var date_time = getDateTime()
		$('.msg_history').append('<div class="outgoing_msg">'
							   + '<div class="sent_msg">'
							   + '<p><b>' + msg + '</b></p>'
							   + '<span class="time_date">' + date_time + '</span>'
							   + '</div>'
							   + '</div>' )
		$('.msg_history').scrollTop(
							$('.msg_history')[0].scrollHeight )
	}

	var setResponse = function(items) {
		var date_time = getDateTime()
		$('.msg_history').append('<div class="incoming_msg">'
							   + '<div class="incoming_msg_img">'
							   + '<img src="assets/images/bot-icon.png" alt="SYU BOT">'
							   + '</div>'
							   + '<div class="received_msg">'
							   + '<div class="received_with_msg">'
							   + '<p><b>' + items.message + '</p></b>'
							   + '<span class="time_date">' + date_time + '</span>'
							   + '</div>'
							   + '</div>'
							   + '</div>')
		$('.msg_history').scrollTop(
							$('.msg_history')[0].scrollHeight )
	}
	
	var postRequestToController = function() {
		var msg = $('.write_msg').val()
		
		$('.write_msg').val('')
		
		if(msg == '') {
			$('.write_msg').focus()
			return null
		}
		setRequest(msg)
		
		/*
			${pageContext.request.contextPath}/ChatAPIController.chat
		*/
		
		$.ajax({
			type: 'POST',
			url: 'ChatAPIController.chat',
			data: msg,
			contentType: 'application/json',
			success: function(resdata) {
				var items = JSON.parse(resdata)
				setResponse(items)
			},
			beforeSend: function() {
				$('.wait').addClass('loading')
			},
			complete: function() {
				$('.wait').removeClass('loading')
			},
			error: function(e) {
				console.log(e)
			}
		})
	}
	
	var enterkeypress = function() {
		if(event.keyCode == 13)
			postRequestToController()
	}
</script>
</head>
<body>
	<div class="container">
		<div class="mesgs">
			<div class="mesg_header">
				<h2>SYU's TALK</h2>
			</div>
			<div class="msg_history">
				<div class="wait"></div>
			</div>
			<div class="messaging">
				<div class="type_msg">
					<div class="input_msg_write">
						<input type="text" class="write_msg" placeholder="메시지 입력"
							onkeydown="javascript:enterkeypress()">
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>

