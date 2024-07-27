import lombok.*;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
@ToString
public class ClientePJ extends Cliente{
    private String CNPJ;
}
