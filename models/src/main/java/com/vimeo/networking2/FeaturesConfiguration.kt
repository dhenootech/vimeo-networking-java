package com.vimeo.networking2

/**
 * Based on CAPABILITY_PLATFORM_CONFIGS_OTA_FEATURES.
 */
data class FeaturesConfiguration(

    /**
     * The Chromecast receiver app ID.
     */
    val chromecastAppId: String?,

    /**
     * Is Comscore enabled?
     */
    val comscore: Boolean?,

    /**
     * Does the user reside within a GDPR-compliant country?
     */
    val gdprEnabled: Boolean?,

    /**
     * Is play tracking enabled?
     */
    val playTracking: Boolean?

)
