package sternbach.software.geniandroidsdk.model

data class Profile(
    val about_me: String? = null, //Profile's about me section (cf. detail_strings) (must be requested)
    val baptism: Event? = null, //Profile's baptism event info
    val big_tree: Boolean? = null, //True if the profile is attached to the big tree
    val birth: Event? = null, //Profile's birth event info
    val block_exists: Boolean? = null, //Indicates whether the profile is blocked
    val burial: Event? = null, //Profile's burial event info
    val cause_of_death: String? = null, //Profile's death cause
    val claimed: Boolean? = null, //True if the profile is claimed by a user
    val created_at: String? = null, //Timestamp of when the profile was created
    val created_by: String? = null, //URL (or id) of the profile who added this profile to the tree
    val creator: String? = null, //URL (or id) of the user who added this profile to the tree
    val curator: String? = null, //Profile's curator's url (or id)
    val current_residence: Location? = null, //Profile's current address
    val death: Event? = null, //Profile's death event info
    val detail_strings: Map<Any, Any>? = null, //Nested maps of locales to details fields (eg. about me) to values (must be requested)
    val display_name: String? = null, //Profile's display name
    val documents_updated_at: String? = null, //Timestamp of the last document updated/added to the profile. Will not be return if no documents exist.
    val email: String? = null, //Profile's email address
    val events: List<Event>? = null, //of Events	Events associated with this profile (must be requested)
    val first_name: String? = null, //Profile's first name
    val gender: String? = null, //Profile's gender
    val get_email: Boolean? = null, //Indicates whether the profile can receive email
    val guid: String? = null, //Profile's globally unique identifier
    val id: String? = null, //Profile's node id
    val is_alive: Boolean? = null, //True if the profile is living
    val language: String? = null, //Profile's language
    val last_name: String? = null, //Profile's last name
    val locked: Boolean? = null, //True if the profile has been locked down by a curator
    val maiden_name: String? = null, //Profile's maiden name
    val managers: List<String>? = null, //of Strings	URLs (or ids) of profile(s) currently managing this profile
    val master_profile: Boolean? = null, //Indicates whether the profile is a master profile
    val merge_note: Any? = null, //Array or String	Note explaining the profile's merge status
    val merge_pending: Boolean? = null, //Indicates whether the profile has a pending merge
    val merged_into: String? = null, //URL (or id) of the profile this profile is currently merged into
    val middle_name: String? = null, //Profile's middle name
    val mugshot_urls: PhotoImageSizeMap? = null, //All sizes of the profile's main photo
    val name: String? = null, //Profile's name as it appears on the site to the current user
    val names: Map<String, Profile>? = null, //Nested maps of locales to name fields to values
    val nicknames: List<String>? = null, //of Strings	Also known as. Returned as an array? = null, but can be set as a comma delimited list.
    val occupation: String? = null, //Profile's occupation
    val phone_numbers: List<PhoneNumber>? = null, //of PhoneNumbers	Profile's phone numbers
    val photos_updated_at: String? = null, //Timestamp of the last photo updated/added to the profile. Will not be return if no photos exist.
    val premium_start_date: String? = null, //Date when the profile became a pro user
    val profile_url: String? = null, //URL to access profile in a browser
    val public: Boolean? = null, //True if the profile is public
    val relationship: String? = null, //Profile's relationship to the current user (if any)
    val requested_merges: List<String>? = null, //of Strings	URLs (or ids) of the profile(s) requested to be merged into this one
    val suffix: String? = null, //Profile's suffix
    val unions: List<String>? = null, //of Strings	URLs to unions
    val updated_at: String? = null, //Timestamp of when the profile was last updated
    val url: String? = null, //URL to access profile through the API
    val videos_updated_at: String? = null, //Timestamp of the last video updated/added to the profile. Will not be return if no videos exist.
)
