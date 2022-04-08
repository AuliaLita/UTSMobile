package com.example.recyclerview.data

import com.example.recyclerview.R
import com.example.recyclerview.model.Otomotif

class motor() {
    fun loadAffirmations(): List<Otomotif>{
        return listOf<Otomotif>(
            Otomotif(R.string.judul1, R.string.Otomotif1, R.drawable.image1),
            Otomotif(R.string.judul2, R.string.Otomotif2, R.drawable.image2),
            Otomotif(R.string.judul3, R.string.Otomotif3, R.drawable.image3),
            Otomotif(R.string.judul4, R.string.Otomotif4, R.drawable.image4),
            Otomotif(R.string.judul5, R.string.Otomotif5, R.drawable.image5),
            Otomotif(R.string.judul6, R.string.Otomotif6, R.drawable.image6),
            Otomotif(R.string.judul7, R.string.Otomotif7, R.drawable.image7),
            Otomotif(R.string.judul8, R.string.Otomotif8, R.drawable.image8),
            Otomotif(R.string.judul9, R.string.Otomotif9, R.drawable.image9),
            Otomotif(R.string.judul10, R.string.Otomotif10, R.drawable.image10)
        )
    }
}