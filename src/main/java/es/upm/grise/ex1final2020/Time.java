package es.upm.grise.ex1final2020;

import java.time.LocalDateTime;

public class Time {
	
		public static LocalDateTime getCurrentTime () {
			LocalDateTime time = LocalDateTime.now();
			return time;	
		}

}
