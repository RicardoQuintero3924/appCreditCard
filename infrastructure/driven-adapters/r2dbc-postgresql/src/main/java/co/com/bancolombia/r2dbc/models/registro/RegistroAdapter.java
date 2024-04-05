package co.com.bancolombia.r2dbc.models.registro;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@ToString
@Table(name = "Registro", schema = "public")
public class RegistroAdapter {
    @Id
    @Column("id")
    private Integer id;
    @Column("nombre")
    private String nombre;
    @Column("correo")
    private String correo;
    @Column("nro_documento")
    private String nroDocumento;
}
