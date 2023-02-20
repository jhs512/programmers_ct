package org.example.level0.P120822_1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SolutionTests {
    @Test
    void t1() {
        assertThat(new Solution().solution("jaron")).isEqualTo("noraj");
    }

    @Test
    void t2() {
        assertThat(new Solution().solution("bread")).isEqualTo("daerb");
    }
}
