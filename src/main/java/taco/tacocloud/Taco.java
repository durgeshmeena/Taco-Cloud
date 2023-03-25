package taco.tacocloud;

import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import lombok.Data;

@Data
public class Taco {
    
    @NotBlank(message="Name is required")
    @Size(min=5, message="Name must be at least 5 characters long")
    private String name;


    @NotNull(message="You must choose at least 1 ingredient")
    private List<String> ingredients;

}
