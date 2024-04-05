package co.com.bancolombia.r2dbc.models.solicitud;

import co.com.bancolombia.model.solicitud.Solicitud;
import co.com.bancolombia.model.solicitud.gateways.SolicitudRepository;
import co.com.bancolombia.r2dbc.helper.ReactiveAdapterOperations;
import lombok.extern.java.Log;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.util.function.Function;
@Repository
@Log
public class SolicitudAdapterRepositoryImpl extends ReactiveAdapterOperations<Solicitud, SolicitudAdapter, Integer, SolicitudAdapterRepository>
implements SolicitudRepository {
    protected SolicitudAdapterRepositoryImpl(SolicitudAdapterRepository repository, ObjectMapper mapper) {
        super(repository, mapper, d -> mapper.map(d, Solicitud.class) );
    }
}
