package co.com.bancolombia.r2dbc.models.solicitud;

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
@Table(name = "Solicitud", schema = "public")
public class SolicitudAdapter {
    @Id
    @Column("id")
    private Integer id;
    @Column("usuario")
    private Integer usuario;
    @Column("cupo")
    private Integer cupo;
    @Column("ingresos_mensuales")
    private Integer ingresosMensuales;
    @Column("cupo_deseado")
    private Integer cupoDeseado;
    @Column("fecha_solicitud")
    private LocalDateTime fechaSolicitud;
    @Column("historial_crediticio")
    private String historialCrediticio;
    @Column("estado_solicitud")
    private Integer estadoSolicitud;
    @Column("motivo_rechazo")
    private String motivoRechazo;
}
