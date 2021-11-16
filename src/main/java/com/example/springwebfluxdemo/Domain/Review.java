package com.example.springwebfluxdemo.Domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Review {
    private long reviewId;
    private long bookId;
    private double ratings;
    private String comments;
}
