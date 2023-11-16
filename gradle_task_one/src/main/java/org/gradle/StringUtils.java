package org.gradle;

import static org.apache.commons.lang3.math.NumberUtils.isCreatable;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (isCreatable(str)) {
            try {
                if (Integer.parseInt(str) > 0) {
                    return true;
                }
            } catch (NumberFormatException e) {
                if (Double.parseDouble(str) > 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
