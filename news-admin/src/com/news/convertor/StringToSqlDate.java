package com.news.convertor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToSqlDate {

	public java.sql.Date getStringToSqlDate(String date){
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date parse;
		try {
			parse = format.parse(date);
			java.sql.Date date2 = new java.sql.Date(parse.getTime());
			return date2;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
