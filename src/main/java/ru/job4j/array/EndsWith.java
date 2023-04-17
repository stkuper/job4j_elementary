package ru.job4j.array;

public class EndsWith {
    public static boolean endWith(char[] word, char[] post) {
        for (int i = 0; i < post.length; i++) {
            if (word[word.length - post.length + i] != post[i]) {
                return false;
            }
        }
        return true;
    }
}
