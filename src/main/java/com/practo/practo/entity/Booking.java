package com.practo.practo.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="bookings")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    //private long patientId;
    private long doctorId;

    private long patentId;

    private String bookingTime;


}

