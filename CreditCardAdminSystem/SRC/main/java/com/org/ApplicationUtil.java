package com.org;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.Date;
import java.util.List;
public class ApplicationUtil {
	public static List<String> readFile(String fileName) throws CreditCardAdminSystemException{
		List<String> l=new ArrayList<>();
		try {
			FileReader fr=new FileReader(fileName);
			BufferedReader br=new BufferedReader(fr);
			String s="";
			while((s=br.readLine())!=null) {
				String arr[]=s.split(",");
				if(arr[0].startsWith("5"))
					l.add(s);
			}
			br.close();
		}catch(Exception e) {
			
		}
		return l;
	}
	public static Date getDateWithoutTime(Date date) {
		return null;
	}
	public static java.sql.Date convertUtilToSqlDate(java.util.Date uDate){
		java.sql.Date sqlDate=null;
		String s=(new SimpleDateFormat("yyyy-MM-dd")).format(uDate);
		sqlDate=java.sql.Date.valueOf(s);
		return sqlDate;
	}
	
	
	
	public static Date convertStringToDate(String inDate){
		Date date=null;
		try {
			date=(new SimpleDateFormat("yyyy-MM-dd")).parse(inDate);
		}catch(ParseException e) {
			e.printStackTrace();
		}
		return date;
		
	}

}
