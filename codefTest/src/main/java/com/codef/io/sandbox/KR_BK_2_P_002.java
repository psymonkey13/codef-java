package com.codef.io.sandbox;

import java.io.IOException;
import java.util.HashMap;

import org.json.simple.parser.ParseException;

import com.codef.io.util.CommonConstant;

/**
 * 저축 은행 개인 거래내역	
 */
public class KR_BK_2_P_002 {
	
	public static void main(String[] args) throws IOException, InterruptedException, ParseException {
		// 요청 URL 설정
		String urlPath = CommonConstant.SANDBOX_DOMAIN + CommonConstant.KR_BK_2_P_002;
		
		// 요청 파라미터 설정 시작
		HashMap<String, Object> bodyMap = new HashMap<String, Object>();
		bodyMap.put("connectedId", "sandbox_connectedId");	// 엔드유저의 은행/카드사 계정 등록 후 발급받은 커넥티드아이디 예시
		
		bodyMap.put("organization", "0102"); 
		bodyMap.put("bankName", ""); 
		
		bodyMap.put("account", "06368130100000"); 
		bodyMap.put("startDate", "20190101");
		bodyMap.put("endDate", "20190619");
		bodyMap.put("orderBy", "0");
		bodyMap.put("inquiryType", "1");
		// 요청 파라미터 설정 종료

		// API 요청
		String result = SandboxApiRequest.reqeust(urlPath, bodyMap);	//  샌드박스 요청 오브젝트 사용
	}
}
