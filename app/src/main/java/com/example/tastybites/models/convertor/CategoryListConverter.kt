package com.example.tastybites.models.convertor

import androidx.room.TypeConverter
import com.example.tastybites.models.Category
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class CategoryListConverter {
    @TypeConverter
    fun fromCategoryList(category: List<Category>):String?{
        if (category == null)
            return null
        else{
            val gson = Gson()
            val type = object : TypeToken<Category>() {
                
            }.type
            return gson.toJson(category, type)
        }
    }

    @TypeConverter
    fun toCategoryList(categoryString: String):List<Category>?{
        if (categoryString == null)
            return null
        else{
            val gson = Gson()
            val type = object : TypeToken<Category>() {

            }.type
            return gson.fromJson(categoryString, type)
        }
    }
}