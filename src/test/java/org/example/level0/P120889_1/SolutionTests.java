package org.example.level0.P120889_1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SolutionTests {
    @Test
    void t1() {
        assertThat(new Solution().solution(new int[] {1, 2, 3})).isEqualTo(2);
    }

    @Test
    void t2() {
        assertThat(new Solution().solution(new int[] {3, 6, 2})).isEqualTo(2);
    }

    @Test
    void t3() {
        assertThat(new Solution().solution(new int[] {199, 72, 222})).isEqualTo(1);
    }
}
