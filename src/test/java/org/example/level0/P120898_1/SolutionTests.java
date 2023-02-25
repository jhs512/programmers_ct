package org.example.level0.P120898_1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SolutionTests {
    @Test
    void t1() {
        assertThat(new Solution().solution("happy birthday!")).isEqualTo(30);
    }

    @Test
    void t2() {
        assertThat(new Solution().solution("I love you~")).isEqualTo(22);
    }
}
