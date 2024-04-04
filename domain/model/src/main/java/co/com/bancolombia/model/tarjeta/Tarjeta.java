package co.com.bancolombia.model.tarjeta;

import co.com.bancolombia.model.entities.CardType;
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
public class Tarjeta {
    private Integer id;
    private String numeroTarjeta;
    private Integer cupo;
    private String codigoCVV;
    private LocalDateTime fechaVencimiento;
    private Usuarios usuarioTitular;
    private CardType tipoTarjeta;
    private String cupoLimite;
    private LocalDateTime fechaEmision;
    private Integer saldoActual;
    private boolean estado;

}
