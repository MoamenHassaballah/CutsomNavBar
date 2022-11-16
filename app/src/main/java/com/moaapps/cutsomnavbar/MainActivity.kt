package com.moaapps.cutsomnavbar

import android.animation.LayoutTransition
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.GONE
import android.view.View.VISIBLE
import androidx.annotation.RequiresApi
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.getColor
import com.moaapps.cutsomnavbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.homeLayout.setOnClickListener { checkHomeTab() }
        binding.categoriesLayout.setOnClickListener { checkCategoriesTab() }
        binding.aboutLayout.setOnClickListener { checkAboutTab() }
        binding.root.layoutTransition.enableTransitionType(LayoutTransition.CHANGING)
        binding.homeLayout.layoutTransition.enableTransitionType(LayoutTransition.CHANGING)
        binding.categoriesLayout.layoutTransition.enableTransitionType(LayoutTransition.CHANGING)
        binding.aboutLayout.layoutTransition.enableTransitionType(LayoutTransition.CHANGING)

    }



    private fun checkHomeTab(){
        binding.homeIcon.setImageResource(R.drawable.ic_home_yellow)
        binding.homeTxt.visibility = VISIBLE
        binding.homeLayout.background = AppCompatResources.getDrawable(this, R.drawable.selection_background)
        binding.screenLabel.text = "Home Screen"
        uncheckCategoriesTab()
        uncheckAboutTab()
    }

    private fun uncheckHomeTab(){
        binding.homeIcon.setImageResource(R.drawable.ic_home)
        binding.homeTxt.visibility = GONE
        binding.homeLayout.background = AppCompatResources.getDrawable(this, R.drawable.transparent_background)
    }

    private fun checkCategoriesTab(){
        binding.categoriesIcon.setImageResource(R.drawable.ic_list_yellow)
        binding.categoriesTxt.visibility = VISIBLE
        binding.categoriesLayout.background = AppCompatResources.getDrawable(this, R.drawable.selection_background)
        binding.screenLabel.text = "Categories Screen"
        uncheckHomeTab()
        uncheckAboutTab()
    }

    private fun uncheckCategoriesTab(){
        binding.categoriesIcon.setImageResource(R.drawable.ic_list)
        binding.categoriesTxt.visibility = GONE
        binding.categoriesLayout.background = AppCompatResources.getDrawable(this, R.drawable.transparent_background)
    }

    private fun checkAboutTab(){
        binding.aboutIcon.setImageResource(R.drawable.ic_about_yellow)
        binding.aboutTxt.visibility = VISIBLE
        binding.aboutLayout.background = AppCompatResources.getDrawable(this, R.drawable.selection_background)
        binding.screenLabel.text = "About Screen"
        uncheckHomeTab()
        uncheckCategoriesTab()
    }

    private fun uncheckAboutTab(){
        binding.aboutIcon.setImageResource(R.drawable.ic_about)
        binding.aboutTxt.visibility = GONE
        binding.aboutLayout.background = AppCompatResources.getDrawable(this, R.drawable.transparent_background)
    }
}