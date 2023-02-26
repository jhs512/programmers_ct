package org.example.level0.P120909_1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SolutionTests {
    @Test
    void t1() {
        assertThat(new Solution().solution(144)).isEqualTo(1);
    }

    @Test
    void t2() {
        assertThat(new Solution().solution(976)).isEqualTo(2);
    }
}
