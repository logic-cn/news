package com.news.convertor;

public class StringToInt {
	public int getStringToInt(String String){
		switch (String) {
		case "时政":
			return 1;
		case "国际":
			return 2;
		case "军事":
			return 3;
		case "公益":
			return 4;
		case "汽车":
			return 5;
		case "房产":
			return 6;
		case "教育":
			return 7;
		case "时尚":
			return 8;
		case "科技":
			return 9;
		case "娱乐":
			return 10;
		default:
			break;
		}
		return 0;
	}
}
