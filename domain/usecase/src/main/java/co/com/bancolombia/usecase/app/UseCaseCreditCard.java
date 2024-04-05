package co.com.bancolombia.usecase.app;


import co.com.bancolombia.model.registro.Registro;
import co.com.bancolombia.model.registro.gateways.RegistroRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;

import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Log
public class UseCaseCreditCard {
    private final RegistroRepository registroRepository;

    public Mono<Void> SaveRegistrer(Registro registro){
        return null;

    }
}
