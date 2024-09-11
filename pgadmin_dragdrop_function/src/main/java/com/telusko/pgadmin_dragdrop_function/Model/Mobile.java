package com.telusko.pgadmin_dragdrop_function.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mobile {
    @Id
    private Long id;

    private String mobileName;

    private int priority = 0 ;
}
