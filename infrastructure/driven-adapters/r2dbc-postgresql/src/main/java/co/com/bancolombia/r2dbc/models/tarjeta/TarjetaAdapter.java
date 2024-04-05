package co.com.bancolombia.r2dbc.models.tarjeta;

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
@Table(name = "Tarjeta", schema = "public")
public class TarjetaAdapter {
    @Id
    @Column("id")
    private Integer id;
    @Column("numero_tarjeta")
    private String numeroTarjeta;
    @Column("cupo")
    private Integer cupo;
    @Column("codigo_cvv")
    private String codigoCVV;
    @Column("fecha_vencimiento")
    private LocalDateTime fechaVencimiento;
    @Column("usuario_titular")
    private Integer usuarioTitular;
    @Column("tipo_tarjeta")
    private Integer tipoTarjeta;
    @Column("limite_credito")
    private String cupoLimite;
    @Column("fecha_emision")
    private LocalDateTime fechaEmision;
    @Column("saldo_actual")
    private Integer saldoActual;
    @Column("estado")
    private boolean estado;
}
