package com.example.epoxyrecyclerviewdemo.ui.main.adapter

import com.airbnb.epoxy.EpoxyController
import com.example.epoxyrecyclerviewdemo.ui.main.model.DescriptionModel
import com.example.epoxyrecyclerviewdemo.ui.main.model.EpoxyViewModel
import com.example.epoxyrecyclerviewdemo.ui.main.model.ViewPojo

class EpoxyListAdapter: EpoxyController() {

    var viewList = emptyList<ViewPojo>()
    set(value) {
        field = value
        requestModelBuild()
    }

    override fun buildModels() {
        viewList.map {
            if (it.isShowDescription) {
                EpoxyViewModel(it).id(it.title).addTo(this)
                DescriptionModel(it.description).id(it.description).addTo(this)
            }else {
                EpoxyViewModel(it).id(it.title).addTo(this)
            }
        }
    }
}