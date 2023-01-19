package com.example.epoxyrecyclerviewdemo.ui.main.model

import com.example.epoxyrecyclerviewdemo.R
import com.example.epoxyrecyclerviewdemo.databinding.ItemDescriptionBinding
import com.example.epoxyrecyclerviewdemo.viewBindingModel.ViewBindingKotlinModel

data class DescriptionModel(
    val description: String
):ViewBindingKotlinModel<ItemDescriptionBinding>(R.layout.item_description) {
    override fun ItemDescriptionBinding.bind() {
     descriptionTV.text = description
    }
}
