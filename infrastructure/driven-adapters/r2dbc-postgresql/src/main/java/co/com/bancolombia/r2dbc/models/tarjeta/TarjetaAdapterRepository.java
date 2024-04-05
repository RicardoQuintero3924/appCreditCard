package co.com.bancolombia.r2dbc.models.tarjeta;

import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface TarjetaAdapterRepository extends ReactiveCrudRepository<TarjetaAdapter, Integer>, ReactiveQueryByExampleExecutor<TarjetaAdapter> {
}
