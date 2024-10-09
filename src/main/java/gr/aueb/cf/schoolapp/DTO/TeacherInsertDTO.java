package gr.aueb.cf.schoolapp.DTO;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TeacherInsertDTO {
    @NotNull(message="name is mandatory")
    @Size(min = 2, max = 255, message = "name must be between 2 and 255 characters")
    private String firstname;

    @NotNull(message = "lastname is mandatory")
    @Size(min = 2, max = 255, message = "lastname must be between 2 and 255 characters")
    private String lastname;

    @NotNull(message = "VAT is mandatory")
    @Size(min=9, message = "VAT should be at least 9 characters long")
    private String vat;
}
