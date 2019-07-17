package com.codef.io.sample.cd;

import java.io.IOException;
import java.util.HashMap;

import org.json.simple.parser.ParseException;
import org.junit.Test;

import com.codef.io.sample.util.ApiRequest;
import com.codef.io.sample.util.CommonConstant;

/**
 * 카드 개인  청구내역 조회
 */
public class TestKR_CD_P_003 {
	
	@Test
	public void testKR_CD_P_003() throws IOException, InterruptedException, ParseException {
		// 요청 URL 설정
		String urlPath = CommonConstant.API_DOMAIN + CommonConstant.KR_CD_P_003;
		
		// 요청 파라미터 설정 시작
		HashMap<String, Object> bodyMap = new HashMap<String, Object>();
		bodyMap.put("connectedId",	"9LUm.uhVQbzaangazwI0tr");	// 엔드유저의 은행/카드사 계정 등록 후 발급받은 커넥티드아이디 예시
		bodyMap.put("organization",	"기관코드"); 
		bodyMap.put("birthDate",	"생년월일"); 
		
		bodyMap.put("startDate",	"조회시작일자");
		// 요청 파라미터 설정 종료
		
		// API 요청
		String result = ApiRequest.reqeust(urlPath, bodyMap);

		// 응답결과 확인
		System.out.println(result);
	}
}