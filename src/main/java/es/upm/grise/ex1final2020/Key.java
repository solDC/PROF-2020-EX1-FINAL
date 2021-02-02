package es.upm.grise.ex1final2020;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Key {

	public static String getKey() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss-SSS");
		LocalDateTime time = Time.getCurrentTime();
		return formatter.format(time);
	}	
	
}
