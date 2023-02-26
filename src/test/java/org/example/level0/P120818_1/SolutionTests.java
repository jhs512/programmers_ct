package org.example.level0.P120818_1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SolutionTests {
    @Test
    void t1() {
        assertThat(new Solution().solution(150_000)).isEqualTo(142_500);
    }

    @Test
    void t2() {
        assertThat(new Solution().solution(580_000)).isEqualTo(464_000);
    }
}
