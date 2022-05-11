package com.cision.assignment.model;

import java.time.ZonedDateTime;

public class MessagePresentationObj {
	
	private String content;
	private ZonedDateTime timestamp;
	private Integer longestPalindromeSize;
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public ZonedDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(ZonedDateTime timestamp) {
		this.timestamp = timestamp;
	}
	public Integer getLongestPalindromeSize() {
		return longestPalindromeSize;
	}
	public void setLongestPalindromeSize(Integer longestPalindromeSize) {
		this.longestPalindromeSize = longestPalindromeSize;
	}
	
	public MessagePresentationObj(Message msg) {
		super();
		this.content = msg.getContent();
		this.timestamp = msg.getTimestamp();
		this.longestPalindromeSize = msg.getLongestPalindromeSize();
	}
	
	
	public MessagePresentationObj(String content, ZonedDateTime timestamp, Integer longestPalindromeSize) {
		super();
		this.content = content;
		this.timestamp = timestamp;
		this.longestPalindromeSize = longestPalindromeSize;
	}
	
	public MessagePresentationObj() {
		super();
	}
	
	
}
