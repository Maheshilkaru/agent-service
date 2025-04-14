
package com.moontracker.agentservice;

import jakarta.validation.constraints.*;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "agents")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Agent {

    @Id
    private String id;

    @NotBlank(message = "Agent code is required")
    private String agentCode;

    @NotBlank(message = "Name is required")
    private String name;

    @Email(message = "Invalid email")
    private String email;

    @Pattern(regexp = "^[0-9]{10}$", message = "Phone number must be 10 digits")
    private String phone;

    private List<String> productAuthorizations;

    private String role;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
