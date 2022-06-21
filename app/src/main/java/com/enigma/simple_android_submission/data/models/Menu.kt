package com.enigma.simple_android_submission.data.models

import com.enigma.simple_android_submission.R
import java.io.Serializable

data class Menu(
    val id: Int,
    val name: String,
    val price: Long,
    val description: String,
    val image: Int,
) : Serializable

object MenuData {
    val listMenu = listOf<Menu>(
        Menu(1,
            "Nasi Goreng",
            18000,
            "Nasi goreng adalah sebuah makanan berupa nasi yang digoreng dan diaduk dalam minyak goreng, margarin, atau mentega",
            R.drawable.nasi_goreng
        ),
        Menu(2,
            "Mi Goreng",
            17000,
            "Mi goreng berarti \"mi yang digoreng\" adalah hidangan mie yang dimasak dengan digoreng tumis khas Indonesia",
            R.drawable.mi_goreng
        ),
        Menu(3,
            "Kwetiau goreng",
            17000,
            "Kwetiau goreng adalah kwetiau yang digoreng yang merupakan masakan Tionghoa Indonesia, itu adalah hidangan mie yang digoreng yang beraroma dan pedas yang umum dijumpai di Indonesia.",
            R.drawable.kwetiau
        ),
        Menu(4,
            "Bakso",
            25000,
            "Bakso atau baso adalah jenis bola daging yang lazim ditemukan pada masakan Indonesia. Bakso umumnya dibuat dari campuran daging sapi giling dan tepung tapioka, tetapi ada juga bakso yang terbuat dari daging ayam, ikan, atau udang bahkan daging kerbau.",
            R.drawable.bakso
        ),
        Menu(5,
            "Siomay",
            15000,
            "Siomai adalah salah satu jenis dim sum. Dalam bahasa Mandarin, makanan ini disebut shaomai, sementara dalam bahasa Kanton disebut siu maai.",
            R.drawable.siomai
        ),
        Menu(6,
            "Dim Sum",
            15000,
            "Dim sum is a large range of small Chinese dishes that are traditionally enjoyed in restaurants for brunch. Most modern dim sum dishes originated in China and are commonly associated with Cantonese cuisine, although dim sum dishes also exist in other Chinese cuisines",
            R.drawable.dimsum
        ),
        Menu(7,
            "Lumpia",
            5000,
            "Lumpia atau terkadang dieja sebagai lun pia adalah sejenis jajanan tradisional Tionghoa. Lumpia yang dikenal oleh orang Indonesia merupakan lafal Bahasa Hokkian. ",
            R.drawable.lumpia
        ),
        Menu(8,
            "Batagor",
            15000,
            "Batagor merupakan jajanan khas Bandung yang mengadaptasi gaya Tionghoa-Indonesia dan kini sudah dikenal hampir di seluruh wilayah Indonesia.",
            R.drawable.batagor
        ),
        Menu(9,
            "Gado-Gado",
            17000,
            "Nasi goreng adalah sebuah makanan berupa nasi yang digoreng dan diaduk dalam minyak goreng, margarin, atau mentega",
            R.drawable.gado_gado
        ),
        Menu(10,
            "Soto",
            15000,
            "Soto, sroto, sauto, tauto, atau coto adalah makanan khas Indonesia seperti sop yang terbuat dari kaldu daging dan sayuran.",
            R.drawable.soto
        ),
    )
}