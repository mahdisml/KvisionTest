package com.example

import io.kvision.Application
import io.kvision.core.*
import io.kvision.html.div
import io.kvision.html.p
import io.kvision.module
import io.kvision.panel.flexPanel
import io.kvision.panel.root
import io.kvision.require
import io.kvision.startApplication
import io.kvision.state.ObservableValue
import io.kvision.utils.perc

class Helloworld : Application() {
    init {
        require("css/helloworld.css")
    }
    private val state = ObservableValue(Core())

    override fun start() {
        root("app") {
            flexPanel (
                direction = FlexDirection.COLUMN,
                wrap = FlexWrap.NOWRAP,
                justify = JustifyContent.CENTER,
                alignItems = AlignItems.CENTER,
                alignContent = AlignContent.STRETCH,
            ){
                width = 100.perc
                height = 100.perc
                div (state){
                    it.texts.map { it2 ->
                        p(content = it2)
                    }
                    this.add(Button(text = "+",state))
                }
            }
        }
    }
}

fun main() {
    startApplication(::Helloworld, module.hot)
}
/*

flexPanel (
                direction = FlexDirection.ROW,
                wrap = FlexWrap.NOWRAP,
                justify = JustifyContent.FLEXSTART,
                alignItems = AlignItems.FLEXSTART,
                alignContent = AlignContent.STRETCH,
            ){
                width = auto
                height = auto


            }


 */