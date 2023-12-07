package ijmo.example.library

import org.apache.commons.text.WordUtils

class StringUtils {
    companion object {
        fun capitalize(s: String): String {
            return WordUtils.capitalize(s)
        }
    }
}