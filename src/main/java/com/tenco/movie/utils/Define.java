package com.tenco.movie.utils;

public class Define {
	
	/**
	 * 안내 메세지!! - 추가할거 추가하고 주석좀
	 * @author 성후
	 */
	
	//  상수
	public static final String PRINCIPAL = "principal";
	
	// 이미지 관련
	public static final String UPLOAD_FILE_DERECTORY = "C:\\work_spring\\upload/";
	public static final int MAX_FILE_SIZE = 1024 * 1024 * 20; // 20MB

	//  Movie
	public static final String ERROR_INVALID_SHOWTIME = "선택하신 상영 시간은 유효하지 않습니다";
	public static final String ERROR_SEAT_NOT_AVAILABLE = "좌석을 선택하여 주십시오.";
	public static final String ERROR_INCORRECT_NUMBER_OF_PEOPLE = "인원수가 맞지 않습니다";
	public static final String ERROR_CHECK_VIEWING_RATING = "관람등급을 확인해주세요";
	public static final String ERROR_AGE_RESTRICTION = "관람 연령 제한에 따라 이 영화를 관람할 수 없습니다";
	public static final String ERROR_MOVIE_SOLD_OUT = "이미 매진된 영화입니다";
	public static final String ERROR_INVALID_SCREEN = "선택하신 상영관은 존재하지 않습니다";

	// pay
	public static final String ERROR_PAYMENT_FAILED = "결제에 실패하였습니다. 다시 시도해 주세요";
	
	//  User
	public static final String ENTER_YOUR_LOGIN = "로그인 먼저 해주세요.";
	public static final String ENTER_YOUR_ID = "아이디를 입력해 주세요.";
	public static final String NOT_ID = "존재하지 않는 아이디입니다.";
	public static final String DUPLICATION_ID = "중복된 아이디는 사용할 수 없습니다.";
	public static final String ENTER_ID_TRIM = "아이디 공백을 제거하고 입력해주세요.";
	public static final String ENTER_ID_LENGTH = "아이디는 6 ~ 15자까지 입니다.";
	public static final String ENTER_YOUR_NAME = "이름을 입력해 주세요.";
	public static final String ENTER_NAME_TRIM = "이름 공백을 제거하고 입력해주세요.";
	public static final String ENTER_YOUR_PASSWORD = "비밀번호를 입력해 주세요.";
	public static final String NOT_VALIDATE_PASSWORD = "비밀번호가 일치하지 않습니다.";
	public static final String ENTER_PASSWORD_LENGTH = "비밀번호는 8 ~ 20자까지입니다.";
	public static final String ENTER_PASSWORD_CHAR = "비밀번호에는 최소한 하나의 문자가 포함되어야 합니다.";
	public static final String ENTER_PASSWORD_SPECIAL_CHAR = "비밀번호에는 최소한 하나의 특수문자가 포함되어야 합니다.";
	public static final String ENTER_PASSWORD_NUM = "비밀번호에는 최소한 하나의 숫자가 포함되어야 합니다.";
	public static final String DUPLICATION_PASSWORD = "중복된 비밀번호는 사용할 수 없습니다.";
	public static final String ENTER_YOUR_EMAIL = "이메일을 입력해 주세요.";
	public static final String ENTER_YOUR_PHONE_NUM = "휴대폰 번호를 입력해 주세요.";
	public static final String NOT_VALIDATE_PHONE_NUM = "유효하지 않은 휴대폰 번호입니다.";
	public static final String ENTER_YOUR_BIRTH = "생년월일을 입력해 주세요.";
	public static final String ENTER_YOUR_GENDER ="성별을 선택해 주세요.";
	
	// etc 
	public static final String FAIL_TO_CREATE_USER = "회원가입 실패.";
	public static final String DUPLICATION_NAME = "중복 이름을 사용할 수 없습니다.";
	public static final String NOT_AN_AUTHENTICATED_USER = "인증된 사용자가 아닙니다.";
	public static final String INVALID_INPUT = "잘못된 입력입니다.";
	public static final String UNKNOWN_ERROR = "알 수 없는 오류입니다";
	public static final String FAILED_PROCESSING = "정상 처리 되지 않았습니다.";
	public static final String ERROR_SIGNUP_REQUIRED = "회원 가입 후 이용 가능합니다";

}	
