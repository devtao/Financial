package me.tspace.common.timer;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TimerTask {
	 private static final Logger logger = LoggerFactory.getLogger(TimerTask.class);
	
	public void doBiz(){
		System.out.println("哈哈哈哈哈哈哈哈哈哈   "+new Date());
	}
}
