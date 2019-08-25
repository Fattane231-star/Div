package com.example.divar

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class AdapterViewpager(fm:FragmentManager) :FragmentStatePagerAdapter(fm){
    var b=Fragment()
    override fun getItem(position: Int): Fragment {
        if (position == 0)
            b= FragmentDivarman()
        if (position == 1)
            b= FragmentChat()
        if (position == 2)
            b= FragmentSabtAgahi()
       if (position==3)
           b= FragmentAdd2()
        else if(position==4)
           b=Setting()
        return b
    }

    override fun getCount(): Int {
        return 4
    }

}