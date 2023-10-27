package com.practo.practo.service.serviceimpl;

import com.practo.practo.entity.Booking;
import com.practo.practo.payload.BookingDto;
import com.practo.practo.repository.BookingRepository;
import com.practo.practo.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
   private BookingRepository bookingRepo;

    public void bookAnAppointment(BookingDto dto){
        List<String> availableTimeSlots = new ArrayList<>();
        availableTimeSlots.add("10:15 AM");
        availableTimeSlots.add("11:15 AM");
        availableTimeSlots.add("12:15 PM");

        // Schedule the task to run every 24 hours
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(() -> {
            // Your task logic here
            System.out.println("Task executed every 24 hours");

            // Add or update the available time slots
            availableTimeSlots.clear();
            availableTimeSlots.add("10:15 AM");
            availableTimeSlots.add("11:15 AM");
            availableTimeSlots.add("12:15 PM");

        }, 0, 24, TimeUnit.HOURS);

        Booking booking =new Booking();
        for (String slots:availableTimeSlots
             ) {
            if (slots.equals(dto.getBookingTime())){
                booking.setBookingTime(dto.getBookingTime());
                availableTimeSlots.remove(slots);
            }
        }

        booking.setDoctorId(dto.getDoctorId());
        booking.setPatentId(dto.getPatientId());

        if(booking.getBookingTime()!=null) {
            bookingRepo.save(booking);
        }else{
            System.out.println("Time slot not avlaible");
        }
    }

}
