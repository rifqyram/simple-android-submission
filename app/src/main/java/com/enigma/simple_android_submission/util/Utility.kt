package com.enigma.simple_android_submission.util

import java.text.NumberFormat
import java.util.*

class Converter {
    companion object {
        fun rupiah(number: Double): String{
            val localeID =  Locale("in", "ID")
            val numberFormat = NumberFormat.getCurrencyInstance(localeID)
            return numberFormat.format(number).toString()
        }
    }
}