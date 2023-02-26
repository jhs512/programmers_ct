package org.example.level0.P120836_1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SolutionTests {
    @Test
    void t1() {
        assertThat(new Solution().solution(20)).isEqualTo(6);
    }

    @Test
    void t2() {
        assertThat(new Solution().solution(100)).isEqualTo(9);
    }
}
