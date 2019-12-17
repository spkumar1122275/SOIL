package io.ffem.integration

internal object Constants {
    // The Play store url to link to if the user has not installed the required ffem apps
    const val playStoreUrl = "https://play.google.com/store/apps/details?id="
    // Some of the different types of tests that can be started
    const val AVAILABLE_IRON = "Soil - Available Iron"
    const val CALCIUM_MAGNESIUM = "Soil - Exchangeable Calcium and Magnesium"
    const val FLUORIDE = "Water - Fluoride"
    const val INVALID_TEST = "Invalid Test Example"
    // Keys
    const val TEST_ID_KEY = "testId"
    const val RESULT_JSON = "resultJson"
}