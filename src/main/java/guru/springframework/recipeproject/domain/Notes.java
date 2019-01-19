package guru.springframework.recipeproject.domain;

import javax.persistence.*;

// Defines the POJO as Entity
@Entity
public class Notes {
    /// Properties
    /// ID - Auto generated Identity for relation DB
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // Defines OneToOn relationship with Recipe
    @OneToOne
    private String recipe;
    // defines Blob binary type in the DB
    @Lob
    private String recipeNotes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public String getRecipeNotes() {
        return recipeNotes;
    }

    public void setRecipeNotes(String recipeNotes) {
        this.recipeNotes = recipeNotes;
    }
}
