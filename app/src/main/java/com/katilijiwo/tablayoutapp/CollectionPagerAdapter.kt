package com.katilijiwo.tablayoutapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentStatePagerAdapter
import com.katilijiwo.tablayoutapp.fragments.Fragment1
import com.katilijiwo.tablayoutapp.fragments.Fragment2
import com.katilijiwo.tablayoutapp.fragments.Fragment3
import java.lang.Exception

class CollectionPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT)  {
    override fun getCount(): Int = 3

    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> Fragment1()
            1 -> Fragment2()
            2 -> Fragment3()
            else -> throw Exception()
        }
    }

    override fun getPageTitle(position: Int): CharSequence {
        return when(position) {
            0 -> "Fragment 1"
            1 -> "Fragment 2"
            2 -> "Fragment 3"
            else -> throw Exception()
        }
    }
}