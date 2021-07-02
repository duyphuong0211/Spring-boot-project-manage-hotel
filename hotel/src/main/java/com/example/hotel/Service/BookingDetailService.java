package com.example.hotel.Service;


import com.example.hotel.model.BookingDetail;
import org.springframework.stereotype.Service;

@Service
public interface BookingDetailService {
	
	public void savebookingdetail(BookingDetail theBookingDetail);

}
