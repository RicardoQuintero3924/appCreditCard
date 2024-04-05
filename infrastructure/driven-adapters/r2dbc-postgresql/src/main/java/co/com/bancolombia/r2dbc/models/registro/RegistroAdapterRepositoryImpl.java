package co.com.bancolombia.r2dbc.models.registro;

import co.com.bancolombia.model.registro.Registro;
import co.com.bancolombia.model.registro.gateways.RegistroRepository;
import co.com.bancolombia.r2dbc.helper.ReactiveAdapterOperations;
import lombok.extern.java.Log;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
@Log
public class RegistroAdapterRepositoryImpl  extends ReactiveAdapterOperations<Registro, RegistroAdapter, Integer, RegistroAdapterRepository>
implements RegistroRepository {
    private final RegistroAdapterRepository repository;
    protected RegistroAdapterRepositoryImpl(RegistroAdapterRepository repository, ObjectMapper mapper) {
        super(repository, mapper, d -> mapper.map(d, Registro.class));
        this.repository = repository;
    }
    @Override
    public Mono<Registro> saveRegistro(Registro registro){
        RegistroAdapter registroAdapter = mapper.map(registro, RegistroAdapter.class);

        return repository.saveRegistro(registroAdapter.getNombre(), registroAdapter.getCorreo(), registroAdapter.getNroDocumento())
                .then(Mono.just(registro));
    }
}
