package ch13;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Clock {
	public String now() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy�� MM�� dd�� HH�� mm�� ss��");
		return format.format(new Date());
	}

}
