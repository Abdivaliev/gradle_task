package org.gradle;

import static org.apache.commons.lang3.math.NumberUtils.isCreatable;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        return isCreatable(str) && Double.parseDouble(str) > 0;
    }
}
