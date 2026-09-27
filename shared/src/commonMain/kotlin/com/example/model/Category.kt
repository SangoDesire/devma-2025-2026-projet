package com.example.model

//import ecobudget.shared.generated.resources.Res
import ecobudget.shared.generated.resources.*
import org.jetbrains.compose.resources.StringResource


/**
 * Représente les catégories obligatoires pour la classification des dépenses dans EcoBudget.
 */
enum class Category(
    val labelResId: StringResource,
    val emoji: String
) {
    TRANSPORT(Res.string.category_transport, "🚌"),
    ALIMENTATION(Res.string.category_alimentation, "🍱"),
    LOISIRS(Res.string.category_loisirs, "🎾"),
    LOGEMENT(Res.string.category_logement, "🏠")
}