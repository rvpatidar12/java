package Date;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class SimpeDate {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		String s = f.format(d);
		System.out.println("Date : "+s);
		
		String s_1 = "16/05/2022";
		Date d1 = f.parse(s_1);
		System.out.println(d1);
		
		
	}

}


