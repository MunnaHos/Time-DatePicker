package com.example.timedatepicker

import java.text.SimpleDateFormat
import java.util.*

fun GetFormat( milies :Long,format : String)=
    SimpleDateFormat(format, Locale.getDefault()).format(Date(milies))