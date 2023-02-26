package org.example.level0.P120837_1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SolutionTests {
    @Test
    void t1() {
        assertThat(new Solution().solution(23)).isEqualTo(5);
    }

    @Test
    void t2() {
        assertThat(new Solution().solution(24)).isEqualTo(6);
    }

    @Test
    void t3() {
        assertThat(new Solution().solution(999)).isEqualTo(201);
    }
}
