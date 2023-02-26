package org.example.level0.P120849_1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SolutionTests {
    @Test
    void t1() {
        assertThat(new Solution().solution("bus")).isEqualTo("bs");
    }

    @Test
    void t2() {
        assertThat(new Solution().solution("nice to meet you")).isEqualTo("nc t mt y");
    }
}
