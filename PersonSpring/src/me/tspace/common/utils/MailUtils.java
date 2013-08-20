package me.tspace.common.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class MailUtils {
	public static Boolean isStaticMail(String templateURL){
		if(templateURL.contains(".ftl"))
			return false;
		return true;
	}
	
	public static String getOneHtml(final String htmlurl) throws Exception {
		URL url;
		String temp;
		final StringBuffer sb = new StringBuffer();
		try {
			url = new URL(htmlurl);
			final BufferedReader in = new BufferedReader(new InputStreamReader(
					url.openStream(), "utf-8"));// 读取网页全部内容
			while ((temp = in.readLine()) != null) {
				sb.append(temp);
			}
			in.close();
		} catch (final MalformedURLException me) {
			throw me;
		} catch (final IOException e) {
			throw e;
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		System.out.println(MailUtils.isStaticMail("x.html"));
	}
}
