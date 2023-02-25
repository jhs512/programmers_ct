package org.example.level0.P120825_1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SolutionTests {
    @Test
    void t1() {
        assertThat(new Solution().solution("hello", 3)).isEqualTo("hhheeellllllooo");
    }
}
