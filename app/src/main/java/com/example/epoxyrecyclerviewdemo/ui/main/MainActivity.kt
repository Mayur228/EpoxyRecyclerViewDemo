package com.example.epoxyrecyclerviewdemo.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.epoxyrecyclerviewdemo.R
import com.example.epoxyrecyclerviewdemo.databinding.ActivityMainBinding
import com.example.epoxyrecyclerviewdemo.ui.main.adapter.EpoxyListAdapter
import com.example.epoxyrecyclerviewdemo.ui.main.model.ViewPojo

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var viewController: EpoxyListAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        setUpView()
    }

    private fun setUpView() {
        viewController = EpoxyListAdapter()
        viewController.viewList = listOf(
            ViewPojo(title = "test1","https://parade.com/.image/ar_1:1%2Cc_fill%2Ccs_srgb%2Cfl_progressive%2Cq_auto:good%2Cw_1200/MTkwNTgxMjkxNjk3NDQ4ODI4/marveldisney.jpg",false,"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."),
            ViewPojo(title = "test2","https://s3.amazonaws.com/com.marvel.terrigen/prod/captainmarvel_lob_crd_06.jpg",true,"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."),
            ViewPojo(title = "test3","https://terrigen-cdn-dev.marvel.com/content/prod/1x/antmanandthewaspquantumania_lob_crd_03.jpg",false,"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."),
            ViewPojo(title = "test4","https://terrigen-cdn-dev.marvel.com/content/prod/1x/eternals_lob_crd_06.jpg",true,"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."),
            ViewPojo(title = "test5","https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/marvel-list-1655249184.jpg?crop=0.6666666666666666xw:1xh;center,top&resize=1200:*",true,"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.")
        )
        binding.epoxyRV.layoutManager = LinearLayoutManager(applicationContext,)
        binding.epoxyRV.setController(viewController)
    }
}