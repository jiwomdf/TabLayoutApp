package com.katilijiwo.tablayoutapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.katilijiwo.tablayoutapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = CollectionPagerAdapter(supportFragmentManager)
        binding.viewpager.adapter = adapter
        binding.tabs.setupWithViewPager(binding.viewpager)
    }
}