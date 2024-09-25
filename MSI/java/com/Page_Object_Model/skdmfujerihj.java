package com.Page_Object_Model;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class skdmfujerihj {
	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("HH:mm");
		String format = now.format(ofPattern);
		System.out.println(format);
	}

}
