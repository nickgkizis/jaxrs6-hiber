package gr.aueb.cf.schoolapp.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class UserInsertDTO {
    @Email(message = "invalid username")
    private String username;

    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*?\\d)(?=.[*@#$!%&*]).{8,}$",message ="invalid password" )
    private String password;

    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*?\\d)(?=.[*@#$!%&*]).{8,}$",message ="invalid password" )
    private String confirmPassword;

    @NotEmpty(message = "role cant ne empty")
    private String role;
}
