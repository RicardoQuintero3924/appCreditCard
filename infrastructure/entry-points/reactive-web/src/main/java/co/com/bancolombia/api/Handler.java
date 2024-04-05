package co.com.bancolombia.api;

import co.com.bancolombia.model.registro.Registro;
import co.com.bancolombia.model.registro.gateways.RegistroRepository;
import co.com.bancolombia.r2dbc.models.registro.RegistroAdapterRepository;
import co.com.bancolombia.usecase.app.UseCaseCreditCard;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.util.Map;

@Component
@RequiredArgsConstructor
@Log
public class Handler {

 private final UseCaseCreditCard useCaseCreditCard;
 private final RegistroRepository repository;

    public Mono<ServerResponse> loginView(ServerRequest serverRequest) {
        return ServerResponse.ok().render("index");
    }

    public Mono<ServerResponse> registroView(ServerRequest serverRequest) {
        return ServerResponse.ok().render("index");
    }

    public Mono<ServerResponse> handlerRegistro(ServerRequest request){
        Mono<Map<String, String>> formDataMono = request.formData()
                .flatMap(formData -> Mono.justOrEmpty(formData.toSingleValueMap()));

        return formDataMono.flatMap(formData -> {
            String nombre = formData.get("nombre");
            String correo = formData.get("correo");
            String nroDocumento = formData.get("nroDocumento");

            Registro registro = Registro.builder()
                    .nombre(nombre)
                    .correo(correo)
                    .nroDocumento(nroDocumento)
                    .build();


           // return useCaseCreditCard.SaveRegistrer(registro)
            return repository.saveRegistro(registro)
                    .then(ServerResponse.ok().render("index","Registro Exitoso la contraseña llegara a su correo"));
        });
    }
}
