package com.pds.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pds.demo.entity.MessageTemplate;

@Repository
public interface MessageTemplateRespository extends JpaRepository<MessageTemplate, Long>{

}
