package com.metoojava.microservices.productcatalogservice.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.metoojava.microservices.productcatalogservice.model.Item;

@RestController
@RequestMapping(path = "/catalog")
public class ProdcutCatalog {

	List<Item> catalog = new ArrayList<>();

	@RequestMapping(method = RequestMethod.GET)
	public List<Item> getCatalog() {
		Item samsungS8 = new Item("S8", "Samsing Galaxy S8", 799.00);
		Item iphone10 = new Item("i10", "Apple Iphone X", 999.00);
		catalog.add(samsungS8);
		catalog.add(iphone10);
		return catalog;
	}

	@RequestMapping(method = RequestMethod.GET, path = "/{id}")
	public Item getPhoneDetails(@PathVariable("id") String id) {
		Item itemDetails = null;
		for (Item item : catalog) {
			if (id.equalsIgnoreCase(item.getProductId())) {
				itemDetails = item;
			}
		}
		return itemDetails;
	}
}
