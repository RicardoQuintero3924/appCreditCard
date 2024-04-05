package co.com.bancolombia.r2dbc.models.solicitud;

import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface SolicitudAdapterRepository extends ReactiveCrudRepository<SolicitudAdapter,Integer>, ReactiveQueryByExampleExecutor<SolicitudAdapter> {
}
