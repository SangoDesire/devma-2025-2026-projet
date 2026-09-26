# EcoBudget 🌿
# Process :
# 1- clonage du projet (devma 2025-2026-projet Ecobudget) depuis le dépot git
# 2 - Création du module shared : via new-module-java or kotlin librairy
# 3-suppression du contenu 'build.gradle.kts' et synchronisation ...
# 4-Suppression du dossier Main du module 'shared'
# Ajout des plugins et dependencies nécessaires au module 'shared'dans le fichier build.gradle.kts"

# Création du dossier commonMain/kotlin, androidMain/kotlin ,iosMain/kotlin"
# Liaison des modules 'shared' et 'app' via :   implementation(project(":shared"))
# synchronisation du fichier build.gradle.kts après ajout de   implementation(project(":shared"))
# Nettoyage : suppression de  implementation(libs.kotlinx.coroutines.core) et synchronisation ...
    




# Difficulté rencontrées : 

#  1- Géneration d'exceptions (erreurs ) lors de la synchronisation du projet après mise à jour de build.gradle.kts.
# problème dû à la position du bloc android dans le fichier build.gradle.kts . 

# Corrections;
# 1- retirer le bloc android du bloc kotlin

