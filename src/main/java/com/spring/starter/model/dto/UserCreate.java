package com.spring.starter.model.dto;

import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserCreate {

    @NotNull
    @Size(min = 2, max = 20)
    private String name;

    @Positive
    private Integer age;
}
