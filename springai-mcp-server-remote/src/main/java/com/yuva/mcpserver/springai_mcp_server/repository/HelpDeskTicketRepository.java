package com.yuva.mcpserver.springai_mcp_server.repository;

import com.yuva.mcpserver.springai_mcp_server.entity.HelpDeskTicket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HelpDeskTicketRepository extends JpaRepository<HelpDeskTicket, Long> {

    List<HelpDeskTicket> findByUsername(String username);

}