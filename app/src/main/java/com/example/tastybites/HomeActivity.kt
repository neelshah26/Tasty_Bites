package com.example.tastybites

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tastybites.adapter.MainCategoryAdapter
import com.example.tastybites.adapter.SubCategoryAdapter
import com.example.tastybites.databinding.ActivityHomeBinding
import com.example.tastybites.models.Recipes

class HomeActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityHomeBinding
    var mainCategoryAdapter = MainCategoryAdapter()
    var subCategoryAdapter = SubCategoryAdapter()

    var arrMainCategory = ArrayList<Recipes>()
    var arrSubCategory = ArrayList<Recipes>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        arrMainCategory.add(Recipes(1, "South Indian"))
        arrMainCategory.add(Recipes(2, "Punjabi"))
        arrMainCategory.add(Recipes(3, "Gujarati"))
        arrMainCategory.add(Recipes(4, "Dessert"))

        mainCategoryAdapter.setData(arrMainCategory)
        binding.rvMainCategory.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.rvMainCategory.adapter = mainCategoryAdapter

        arrSubCategory.add(Recipes(1, "Dosa"))
        arrSubCategory.add(Recipes(2, "Panner Sabji"))
        arrSubCategory.add(Recipes(3, "Dal Dhokli"))
        arrSubCategory.add(Recipes(4, "Gulab Jambu"))

        subCategoryAdapter.setData(arrSubCategory)
        binding.rvSubCategory.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.rvSubCategory.adapter = subCategoryAdapter

    }
}