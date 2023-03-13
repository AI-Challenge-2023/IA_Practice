package com.aichallenge.practice;

import java.util.function.BiConsumer;

public class Util {
    public static BiConsumer<Integer, Runnable> repeat = (n, f) -> {
        for (int i = 1; i <= n; i++)
            f.run();
    };
}
