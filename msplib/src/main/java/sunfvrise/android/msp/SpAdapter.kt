package sunfvrise.android.msp

import android.content.SharedPreferences

class SpAdapter : SharedPreferences {
    override fun getAll(): Map<String?, *>? = null

    override fun getString(key: String?, defValue: String?): String? = null

    override fun getStringSet(
        key: String?,
        defValues: Set<String?>?
    ): Set<String?>? = null

    override fun getInt(key: String?, defValue: Int): Int = 0

    override fun getLong(key: String?, defValue: Long): Long = 0

    override fun getFloat(key: String?, defValue: Float): Float = 0f

    override fun getBoolean(key: String?, defValue: Boolean): Boolean = false

    override fun contains(key: String?): Boolean = false

    override fun edit(): SharedPreferences.Editor? = null

    override fun registerOnSharedPreferenceChangeListener(listener: SharedPreferences.OnSharedPreferenceChangeListener?) {
    }

    override fun unregisterOnSharedPreferenceChangeListener(listener: SharedPreferences.OnSharedPreferenceChangeListener?) {
    }

    class EditorAdapter : SharedPreferences.Editor {
        override fun putString(
            key: String?,
            value: String?
        ): SharedPreferences.Editor? = null

        override fun putStringSet(
            key: String?,
            values: Set<String?>?
        ): SharedPreferences.Editor? = null

        override fun putInt(
            key: String?,
            value: Int
        ): SharedPreferences.Editor? = null

        override fun putLong(
            key: String?,
            value: Long
        ): SharedPreferences.Editor? = null

        override fun putFloat(
            key: String?,
            value: Float
        ): SharedPreferences.Editor? = null

        override fun putBoolean(
            key: String?,
            value: Boolean
        ): SharedPreferences.Editor? = null

        override fun remove(key: String?): SharedPreferences.Editor? = null

        override fun clear(): SharedPreferences.Editor? = null

        override fun commit(): Boolean = false

        override fun apply() {
        }
    }
}