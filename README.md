## Calla
> 해당 프로젝트는 spring으로 구현한 상품 판매 사이트입니다.
> <br>
> 취향 공유 플랫폼 'Colley'를 모티브로 상품판매, 중고거래, 사용자들의 소통을 위한 플랫폼을 구현하고 싶었습니다.

## 개발환경 세팅 방법
1. <a href="https://www.oracle.com/database/technologies/xe-prior-release-downloads.html">Oracle Database 11g Express Edition Release 11.2.0.2.0</a> 설치
2. sql 폴더에 있는 DDL을 실행
3. <a href="https://developers.kakao.com"> 카카오 developer</a> 에서 어플리케이션 추가
4. src/main/resources에 application.properties 파일 추가
5. <a href="https://tomcat.apache.org/download-90.cgi">아파치 톰캣 9.0</a> 설치
6. maven 을 통해서 dependency down
7. sts로 열기 및 실행

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
  <summary> 상품 검색 </summary> 
  <p>
    1. 모든 이용자가 사용 가능합니다.<br/>
    2. 상품의 이름, 옵션 및 설명, 카테고리를 검색어와 비교합니다.<br/>
    3. 좋아요 수, 조회 수, 후기 수, 별 점 표출 등 구매자의 신뢰도를 올려줍니다.<br/>
    <img src="https://github.com/cocobono1/Calla07/assets/147673787/71a7b9dc-1ee7-4a32-9ac9-2ea1ecc3c9a5">
  </p>
</details>

<details>
  <summary> 상품 등록 / 수정 </summary> 
  <p>
    1. 관리자만 상품 등록을할 수 있습니다..<br/>
    2. 상품의 이름, 가격, 카테고리, 설명 및 옵션, 이미지를 등록할 수 있습니다.<br/>
    3. 관리자만 상품 수정을할 수 있습니다.<br/>
    4. 상품의 이름, 가격, 카테고리, 설명 및 옵션, 이미지를 수정할 수 있습니다.<br/>
    <img src="https://github.com/cocobono1/Calla07/assets/147673787/d122d1cd-828c-45ad-9fd7-e4672e7aea9d">
    <img src="https://github.com/cocobono1/Calla07/assets/147673787/b96217a2-8550-4541-8060-a501243059c1">
  </p>
</details>

<details> 
  <summary> 상품 좋아요 </summary> 
   <p>
    1. 모든 회원이 이용할 수 있습니다.<br/>
    2. 상품에 대해 좋아요를 클릭해 상품에 대한 호감도를 표현합니다.<br/>
    3. '좋아요'에 대한 카운트를 제공합니다.<br/>
    <img src="https://github.com/cocobono1/Calla07/assets/147673787/92d2c07a-dab7-4e2f-8a97-1a397ae112e5">
   </p>
</details>

<details>
  <summary> 상품 별점후기 등록 / 수정 </summary>
  <p>
    1. 모든 회원이 상품에 대해 평가합니다.<br/>
    2. 후기를 통해 구매자와 비구매자가 상품의 대한 정보를 공유할수있습니다.</br>
    3. 후기를 작성한 본인만 수정하거나 삭제할 수 있습니다.</br>
    4. Modal을 사용해 글을 수정할 수 있게 만들었습니다.</br>
    <img src="https://github.com/cocobono1/Calla07/assets/147673787/6c3bac92-9e4b-4c14-837b-abd92c68a3c6">
    <img src="https://github.com/cocobono1/Calla07/assets/147673787/f48918d5-3696-463a-9921-29ee0e96b8b1">
  </p>
</details>

<details>
  <summary> 후기에 대한 답글 등록 / 수정 </summary>
  <p>
    1. 후기에 대한 답글을 등록할 수 있습니다.</br>
    2. 답글을 작성한 본인만 수정하거나 삭제할 수 있습니다.</br>
    3. Modal을 사용해 글을 수정할 수 있게 만들었습니다.</br>
    <img src="https://github.com/cocobono1/Calla07/assets/147673787/861f9c11-efa1-45b3-9710-c2cf8b7a4dee">
    <img src="https://github.com/cocobono1/Calla07/assets/147673787/0a9b0a59-6e83-4e4a-ac33-9400f4e6f354">
  </p>

</details>
 
<details>
  <summary> 장바구니와 결제 </summary>
  <p>
    1. 원하는 상품에 수량을 선택하여 장바구니에 등록할 수 있습니다.</br>
    2. 구매를 원하는 여러가지 상품을 등록할 수 있습니다.</br>
    3. 장바구니 페이지에서 상품의 수량을 변경할 수 있습니다.</br>
    4. 체크된 상품에 따라 상품의 전체 수량에 따라 총 금액이 변화합니다.</br>
    5. 체크된 상품만 구매할 수 있습니다.</br>
    6. Modal을 사용하여 구매자의 추가 정보(카드, 주소, 이메일 등) 기입하게 했습니다.</br>
    7. Email 유효성 체크를 진행했습니다.</br>
    8. 주소 검색API를 사용했습니다.</br>
    <img src="https://github.com/cocobono1/Calla07/assets/147673787/5c6894b7-2613-43b8-8157-c9942062c42d">
    <img src="https://github.com/cocobono1/Calla07/assets/147673787/bc4f9cc7-c2cc-478a-9586-890730427ff9">
  </p>
</details>
  
<details>
  <summary> 구매 내역 </summary>
  <p>
    1. 배송상황에 따라 주소변경, 주문취소, 주문정보 삭제 를 진행할 수 있습니다.</br>
    2. 주소변경은 Modal과 주소검색API를 사용하여 수정이 가능합니다.</br>
    3. 'Scheduled'를 사용하여 1시간 마다 메소드를 호출하고 구매일로부터 24시간이 지나면 배송상황이 변화하게 했습니다. </br>
    <img src="https://github.com/cocobono1/Calla07/assets/147673787/628fef0f-75e1-47bc-bb20-e46a11e6e0e8">
    <img src="https://github.com/cocobono1/Calla07/assets/147673787/b13e226b-924c-4739-ac1c-45cdff8b1b27">
  </p>
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
  <p>프로젝트 참여자들은 경험이 부족하여 깃 사용을 간소화하기 위해 다음과 같은 간단한 규칙을 따라야 합니다:</p>
  <br>
  <p>1. 커밋 메세지는 update, feat 두가지로 시작해야한다. <br> 2. 브렌치명은 feature/기능 형식이여야한다. <br> 3. 머지시 develop에 합친 후 이상이 없으면 mater으로 병합한다.<br> 적은 인원 수와 깃 활용 능력을 고려하여 컨벤션은 최대한 간단하게 가져야한다. <br>
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
- **총 제작인원:**  <a href="https://github.com/cocobono1">강정묵</a>, <a href="https://github.com/superDDangKong">박진성</a>, <a href="https://github.com/prodo813">김홍석</a>,  <a href="https://github.com/DongGun01">이동건</a> | 해당 링크를 누르면 깃허브 페이지로 이동합니다.
- **제작 기간:** 2023/10/20 ~ 2023/12/17
