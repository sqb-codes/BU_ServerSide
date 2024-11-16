package com.tbs.booking.repository;

import com.tbs.booking.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
    /*
        save, findAll, findById, deleteById...
     */
}
