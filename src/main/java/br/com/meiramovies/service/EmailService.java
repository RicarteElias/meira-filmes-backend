package br.com.meiramovies.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    private final JavaMailSender javaMailSender;

    @Autowired
    public EmailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

   public void sendEmail() {

        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo("ricarte.elias@outlook.com");
        msg.setSubject("Recuperar codigo");
        msg.setText("Opa recuperar o codigo aqui ne pela aplicação que eu acabei de criar");
        javaMailSender.send(msg);

    }

    public void enviarEmail(String to, String body) {

        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(to);
        msg.setSubject("Email do meiramovies");
        msg.setText(body);
        javaMailSender.send(msg);
    }

}
