CREATE SEQUENCE code_sq
INCREMENT BY 1
START WITH 1
MINVALUE 1
nomaxvalue
nocycle
nocache

select * from FRIEND

CREATE TABLE lecture(
l_pk number(10,0) PRIMARY KEY,
l_code varchar2(50) NOT null,
l_ltype varchar2(50) NOT NULL,
l_title varchar2(100) NOT NULL,
l_teacher varchar2(50) NOT NULL,
l_cost number(6,0) NOT NULL,
l_time varchar2(50) NOT NULL,
l_difficulty varchar2(50) NOT NULL,
l_tag varchar2(1000) NOT NULL,
l_video varchar2(1000) NOT NULL,
l_image varchar2(1000) NOT null
)

DROP TABLE lecture;

INSERT INTO board_seq (l_code) VALUES ('AAA' + board_seq.nextval());

CREATE SEQUENCE lpk_seq
INCREMENT BY 1
START WITH 1
MINVALUE 1
nomaxvalue
nocycle
nocache

CREATE SEQUENCE board_seq
INCREMENT BY 1
START WITH 1
MINVALUE 1
nomaxvalue
nocycle
nocache

DROP SEQUENCE lpk_sq;

INSERT INTO lecture values(lpk_seq.nextval,'Java01', 'JAVA','입문자를 위해 준비한 풀스택코스 웹 개발', '강승진', 200000, '총 10시간 32분', '입문', '#JAVA #CSS #코딩초보 #입문 #비기너 #풀스택' , 'www', '/img')

INSERT INTO lecture values(lpk_seq.nextval,'Java02', 'JAVA', '[실무자용] Chat GPT를 활용한 프로그래밍', '김미정', 100000, '총 6시간 10분', '고급', '#JAVA #구글 #chatgpt #고급 #프로그래밍' , 'www', '/img')

SELECT * FROM LECTURE;

CREATE TABLE lectureInfo(
lf_pk number(10,0) PRIMARY KEY,
lf_code varchar2(50) NOT null,
lf_lectureTitle varchar2(100) NOT NULL,
lf_lectureinfo varchar2(1000) NOT NULL,
lf_firstSkill varchar2(100) NOT NULL,
lf_secondSkill varchar2(100) NOT NULL,
lf_thirdSkill varchar2(100),
lf_forthSkill varchar2(100), 
lf_teacherTitle varchar2(100) NOT NULL,
lf_teacherName varchar2(100) NOT NULL, 
lf_teacherInfo varchar2(1000) NOT NULL,
lf_curriculumFirstTitle varchar2(100) NOT NULL,
lf_curriculumSecondTitle varchar2(100),
lf_curriculumThirdTitle varchar2(100),
lf_curriculumFirstDetailOne varchar2(100),
lf_curriculumFirstDetailTwo varchar2(100),
lf_curriculumFirstDetailThree varchar2(100),
lf_curriculumSecondDetailOne varchar2(100),
lf_curriculumSecondDetailTwo varchar2(100),
lf_curriculumSecondDetailThree varchar2(100),
lf_curriculumThirdDetailOne varchar2(100),
lf_curriculumSThirdDetailTwo varchar2(100),
lf_curriculumSThirdDetailThree varchar2(100),
lf_reviewFirst varchar2(1000) NOT NULL,
lf_reviewFirstName varchar2(1000) NOT NULL,
lf_reviewSecond varchar2(1000) NOT NULL,
lf_reviewSecondName varchar2(1000) NOT NULL
)

DROP TABLE lectureInfo;



