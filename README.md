## Calla
> 해당 프로젝트는 spring으로 구현한 상품 판매 사이트입니다.
<br>
> 취향 공유 플랫폼 'Colley'를 모티브로 상품판매, 중고거래, 사용자들의 소통을 위한 플랫폼을 구현하고 싶었습니다.

## 개발환경 세팅 방법
1. <a href="https://www.oracle.com/database/technologies/xe-prior-release-downloads.html">Oracle Database 11g Express Edition Release 11.2.0.2.0</a> 설치
2. sql 폴더에 있는 DDL을 실행
3. <a href="https://ffmpeg.org/download.html"> ffmpeg 링크</a> 에서 OS에 맞는 ffmpeg파일을 받고 설치
4. <a href="https://developers.kakao.com"> 카카오 developer</a> 에서 어플리케이션 추가
3. src/main/resources에 application.properties 파일 추가
4. <a href="https://tomcat.apache.org/download-90.cgi">아파치 톰캣 9.0</a> 설치
5. maven 을 통해서 dependency down
6. sts로 열기 및 실행

### application.properties 예제
```properties
#application.properties example - window
uploadPath.img=C:\\\\upload\\temp

database.url=jdbc:oracle:thin:@localhost:1521:xe
database.user={ your id }
database.password={ your password }
```
## 웹 실행 모습

<details>
  <summary> 로그인 & 회원가입 </summary> 
</details>

<details> 
  <summary> 질문 게시판과 댓글 </summary> 
</details>

<details> 
  <summary>메인 페이지</summary> 
</details>

<details>
  <summary>상품 목록</summary> 
</details>

<details>


<details>
 
 
</details>

<details>
  <summary>장바구니와 결제</summary>
   <

<details>
  
</details>

<details>

</details>

## 사용 기술

|분류|Badge|
|---|---|
|**Front - end** | <img src="https://img.shields.io/badge/HTML5-E34F26?style=flat-square&amp;logo=html5&amp;logoColor=white"> <img src="https://img.shields.io/badge/css3-1572B6?style=flat-square&logo=css3&logoColor=white"> <img src="https://img.shields.io/badge/javascript-F7DF1E?style=flat-square&logo=javascript&logoColor=white"> <img src="https://img.shields.io/badge/jQuery-0769AD?style=flat-square&amp;logo=jQuery&amp;logoColor=white"> <img src="https://img.shields.io/badge/bootstrap-7952B3?style=flat-square&logo=bootstrap&logoColor=white"> |
|**Back - end** |<img src="https://img.shields.io/badge/Spring-6DB33F?style=flat-square&amp;logo=Spring&amp;logoColor=white">|
|**Version Control**|<img src="https://img.shields.io/badge/git-F05032?style=flat-square&logo=git&logoColor=white"> |
|**DB** |<img src="https://img.shields.io/badge/ORACLE-F80000?style=flat-square&logo=oracle&logoColor=white"> |



## ERD - Diagram
![ERD 모델링 최종](https://github.com/cocobono1/Calla07/assets/147673787/e9e40950-76f1-4807-9600-967ccb99a705)

## 컨벤션과 협업전략
<details>
  <summary> Git 관련 </summary> 
  <br>
  <p>1. 커밋 메세지는 update, feat 두가지로 시작해야한다. <br> 2. 브렌치명은 feature/기능 형식이여야한다. <br> 3. 머지시 develop에 합친 후 이상이 없으면 main으로 병합한다.<br> 적은 인원 수와 깃 활용 능력을 고려하여 컨벤션은 최대한 간단하게 가져갔습니다. 
  </p>
</details>
<details>
  <summary> 자바 관련</summary> 
  <br>
  <p> 1. 구글 formatter 를 사용한다. <br> 2. restful한 method를 구현하려고 노력한다. <br>
  3. 함수명과 변수명을 적절하게 유지한다. <br> 4. else문을 적게 쓴다. <br> 

 > 머지 할 때 코드리뷰를 진행하는 방식으로 코드를 계속 고쳐왔습니다.
  </p>
</details>



## 제작인원 및 기간
- **총 제작인원:** 
- **제작 기간:** 2023/10/20 ~ 2023/12/17
