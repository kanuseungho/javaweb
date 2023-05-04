show tables;

create table member (
	idx 			int not null auto_increment,	/*회원 고유번호*/
	mid 			varchar(20) not null, 				/*회원 아이디 중복불허*/
	pwd 			varchar(100) not null, 				/*비밀번호 SHA256암호화처리*/
	nickName 	varchar(20) not null, 				/*회원별명 (중복불허/수정가능)*/
	name		  varchar(20) not null, 				/*회원 이름*/
	gender 		varchar(5) default '남자', 			/*회원 성별*/
	birthday  datetime default now(), 			/*회원 생일*/
	tel 			varchar(15),                  /*전화번호000-0000-0000*/
	address   varchar(100), 								/*주소 다음 API 우편번호 활용*/
	email  		varchar(50) not null, 				/*이메일 아이디나 비밀번호 분실 시 사용 형식체크 필수*/
	homePage  varchar(50), 									/*홈페이지 블로그 등 주소*/
	job 			varchar(20),									/*회원 직업*/
	hobby     varchar(100),									/*취미 2개이상 선택가능 구분자는/ 로한다*/
	photo 		varchar(100) default 'noimage.jpg', /*회원 사진*/
	content   text, 												/*회원소개*/
	userInfor char(6) default '공개',					/*회원정보 공개여부 공개/비공개*/
	userDel   char(2) default 'NO', 				/*회원 탈퇴신청여부 NO:현재 활동중 , OK: 탈퇴 신청 중*/
	point			int default 100,							/*회원 누적포인트 (가입포인트100증정, 1회방문시 10포인트증가 1일 최대 50점까지 증가)*/
	level 		int default 1,								/*회원등급(0:관리자,1:준회원 2: 정회원 3: 우수회원 4:운영자*/
	visitCnt  int default 0,  							/*총 방문횟수*/
	startDate datetime default now(),				/*최초 가입일*/	
	lastDate  datetime default now(),				/*마지막 접솔일*/
	todayCnt  int default 0,								/*오늘 방문한 횟수*/
	primary key(idx,mid)										/*주키:idx고유번호 mid 회원고유아이디*/
);
drop table member;
desc member;


