package com.project.banking.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "sequences")
@AllArgsConstructor
@NoArgsConstructor
public class Sequence {

    @Id
    private String id;

    private long seq;
}

