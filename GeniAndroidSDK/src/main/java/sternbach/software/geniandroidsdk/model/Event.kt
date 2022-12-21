package sternbach.software.geniandroidsdk.model

data class Event(
    val date: Date, //	Event's date
    val description: String, //	Event's description
    val location: Location, //	Event's location
    val name: String, //	Event's name
)
