package com.example

import io.kvision.html.Div
import io.kvision.html.button
import io.kvision.state.ObservableValue

class Button (text:String,state:ObservableValue<Core>) : Div(){
    init {
        var buttonText = ""
        state.value.texts.map {
            buttonText += text
        }
        button(text = buttonText){
            onClick {
                state.value = state.value.add("Salam Salam")
            }
        }
    }
}