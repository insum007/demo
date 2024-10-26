package com.adib.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adib.demo.entity.MessageTemplate;

@Repository
public interface MessageTemplateRespository extends JpaRepository<MessageTemplate, Long>{

}
