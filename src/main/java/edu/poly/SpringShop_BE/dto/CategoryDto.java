package edu.poly.SpringShop_BE.dto;

import edu.poly.SpringShop_BE.domain.CategoryStatus;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.Value;
import org.hibernate.annotations.NotFound;

import java.io.Serializable;

/**
 * DTO for {@link edu.poly.SpringShop_BE.domain.Category}
 */
@Data
public class CategoryDto implements Serializable {
    private  Long id;
    @NotEmpty(message = "Category name is required")
    private  String name;
    private  CategoryStatus status;
}