package com.cision.assignment.service;

import org.springframework.stereotype.Service;

import com.cision.assignment.model.Message;

@Service
public class MessageService {
	
	public void calculateLongestPalindromeSize(Message message) {
		// Length of message.getContent()ing message.getContent()
	    int n = message.getContent().length();
	 
	    // Stores the dp states
	    boolean [][]table = new boolean[n][n];
	 
	    // All submessage.getContent()ings of length 1
	    // are palindromes
	    int maxLength = 1;
	 
	    for(int i = 0; i < n; ++i)
	        table[i][i] = true;
	 
	    // Check for sub-message.getContent()ing of length 2
	    int start = 0;
	 
	    for(int i = 0; i < n - 1; ++i)
	    {
	         
	        // If adjacent character are same
	        if (message.getContent().charAt(i) == message.getContent().charAt(i + 1))
	        {
	             
	            // Update table[i][i + 1]
	            table[i][i + 1] = true;
	            start = i;
	            maxLength = 2;
	        }
	    }
	 
	    // Check for lengths greater than 2
	    // k is length of submessage.getContent()ing
	    for(int k = 3; k <= n; ++k)
	    {
	         
	        // Fix the starting index
	        for(int i = 0; i < n - k + 1; ++i)
	        {
	             
	            // Ending index of submessage.getContent()ing
	            // of length k
	            int j = i + k - 1;
	 
	            // Check for palindromic
	            // submessage.getContent()ing message.getContent()[i, j]
	            if (table[i + 1][j - 1] &&
	                message.getContent().charAt(i) == message.getContent().charAt(j))
	            {
	                 
	                // Mark true
	                table[i][j] = true;
	 
	                // Update the maximum length
	                if (k > maxLength)
	                {
	                    start = i;
	                    maxLength = k;
	                }
	            }
	        }
	    }
	     
	    // Return length of LPS
	    System.out.println(maxLength);
	    message.setLongestPalindromeSize(maxLength);
	}
	
}
