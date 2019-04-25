package com.metoojava.microservices.productreviewservice.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.metoojava.microservices.productreviewservice.model.ItemReview;

@RestController
@RequestMapping(path = "/review")
public class ProdcutReviewController {

	List<ItemReview> reviewList = new ArrayList<>();

	@RequestMapping(method = RequestMethod.POST)
	public void addReviews(@RequestBody List<ItemReview> itemReviews) {
		reviewList.addAll(itemReviews);
	}

	@RequestMapping(method = RequestMethod.GET, path = "/{id}")
	public ItemReview getPhoneReviews(@PathVariable("id") String id) {
		ItemReview review = null;
		for (ItemReview review1 : reviewList) {
			if (id.equalsIgnoreCase(review1.getProductId())) {
				review = review1;
			}
		}	
		return review;
	}
}
