package com.training.servlets;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemList {

	public static Map<String, List<String>> getItems() {

		List<String> books = Arrays.asList("Head First Java", "Thinking in Java");
		List<String> fashion = Arrays.asList("Lipstick", "Kajal");
		List<String> textiles = Arrays.asList("Casual Wear", "Party Wear");
		List<String> sweets = Arrays.asList("Jamun", "Kaju Katli");

		Map<String, List<String>> items = new HashMap<>();

		items.put("Books", books);
		items.put("Fashion", fashion);
		items.put("Textiles", textiles);
		items.put("Sweets", sweets);

		return items;
	}

}
