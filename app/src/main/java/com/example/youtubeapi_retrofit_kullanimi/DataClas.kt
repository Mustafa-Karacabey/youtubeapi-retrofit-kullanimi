package com.example.youtubeapi_retrofit_kullanimi

import com.example.youtubeapi_retrofit_kullanimi.DataClas.DataseriesEntity
import com.example.youtubeapi_retrofit_kullanimi.DataClas.Wind10mEntity

abstract class DataClas {
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName("dataseries")
    var dataseries: List<DataseriesEntity>? = null

    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName("init")
    var init: String? = null

    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName("product")
    var product: String? = null

    class DataseriesEntity {
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("prec_type")
        var prec_type: String? = null

        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("temp2m")
        var temp2m = 0

        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("wind10m")
        var wind10m: Wind10mEntity? = null

        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("rh2m")
        var rh2m = 0

        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("lifted_index")
        var lifted_index = 0

        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("transparency")
        var transparency = 0

        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("seeing")
        var seeing = 0

        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("cloudcover")
        var cloudcover = 0

        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("timepoint")
        var timepoint = 0
    }

    class Wind10mEntity {
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("speed")
        var speed = 0

        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("direction")
        var direction: String? = null
    }
}