package com.book.service.hht.company.query.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookResponseModel {
	
	private String bookId;
	
	private String name;
	
	private String author;
	
	private Boolean isReady;
	
}
