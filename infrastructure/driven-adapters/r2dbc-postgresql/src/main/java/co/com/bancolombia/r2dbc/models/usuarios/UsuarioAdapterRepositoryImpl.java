package co.com.bancolombia.r2dbc.models.usuarios;

import co.com.bancolombia.model.usuarios.Usuarios;
import co.com.bancolombia.model.usuarios.gateways.UsuariosRepository;
import co.com.bancolombia.r2dbc.helper.ReactiveAdapterOperations;
import org.reactivecommons.utils.ObjectMapper;

import java.util.function.Function;

public class UsuarioAdapterRepositoryImpl extends ReactiveAdapterOperations<Usuarios, UsuarioAdapter, Integer, UsuarioAdapterRepository>
implements UsuariosRepository {
    protected UsuarioAdapterRepositoryImpl(UsuarioAdapterRepository repository, ObjectMapper mapper) {
        super(repository, mapper, d -> mapper.map(d, Usuarios.class) );
        this.repository = repository;
    }
}
