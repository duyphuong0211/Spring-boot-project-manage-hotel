package com.example.hotel.utility;

import org.springframework.stereotype.Component;

import java.util.Base64;

@Component
public class ImageUtil {

	 public String getImgData(byte[] byteData) {
	        return Base64.getMimeEncoder().encodeToString(byteData);
	    }

	public ImageUtil() {
		super();
		
	}
}
