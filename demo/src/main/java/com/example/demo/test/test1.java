package com.example.demo.test;

import org.springframework.util.AntPathMatcher;
import org.springframework.util.PathMatcher;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huzhenhua
 * @date 2020/8/20 18:39
 */
public class test1 {

    public static void main(String[] args) {
        PathMatcher pathMatcher = new AntPathMatcher();
        boolean match = pathMatcher.match("POST:/hexasino-lc-ebm/ebm/search/**", "POST:/hexasino-lc-ebm/ebm/search/searchInvestigation");
        System.out.println(match);
    }

    private static void remove(List<Integer> integers) {
        for (int i = 0; i < 3; i++) {
            integers.remove(i);
        }
    }
}
