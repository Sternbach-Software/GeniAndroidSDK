package sternbach.software.geniandroidsdk.model

data class PhotoImageSizeMap(
    val large: String, // URL of the large image
    val medium: String, // URL of the medium image
    val origin: String, // URL of the original image
    val print: String, // URL of the print image
    val small: String, // URL of the small image
    val thumb: String, // URL of the thumb image
    val thumb2: String, // URL of the thumb2 image
)
