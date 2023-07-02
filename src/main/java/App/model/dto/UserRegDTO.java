package App.model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserRegDTO {
    private String fullName;
    private String email;
    private String password;
}
