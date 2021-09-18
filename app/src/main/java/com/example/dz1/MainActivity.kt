package com.example.dz1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.dz1.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_blank1.*
import kotlinx.android.synthetic.main.fragment_blank2.*

class MainActivity : AppCompatActivity() {
    fun onclick3(){
        val f3 = BlankFragment3()
        val ft = supportFragmentManager.beginTransaction()
        ft.remove(container2)
        ft.add(R.id.container3,f3)
        ft.commit()
    }
    fun onclick2()
    {
        val f2 = BlankFragment2()
        val ft = supportFragmentManager.beginTransaction()
        ft.add(R.id.container2,f2)
        ft.remove(container)
        ft.remove(container3)
        ft.commit();
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1.setOnClickListener{
            onclick2()
        }
        btn2.setOnClickListener{
            onclick3()
        }
    }

}
