package co.com.bancolombia.model.solicitud;

import co.com.bancolombia.model.entities.StateType;
import co.com.bancolombia.model.usuarios.Usuarios;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.Builder;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Solicitud {
    private Integer id;
    private Usuarios usuario;
    private Integer cupo;
    private Integer ingresosMensuales;
    private Integer cupoDeseado;
    private LocalDateTime fechaSolicitud;
    private String historialCrediticio;
    private StateType estadoSolicitud;
    private String motivoRechazo;
}
