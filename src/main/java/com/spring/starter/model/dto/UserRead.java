package com.spring.starter.model.dto;

import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRead {

    private Long id;
    private String name;

    private Integer age;
}
