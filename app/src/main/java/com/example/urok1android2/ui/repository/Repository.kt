package com.example.urok1android2.ui.repository

import com.example.urok1android2.ui.model.Model

class Repository {

    private val list = ArrayList <Model>()

    fun getList() : ArrayList <Model> {

        list.add(
            Model(
                "Red", "https://upload.wikimedia.org/wikipedia/commons/thumb/6/62/Solid_red.svg/512px-Solid_red.svg.png?20150316143248"
            )
        )
        list.add(
            Model(
                "Orange", "https://htmlcolorcodes.com/assets/images/colors/neon-orange-color-solid-background-1920x1080.png"
            )
        )
        list.add(
            Model(
                "Yellow", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/09/Solid_yellow.svg/768px-Solid_yellow.svg.png"
            )
        )
        list.add(
            Model(
                "Green", "https://www.macmillandictionary.com/external/slideshow/full/Green_full.png"
            )
        )
        list.add(
            Model(
                "Blue", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/ff/Solid_blue.svg/800px-Solid_blue.svg.png"
            )
        )
        list.add(
            Model(
                "Dark-Blue", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d8/Oxford_blue.png/220px-Oxford_blue.png"
            )
        )
        list.add(
            Model(
                "Violet", "https://colourlex.com/wp-content/uploads/2021/03/cobalt-violet-painted-swatch-N-300x300.jpg"
            )
        )
        return list
    }
}
