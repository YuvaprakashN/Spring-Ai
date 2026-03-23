package com.eazybyte.yuva.springai.spring_ai_demo.repository;

import com.eazybyte.yuva.springai.spring_ai_demo.entity.HelpDeskTicket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HelpDeskTicketRepository extends JpaRepository<HelpDeskTicket, Long> {

    List<HelpDeskTicket> findByUsername(String username);
}