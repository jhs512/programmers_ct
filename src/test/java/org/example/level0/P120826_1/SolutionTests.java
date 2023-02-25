package org.example.level0.P120826_1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SolutionTests {
    @Test
    void t1() {
        assertThat(new Solution().solution(10)).isEqualTo(30);
    }

    @Test
    void t2() {
        assertThat(new Solution().solution(4)).isEqualTo(6);
    }
}
