package org.example.level0.P120854_1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SolutionTests {
    @Test
    void t1() {
        assertThat(new Solution().solution(new String[]{"We", "are", "the", "world!"})).isEqualTo(new int[]{2, 3, 3, 6});
    }

    @Test
    void t2() {
        assertThat(new Solution().solution(new String[]{"I", "Love", "Programmers."})).isEqualTo(new int[]{1, 4, 12});
    }
}
