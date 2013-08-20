package me.tspace.common.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

import org.springframework.context.MessageSource;

import me.tspace.common.spec.ILocalizationInject;

public class DataUtil {
	public static String getDateToText(Date date,String template){
		SimpleDateFormat df = new SimpleDateFormat(template);
		return df.format(date);
	}
	
	public static String generateUUID(){
		 UUID uuid = UUID.randomUUID();
		 return uuid.toString();
	}
	
	public static boolean isEmpty(String obj){
		if(obj==null||"".equals(obj.trim()))
			return true;
		return false;
	}
	
	public static boolean isEmptyList(Collection collection){
		if(collection==null||collection.isEmpty())
			return true;
		return false;
	}
	
	public static String formatStr(String pattern, Object... arguments) {
		String str = java.text.MessageFormat.format(pattern, arguments);
		return str;
	}
	
	public static Object copyObject(Object obj1) {
		Object obj2 = null;
		try {
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(os);
			oos.writeObject(obj1);
			oos.close();

			InputStream is = new ByteArrayInputStream(os.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(is);
			obj2 = ois.readObject();
			is.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.err.println(e.getMessage());
		}
		return obj2;
	}
	
	/**
	 * 是否是整数
	 * @return
	 */
	public static Boolean isNumberic(Float value){
		return value % value.intValue()>0 ? false : true;
	}
	
	/**
	 * 得到V4 支持的语言列表
	 * @return
	 */
	public static List<Locale> getV4SupportLocaleList(){
		//de,en,zh--德语，英语，中文
		List<Locale> list = new ArrayList<Locale>();
		Locale[] locales = Locale.getAvailableLocales();
		boolean hasEn = false;
		boolean hasZh = false;
//		boolean hasDe = false;
		
		for(Locale locale:locales){
			/*if(!hasDe && "de".equals(locale.getLanguage())){
				list.add(locale);
				hasDe = true;
			}else*/ if(!hasEn && "en".equals(locale.getLanguage())){
				list.add(locale);
				hasEn = true;
			}else if(!hasZh &&"zh".equals(locale.getLanguage())){
				list.add(locale);
				hasZh = true;
			}
		}
		return list;
	}
	
	public static void injectLocalization(List list,MessageSource messageSource,Locale locale) throws IllegalAccessException{
		for(Object obj:list){
			if(!(obj instanceof ILocalizationInject))
			throw new IllegalAccessException("passed Object must be ILocalizationInject instance");
			((ILocalizationInject)obj).setMessageSource(messageSource);
			((ILocalizationInject)obj).setLocale(locale);
		}
	}
	public static void main(String[] args) {
		System.out.println(new Float("15.0")%new Float("15.0").intValue()>0);
		System.out.println(new Float("15.1")%new Float("15.1").intValue()>0);
		System.out.println(new Float("15.2")%new Float("15.2").intValue()>0);
		System.out.println(new Float("15.4")%new Float("15.4").intValue()>0);
		System.out.println(new Float("15.8")%new Float("15.8").intValue()>0);
	}
}
