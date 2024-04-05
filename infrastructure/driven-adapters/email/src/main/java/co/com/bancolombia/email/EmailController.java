package co.com.bancolombia.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import reactor.core.publisher.Mono;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/send-email")
    public Mono<String> sendEmail(@RequestBody EmailRequest request){
        return emailService.sendEmail(request.getTo(), request.getSubject(), request.getText())
                .thenReturn("Email Enviado Con Exito")
                .onErrorReturn("Failed to send email");
    }
}
