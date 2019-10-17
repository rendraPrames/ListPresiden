package com.example.presidenindonesia

object DataArray {
    private val languages = listOf("Ir.Soekarno","H.M. Soeharto","B.J Habibie","Abdurrahman Wahid",
        "Megawati Soekarnoputri","Susilo Bambang Yudhoyono", "Ir. Joko Widodo")

    val desk = listOf(
        "Ir.Soekarno merupakan Presiden Republik Indonesia Pertama",
        "H.M. Soeharto merupakan Presiden Republik Indonesia Kedua",
        "B.J Habibie merupakan Presiden Republik Indonesia Ketiga",
        "Abdurrahman Wahid merupakan Presiden Republik Indonesia Keempat",
        "Megawati Soekarnoputri merupakan Presiden Republik Indonesia Kelima",
        "Susilo Bambang Yudhoyono merupakan Presiden Republik Indonesia Keenam",
        "Ir. Joko Widodo merupakan Presiden Republik Indonesia Ketujuh"
    )

    private val pictDat = intArrayOf(
        R.drawable.soekarno,
        R.drawable.soeharto,
        R.drawable.habibie,
        R.drawable.abdurahman,
        R.drawable.megawati,
        R.drawable.sby,
        R.drawable.jokowi
    )
    val listData : ArrayList<AturArray>
        get() {
            val list = arrayListOf<AturArray>()
            for (position in languages.indices){
                val listDat = AturArray()
                listDat.name = languages[position]
                listDat.detail = desk[position]
                listDat.pict = pictDat[position]
                list.add(listDat)
            }
            return list
        }
}