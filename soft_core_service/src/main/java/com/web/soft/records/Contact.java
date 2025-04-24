package com.web.soft.records;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record Contact(
        @NotNull(message = "{name.notnull}")
        @Size(min = 4, max = 20, message = "{name.size}")
        @Pattern(regexp = "^[a-zA-Z]+$", message = "{name.pattern}")
        String name,

        @NotNull(message = "{phone.notnull}")
        @Pattern(regexp = "^[0-9]{10}$", message = "{phone.pattern}")
        String phoneNumber
) {
}
