package com.mac.book.myplayandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //fragment的容器视图，navHost的默认实现——NavHostFragment
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment

        //管理应用导航的对象
        val navController = navHostFragment.navController

        //fragment与BottomNavigationView的交互交给NavigationUI
        bottom_nav_view.setupWithNavController(navController)

    }


}