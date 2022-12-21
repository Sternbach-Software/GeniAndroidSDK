package sternbach.software.geniandroidsdk.model

data class Date(
    val circa: Boolean, //	Indicates wether the date is an approximation
    val day: Number, //	Date's day
    val end_circa: Boolean, //	Indicates wether the end date is an approximation
    val end_day: Number, //	Date's end day (only valid if range is between)
    val end_month: Number, //	Date's end month (only valid if range is between)
    val end_year: Number, //	Date's end year (only valid if range is between)
    val month: Number, //	Date's month
    val range: String, //	Range (before, after, or between)
    val year: Number, //	Date's year
)
