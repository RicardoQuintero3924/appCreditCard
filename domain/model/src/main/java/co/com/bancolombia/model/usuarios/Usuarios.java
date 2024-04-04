package co.com.bancolombia.model.usuarios;

import co.com.bancolombia.model.entities.DocumentType;
import co.com.bancolombia.model.entities.UserType;
import co.com.bancolombia.model.registro.Registro;
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
public class Usuarios {
    private Integer id;
    private String nombres;
    private String apellidos;
    private DocumentType tipoDocumento;
    private String documento;
    private UserType tipoUsuario;
    private Registro registro;
    private boolean estado;
}
