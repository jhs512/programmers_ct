package org.example.level0.P120816_1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SolutionTests {
    @Test
    void t1() {
        assertThat(new Solution().solution(7, 10)).isEqualTo(2);
    }

    @Test
    void t2() {
        assertThat(new Solution().solution(4, 12)).isEqualTo(3);
    }
}
