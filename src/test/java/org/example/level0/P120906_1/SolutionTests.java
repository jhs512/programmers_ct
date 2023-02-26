package org.example.level0.P120906_1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SolutionTests {
    @Test
    void t1() {
        assertThat(new Solution().solution(1234)).isEqualTo(10);
    }

    @Test
    void t2() {
        assertThat(new Solution().solution(930211)).isEqualTo(16);
    }
}
