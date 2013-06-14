package me.tspace.common.pojo;

public class SubmitForbiddenException extends RuntimeException{
  
	private String message;
    private Throwable e;
    
    public SubmitForbiddenException(String message){
    	this.message=message;
    }
    
	public SubmitForbiddenException(String message,Throwable e) {
	  // TODO Auto-generated constructor stub
	  this.message=message;
	  this.e=e;
    }
}
