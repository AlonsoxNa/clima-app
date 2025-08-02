package com.alonso.climaapp.model

data class PronosticoResponse(
    val list: List<DiaPronostico>
)

data class DiaPronostico(
    val dt_txt: String,
    val main: Main,
    val weather: List<Weather>

)