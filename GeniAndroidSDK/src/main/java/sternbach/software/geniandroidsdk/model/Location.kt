package sternbach.software.geniandroidsdk.model

data class Location(
    val city: String, // City name
    val country: String, // Country name
    val county: String, // County name
    val latitude: Number, // Latitude
    val longitude: Number, // Longitude
    val place_name: String, // Place name
    val state: String, // State name
    val street_address1: String, // Street address line 1
    val street_address2: String, // Street address line 2
    val street_address3: String, // Street address line 2
)
