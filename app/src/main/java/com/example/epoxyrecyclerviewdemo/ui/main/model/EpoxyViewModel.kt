package com.example.epoxyrecyclerviewdemo.ui.main.model

import com.bumptech.glide.Glide
import com.example.epoxyrecyclerviewdemo.R
import com.example.epoxyrecyclerviewdemo.databinding.ItemEpoxyAdapterViewBinding
import com.example.epoxyrecyclerviewdemo.viewBindingModel.ViewBindingKotlinModel

data class EpoxyViewModel(
   val item: ViewPojo
) : ViewBindingKotlinModel<ItemEpoxyAdapterViewBinding>(R.layout.item_epoxy_adapter_view) {
    override fun ItemEpoxyAdapterViewBinding.bind() {
        titleTV.text = item.title
        Glide.with(imageIV.context)
            .load(item.imageView)
            .into(imageIV)
    }
}
