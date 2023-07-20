package com.example.tastybites.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.tastybites.models.Recipies

@Dao
interface RecipeDao {

    @get:Query("SELECT * FROM recipes ORDER BY id DESC")
    val allRecipes: List<Recipies>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertRecipe(recipe: Recipies)

}