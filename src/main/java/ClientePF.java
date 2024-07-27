import lombok.*;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
@ToString
public class ClientePF extends Cliente {
    private String CPF;
}
