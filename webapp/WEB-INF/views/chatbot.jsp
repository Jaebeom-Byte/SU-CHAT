<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SU-CHAT</title>
<meta name=viewport content="width=device-width, initial-scale=1, user-scalable=0">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css"
	rel="stylesheet" type="text/css">
<link href="assets/css/chatbot.css" type="text/css" rel="stylesheet">

<script>
	var getTime = function() {
		var today = new Date()
		var time = today.getHours()

		if (time < 12) {
			time = '오전 ' + today.getHours() + ':' + today.getMinutes()
		} else if (time == 12) {
			time = '오후 ' + today.getHours() + ':' + today.getMinutes()
		} else {
			time = '오후 ' + (today.getHours() - 11) + ':' + today.getMinutes()
		}
		return time
	}

	var setRequest = function(msg) {
		var date_time = getTime()
		$('.msg_history').append(
				'<div class="outgoing_msg">' + '<div class="sent_msg">' + '<p>'
						+ msg + '</p>' + '<span class="time_date">' + date_time
						+ '</span>' + '</div>' + '</div>')
		$('.msg_history').scrollTop($('.msg_history')[0].scrollHeight)
	}

	var postRequestToController = function() {
		var msg = $('.write_msg').val()

		$('.write_msg').val('')

		if (msg == '') {
			$('.write_msg').focus()
			return null
		}
		setRequest(msg)

		$.ajax({
			type : 'POST',
			url : 'ChatAPIController.chat',
			data : msg,
			contentType : 'application/json',
			success : function(resdata) {
				var items = JSON.parse(resdata)
				urlTypeParsor(items)
			},
			beforeSend : function() {
				$('.wait').addClass('loading')
			},
			complete : function() {
				$('.wait').removeClass('loading')
			},
			error : function(e) {
				console.log(e)
			}
		})
	}

	var enterkeypress = function() {
		if (event.keyCode == 13)
			postRequestToController()
	}

	var urlTypeParsor = function(items) {
		var urls = items.messages

		if (urls[0].includes('.png')) {
			setImgResponse(items)
		} else {
			setResponse(items)
		}
	}

	var setResponse = function(items) {
		var date_time = getTime()

		for (index in items.messages) {
			$('.msg_history')
					.append(
							'<div class="incoming_msg">'
									+ '<div class="incoming_msg_img">'
									+ '<img src="assets/images/bot-icon.png" alt="SU CHAT">'
									+ '</div>' + '<div class="received_msg">'
									+ '<div class="received_with_msg">' + '<p>'
									+ items.messages[index] + '</p>'
									+ '<span class="time_date">' + date_time
									+ '</span>' + '</div>' + '</div>'
									+ '</div>')
			$('.msg_history').scrollTop($('.msg_history')[0].scrollHeight)
		}
	}

	var setImgResponse = function(items) {
		var date_time = getTime()

		for (index in items.messages) {
			$('.msg_history')
					.append(
							'<div class="incoming_msg">'
									+ '<div class="incoming_msg_img">'
									+ '<img src="assets/images/bot-icon.png" alt="SU CHAT">'
									+ '</div>'
									+ '<div class="received_img">'
									+ '<div class="received_contents_container">'
									+ '<div class="received_with_img" style="background-image: url('
									+ '\'' + items.messages[index] + '\')"'
									+ '>' + '</div>' + '</div>'
									+ '<span class="time_date">' + date_time
									+ '</span>' + '</div>' + '</div>')
			$('.msg_history').scrollTop($('.msg_history')[0].scrollHeight)
		}
	}
</script>
</head>
<body>
	<div class="container">
		<div class="mesgs">
			<div class="mesg_header">
				<h2>SU TALK</h2>
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

