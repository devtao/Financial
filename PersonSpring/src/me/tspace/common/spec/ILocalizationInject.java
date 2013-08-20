package me.tspace.common.spec;

import java.util.Locale;

import org.springframework.context.MessageSource;

public interface ILocalizationInject {
    public void setMessageSource(MessageSource messageSource);
	public void setLocale(Locale locale) ;
	public String returnMsg(String str);
}
