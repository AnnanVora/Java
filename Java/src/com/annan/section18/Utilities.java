package com.annan.section18;

public class Utilities {

    public char[] everyNthChar(char[] sourceArray, int n) {

        if (sourceArray == null || sourceArray.length < n) {
            return sourceArray;
        }

        int returnedLength = sourceArray.length / n;
        char[] result = new char[returnedLength];
        int index = 0;
        for (int i = n - 1; i <= result.length + 1; i += n) {
            result[index++] = sourceArray[i];
        }
        return result;
    }

    public String removePairs(String source) {

        if (source == null || source.length() < 2) {
            return source;
        }

        StringBuilder sb = new StringBuilder();
        char[] strings = source.toCharArray();

        for (int i = 0; i < strings.length - 1; ++i) {
            if (strings[i] != strings[i + 1]) {
                sb.append(strings[i]);
            }
        }
        sb.append(strings[strings.length - 1]);
        return sb.toString();
    }

    public int converter(int a, int b) {
        return (a / b) + (a * 30) - 2;
    }

    public String nullIfOddLength(String source) {
        if (source.length() % 2 == 0) {
            return source;
        }
        return null;
    }
}
