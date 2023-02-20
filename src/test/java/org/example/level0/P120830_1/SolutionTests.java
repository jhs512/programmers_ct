package org.example.level0.P120830_1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SolutionTests {
    @Test
    void t1() {
        assertThat(new Solution().solution(10, 3)).isEqualTo(124_000);
    }

    @Test
    void t2() {
        assertThat(new Solution().solution(64, 6)).isEqualTo(768_000);
    }
}
