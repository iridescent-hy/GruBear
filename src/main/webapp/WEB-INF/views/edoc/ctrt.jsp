<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

 <script src="/resources/ckeditor/ckeditor.js"></script>
 
 <script src="https://rawgit.com/enyo/dropzone/master/dist/dropzone.js"></script>
<link rel="stylesheet"
	href="https://rawgit.com/enyo/dropzone/master/dist/dropzone.css">
 
 
 
 <script type="text/javascript">
	$(function() {

		$('#cancel').on('click', function() {
			let result = confirm("취소하시겠습니까?");
			if (result > 0) {
				window.close();
			}
		});
	});
</script>
 
 
 
 
 
 	<form action="/a" id="" enctype="multipart/form-data" method="post">
	<table class="m-2" style="border: 0px solid rgb(0, 0, 0); border-image: none; width: 100px; 
	  font-family: malgun gothic,dotum,arial,tahoma;  margin-top: 1px; border-collapse: collapse;">
	      <tr>
	  <td><button type="button" class="btn btn-outline-dark" style="width:100px;">결재정보</button></td>
		<td><button type="button" class="btn btn-outline-dark" style="width:100px;">결재요청</button></td>
	  <td><button type="button" class="btn btn-outline-dark" style="width:100px;" >미리보기</button></td>
		<td><button type="button" class="btn btn-outline-dark" style="width:100px;">임시저장</button></td>
		<td><button type="button" class="btn btn-outline-dark" style="width:100px;" id="cancel">취소</button></td>
	  </tr>
	  </table> 


	<div class="card m-2 mb-5 pb-7">


	<!-- 문서 내용 표시 테스트 -->

		<table class="px-5 mx-5 mx-auto"
			style="border: 0px solid rgb(0, 0, 0); border-image: none; width: 800px; 
			font-family: malgun gothic, dotum, arial, tahoma; margin-top: 1px; border-collapse: collapse;">
			<!-- Header -->
			<colgroup>
				<col width="310">
				<col width="490">
			</colgroup>
			<tbody>
				<tr>
					<td
						style="background: white; padding: 0px !important; border: 0px currentColor; height: 200px; text-align: center; color: black; font-size: 36px; font-weight: bold; vertical-align: middle;"
						colspan="2">하도급 계약 요청서</td>
				</tr>
				<tr>
					<td
						style="background: white; padding: 0px !important; border: currentColor; border-image: none; text-align: left; color: black; font-size: 12px; font-weight: normal; vertical-align: top;">
						<div id="agreementWrap" class="sign_type1 sign_type_new"></div>

						<table
							style="border: 1px solid rgb(0, 0, 0); border-image: none; font-family: malgun gothic, dotum, arial, tahoma; margin-top: 1px; border-collapse: collapse;">
							<!-- User -->
							<colgroup>
								<col width="90">
								<col width="220">
							</colgroup>
							<tbody>
								<tr>
									<td
										style="background: rgb(221, 221, 221); padding: 5px; border: 1px solid black; border-image: none; height: 18px; text-align: center; color: rgb(0, 0, 0); font-size: 12px; font-weight: bold; vertical-align: middle;">기안자</td>
									<td
										style="background: rgb(255, 255, 255); padding: 5px; border: 1px solid black; border-image: none; text-align: left; color: rgb(0, 0, 0); font-size: 12px; font-weight: normal; vertical-align: middle;">
										<input type="text"
										style="vertical-align: middle; width: 100%; border: 0px; box-shadow: inset 0px 0px 0px rgba(150, 150, 150, 0.2)"
										name="" id="" value="${name}">
									</td>
								</tr>
								<tr>
									<td
										style="background: rgb(221, 221, 221); padding: 5px; border: 1px solid black; border-image: none; height: 18px; text-align: center; color: rgb(0, 0, 0); font-size: 12px; font-weight: bold; vertical-align: middle;">
										소속</td>
									<td
										style="background: rgb(255, 255, 255); padding: 5px; border: 1px solid black; border-image: none; text-align: left; color: rgb(0, 0, 0); font-size: 12px; font-weight: normal; vertical-align: middle;">
										<input type="text"
										style="vertical-align: middle; width: 100%; border: 0px; box-shadow: inset 0px 0px 0px rgba(150, 150, 150, 0.2)"
										name="" id="" value="${dept}">
									</td>
								</tr>
								<tr>
									<td
										style="background: rgb(221, 221, 221); padding: 5px; border: 1px solid black; border-image: none; height: 18px; text-align: center; color: rgb(0, 0, 0); font-size: 12px; font-weight: bold; vertical-align: middle;">
										기안일</td>
									<td
										style="background: rgb(255, 255, 255); padding: 5px; border: 1px solid black; border-image: none; text-align: left; color: rgb(0, 0, 0); font-size: 12px; font-weight: normal; vertical-align: middle;">
										<input type="text"
										style="vertical-align: middle; width: 100%; border: 0px; box-shadow: inset 0px 0px 0px rgba(150, 150, 150, 0.2)"
										value="${today}" />
									</td>
								</tr>
								<tr>
									<td
										style="background: rgb(221, 221, 221); padding: 5px; border: 1px solid black; border-image: none; height: 18px; text-align: center; color: rgb(0, 0, 0); font-size: 12px; font-weight: bold; vertical-align: middle;">
										문서번호</td>
									<td
										style="background: rgb(255, 255, 255); padding: 5px; border: 1px solid black; border-image: none; text-align: left; color: rgb(0, 0, 0); font-size: 12px; font-weight: normal; vertical-align: middle;">
										<input type="text"
										style="vertical-align: middle; width: 100%; border: 0px; box-shadow: inset 0px 0px 0px rgba(150, 150, 150, 0.2)">
									</td>
								</tr>
							</tbody>
						</table>
					</td>
					<td
						style="background: white; padding: 0px !important; border: currentColor; border-image: none; text-align: right; color: black; font-size: 12px; font-weight: normal; vertical-align: top;"><span
						class="sign_type1_inline"> <span class="sign_tit_wrap"><span
								class="sign_tit"><strong>신청</strong></span></span> <span
							class="sign_member_wrap" id="activity_19284"><span
								class="sign_member"> <span class="sign_rank_wrap"><span
										class="sign_rank">과장</span></span> <span class="sign_wrap"><span
										class="sign_name">한성준</span></span><span class="sign_date_wrap"><span
										class="sign_date" id="date_19284"></span></span></span></span></span>
					<!-- 에디터 &nbsp; 버그. 개행과 공백을 최소화 시키자. --> <span
						class="sign_type1_inline"><span class="sign_tit_wrap"><span
								class="sign_tit"><strong>승인</strong></span></span><span
							class="sign_member_wrap" id="activity_19285"><span
								class="sign_member"><span class="sign_rank_wrap"><span
										class="sign_rank">차장</span></span><span class="sign_wrap"><span
										class="sign_name">전병헌</span></span><span class="sign_date_wrap"><span
										class="sign_date " id="date_19285"></span></span></span></span><span
							class="sign_member_wrap" id="activity_19286"><span
								class="sign_member"><span class="sign_rank_wrap"><span
										class="sign_rank">부장</span></span><span class="sign_wrap"><span
										class="sign_name">김지연</span></span><span class="sign_date_wrap"><span
										class="sign_date " id="date_19286"></span></span></span></span><span
							class="sign_member_wrap" id="activity_19287"><span
								class="sign_member"><span class="sign_rank_wrap"><span
										class="sign_rank">대표이사</span></span><span class="sign_wrap"><span
										class="sign_name">김상후</span></span><span class="sign_date_wrap"><span
										class="sign_date " id="date_19287"></span></span></span></span></span>
					<!-- 에디터 &nbsp; 버그. 개행과 공백을 최소화 시키자. --> <span
						class="sign_type1_inline"></span></td>
			</tbody>
		</table>


		<table class="px-5 mx-5 mx-auto"
			style="border: 0px solid rgb(0, 0, 0); border-image: none; width: 800px; font-family: malgun gothic, dotum, arial, tahoma; margin-top: 10px; border-collapse: collapse;">
			<!-- Data2 -->
			<colgroup>
				<col width="140">
				<col width="140">
				<col width="120">
				<col width="140">
				<col width="260">
			</colgroup>
			<tbody>
				<tr>
					<td
						style="background: rgb(255, 255, 255); padding: 5px; border: 0px solid black; border-image: none; height: 25px; text-align: left; color: rgb(0, 0, 0); font-size: 14px; font-weight: bold; vertical-align: middle;"
						colspan="4">2.하도급 계약 내용</td>
					<td
						style="background: rgb(255, 255, 255); padding: 5px; border: 0px solid black; border-image: none; text-align: right; color: rgb(0, 0, 0); font-size: 12px; font-weight: normal; vertical-align: bottom;">
					</td>
				</tr>
				
				 <tr> 
	     			<td style="background: rgb(221, 221, 221); padding: 5px; border: 1px solid black; border-image: none; height: 22px; text-align: center; 
	     			color: rgb(0, 0, 0); font-size: 12px; font-weight: bold; vertical-align: middle;">
	     			 계약명
	     			  </td> 
	    			 <td style="background: rgb(255, 255, 255); padding: 5px; border: 1px solid black; border-image: none; text-align: left; 
	    			 color: rgb(0, 0, 0); font-size: 12px; font-weight: normal; vertical-align: middle;" colspan="4" >
	    			 <input type="text" size="20"><br></td> 
   				 </tr>	
				 <tr> 
	     			<td style="background: rgb(221, 221, 221); padding: 5px; border: 1px solid black; border-image: none; height: 22px; text-align: center; 
	     			color: rgb(0, 0, 0); font-size: 12px; font-weight: bold; vertical-align: middle;">
	     			 거래처명
	     			  </td> 
	    			 <td style="background: rgb(255, 255, 255); padding: 5px; border: 1px solid black; border-image: none; text-align: left; 
	    			 color: rgb(0, 0, 0); font-size: 12px; font-weight: normal; vertical-align: middle;" colspan="4" >
	    			 <input type="text" size="20"><br></td> 
   				 </tr>	
				 <tr> 
	     			<td style="background: rgb(221, 221, 221); padding: 5px; border: 1px solid black; border-image: none; height: 22px; text-align: center; 
	     			color: rgb(0, 0, 0); font-size: 12px; font-weight: bold; vertical-align: middle;">
	     			 거래처 법인번호
	     			  </td> 
	    			 <td style="background: rgb(255, 255, 255); padding: 5px; border: 1px solid black; border-image: none; text-align: left; 
	    			 color: rgb(0, 0, 0); font-size: 12px; font-weight: normal; vertical-align: middle;" colspan="4" >
	    			 <input type="text" size="20"><br></td> 
   				 </tr>	
				
				<tr>
					<td
						style="background: rgb(221, 221, 221); padding: 5px; border: 1px solid black; border-image: none; text-align: center; color: rgb(0, 0, 0); font-size: 12px; font-weight: bold; vertical-align: middle;"
						rowspan="6">하도급<br>계약조건
					</td>
					<td
						style="background: rgb(221, 221, 221); padding: 5px; border: 1px solid black; border-image: none; height: 22px; text-align: center; color: rgb(0, 0, 0); font-size: 12px; font-weight: normal; vertical-align: middle;">
						계약금액</td>
					<td
						style="background: rgb(255, 255, 255); border-width: medium 1px 1px; border-style: none solid solid; 
						border-color: currentColor black black; padding: 5px; text-align: left; color: rgb(0, 0, 0); font-size: 12px; font-weight: normal; vertical-align: middle;"
						colspan="3">
						<input type="text"
						class="ipt_editor ipt_editor_currency" 
						style="text-align: right;">&nbsp;원/VAT 별도</td>
				</tr>
				<tr>
					<td
						style="background: rgb(221, 221, 221); padding: 5px; border: 1px solid black; border-image: none; height: 22px; text-align: center; color: rgb(0, 0, 0); font-size: 12px; font-weight: normal; vertical-align: middle;">
						계약기간</td>
					<td
						style="background: rgb(255, 255, 255); padding: 5px; border: 1px solid black; border-image: none; text-align: left; color: rgb(0, 0, 0); 
						font-size: 12px; font-weight: normal; vertical-align: middle;"
						colspan="3"><span data-type="period" data-value="">
						<input type="date"
							 id="editorForm_26" name="editorForm_26">
							~ <input type="date" 
							 id="editorForm_27" name="editorForm_27"></span>
					</td>
				</tr>
				<tr>
					<td
						style="background: rgb(221, 221, 221); padding: 5px; border: 1px solid black; border-image: none; height: 22px; 
						text-align: center; color: rgb(0, 0, 0); font-size: 12px; font-weight: normal; vertical-align: middle;">
						납부기한일</td>
					<td
						style="background: rgb(255, 255, 255); padding: 5px; border: 1px solid black; border-image: none; 
						text-align: left; color: rgb(0, 0, 0); font-size: 12px; font-weight: normal; vertical-align: middle;"
						colspan="3">
						<input type="date" class="">
					</td>
				</tr>
				<tr>
				</tr>
				<tr>
				</tr>
				<tr>
					<td
						style="background: rgb(221, 221, 221); padding: 5px; border: 1px solid black; border-image: none; height: 100px; 
						text-align: center; color: rgb(0, 0, 0); font-size: 12px; font-weight: no; vertical-align: middle;">
						대금결제조건</td>
					<td
						style="background: rgb(255, 255, 255); padding: 5px; border: 1px solid black; border-image: none; 
						text-align: left; color: rgb(0, 0, 0); font-size: 12px; font-weight: normal; vertical-align: top;"
						colspan="4">
						<textarea id="" name="" style="width:100%; height:100px;"></textarea></td>
				</tr>
				<tr>
					<td
						style="background: rgb(221, 221, 221); padding: 5px; border: 1px solid black; border-image: none; height: 230px; 
						text-align: center; color: rgb(0, 0, 0); font-size: 12px; font-weight: bold; vertical-align: middle;">
						도급내용</td>
					<td
						style="background: rgb(255, 255, 255); padding: 5px; border: 1px solid black; border-image: none; text-align: left; 
						color: rgb(0, 0, 0); font-size: 12px; font-weight: normal; vertical-align: top;"
						colspan="4">
						<textarea id="ctrtCn" name="ctrtCn" style="width:100%; height:230px;"></textarea>
						</td>
				</tr>
				<tr>
					<td
						style="background: rgb(221, 221, 221); padding: 5px; border: 1px solid black; border-image: none; height: 150px; 
						text-align: center; color: rgb(0, 0, 0); font-size: 12px; font-weight: bold; vertical-align: middle;">
						비고</td>
					<td
						style="background: rgb(255, 255, 255); padding: 5px; border: 1px solid black; border-image: none; text-align: left; 
						color: rgb(0, 0, 0); font-size: 12px; font-weight: normal; vertical-align: top;"
						colspan="4">
						<textarea id="ctrtExt" name="ctrtExt"  style="height:150px; width:100%;"></textarea><br></td>
				</tr>
				<tr>
					<td
						style="background: rgb(255, 255, 255); padding: 5px; border: 0px solid black; border-image: none; height: 25px; text-align: left; color: rgb(0, 0, 0); font-size: 12px; font-weight: normal; vertical-align: top;"
						colspan="5">
					<span style="color: rgb(255, 0, 0);">※ 계약 시작일 이후 요청하거나 선투입이
							필요한 경우 비고란에 사유 기재</span><br></td>
				</tr>
			</tbody>
		</table>
		
 		<table class="px-5 mx-5 mx-auto"
			style="border: 0px solid rgb(0, 0, 0); border-image: none; width: 800px; height:100px; font-family: malgun gothic, dotum, arial, tahoma; margin-top: 10px; border-collapse: collapse;">
			<tr>
				<td
					style="background: rgb(221, 221, 221); padding: 5px; border: 1px solid black; border-image: none; height: 25px; text-align: center; color: rgb(0, 0, 0); font-size: 14px; font-weight: bold; vertical-align: middle;">
					파일선택</td>
				<td
					style="background: rgb(255, 255, 255); padding: 5px; border: 1px solid black; border-image: none; text-align: left; color: rgb(0, 0, 0); font-size: 14px; font-weight: normal; vertical-align: middle;"
					colspan="3">
					<div action="/file-upload" class="form-control dropzone" id="dropzone">
					  <div class="fallback">
					    <input name="file" type="file" multiple />
					  </div>
					</div>
				</td> 
			</tr>
				<tr>
				<td
					style="background: rgb(221, 221, 221); padding: 5px; border: 1px solid black; border-image: none; height: 25px; text-align: center; color: rgb(0, 0, 0); font-size: 14px; font-weight: bold; vertical-align: middle;">
					관련문서</td>

				<td
					style="background: rgb(255, 255, 255); padding: 5px; border: 1px solid black; border-image: none; text-align: left; color: rgb(0, 0, 0); font-size: 14px; font-weight: normal; vertical-align: middle;"
					colspan="3">
						<input type="file">
				</td>
			</tr> 
		</table> 
		

</div>
	</form>

