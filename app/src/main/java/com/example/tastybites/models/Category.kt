package com.example.tastybites.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.example.tastybites.models.convertor.CategoryListConverter
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Entity(tableName = "Category")
data class Category(
    @PrimaryKey(autoGenerate = true)
    var id: Int,

    @ColumnInfo(name = "categoriesitems")
    @Expose
    @SerializedName("categories")
    @TypeConverters(CategoryListConverter::class)
    val categoriesitems: List<CategoryItems>? = null
)
