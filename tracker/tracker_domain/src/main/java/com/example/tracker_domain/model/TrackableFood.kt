package com.example.tracker_domain.model

data class TrackableFood(
    val name: String,
    val imageUrl: String?,
    val caloriesPer100g: Int,
    val carbsPer100g: Int,
    val proteinPer100g: Int,
    val fatPer100g: Int
) {
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is TrackableFood) return false;
        return name.equals(other.name) &&
                imageUrl.equals(other.imageUrl) &&
                caloriesPer100g == other.caloriesPer100g &&
                carbsPer100g == other.carbsPer100g &&
                proteinPer100g == other.proteinPer100g &&
                fatPer100g == other.fatPer100g

    }
}
