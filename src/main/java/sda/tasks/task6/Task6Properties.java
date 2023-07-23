package sda.tasks.task6;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "pl.sdacademy.zad6")
@Validated
public class Task6Properties {
    @NotNull
    @Email(message = "Podaj poprawny adres email")
    private String email;
    @NotEmpty
    @NotBlank
    private String firstName;
    @NotNull(message = "Nazwisko jest wymagane")
    @Size(min = 3, max = 20)
    private String lastName;
    @NotBlank
    @Pattern(regexp = "\\w+ \\d+")
    private String address;
    @NotNull
    @Min(message = "Minimalny wymagany wiek to 18 lat", value = 18)
    private int age;
    @NotNull
    private List<String> values;
    private Map<String, String> customAttributes;

    @AssertTrue(message = "{address.error}")
    public boolean isAddressValid() {
        return address != null && address.contains(" ") && address.split(" ").length == 2;
    }
}
