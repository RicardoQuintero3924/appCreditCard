package co.com.bancolombia.r2dbc.models.registro;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface RegistroAdapterRepository extends ReactiveCrudRepository<RegistroAdapter, Integer>, ReactiveQueryByExampleExecutor<RegistroAdapter> {

    @Query("INSERT INTO Registro (nombre, correo, nro_documento) VALUES (:nombre, :correo, :nroDocumento)")
    Mono<Void> saveRegistro(@Param("nombre") String nombre, @Param("correo") String correo, @Param("nro_documento") String nroDocumento);

}
