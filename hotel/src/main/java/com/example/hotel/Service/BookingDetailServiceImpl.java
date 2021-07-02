package com.example.hotel.Service;


import com.example.hotel.model.BookingDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.hotel.repository.BookingDetailRepository;

@Service
@Transactional
public class BookingDetailServiceImpl implements BookingDetailService {
	
	@Autowired
	private BookingDetailRepository theBookingDetailRepo;
	

	@Override
	public void savebookingdetail(BookingDetail theBookingDetail) {
		
		theBookingDetailRepo.save(theBookingDetail);
		
	}

}
