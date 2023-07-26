package com.example.tastybites.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tastybites.R
import com.example.tastybites.models.Recipes

class MainCategoryAdapter: RecyclerView.Adapter<MainCategoryAdapter.RecipeViewHolder>() {

    lateinit var arrMainCategory: ArrayList<Recipes>
    class RecipeViewHolder(view: View): RecyclerView.ViewHolder(view) {
        private val tv_dish_name = itemView.findViewById<TextView>(R.id.tv_dish_name)
        fun bind(recipes: Recipes){
            tv_dish_name.text = recipes.dishName
        }
    }

    fun setData(arrData: List<Recipes>){
        arrMainCategory = arrData as ArrayList<Recipes>
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecipeViewHolder {
        return RecipeViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_rv_main_category, parent, false))
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        holder.bind(arrMainCategory[position])
    }

    override fun getItemCount(): Int {
        return arrMainCategory.size
    }

}