INSERT INTO lectureInfo values(
1,
'Java01',
'입문자를 위해 준비한 풀스택코스 웹 개발', 
'1년간 300여명의 개발자를 배출한 "진짜" 부트캠프의 고농축 커리큘럼 입니다. 
이 강의 하나로 여러분은 현업 주니어 개발자 수준까지 성장 가능하며, 
프론트엔드 기술스택의 활용 능력과 지식을
 얻게 될거에요. 
누구나 사회적, 경제적, 교육적 배경에 상관없이 커리어를 쌓을 수 있도록, [코코아X코드캠프]가 준비했습니다 :)',
'실무 포트폴리오 2개',
'최신 기술 스택을 활용한 8개의 프로젝트 구현',
'전체적인 개발 사이클 완벽 이해',
'+α 백엔드의 기본 CRUD까지 습득',
'코코아 최고의 아웃풋 메이커🏅',
'안녕하세요. Leokang 입니다.',
'현재 코코아의 메인강사이자 하이미디어 코딩아카데미의 강사로 활동하고 있습니다. 
네이버 부트캠프 강사로서 수많은 아웃풋을 만들었으며, 토스 페이먼츠 개발팀장으로 일한 경험이 있습니다. 
"자바실무자 메이킹" 강의를 통해 java expert로 도약하도록 돕겠습니다.',
'색션 0. 백엔드 강의 소개',
'색션 1. 백엔드 기초 - 파이썬 알아보기',
'색션 2. 프론트엔드 기초 - css 알아보기',
'▶ 강의 인트로',
'▶ 코딩 바로 시작하기',
'▶ 강사가 생각하는 소프트웨어 엔지니어링이란?',
'▶ 강사가 생각하는 파이썬이란?',
'▶ 파이썬 이론',
'▶ 파이썬 실습',
'▶ 강사가 생각하는 css란?',
'▶ css 이론',
'▶ css 실습',
'데이터 사이언스 직무에서 데이터 엔지니어 직무로 전환 하기 위해 신청하였습니다. 
강의를 통해 실무에서 헷갈렸던 부분에 대해서 명쾌하게 짚어주셨고, 
데이터 엔지니어의 커리어 이야기, 실제 업무에서 발생하는 문제점 그리고, 
해당 문제를 해결하기 위해 맥스가 사용하셨던 방안 등을 살펴보면서 기술적인 부분은 물론 그외적인 부분에서도 많은 것을 배울 수 있었습니다. 
매주 내주신 과제를 풀고 피드백을 받으면서 많이 성장할 수 있었고, 궁금한 점은 언제든지 슬랙에서 실시간으로 피드백받을 수 있어 좋았습니다.
데이터 엔지니어 직무뿐만이 아닌 데이터 직무로의 커리어를 원하시는 분들 모두에게 추천드리고 싶은 강의입니다.',
'-미정(4기), 데이터 엔지니어-',
'스타트업에서 AI 인턴으로 근무하다 엔지니어 전향을 결심을 하고 있던 차에
 데이터 엔지니어 오픈 톡방에서 정보를 얻어 수강하게 되었습니다. 
시니어 개발자분들이 진행하는 엔지니어 강의는 많이 없었는데 참여하면서 큰 도움을 받았습니다. 
데이터 엔지니어가 하는 업무가 무엇이며, 
실무에서 어떤 어려움이 있는지, 데이터 인프라는 어떻게 구성하는지에 대해 배울수 있었습니다. 
또한, 데이터 인프라를 구현하는 과정에서 겪게 되는 어려움과 상황별 Best Practice도 알 수 있었습니다.',
'-지윤(5기), 인공지능 엔지니어-'
)

SELECT * FROM lectureInfo;


ALTER TABLE lecture MODIFY star NULL

ALTER TABLE FRIEND ADD f_recently varchar2(100)

SELECT * FROM star

INSERT INTO lecture(code, ltype, title, teacher, cost, video, image) 
VALUES(code_sq.nextval,'자바', 'Hello, Java!', '강승진', 200000, 'https://www.youtube.com/watch?v=NQq0dOoEPUM', 'C:\seyeon\2ndProj\img\java')

