package com.practo.practo.service;

import com.practo.practo.entity.Booking;
import com.practo.practo.payload.BookingDto;

import java.util.List;

public interface BookingService {
    public void bookAnAppointment(BookingDto dto);
}

