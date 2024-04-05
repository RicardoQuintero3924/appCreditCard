package co.com.bancolombia.r2dbc.models.usuarios;

import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface UsuarioAdapterRepository extends ReactiveCrudRepository<UsuarioAdapter, Integer>, ReactiveQueryByExampleExecutor<UsuarioAdapter> {
}