INSERT INTO lecture(code, ltype, title, teacher, cost, video, image) 
VALUES(code_sq.nextval,'자바스크립트', '함수형 프로그래밍과 Java Script', '유니', 285000, 'https://www.youtube.com/watch?v=NQq0dOoEPUM', 'C:\seyeon\2ndProj\img\javascript')

CREATE SEQUENCE spk_sq
INCREMENT BY 1
START WITH 1
MINVALUE 1
nomaxvalue
nocycle
nocache

CREATE TABLE star(
s_pk number(10,0) PRIMARY KEY,
s_femail varchar2(50) NOT null,
s_code number(10,0) NOT NULL,
s_star number(1,0) NOT NULL,
s_review varchar2(500) NOT NULL
)

// star 고유 코드 필요. 이메일도 여러개, 강의도 여러개


DROP TABLE star


ALTER TABLE LECTURE DROP COLUMN star

SELECT * FROM FRIEND

CREATE TABLE FRIEND(
f_name varchar2(50) NOT NULL,
f_email varchar2(50) PRIMARY KEY,
f_password varchar2(50) NOT NULL,
f_phone varchar2(50) NOT NULL,
f_job varchar2(50) NOT NULL,
f_recently varchar2(100),
f_mycourse varchar2(100)
)

SELECT * FROM FRIEND
WHERE
F_EMAIL = 'n' AND F_PASSWORD = 'n';


ALTER TABLE MANAGER RENAME TO director

SELECT * FROM DIRECTOR

CREATE TABLE good(
g_code NUMBER(10,0) PRIMARY KEY,
g_femail varchar2(50) NOT NULL
)

//good 고유 코드 필요

CREATE TABLE cart(
g_code NUMBER(10,0) PRIMARY KEY,
g_femail varchar2(50) NOT NULL
)

//cart 고유 코드 필요

CREATE TABLE payment(
p_code NUMBER(10,0) PRIMARY KEY,
p_femail varchar2(50) NOT NULL,
p_paydate DATE default sysdate,
p_refund char(1) CHECK (refund='T' OR REFUND='F'),
p_refdate DATE,
p_recently DATE DEFAULT sysdate
)

// payment 고유 코드 필요


ALTER TABLE PAYMENT ADD title varchar2(100)

ALTER TABLE payment MODIFY refund DEFAULT 'F'


-- 트리거 생성(환불일자 생성)
CREATE OR REPLACE TRIGGER payment_refund_trigger
BEFORE UPDATE ON payment
FOR EACH ROW
BEGIN
  IF :new.refund = 'T' THEN
    :new.refdate := sysdate;
  ELSE
    :new.refdate := null;
  END IF;
END;

-- 트리거 생성필요(환불 T ---> payment 레코드 초기화)


INSERT INTO payment (code, uemail)
VALUES (2, 'yyy')

UPDATE payment
SET refund = 'T'incumbent
WHERE UEMAIL='sss'

CREATE TABLE teacher(
t_name varchar2(50) NOT NULL,
t_email varchar2(50) NOT NULL,
t_code number(10,0) PRIMARY KEY,
t_password varchar2(50) NOT NULL,
t_phone varchar2(100) NOT null
)

CREATE TABLE DIRECTOR(
d_email varchar2(50) NOT NULL,
d_password varchar2(50) NOT null
)

ALTER TABLE payment RENAME COLUMN p_uemail TO p_femail

CREATE SEQUENCE mcode_sq
INCREMENT BY 1
START WITH 1
MINVALUE 1
nomaxvalue
nocycle
nocache

CREATE TABLE mentoring(
m_name varchar2(50) NOT NULL,
m_email varchar2(50) PRIMARY KEY,
m_job varchar2(50) NOT NULL,
m_company varchar2(50) NOT NULL,
m_career varchar2(10) NOT NULL,
m_title varchar2(100) NOT NULL,
m_content varchar2(1000) NOT NULL,
m_mcode number(10,0) NOT null
)

DROP TABLE umember