package co.com.bancolombia.model.registro.gateways;

import co.com.bancolombia.model.registro.Registro;
import reactor.core.publisher.Mono;

public interface RegistroRepository {
    Mono<Registro> saveRegistro(Registro registro);
}
