package com.example.a30daysapp2.data
import com.example.a30daysapp2.R

class DataSource {
    fun loadPlaces(): List<Place> {
        return listOf<Place>(
            Place(R.string.day1, R.string.casadecultura1_title, R.string.casadecultura1_desc, R.drawable.casadeculturaconstanta1, PlaceType.THEN),
            Place(R.string.day2, R.string.casadecultura2_title, R.string.casadecultura2_desc, R.drawable.casadeculturaconstanta2, PlaceType.NOW  ),
            Place(R.string.day3, R.string.eforienord1_title, R.string.eforienord1_desc, R.drawable.eforienord1, PlaceType.THEN),
            Place(R.string.day4, R.string.eforienord2_title, R.string.eforienord2_desc, R.drawable.eforienord2, PlaceType.NOW),
            Place(R.string.day5, R.string.garaconstanta1_title, R.string.garaconstanta1_desc, R.drawable.garaconstant1, PlaceType.THEN),
            Place(R.string.day6, R.string.garaconstanta2_title, R.string.garaconstanta2_desc, R.drawable.garaconstanta2, PlaceType.NOW),
            Place(R.string.day7, R.string.laculperla1_title, R.string.laculperla1_desc, R.drawable.laculdinpiatetaperlamamaia1, PlaceType.THEN),
            Place(R.string.day8, R.string.laculperla2_title, R.string.laculperla2_desc, R.drawable.llaculpiateta2, PlaceType.NOW),
            Place(R.string.day9, R.string.magazintomis1_title, R.string.magazintomis1_desc, R.drawable.magazinttomis1, PlaceType.THEN),
            Place(R.string.day10, R.string.magazintomis2_title, R.string.magazintomis2_desc, R.drawable.magazintomis2, PlaceType.NOW),
            Place(R.string.day11, R.string.moschee1_title, R.string.moschee1_desc, R.drawable.moschee1, PlaceType.THEN),
            Place(R.string.day12, R.string.moschee2_title, R.string.moschee2_desc, R.drawable.moschee2, PlaceType.NOW),
            Place(R.string.day13, R.string.olimp1_title, R.string.olimp1_desc, R.drawable.olimp1, PlaceType.THEN),
            Place(R.string.day14, R.string.olimp2_title, R.string.olimp2_desc, R.drawable.olimp22, PlaceType.NOW),
            Place(R.string.day15, R.string.parcarheologic1_title, R.string.parcarheologic1_desc, R.drawable.parcarheologic1, PlaceType.THEN),
            Place(R.string.day16, R.string.parcarheologic2_title, R.string.parcarheologic2_desc, R.drawable.parcarheologic2, PlaceType.NOW),
            Place(R.string.day17, R.string.piataovidiu1_title, R.string.piataovidiu1_desc, R.drawable.piataovidiu1, PlaceType.THEN),
            Place(R.string.day18, R.string.piataovidiu2_title, R.string.piataovidiu2_desc, R.drawable.piataovidiu2, PlaceType.NOW),
            Place(R.string.day19, R.string.poarta1port1_title, R.string.poarta1port1_desc, R.drawable.poarta1portvrajamarii, PlaceType.THEN),
            Place(R.string.day20, R.string.poarta1port2_title, R.string.poarta1port2_desc, R.drawable.poarta2portvrajamarii, PlaceType.NOW),
            Place(R.string.day21, R.string.port1_title, R.string.port1_desc, R.drawable.port1, PlaceType.THEN),
            Place(R.string.day22, R.string.port2_title, R.string.port2_desc, R.drawable.port2, PlaceType.NOW),
            Place(R.string.day23, R.string.radioconstanta1_title, R.string.radioconstanta1_desc, R.drawable.radioconstanta1, PlaceType.THEN),
            Place(R.string.day24, R.string.radioconstanta2_title, R.string.radioconstanta2_desc, R.drawable.radioconstanta2, PlaceType.NOW),
            Place(R.string.day25, R.string.saturn1_title, R.string.saturn1_desc, R.drawable.saturn1, PlaceType.THEN),
            Place(R.string.day26, R.string.saturn2_title, R.string.saturn2_desc, R.drawable.saturn2, PlaceType.NOW),
            Place(R.string.day27, R.string.teatruvara1_title, R.string.teatruvara1_desc, R.drawable.teatrudevara1, PlaceType.THEN),
            Place(R.string.day28, R.string.teatruvara2_title, R.string.teatruvara2_desc, R.drawable.teatrudevara2, PlaceType.NOW),
            Place(R.string.day29, R.string.tuzla1_title, R.string.tuzla1_desc, R.drawable.tuzla1, PlaceType.THEN),
            Place(R.string.day30, R.string.tuzla2_title, R.string.tuzla2_desc, R.drawable.tuzla2, PlaceType.NOW)


        )
    }
}