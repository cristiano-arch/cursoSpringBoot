package com.andcris.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.andcris.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
