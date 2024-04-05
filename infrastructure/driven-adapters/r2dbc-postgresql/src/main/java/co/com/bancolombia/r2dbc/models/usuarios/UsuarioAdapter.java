package co.com.bancolombia.r2dbc.models.usuarios;

import co.com.bancolombia.model.entities.UserType;
import co.com.bancolombia.model.registro.Registro;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@ToString
@Table(name = "Usuario", schema = "public")
public class UsuarioAdapter {
    @Id
    @Column("id")
    private Integer id;
    @Column("nombres")
    private String nombres;
    @Column("apellidos")
    private String apellidos;
    @Column("tipo_documento")
    private Integer tipoDocumento;
    @Column("documento")
    private String documento;
    @Column("tipo_usuario")
    private UserType tipoUsuario;
    @Column("registro_ingreso")
    private Registro registro;
    @Column("estado")
    private boolean estado;
}
