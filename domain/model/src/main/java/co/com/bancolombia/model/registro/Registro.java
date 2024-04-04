package co.com.bancolombia.model.registro;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.Builder;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Registro {
    private Integer id;
    private String nombre;
    private String correo;
    private String nroDocumento;
}
