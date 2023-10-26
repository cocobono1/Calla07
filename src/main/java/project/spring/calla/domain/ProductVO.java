package project.spring.calla.domain;

import java.util.Date;

public class ProductVO {
	private int productId; // 상품 번호
	private String productName; // 상품 이름
	private int productPrice; // 상품 가격
	private int productViews; // 상품 조회수
	private int productLikes; // 상품 좋아요 수
	private Date productCreatedDate; // 상품 등록 날짜
	private String productCategori; // 상품 카테고리
	private String productImagePath; // 상품 이미지 경로
	private String productContent; // 상품 설명
	private int productCommentCount; // 상품 댓글 갯수
	private String memberNickname; // 회원 닉네임
	private int memberLevel; // 회원 등급
	
	
	public ProductVO() {}


	public ProductVO(int productId, String productName, int productPrice, int productViews, int productLikes,
			Date productCreatedDate, String productCategori, String productImagePath, String productContent,
			int productCommentCount, String memberNickname, int memberLevel) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productViews = productViews;
		this.productLikes = productLikes;
		this.productCreatedDate = productCreatedDate;
		this.productCategori = productCategori;
		this.productImagePath = productImagePath;
		this.productContent = productContent;
		this.productCommentCount = productCommentCount;
		this.memberNickname = memberNickname;
		this.memberLevel = memberLevel;
	}


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public int getProductPrice() {
		return productPrice;
	}


	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}


	public int getProductViews() {
		return productViews;
	}


	public void setProductViews(int productViews) {
		this.productViews = productViews;
	}


	public int getProductLikes() {
		return productLikes;
	}


	public void setProductLikes(int productLikes) {
		this.productLikes = productLikes;
	}


	public Date getProductCreatedDate() {
		return productCreatedDate;
	}


	public void setProductCreatedDate(Date productCreatedDate) {
		this.productCreatedDate = productCreatedDate;
	}


	public String getProductCategori() {
		return productCategori;
	}


	public void setProductCategori(String productCategori) {
		this.productCategori = productCategori;
	}


	public String getProductImagePath() {
		return productImagePath;
	}


	public void setProductImagePath(String productImagePath) {
		this.productImagePath = productImagePath;
	}


	public String getProductContent() {
		return productContent;
	}


	public void setProductContent(String productContent) {
		this.productContent = productContent;
	}


	public int getProductCommentCount() {
		return productCommentCount;
	}


	public void setProductCommentCount(int productCommentCount) {
		this.productCommentCount = productCommentCount;
	}


	public String getMemberNickname() {
		return memberNickname;
	}


	public void setMemberNickname(String memberNickname) {
		this.memberNickname = memberNickname;
	}


	public int getMemberLevel() {
		return memberLevel;
	}


	public void setMemberLevel(int memberLevel) {
		this.memberLevel = memberLevel;
	}


	@Override
	public String toString() {
		return "ProductVO [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productViews=" + productViews + ", productLikes=" + productLikes + ", productCreatedDate="
				+ productCreatedDate + ", productCategori=" + productCategori + ", productImagePath=" + productImagePath
				+ ", productContent=" + productContent + ", productCommentCount=" + productCommentCount
				+ ", memberNickname=" + memberNickname + ", memberLevel=" + memberLevel + "]";
	}
	
	
	
	
	
	
}
