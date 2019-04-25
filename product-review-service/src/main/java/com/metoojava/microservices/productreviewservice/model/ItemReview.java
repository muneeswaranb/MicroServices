package com.metoojava.microservices.productreviewservice.model;

import java.util.List;

public class ItemReview {

	private String productId;
	private List<String> reviews;

	public ItemReview(String productId, List<String> reviews) {
		this.productId = productId;
		this.reviews = reviews;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public List<String> getReviews() {
		return reviews;
	}

	public void setReviews(List<String> reviews) {
		this.reviews = reviews;
	}

}
