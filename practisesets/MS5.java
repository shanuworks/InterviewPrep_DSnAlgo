package com.google.practisesets;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MS5 {
	
	Optional<String> bookName;

	public MS5(Optional<String> bookName) {
		this.bookName = bookName;
	}
	
	public Optional<String> getName() {
		return bookName;
	}
	public static void main(String[] args) {
		MS5 ms = new MS5(Optional.ofNullable(null));
		Optional<String> name = ms.getName();
		name.ifPresent(System.out::println).orElse("Empty");
	}
}
