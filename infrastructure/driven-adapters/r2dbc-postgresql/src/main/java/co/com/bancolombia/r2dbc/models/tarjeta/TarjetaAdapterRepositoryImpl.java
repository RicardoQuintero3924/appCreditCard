package co.com.bancolombia.r2dbc.models.tarjeta;

import co.com.bancolombia.model.tarjeta.Tarjeta;
import co.com.bancolombia.model.tarjeta.gateways.TarjetaRepository;
import co.com.bancolombia.r2dbc.helper.ReactiveAdapterOperations;
import lombok.extern.java.Log;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.util.function.Function;
@Repository
@Log
public class TarjetaAdapterRepositoryImpl extends ReactiveAdapterOperations<Tarjeta, TarjetaAdapter, Integer, TarjetaAdapterRepository>
implements TarjetaRepository {
    protected TarjetaAdapterRepositoryImpl(TarjetaAdapterRepository repository, ObjectMapper mapper) {
        super(repository, mapper, d -> mapper.map(d, Tarjeta.class));
        this.repository = repository;
    }
}
