package me.tspace.common.jackjson;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import javax.xml.rpc.encoding.DeserializationContext;

import org.apache.commons.lang3.time.DateUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;

/**
 * json由日期字符串转换为日期对象时做的转换
 * 
 * <pre>
 * &#064;JsonDeserialize(using = CustomDateDeserializer.class)
 * public void setTime(Date time) {
 * 	this.time = time;
 * }
 * </pre>
 * 
 * @author selleck
 * @date 2010-6-28 下午01:08:23
 */
public class CustomDateDeserializer {
	private static final Log logger = LogFactory.getLog(CustomDateDeserializer.class);
	private static final String[] DATE = { "yyyy-MM-dd" };

	public Date deserialize(JsonParser parser, DeserializationContext arg1) throws IOException, JsonProcessingException {
		try {
			return DateUtils.parseDate(parser.getText(), DATE);
		} catch (ParseException e) {
			logger.error("ParseException: ", e);
		}
		return null;
	}

}