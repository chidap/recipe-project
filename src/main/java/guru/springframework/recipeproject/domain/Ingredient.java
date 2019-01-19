package guru.springframework.recipeproject.domain;

import javax.persistence.*;
import java.math.BigDecimal;

// Defines the POJO as Entity
// One to One Unidirectional relationship with UnitOfMeasure
@Entity
public class Ingredient {
    /// Properties
    /// ID - Auto generated Identity for relation DB
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private BigDecimal amount;
    @ManyToOne
    private Recipe recipe;
    ///FetchType - Eagerly loading from DB
    @OneToOne(fetch = FetchType.EAGER)
    private UnitOfMeasure uom;

    /// Setters and Getters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public UnitOfMeasure getUom() {
        return uom;
    }

    public void setUom(UnitOfMeasure uom) {
        this.uom = uom;
    }
}
