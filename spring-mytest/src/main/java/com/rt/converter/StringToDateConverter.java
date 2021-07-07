package com.rt.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 描述：
 *
 * @author grt
 * @date 2020-05-20
 */
public class StringToDateConverter implements Converter<String, Date> {


	// 日期类型模板：如yyyy-MM-dd
	private String datePattern;

	public void setDatePattern(String datePattern) {
		this.datePattern = datePattern;
	}

	@Override
	public Date convert(String source) {
		try {

			SimpleDateFormat dateFormat = new SimpleDateFormat(this.datePattern);
			// 将日期字符串转换成Date类型返回
			return dateFormat.parse(source);
		} catch (Exception e) {
			return null;
		}
	}
}
