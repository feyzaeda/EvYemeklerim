package com.example.evyemeklerim.entity

import java.io.Serializable

data class Foods(var yemek_id : Int,
                 var yemek_adi : String,
                 var yemek_resim_adi : String,
                 var yemek_fiyat : Int) : Serializable{}
