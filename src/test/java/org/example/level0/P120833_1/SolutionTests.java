package org.example.level0.P120833_1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SolutionTests {
    @Test
    void t1() {
        assertThat(new Solution().solution(new int[]{1, 2, 3, 4, 5}, 1, 3)).isEqualTo(new int[]{2, 3, 4});
    }

    @Test
    void t2() {
        assertThat(new Solution().solution(new int[]{1, 3, 5}, 1, 2)).isEqualTo(new int[]{3, 5});
    }
}
