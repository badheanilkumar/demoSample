package com.example.demoSample;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class GenericResponseDto<T> {
    private int statusCode;
    private T responseData;
}
