package com.own.develop.compiler;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

import com.own.develop.exception.DataTypeException;
import com.own.develop.exception.ReferenceException;

public class Heap {
    private static final Map<String, Integer> HEAP = new HashMap<String, Integer>();
    private static final String NUMBER_REGEX = "(?<=\\s|^)\\d+(?=\\s|$)";

    public static void heap(String identifier, Integer value) {
        innerHeap(identifier, value);
    }

    private static void innerHeap(String identifier, Integer value) {
        if (HEAP.isEmpty()) {
            HEAP.put(identifier, value);
        } else {
            if (HEAP.containsKey(identifier)) {
                HEAP.replace(identifier, value);
            } else {
                HEAP.put(identifier, value);
            }
        }
    }

    private static Integer valueToInteger(String value) {
        return Integer.valueOf(value);
    }

    public static Integer searchInHeap(String identifier) {
        Integer value;

        if (HEAP.isEmpty()) {
            HEAP.put(identifier, 0);
            value = 0;
        } else {
            if (HEAP.containsKey(identifier)) {
                value = HEAP.get(identifier);
            } else {
                HEAP.put(identifier, 0);
                value = 0;
            }
        }

        return value;
    }

    public static void print(String identifier) throws ReferenceException {
        if (HEAP.isEmpty()) {
            throw new ReferenceException("La variable " + identifier + " aun no ha sido declarada.");
        } else {
            if (HEAP.containsKey(identifier)) {
                System.out.println(HEAP.get(identifier));
            } else {
                throw new ReferenceException("La variable " + identifier + " aun no ha sido declarada.");
            }
        }
    }

    public static void read(String identifier) throws DataTypeException {
        Scanner scanner = new Scanner(System.in);
        String read = scanner.next();
        Integer intValue;

        if (Pattern.matches(NUMBER_REGEX, read)) {
            intValue = valueToInteger(read);
            scanner.close();
        } else {
            scanner.close();
            throw new DataTypeException("Debe introducir un valor de tipo Integer.");
        }

        innerHeap(identifier, intValue);
    }
}
