package com.example.tastybites.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "Recipes")
data class Recipies(
    @PrimaryKey(autoGenerate = true)
    var id: Int
) : Serializable