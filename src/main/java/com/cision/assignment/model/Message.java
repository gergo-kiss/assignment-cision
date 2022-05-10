package com.cision.assignment.model;

import java.io.Serializable;
import java.time.ZonedDateTime;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@RedisHash("Message")
public class Message implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3387552089363562823L;
	
	@Id
	@JsonProperty("id")
	private Long id;
	
	@JsonProperty("content")
	@NotNull
	private String content;
	
	@JsonProperty("timestamp")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd' 'HH:mm:ssZ")
	@NotNull
	private ZonedDateTime timestamp;
	
	@JsonProperty("longest_palindrome_size")
	private Integer longestPalindromeSize;
	
	public Message() {
		
	}
    
	public Message(String content, ZonedDateTime timestamp, Integer longestPalindromeSize) {
		super();
		this.content = content;
		this.timestamp = timestamp;
		this.longestPalindromeSize = longestPalindromeSize;
	}
	
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getLongestPalindromeSize() {
		return longestPalindromeSize;
	}

	public void setLongestPalindromeSize(Integer longestPalindromeSize) {
		this.longestPalindromeSize = longestPalindromeSize;
	}
	
}
